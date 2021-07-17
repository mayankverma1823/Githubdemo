package abstractexample;

public class Child  extends parentchild{
	
	public void color() {
		System.out.println("new color");
	}

	public static void main(String[] args) {
		
		Child j = new Child();
		j.audio();
		j.brakes();
		j.engine();
		j.color();
		
		// TODO Auto-generated method stub

	}

}
