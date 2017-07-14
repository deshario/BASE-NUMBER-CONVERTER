import java.util.*; // All Utils Library
import java.io.*; // All Input Output Library
import javax.swing.JOptionPane; // JPANEL

class Hexadecimal{

	public static int menu_choice; // Choice for Menu Selection
	public static int convert_again; // Convert Again Options Menu Choice
	public static Scanner input = new Scanner(System.in); // Scanner Object
	public static String filename = "deshario@project.txt"; // Register File
	public static String hexadecimal_input; // Input Octal value
	public static String[] splitted_text_data; // Split Text Data and keep into this variable

	public int setMenu_choice(int menu_choice) { // Set Menu || Setter
		return this.menu_choice = menu_choice;
	}
	public static int getMenu_choice() { // Get Menu || Getter
		return menu_choice;
	}

	public static void hexadecimal_home(){ // Main Menu of Hexadecimal Numbers
		try{
			Index h_anim = new Index();
			h_anim.CharAnimation("\n =========================","05");
			h_anim.CharAnimation("\n    Hexadecimal Numbers ","05");
			h_anim.CharAnimation("\n =========================","05");
			h_anim.CharAnimation("\n\n  1. Hexadecimal -> Binary","05");
			h_anim.CharAnimation("\n\n  2. Hexadecimal -> Octal","05");
			h_anim.CharAnimation("\n\n  3. Hexadecimal -> Decimal","05");
  			h_anim.CharAnimation("\n\n -------------------------","05");
  			h_anim.CharAnimation("\n  4. MainMenu || 5. About ","05");
  			h_anim.CharAnimation("\n -------------------------","05");
		}catch(Exception e){
			System.exit(0);
		}
	}

	public static void switcher(){ // Menu Chooser For Hexadecimal Numbers
		Index hexadecimal_switch = new Index();
		switch(getMenu_choice()){ // Get Choice
		case 1:
			hexadecimal_input = null;	// Reset Variable
			hexadecimal_binary();
			break;
		case 2:
			hexadecimal_input = null;	// Reset Variable
			hexadecimal_octal();
			break;
		case 3:
			hexadecimal_input = null;	 // Reset Variable
			hexadecimal_decimal();
			break;
		case 4:
			hexadecimal_switch.mainmenu();
			break;
		case 5:
			hexadecimal_switch.aboutprogram();
			hexadecimal_switch.hexadecimalfunction();
			break;
		default:
			JOptionPane.showMessageDialog(null," Invalid Choice  ! \n Please Try Again..."," Invalid Choice", JOptionPane.ERROR_MESSAGE);
			hexadecimal_switch.hexadecimalfunction();
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

	public static void inputhexadecimalnum(){ // Input For Hexadecimal Numbers
		Index io_hn = new Index();
		datareader();
		String username = splitted_text_data[1];
		io_hn.CharAnimation("\n\n  "+username+" > Input Hexadecimal Digit : ","02");
		try{
		 	hexadecimal_input = input.next();
		}catch(Exception e){
		 	System.exit(0);
		}
	}

	// HexaDecimal Functions
	public static void hexadecimal_binary(){
		Index h_b = new Index();
		try{
			h_b.clearscreen();
			h_b.CharAnimation("\n =========================","05");
			h_b.CharAnimation("\n # Hexadecimal -> Binary #","05");
			h_b.CharAnimation("\n =========================","05");

			// Convert Hexadecimal to Binary Function Start Here
				if(hexadecimal_input != null){
				}else{
					inputhexadecimalnum();
				}
				String hexadecimalNumber = hexadecimal_input;
				int num = Integer.parseInt(hexadecimalNumber,16);
				String binaryNumber = Integer.toBinaryString(num);
			// Convert Hexadecimal to Binary Function End Here

			h_b.CharAnimation("\n -----------------------------------------------------","01");
			System.out.println("\n  Hexadecimal("+hexadecimalNumber+")"+" = "+"Binary("+binaryNumber+")");
			h_b.CharAnimation(" -----------------------------------------------------","01");
			h_b.CharAnimation("\n -----------------------------------------------------","01");
			h_b.CharAnimation("\n  1.Convert More || 2.Hexadecimal Functions || 0.Exit ","01");
			h_b.CharAnimation("\n -----------------------------------------------------","01");

			datareader();
			String username = splitted_text_data[1];
		 	h_b.CharAnimation("\n\n  "+username+" > Choice : ","02");
			convert_again = input.nextInt();
			switch(convert_again){
			case 1:
				hexadecimal_input = null;
				hexadecimal_binary();
				break;
			case 2:
				h_b.hexadecimalfunction();
				break;
			case 0:
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null," Invalid Choice  ! \n Please Try Again..."," Invalid Choice", JOptionPane.ERROR_MESSAGE);
				hexadecimal_binary();
			}

		}catch(java.util.InputMismatchException e){
			JOptionPane.showMessageDialog(null," Invalid Choice  ! \n Please Try Again..."," Invalid Choice", JOptionPane.ERROR_MESSAGE);
		  	input.next();
			hexadecimal_binary();
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null," Invalid Hexadecimal Digit  ! \n Please Try Again..."," Hexadecimal Digit Error", JOptionPane.ERROR_MESSAGE);
			hexadecimal_input = null;
			hexadecimal_binary();
		}
	}

	public static void hexadecimal_octal(){
		Index h_o = new Index();
		try{
			h_o.clearscreen();
			h_o.CharAnimation("\n ========================","05");
			h_o.CharAnimation("\n # Hexadecimal -> Octal #","05");
			h_o.CharAnimation("\n ========================","05");

			// Convert Hexadecimal to Octal Function Start Here
				if(hexadecimal_input != null){
				}else{
					inputhexadecimalnum();
				}
				String hexadecimalNumber = hexadecimal_input;
				int num = Integer.parseInt(hexadecimalNumber,16);
				String octalNumber = Integer.toOctalString(num);
			// Convert Hexadecimal to Octal Function End Here

			h_o.CharAnimation("\n -----------------------------------------------------","01");
			System.out.println("\n  Hexadecimal("+hexadecimalNumber+")"+" = "+"Octal("+octalNumber+")");
			h_o.CharAnimation(" -----------------------------------------------------","01");
			h_o.CharAnimation("\n -----------------------------------------------------","01");
			h_o.CharAnimation("\n  1.Convert More || 2.Hexadecimal Functions || 0.Exit","01");
			h_o.CharAnimation("\n -----------------------------------------------------","01");

			datareader();
			String username = splitted_text_data[1];
		 	h_o.CharAnimation("\n\n  "+username+" > Choice : ","02");
			convert_again = input.nextInt();
			switch(convert_again){
			case 1:
				hexadecimal_input = null;
				hexadecimal_octal();
				break;
			case 2:
				h_o.hexadecimalfunction();
				break;
			case 0:
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null," Invalid Choice  ! \n Please Try Again..."," Invalid Choice", JOptionPane.ERROR_MESSAGE);
				hexadecimal_octal();
			}

		}catch(java.util.InputMismatchException e){
			JOptionPane.showMessageDialog(null," Invalid Choice  ! \n Please Try Again..."," Invalid Choice", JOptionPane.ERROR_MESSAGE);
		  	input.next();
			hexadecimal_octal();
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null," Invalid Hexadecimal Digit  ! \n Please Try Again..."," Hexadecimal Digit Error", JOptionPane.ERROR_MESSAGE);
			hexadecimal_input = null;
			hexadecimal_octal();
		}
	}

	public static void hexadecimal_decimal(){
		Index h_d = new Index();
		try{
			h_d.clearscreen();
			h_d.CharAnimation("\n ==========================","05");
			h_d.CharAnimation("\n # HexaDecimal -> Decimal #","05");
			h_d.CharAnimation("\n ==========================","05");

			// Convert HexaDecimal to Decimal Function Start Here
				if(hexadecimal_input != null){
				}else{
					inputhexadecimalnum();
				}
				String hexadecimalNumber = hexadecimal_input;
				int num = Integer.parseInt(hexadecimalNumber,16);
				String decimalNumber = Integer.toString(num);
			// Convert HexaDecimal to Decimal Function End Here

			h_d.CharAnimation("\n -----------------------------------------------------","01");
			System.out.println("\n  HexaDecimal("+hexadecimalNumber+")"+" = "+"Decimal("+decimalNumber+")");
			h_d.CharAnimation(" -----------------------------------------------------","01");
			h_d.CharAnimation("\n -----------------------------------------------------","01");
			h_d.CharAnimation("\n  1.Convert More || 2.HexaDecimal Functions || 0.Exit","01");
			h_d.CharAnimation("\n -----------------------------------------------------","01");

			datareader();
			String username = splitted_text_data[1];
			h_d.CharAnimation("\n\n  "+username+" > Choice : ","02");
			convert_again = input.nextInt();
			switch(convert_again){
			case 1:
				hexadecimal_input = null;
				hexadecimal_decimal();
				break;
			case 2:
				h_d.hexadecimalfunction();
				break;
			case 0:
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null," Invalid Choice  ! \n Please Try Again..."," Invalid Choice", JOptionPane.ERROR_MESSAGE);
				hexadecimal_decimal();
			}

		}catch(java.util.InputMismatchException e){
			JOptionPane.showMessageDialog(null," Invalid Choice  ! \n Please Try Again..."," Invalid Choice", JOptionPane.ERROR_MESSAGE);
			input.next();
			hexadecimal_decimal();
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null," Invalid HexaDecimal Digit  ! \n Please Try Again..."," HexaDecimal Digit Error", JOptionPane.ERROR_MESSAGE);
			hexadecimal_input = null;
			hexadecimal_decimal();
		}
	}

}
