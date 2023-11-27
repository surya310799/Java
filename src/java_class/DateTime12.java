package java_class;
// import for Formatting Date and Time
import java.text.SimpleDateFormat;
//import for Date and Time
import java.util.Date;

public class DateTime12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dt = new Date(); 	// Reference the Date & Time
		
		System.out.println(dt);
		String pattern = "dd-MM-yyyy HH:mm"; //pattern for set date and time format
		SimpleDateFormat sf = new SimpleDateFormat(pattern);
		String formatted = sf.format(dt);
		System.out.println(formatted);
	}

}
