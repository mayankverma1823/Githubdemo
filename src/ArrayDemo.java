
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int [5];
		//this define that an array and allocates memory for that array
		a[0]= 2;
		a[1]=6;
		a[2]=8;
		a[3]=7;
		a[4]=13;//initialized values in array
		
		//Array Literals example
		int b[]= {1,4,5,8,3};
		// above step is provide value to memory allocated in array
		for(int i =0; i<b.length; i++) {
			// above loop explains like a.length will print total memory allocation of array and print that in loop say 5
			System.out.println(b[i]);//retrieve value of array
		}
		
		
	}

}
