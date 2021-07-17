package abstractexample;

public class Spice extends Airlines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Spice c = new Spice();
 c.color();
 c.engine();
 c.safety();
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("Red color");
	}

}
