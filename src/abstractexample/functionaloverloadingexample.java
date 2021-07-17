package abstractexample;

public class functionaloverloadingexample {
	
	public void getdata(int a) {
		System.out.println(a);
	}
	public void getdata(String a){
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		functionaloverloadingexample k = new functionaloverloadingexample();
		k.getdata(2);
		k.getdata("Hello");
	}

}
