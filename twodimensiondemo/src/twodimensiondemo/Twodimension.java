package twodimensiondemo;

public class Twodimension {

	public static void main(String[] args) {
		
	int marks[][]= {{22,55,57},{33,66,99},{77,88,100,200}};
		
		for(int row=0; row<marks.length;row++) {
			for(int column=0; column<marks[row].length;column++) {
				System.out.print(marks[row][column]+"\t");
				
			}
			System.out.println();
		}
	}

}
