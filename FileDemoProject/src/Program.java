import java.io.File;

public class Program { // the project is for create a file and delete the file

	public static void main(String[] args) {
		File myFile = new File("test.txt");//File is Class and myFile is a object / txt- whar file we use (noet, excel etc)
		
		//C:\Users\crist_000\Desktop
		File file = new File("C:/Users/crist_000/Desktop/myFirstFile");
		//myFile.mkdir();//mkdir-  to make directory or folder or file//to make a folder/file
		//file.mkdir(); //To make a folder
		//myFile.delete();//to delete file or folder
		file.delete();
	}

}
