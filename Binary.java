import java.util.*; // All Utils Library
import java.io.*; // All Input Output Library
import javax.swing.JOptionPane; // JPANEL

class Binary{
	
	public static int menu_choice; // Choice for Menu Selection
	public static int convert_again; // Convert Again Options Menu Choice
	public static Scanner input = new Scanner(System.in); // Scanner Object
	public static String filename = "deshario@project.txt"; // Register File
	public static String binary_input; // Input binary value
	public static String[] splitted_text_data; // Split Text Data and keep into this variable

	public int setMenu_choice(int menu_choice) { // Set Menu || Setter
		return this.menu_choice = menu_choice;
	}
	public static int getMenu_choice() { // Get Menu || Getter
		return menu_choice;
	}
	
	public static void binary_home(){ // Main Menu of Binary Numbers
		try{
			Index b_anim = new Index();
			b_anim.CharAnimation("\n ========================","05");
  			b_anim.CharAnimation("\n      Binary Numbers ","05");
  			b_anim.CharAnimation("\n ========================","05");
  			b_anim.CharAnimation("\n\n  1. Binary -> Octal","05");
  			b_anim.CharAnimation("\n\n  2. Binary -> Decimal","05");
  			b_anim.CharAnimation("\n\n  3. Binary -> Hexadecimal","05");
  			b_anim.CharAnimation("\n\n -------------------------","05");
  			b_anim.CharAnimation("\n  4. MainMenu || 5. About ","05");
  			b_anim.CharAnimation("\n -------------------------","05");
		}catch(Exception e){
			System.exit(0);
		}
	}
	
	public static void switcher(){ // Menu Chooser For Binary Numbers
		Index binary_switch = new Index();
		switch(getMenu_choice()){ // Get Choice
		case 1:
			binary_input = null;	// Reset Variable
			binary_octal();
			break;
		case 2:
			binary_input = null;	// Reset Variable
			binary_decimal();
			break;
		case 3:
			binary_input = null;	// Reset Variable
			binary_hexadecimal();
			break;
		case 4:
			binary_switch.mainmenu();
			break;
		case 5:
			binary_switch.aboutprogram();
			binary_switch.binaryfunction();
			break;
		default:
			JOptionPane.showMessageDialog(null," Invalid Choice  ! \n Please Try Again..."," Invalid Choice", JOptionPane.ERROR_MESSAGE);
			binary_switch.binaryfunction();
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
	
	public static void inputbinarynum(){ // Input For Binary Numbers
		Index io_bn = new Index();
		datareader();
		String username = splitted_text_data[1];
		io_bn.CharAnimation("\n\n  "+username+" > Input Binary Digit : ","02");
		try{
		 	binary_input = input.next();
		}catch(Exception e){
		 	System.exit(0);
		}
	}
	
	// Binary Functions
	public static void binary_octal(){
		Index b_o = new Index();
		try{
			b_o.clearscreen();
			b_o.CharAnimation("\n ===================","05");
			b_o.CharAnimation("\n # Binary -> Octal #","05");
			b_o.CharAnimation("\n ===================","05");

			// Convert Binary to Octal Function Start Here
				if(binary_input != null){
				}else{
					inputbinarynum();
				}
			String binaryNumber = binary_input;
			int num = Integer.parseInt(binary_input, 2);
			String octalNumber = Integer.toOctalString(num);
			// Convert Binary to Octal Function End Here

			b_o.CharAnimation("\n ------------------------------------------------","01");
			System.out.println("\n  Binary("+binaryNumber+")"+" = "+"Octal("+octalNumber+")");
			b_o.CharAnimation(" ------------------------------------------------","01");
			b_o.CharAnimation("\n ------------------------------------------------","01");
			b_o.CharAnimation("\n  1.Convert More || 2.Binary Functions || 0.Exit","01");
			b_o.CharAnimation("\n ------------------------------------------------","01");

			datareader();
			String username = splitted_text_data[1];
		 	b_o.CharAnimation("\n\n  "+username+" > Choice : ","02");
			convert_again = input.nextInt();
			switch(convert_again){
			case 1:
				binary_input = null;
				binary_octal();
				break;
			case 2:
				b_o.binaryfunction();
				break;
			case 0:
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null," Invalid Choice  ! \n Please Try Again..."," Invalid Choice", JOptionPane.ERROR_MESSAGE);
				binary_octal();
			}

		}catch(java.util.InputMismatchException e){
			JOptionPane.showMessageDialog(null," Invalid Choice  ! \n Please Try Again..."," Invalid Choice", JOptionPane.ERROR_MESSAGE);
		  	input.next();
			binary_octal();
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null," Invalid Binary Digit  ! \n Please Try Again..."," Binary Digit Error", JOptionPane.ERROR_MESSAGE);
			binary_input = null;
			binary_octal();
		}
	}
	
	public static void binary_decimal(){
	 	Index b_d = new Index();
	 	try{
	 		b_d.clearscreen();
	 		b_d.CharAnimation("\n =====================","05");
	 		b_d.CharAnimation("\n # Binary -> Decimal #","05");
	 		b_d.CharAnimation("\n =====================","05");

			// Convert Binary to Decimal Function Start Here
			if(binary_input != null){
			}else{
				inputbinarynum();
			}
			String binaryNumber = binary_input;
			int decimalNumber = Integer.parseInt(binaryNumber,2);
			// Convert Binary to Decimal Function End Here

	 		b_d.CharAnimation("\n ------------------------------------------------","01");
	 		System.out.println("\n  Binary("+binaryNumber+")"+" = "+"Decimal("+decimalNumber+")");
	 		b_d.CharAnimation(" ------------------------------------------------","01");
	 		b_d.CharAnimation("\n ------------------------------------------------","01");
	 		b_d.CharAnimation("\n  1.Convert More || 2.Binary Functions || 0.Exit","01");
	 		b_d.CharAnimation("\n ------------------------------------------------","01");

			datareader();
			String username = splitted_text_data[1];
		 	b_d.CharAnimation("\n\n  "+username+" > Choice : ","02");
	 		convert_again = input.nextInt();
			switch(convert_again){
			case 1:
				binary_input = null;
				binary_decimal();
				break;
			case 2:
				b_d.binaryfunction();
				break;
			case 0:
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null," Invalid Choice  ! \n Please Try Again..."," Invalid Choice", JOptionPane.ERROR_MESSAGE);
				binary_decimal();
			}

	 	}catch(java.util.InputMismatchException e){
			JOptionPane.showMessageDialog(null," Invalid Choice  ! \n Please Try Again..."," Invalid Choice", JOptionPane.ERROR_MESSAGE);
			input.next();
			binary_decimal();
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null," Invalid Binary Digit  ! \n Please Try Again..."," Binary Digit Error", JOptionPane.ERROR_MESSAGE);
			binary_input = null;
			binary_decimal();
		}
	}
	
	public static void binary_hexadecimal(){
		Index b_h = new Index();
		try{
			b_h.clearscreen();
			b_h.CharAnimation("\n ==========================","05");
			b_h.CharAnimation("\n  # Binary -> Hexadecimal #","05");
			b_h.CharAnimation("\n ==========================","05");

			// Convert Binary to Hexadecimal Function Start Here
			if(binary_input != null){
			}else{
				inputbinarynum();
			}
			String binaryNumber = binary_input;
			int i = Integer.parseInt(binary_input,2);
			String hexadecimalNumber = Integer.toHexString(i);
			// Convert Binary to Hexadecimal Function End Here

			b_h.CharAnimation("\n ------------------------------------------------","01");
			System.out.println("\n  Binary("+binaryNumber+")"+" = "+"HexadDecimal("+hexadecimalNumber+")");
			b_h.CharAnimation(" ------------------------------------------------","01");
			b_h.CharAnimation("\n ------------------------------------------------","01");
			b_h.CharAnimation("\n  1.Convert More || 2.Binary Functions || 0.Exit","01");
			b_h.CharAnimation("\n ------------------------------------------------","01");

			datareader();
			String username = splitted_text_data[1];
		 	b_h.CharAnimation("\n\n  "+username+" > Choice : ","02");
			convert_again = input.nextInt();
			switch(convert_again){
			case 1:
				binary_input = null;
				binary_hexadecimal();
				break;
			case 2:
				b_h.binaryfunction();
				break;
			case 0:
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null," Invalid Choice  ! \n Please Try Again..."," Invalid Choice", JOptionPane.ERROR_MESSAGE);
				binary_hexadecimal();
			}

		}catch(java.util.InputMismatchException e){
			JOptionPane.showMessageDialog(null," Invalid Choice  ! \n Please Try Again..."," Invalid Choice", JOptionPane.ERROR_MESSAGE);
		  	input.next();
			binary_hexadecimal();
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null," Invalid Binary Digit  ! \n Please Try Again..."," Binary Digit Error", JOptionPane.ERROR_MESSAGE);
			binary_input = null;
			binary_hexadecimal();
		}
	}
	
}
