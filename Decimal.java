import java.util.*; // All Utils Library
import java.io.*; // All Input Output Library
import javax.swing.JOptionPane; // JPANEL

class Decimal{
	
	public static int menu_choice; // Choice for Menu Selection
	public static int convert_again; // Convert Again Options Menu Choice
	public static Scanner input = new Scanner(System.in); // Scanner Object
	public static String filename = "deshario@project.txt"; // Register File
	public static String decimal_input; // Input Octal value
	public static String[] splitted_text_data; // Split Text Data and keep into this variable

	public int setMenu_choice(int menu_choice) { // Set Menu || Setter
		return this.menu_choice = menu_choice;
	}
	public static int getMenu_choice() { // Get Menu || Getter
		return menu_choice;
	}
	
	public static void decimal_home(){ // Main Menu of Decimal Numbers
		try{
			Index d_anim = new Index();
			d_anim.CharAnimation("\n =========================","05");
			d_anim.CharAnimation("\n      Decimal Numbers     ","05");
			d_anim.CharAnimation("\n =========================","05");
			d_anim.CharAnimation("\n\n  1. Decimal -> Binary","05");
			d_anim.CharAnimation("\n\n  2. Decimal -> Octal","05");
			d_anim.CharAnimation("\n\n  3. Decimal -> Hexadecimal","05");
  			d_anim.CharAnimation("\n\n -------------------------","05");
  			d_anim.CharAnimation("\n  4. MainMenu || 5. About ","05");
  			d_anim.CharAnimation("\n -------------------------","05");
		}catch(Exception e){
			System.exit(0);
		}
	}
	
	public static void switcher(){ // Menu Chooser For Decimal Numbers
		Index decimal_switch = new Index();
		switch(getMenu_choice()){ // Get Choice
		case 1:
			decimal_input = null;	// Reset Variable
			decimal_binary();
			break;
		case 2:
			decimal_input = null;	// Reset Variable
			decimal_octal();
			break;
		case 3:
			decimal_input = null;	 // Reset Variable
			decimal_hexadecimal();
			break;
		case 4:
			decimal_switch.mainmenu();
			break;
		case 5:
			decimal_switch.aboutprogram();
			decimal_switch.decimalfunction();
			break;
		default:
			JOptionPane.showMessageDialog(null," Invalid Choice  ! \n Please Try Again..."," Invalid Choice", JOptionPane.ERROR_MESSAGE);
			decimal_switch.decimalfunction();
		}
	}
	
	public static void datareader(){ // Read Username from file
	 	BufferedReader br = null;
	 	try {
	 		String line;
	 		br = new BufferedReader(new FileReader(filename));
	 			while ((line = br.readLine()) != null) {
	 				String delimitators = "([:\\n\\r\\s\\t]+)";
	 				splitted_text_data = line.split(delimitators);
	 			}
	 	}catch(IOException e) {
	 		e.printStackTrace();
	 	}
	}
	
	public static void inputdecimalnum(){ // Input For Decimal Numbers
		Index io_dn = new Index();
		datareader();
		String username = splitted_text_data[1];
		io_dn.CharAnimation("\n\n  "+username+" > Input Decimal Digit : ","02");
		try{
		 	decimal_input = input.next();
		}catch(Exception e){
		 	System.exit(0);
		}
	}

	// Decimal Functions
	public static void decimal_binary(){
		Index d_b = new Index();
		try{
			d_b.clearscreen();
			d_b.CharAnimation("\n =====================","05");
			d_b.CharAnimation("\n # Decimal -> Binary #","05");
			d_b.CharAnimation("\n =====================","05");

			// Convert Decimal to Binary Function Start Here
				if(decimal_input != null){
				}else{
					inputdecimalnum();
				}
				String decimalNumber = decimal_input;
				int num = Integer.parseInt(decimalNumber);
				String binaryNumber = Integer.toBinaryString(num);
			// Convert Decimal to Binary Function End Here

			d_b.CharAnimation("\n -------------------------------------------------","01");
			System.out.println("\n  Decimal("+decimalNumber+")"+" = "+"Binary("+binaryNumber+")");
			d_b.CharAnimation(" -------------------------------------------------","01");
			d_b.CharAnimation("\n -------------------------------------------------","01");
			d_b.CharAnimation("\n  1.Convert More || 2.Decimal Functions || 0.Exit","01");
			d_b.CharAnimation("\n -------------------------------------------------","01");

			datareader();
			String username = splitted_text_data[1];
		 	d_b.CharAnimation("\n\n  "+username+" > Choice : ","02");
			convert_again = input.nextInt();
			switch(convert_again){
			case 1:
				decimal_input = null;
				decimal_binary();
				break;
			case 2:
				d_b.decimalfunction();
				break;
			case 0:
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null," Invalid Choice  ! \n Please Try Again..."," Invalid Choice", JOptionPane.ERROR_MESSAGE);
				decimal_binary();
			}

		}catch(java.util.InputMismatchException e){
				JOptionPane.showMessageDialog(null," Invalid Choice  ! \n Please Try Again..."," Invalid Choice", JOptionPane.ERROR_MESSAGE);
		  	input.next();
				decimal_binary();
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null," Invalid Decimal Digit  ! \n Please Try Again..."," Decimal Digit Error", JOptionPane.ERROR_MESSAGE);
			decimal_input = null;
			decimal_binary();
		}
	}
	
	public static void decimal_octal(){
		Index d_o = new Index();
		try{
			d_o.clearscreen();
			d_o.CharAnimation("\n ====================","05");
			d_o.CharAnimation("\n # Decimal -> Octal #","05");
			d_o.CharAnimation("\n ====================","05");

			// Convert Decimal to Octal Function Start Here
				if(decimal_input != null){
				}else{
					inputdecimalnum();
				}
				String decimalNumber = decimal_input;
				int num = Integer.parseInt(decimalNumber);
				String octalNumber = Integer.toOctalString(num);
			// Convert Decimal to Octal Function End Here

			d_o.CharAnimation("\n -------------------------------------------------","01");
			System.out.println("\n  Decimal("+decimalNumber+")"+" = "+"Octal("+octalNumber+")");
			d_o.CharAnimation(" -------------------------------------------------","01");
			d_o.CharAnimation("\n -------------------------------------------------","01");
			d_o.CharAnimation("\n  1.Convert More || 2.Decimal Functions || 0.Exit","01");
			d_o.CharAnimation("\n -------------------------------------------------","01");

			datareader();
			String username = splitted_text_data[1];
		 	d_o.CharAnimation("\n\n  "+username+" > Choice : ","02");
			convert_again = input.nextInt();
			switch(convert_again){
			case 1:
				decimal_input = null;
				decimal_octal();
				break;
			case 2:
				d_o.decimalfunction();
				break;
			case 0:
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null," Invalid Choice  ! \n Please Try Again..."," Invalid Choice", JOptionPane.ERROR_MESSAGE);
				decimal_octal();
			}

		}catch(java.util.InputMismatchException e){
			JOptionPane.showMessageDialog(null," Invalid Choice  ! \n Please Try Again..."," Invalid Choice", JOptionPane.ERROR_MESSAGE);
		  	input.next();
			decimal_octal();
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null," Invalid Decimal Digit  ! \n Please Try Again..."," Decimal Digit Error", JOptionPane.ERROR_MESSAGE);
			decimal_input = null;
			decimal_octal();
		}
	}
	
	public static void decimal_hexadecimal(){
		Index d_h = new Index();
		try{
			d_h.clearscreen();
			d_h.CharAnimation("\n ==========================","05");
			d_h.CharAnimation("\n # Decimal -> Hexadecimal #","05");
			d_h.CharAnimation("\n ==========================","05");

			// Convert Decimal to Hexadecimal Function Start Here
				if(decimal_input != null){
				}else{
					inputdecimalnum();
				}
				String decimalNumber = decimal_input;
				int num = Integer.parseInt(decimalNumber);
				String hexadecimalNumber = Integer.toHexString(num);
			// Convert Decimal to Hexadecimal Function End Here

			d_h.CharAnimation("\n -------------------------------------------------","01");
			System.out.println("\n  Decimal("+decimalNumber+")"+" = "+"Hexadecimal("+hexadecimalNumber+")");
			d_h.CharAnimation(" -------------------------------------------------","01");
			d_h.CharAnimation("\n -------------------------------------------------","01");
			d_h.CharAnimation("\n  1.Convert More || 2.Decimal Functions || 0.Exit","01");
			d_h.CharAnimation("\n -------------------------------------------------","01");

			datareader();
			String username = splitted_text_data[1];
			d_h.CharAnimation("\n\n  "+username+" > Choice : ","02");
			convert_again = input.nextInt();
			switch(convert_again){
			case 1:
				decimal_input = null;
				decimal_hexadecimal();
				break;
			case 2:
				d_h.decimalfunction();
				break;
			case 0:
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null," Invalid Choice  ! \n Please Try Again..."," Invalid Choice", JOptionPane.ERROR_MESSAGE);
				decimal_octal();
			}

		}catch(java.util.InputMismatchException e){
			JOptionPane.showMessageDialog(null," Invalid Choice  ! \n Please Try Again..."," Invalid Choice", JOptionPane.ERROR_MESSAGE);
			input.next();
			decimal_hexadecimal();
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null," Invalid Decimal Digit  ! \n Please Try Again..."," Decimal Digit Error", JOptionPane.ERROR_MESSAGE);
			decimal_input = null;
			decimal_hexadecimal();
		}
	}
	
}
