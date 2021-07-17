import java.text.SimpleDateFormat;
import java.util.Date;

public class Datedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Date d = new Date();
  SimpleDateFormat nd = new SimpleDateFormat("M/d/yyyy");// This is for printing date in specific format for date

  SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy hh:mm:ss");// This is for printing date in specific format with time format
  System.out.println(d.toString());// to print current date and time
  
  System.out.println(nd.format(d)); // .format(obj)string has to be selected to print date(d)
  System.out.println(sd.format(d));
	}

}
