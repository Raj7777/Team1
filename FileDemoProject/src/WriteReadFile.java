import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteReadFile {

	public static void main(String[] args) {
		File myFile = new File("test.txt");// myFile is name for the file //MY IS A OBJECT  and test.txt is name of the file
		
		//To write to the file
		/*try {
			PrintWriter output = new PrintWriter(myFile);//PrintWrite is a Class/ output name of the object
			output.println("Anu Malik");
			output.println(36);
			output.close(); // inseamna ca salvam ce am scris in file
		}
		catch (IOException ex) { //IO -input output exception
		System.out.println("Error: "+ ex); // daca pun printf folosesc coma nu plus // exemplu pt eroare daca creez alt file cu acelasi nume

	}
	*/
		// To read from the file
		try {
			Scanner input = new Scanner(myFile);// pt ca citim de la file nu din sistem ( nu folosim System.)
			String name = input.nextLine();
			int age = input.nextInt();
			System.out.println("Name: " + name + " Age: " + age);
		}catch (FileNotFoundException ex) {
			System.out.printf("Error!",ex);
		}
		
		
		
	}
}
