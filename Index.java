import java.util.*; // All Utils Library
import java.io.*; // All Input Output Library
import javax.swing.JOptionPane; // JPANEL

class Index{

	public static String guiinput; // Input for gui popup
	public static int sleeptime; // Delay Time (Milliseconds)
	public static String filename = "deshario@project.txt"; // Register File
	public static String[] splitted_text_data; // Split Text Data and keep into this variable
	public static String[] anim_params; // Parameters for using CharAnimation
	public static Scanner input = new Scanner(System.in); // Scanner Object
	public static int menu_choice; // Choice for Menu Selection
	public static String octal_input;

	public static void main(String[] args) {
		checkfile(); // Verify User
	}
	
	public static void mymenu(){
		Integer menu_choice = 0;
		try{
			clearscreen();
			datareader();
			String username = splitted_text_data[1];
			anim_params = CharAnimation("\n =========================","05");
			anim_params = CharAnimation("\n # Base Number Converter #","05");
			anim_params = CharAnimation("\n =========================","05");
			anim_params = CharAnimation("\n\n  1. Binary(2)","10");
			anim_params = CharAnimation("\n\n  2. Octal(8)","10");
			anim_params = CharAnimation("\n\n  3. Decimal(10)","10");
			anim_params = CharAnimation("\n\n  4. Hexadecimal(16)","10");
			anim_params = CharAnimation("\n\n ---------------------","05");
			anim_params = CharAnimation("\n  5. About || 0. Exit","05");
			anim_params = CharAnimation("\n ---------------------","05");
			anim_params = CharAnimation("\n\n  "+username+" > Choice : ","05");
			menu_choice = input.nextInt();
			switch(menu_choice){
			case 0:
				exitprogram();
				break;
			case 1:
				binaryfunction();
				break;
			case 2:
				octalfunction();
				break;
			case 3:
				decimalfunction();
				break;
			case 4:
				hexadecimalfunction();
				break;
			case 5:
				aboutprogram();
				break;
			default:
				JOptionPane.showMessageDialog(null," Invalid Choice  ! \n Please Try Again..."," Invalid Choice", JOptionPane.ERROR_MESSAGE);
				mainmenu();
			}
			mainmenu(); // If exit from switch case
		}catch(java.util.InputMismatchException e){
			JOptionPane.showMessageDialog(null," Invalid Choice  ! \n Please Try Again..."," Invalid Choice", JOptionPane.ERROR_MESSAGE);
			input.next(); // Stop Looping
			mainmenu();
		}
	}

	public static void mainmenu(){
		mymenu();
	}

	public static void binaryfunction(){
		try{
			clearscreen(); // Clear Console Screen
			datareader(); // Read Username
			String username = splitted_text_data[1];
			Binary binary_obj = new Binary();	// Binary Object
			binary_obj.binary_home(); // Main Menu of Binary
			anim_params = CharAnimation("\n\n  "+username+" > Choice : ","10");
			menu_choice = input.nextInt(); // Input Menu
			binary_obj.setMenu_choice(menu_choice); // Set Menu
			binary_obj.switcher(); // Switch to Choosen Menu
		}catch(java.util.InputMismatchException e){
			JOptionPane.showMessageDialog(null," Invalid Choice ! \n Please Try Again..."," Invalid Choice", JOptionPane.ERROR_MESSAGE);
			input.next(); // Stop Looping
			binaryfunction();
		}
	}

	public static void octalfunction(){
		try{
			clearscreen(); // Clear Console Screen
			datareader(); // Read Username
			String username = splitted_text_data[1];
			Octal octal_obj = new Octal();	// Octal Object
			octal_obj.octal_home(); // Main Menu of Octal
			anim_params = CharAnimation("\n\n  "+username+" > Choice : ","10");
			menu_choice = input.nextInt(); // Input Menu
			octal_obj.setMenu_choice(menu_choice); // Set Menu
			octal_obj.switcher(); // Switch to Choosen Menu
		}catch(java.util.InputMismatchException e){
			JOptionPane.showMessageDialog(null," Invalid Choice ! \n Please Try Again..."," Invalid Choice", JOptionPane.ERROR_MESSAGE);
			input.next(); // Stop Looping
			octalfunction();
		}
	}

	public static void decimalfunction(){
		try{
			clearscreen(); // Clear Console Screen
			datareader(); // Read Username
			String username = splitted_text_data[1];
			Decimal decimal_obj = new Decimal();	// Decimal Object
			decimal_obj.decimal_home(); // Main Menu of Decimal
			anim_params = CharAnimation("\n\n  "+username+" > Choice : ","10");
			menu_choice = input.nextInt(); // Input Menu
			decimal_obj.setMenu_choice(menu_choice); // Set Menu
			decimal_obj.switcher(); // Switch to Choosen Menu
		}catch(java.util.InputMismatchException e){
			JOptionPane.showMessageDialog(null," Invalid Choice ! \n Please Try Again..."," Invalid Choice", JOptionPane.ERROR_MESSAGE);
			input.next(); // Stop Looping
			decimalfunction();
		}
	}

	public static void hexadecimalfunction(){
		try{
			clearscreen(); // Clear Console Screen
			datareader();  // Read Username
			String username = splitted_text_data[1]; // Keep username location into variable
			Hexadecimal hexadecimal_obj = new Hexadecimal(); // Hexadecimal Object
			hexadecimal_obj.hexadecimal_home(); // Main Menu of Hexadecimal
			anim_params = CharAnimation("\n\n  "+username+" > Choice : ","10");
			menu_choice = input.nextInt(); // Input Menu
			hexadecimal_obj.setMenu_choice(menu_choice); // Set Menu
			hexadecimal_obj.switcher(); // Switch to Choosen Menu
		}catch(java.util.InputMismatchException e){
			JOptionPane.showMessageDialog(null," Invalid Choice ! \n Please Try Again..."," Invalid Choice", JOptionPane.ERROR_MESSAGE);
			input.next(); // Stop Looping
			hexadecimalfunction();
		}
	}

	public static void aboutprogram(){ // GUI
		JOptionPane.showMessageDialog(null,
	    "Software Name : Base Number Converter\nWritten in : Java\nRelease : 15th October 2016\nDeveloper : Sunil Deshar\nFaculty : Computer Science || 2nd Year\nInstitution : RMUTL NAN\nPresent to : AJ Kaewbanjong Kwan",
	    " About Software",
	    JOptionPane.PLAIN_MESSAGE);
	}

	public static void register(){
		clearscreen();
		guiinput = JOptionPane.showInputDialog(null,"Enter Username (Ex : Deshario)","Registration", JOptionPane.INFORMATION_MESSAGE);
		if(guiinput!= null){
			String path = filename;
			File file = new File(path);
			FileWriter writer;
			try {
				writer = new FileWriter(file, false);  // True = Append to file, false = Overwrite
				writer.write("username:"+guiinput+"\r\n"); // Write value into writeer
				writer.close(); // Close writer
				mainmenu();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}else{
			clearscreen();
			System.out.print("\n Something went wrong ! \n");
			sleepnow(10);
			System.exit(0);
		}
	}

	public static void checkfile(){
		File myfile = new File(filename);
	  	if(myfile.exists()){ // If file was exits == Registered
	  		mainmenu();
	  	}else{ // New User
	  		clearscreen();
			JOptionPane.showMessageDialog(null,"It seems like you are a new user ! \nPlease click ok to get free account !","New User Detected", JOptionPane.INFORMATION_MESSAGE);
			register(); // Create Account
	  	}
	}

	public static void exitprogram(){ // Exit Program
		System.exit(0);
	}

	public static int sleepnow(int sleeptime){ // Delay Time
		try {
			Thread.sleep(sleeptime);
		}catch(InterruptedException ex){
    		Thread.currentThread().interrupt();
		}
		return sleeptime;
	}

	public static void datareader(){ // Read Username from filename and keep into array
		BufferedReader br = null;
		try{
			String line;
			br = new BufferedReader(new FileReader(filename));
			while ((line = br.readLine()) != null) {
				String delimitators = "([:\\n\\r\\s\\t]+)"; // Splitting words with symbols
				splitted_text_data = line.split(delimitators);  // Keep the splitted data into array
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public static String[] CharAnimation(String animtext, String animspeed){ // Text Animation
		String text = animtext;
		char[] charArr = text.toCharArray();
		for(int i = 0; i <= charArr.length-1; i++){
			try{
				long speed = Long.parseLong(animspeed); // Convert animspeed to long
				System.out.print(charArr[i]); // Show array[] value
				Thread.sleep(speed); // Delay time
			}catch (Exception e){
				e.printStackTrace();
			}
		}
		return new String[] {animtext, animspeed}; // Return 2 parameters
	}

	public static void clearscreen(){ // Clear Screen By Detect Operating System
    	try{
    		if (System.getProperty("os.name").contains("Windows")){ // If OS = Windows
    			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    		}else{ // Else Linux,MaxOS 
    			new ProcessBuilder("/bin/sh","-c","reset").inheritIO().start().waitFor();
    		}
    	}catch(IOException | InterruptedException ex){}
	}
}
