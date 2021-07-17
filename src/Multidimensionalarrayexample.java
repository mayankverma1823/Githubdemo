
public class Multidimensionalarrayexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//a[row] [column]
		int a[][]= new int[2][3];
		a[0][0]=3;
		a[0][1]=4;
		a[0][2]=56;
		a[1][0]=0;
		a[1][1]=10;
		a[1][2]=07;
		System.out.println(a[1][0]);
		// Array literals in multidimensional
	/*	int b[][] = {{2,4,7},{4,56,7}};
		System.out.println(b[0][2]);*/
		
		for (int i=0; i<2; i++) { // represents row
			for (int j=0; j<3; j++) { //represents column
				System.out.println(a[i][j]);
			}
				
		}
		
	}

}
