package abstractexample;

public class interviewminimumnumber {
	
	/*
	 * 2 4 6
	 3 8 7
	 5 1 0
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int abc[][]= {{2,4,6},{3,8,7},{5,1,0}};// create 3*3 matrix and capture in abc
		int min=abc[0][0];// define min value is like initiate to provide capture minimum value in obj min
		int mincol=0;
		for(int i=0; i<3;i++) { // loop create for row
			for(int j=0; j<3; j++) {// loop create for column
				if (abc[i][j]<min) {// this is condition to check value of abc , if it is lowest then goes inside and capture
					min=abc[i][j];// if at any position value is minimum then capture here
					mincol=j;// This capture column where minimum value is captured
				}
				
			}
		}
		int max=abc[0][mincol];//capture in max object value of maximum number in that column
		int k=0; // initialize row with this
		while(k<3)// this will move in row 
		{
			if (abc[k][mincol]>max)
			{
				max=abc[k][mincol];
				
			}
			k++;
		}
		System.out.println(max);
		
		
		
		System.out.println(min);
		
	}

}
