import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calendardemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calendar cal = Calendar.getInstance();
SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
System.out.println(sd.format(cal.getTime()));
System.out.println(cal.getFirstDayOfWeek());
System.out.println(cal.getCalendarType());
System.out.println(cal.getTimeZone());
System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
System.out.println(cal.get(Calendar.DECEMBER));
	}

}
