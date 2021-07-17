
public class IndianRules implements Trafficrules,Trainsymbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trafficrules tr = new IndianRules();
		// This object is created from interface and class
		// if we want to call other interface and create object to call method of that then use other object
		Trainsymbol u = new IndianRules();
		u.traintraffic();
tr.Green();
tr.Red();
tr.Yellow();

IndianRules k = new IndianRules();
k.walkin();
// This step is to show that if method is not taken from interface then we have to create object from class and then call method
	}
	
		
	

	@Override
	public void Green() {
		// TODO Auto-generated method stub
		System.out.println("Please go");
	}

	@Override
	public void Red() {
		// TODO Auto-generated method stub
		System.out.println("Please Stop");
		
	}
	public void walkin() {   
		System.out.println("Please walk");
	}
// This above code is new method created which is not taken from interface so we have to create object of this class to run this
	@Override
	public void Yellow() {
		// TODO Auto-generated method stub
		System.out.println("Be ready to stop/start");
	}




@Override
public void traintraffic() {
	// TODO Auto-generated method stub
	System.out.println("train stop");
}
 
 }
