import java.util.*; // All Utils Library
import java.io.*; // All Input Output Library
import javax.swing.JOptionPane; // JPANEL

class Octal{

	public static int menu_choice; // Choice for Menu Selection
	public static int convert_again; // Convert Again Options Menu Choice
	public static Scanner input = new Scanner(System.in); // Scanner Object
	public static String filename = "deshario@project.txt"; // Register File
	public static String octal_input; // Input Octal value
	public static String[] splitted_text_data; // Split Text Data and keep into this variable

	public int setMenu_choice(int menu_choice) { // Set Menu || Setter
		return this.menu_choice = menu_choice;
	}
	public static int getMenu_choice() { // Get Menu || Getter
		return menu_choice;
	}

	public static void octal_home(){ // Main Menu of Octal Numbers
		try{
			Index o_anim = new Index();
			o_anim.CharAnimation("\n =========================","05");
			o_anim.CharAnimation("\n       Octal Numbers      ","05");
			o_anim.CharAnimation("\n =========================","05");
			o_anim.CharAnimation("\n\n  1. Octal -> Binary","05");
			o_anim.CharAnimation("\n\n  2. Octal -> Decimal","05");
			o_anim.CharAnimation("\n\n  3. Octal -> Hexadecimal","05");
  			o_anim.CharAnimation("\n\n -------------------------","05");
  			o_anim.CharAnimation("\n  4. MainMenu || 5. About ","05");
  			o_anim.CharAnimation("\n -------------------------","05");
		}catch(Exception e){
			System.exit(0);
		}
	}

	public static void switcher(){ // Menu Chooser For Octal Numbers
		Index octal_switch = new Index();
		switch(getMenu_choice()){ // Get Choice
		case 1:
			octal_input = null;	// Reset Variable
			octal_binary();
			break;
		case 2:
			octal_input = null;	// Reset Variable
			octal_decimal();
			break;
		case 3:
			octal_input = null;	 // Reset Variable
			octal_hexadecimal();
			break;
		case 4:
			octal_switch.mainmenu();
			break;
		case 5:
			octal_switch.aboutprogram();
			octal_switch.octalfunction();
			break;
		default:
			JOptionPane.showMessageDialog(null," Invalid Choice  ! \n Please Try Again..."," Invalid Choice", JOptionPane.ERROR_MESSAGE);
			octal_switch.octalfunction();
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

	public static void inputoctalnum(){ // Input For Octal Numbers
		Index io_on = new Index();
		datareader();
		String username = splitted_text_data[1];
		io_on.CharAnimation("\n\n  "+username+" > Input Octal Digit : ","02");
		try{
		 octal_input = input.next();
		}catch(Exception e){
		 	System.exit(0);
		}
	}

	// Octal Functions
	public static void octal_binary(){
		Index o_b = new Index();
		try{
			o_b.clearscreen();
			o_b.CharAnimation("\n ===================","05");
			o_b.CharAnimation("\n # Octal -> Binary #","05");
			o_b.CharAnimation("\n ===================","05");

			// Convert Octal to Binary Function Start Here
				if(octal_input != null){
				}else{
					inputoctalnum();
				}
				String octalNumber = octal_input;
				int num = Integer.parseInt(octalNumber, 8);
				String binaryNumber = Integer.toBinaryString(num);
			// Convert Octal to Binary Function End Here

			o_b.CharAnimation("\n -----------------------------------------------","01");
			System.out.println("\n  Octal("+octalNumber+")"+" = "+"Binary("+binaryNumber+")");
			o_b.CharAnimation(" -----------------------------------------------","01");
			o_b.CharAnimation("\n -----------------------------------------------","01");
			o_b.CharAnimation("\n  1.Convert More || 2.Octal Functions || 0.Exit","01");
			o_b.CharAnimation("\n -----------------------------------------------","01");

			datareader();
			String username = splitted_text_data[1];
		 	o_b.CharAnimation("\n\n  "+username+" > Choice : ","02");
			convert_again = input.nextInt();
			switch(convert_again){
			case 1:
				octal_input = null;
				octal_binary();
				break;
			case 2:
				o_b.octalfunction();
				break;
			case 0:
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null," Invalid Choice  ! \n Please Try Again..."," Invalid Choice", JOptionPane.ERROR_MESSAGE);
				octal_binary();
			}

		}catch(java.util.InputMismatchException e){
			JOptionPane.showMessageDialog(null," Invalid Choice  ! \n Please Try Again..."," Invalid Choice", JOptionPane.ERROR_MESSAGE);
		  	input.next();
			octal_binary();
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null," Invalid Octal Digit  ! \n Please Try Again..."," Octal Digit Error", JOptionPane.ERROR_MESSAGE);
			octal_input = null;
			octal_binary();
		}
	}

	public static void octal_decimal(){
		Index o_d = new Index();
		try{
			o_d.clearscreen();
			o_d.CharAnimation("\n ====================","05");
			o_d.CharAnimation("\n # Octal -> Decimal #","05");
			o_d.CharAnimation("\n ====================","05");

			// Convert Octal to Decimal Function Start Here
				if(octal_input != null){
				}else{
					inputoctalnum();
				}
				String octalNumber = octal_input;
				int num = Integer.parseInt(octalNumber, 8);
				String decimalNumber = Integer.toString(num);
			// Convert Octal to Decimal Function End Here

			o_d.CharAnimation("\n -----------------------------------------------","01");
			System.out.println("\n  Octal("+octalNumber+")"+" = "+"Decimal("+decimalNumber+")");
			o_d.CharAnimation(" -----------------------------------------------","01");
			o_d.CharAnimation("\n -----------------------------------------------","01");
			o_d.CharAnimation("\n  1.Convert More || 2.Octal Functions || 0.Exit","01");
			o_d.CharAnimation("\n -----------------------------------------------","01");

			datareader();
			String username = splitted_text_data[1];
		 	o_d.CharAnimation("\n\n  "+username+" > Choice : ","02");
			convert_again = input.nextInt();
			switch(convert_again){
			case 1:
				octal_input = null;
				octal_decimal();
				break;
			case 2:
				o_d.octalfunction();
				break;
			case 0:
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null," Invalid Choice  ! \n Please Try Again..."," Invalid Choice", JOptionPane.ERROR_MESSAGE);
				octal_decimal();
			}

		}catch(java.util.InputMismatchException e){
			JOptionPane.showMessageDialog(null," Invalid Choice  ! \n Please Try Again..."," Invalid Choice", JOptionPane.ERROR_MESSAGE);
		  	input.next();
			octal_decimal();
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null," Invalid Octal Digit  ! \n Please Try Again..."," Octal Digit Error", JOptionPane.ERROR_MESSAGE);
			octal_input = null;
			octal_decimal();
		}
	}

	public static void octal_hexadecimal(){
		Index o_h = new Index();
		try{
			o_h.clearscreen();
			o_h.CharAnimation("\n ========================","05");
			o_h.CharAnimation("\n # Octal -> Hexadecimal #","05");
			o_h.CharAnimation("\n ========================","05");

			// Convert Octal to Hexadecimal Function Start Here
				if(octal_input != null){
				}else{
					inputoctalnum();
				}
				String octalNumber = octal_input;
				int num = Integer.parseInt(octalNumber, 8);
				String hexadecimalNumber = Integer.toHexString(num);
			// Convert Octal to Hexadecimal Function End Here

			o_h.CharAnimation("\n -----------------------------------------------","01");
			System.out.println("\n  Octal("+octalNumber+")"+" = "+"Hexadecimal("+hexadecimalNumber+")");
			o_h.CharAnimation(" -----------------------------------------------","01");
			o_h.CharAnimation("\n -----------------------------------------------","01");
			o_h.CharAnimation("\n  1.Convert More || 2.Octal Functions || 0.Exit","01");
			o_h.CharAnimation("\n -----------------------------------------------","01");

			datareader();
			String username = splitted_text_data[1];
			o_h.CharAnimation("\n\n  "+username+" > Choice : ","02");
			convert_again = input.nextInt();
			switch(convert_again){
			case 1:
				octal_input = null;
				octal_hexadecimal();
				break;
			case 2:
				o_h.octalfunction();
				break;
			case 0:
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null," Invalid Choice  ! \n Please Try Again..."," Invalid Choice", JOptionPane.ERROR_MESSAGE);
				octal_hexadecimal();
			}

		}catch(java.util.InputMismatchException e){
			JOptionPane.showMessageDialog(null," Invalid Choice  ! \n Please Try Again..."," Invalid Choice", JOptionPane.ERROR_MESSAGE);
			input.next();
			octal_hexadecimal();
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null," Invalid Octal Digit  ! \n Please Try Again..."," Octal Digit Error", JOptionPane.ERROR_MESSAGE);
			octal_input = null;
			octal_hexadecimal();
		}
	}

}
