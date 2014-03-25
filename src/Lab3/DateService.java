package Lab3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateService {

    public final void convertStringToDate(String dateString) throws RuntimeException {
        if (dateString == null || dateString.isEmpty()) {
            throw new RuntimeException("Values can not be null or empty");
        }
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        try {
            Date date = df.parse(dateString);
            System.out.println(df.format(date) + " This is the Date Object");
        } catch (ParseException pe) {
            System.out.println("Illegal format, use following format: #/##/####");
        }

    }

    public final void convertStringToCalendar(final String dateString) throws RuntimeException {
        if (dateString == null || dateString.isEmpty()) {
            throw new RuntimeException("Values can not be null or empty");
        }
        Calendar calendar = Calendar.getInstance();
        DateFormat df = new SimpleDateFormat("MMM dd, yyyy H:mm a");
        try {
            calendar.setTime(df.parse(dateString));
            Date d = calendar.getTime();
            System.out.println(df.format(d) + " This is the Calendar Object");
        } catch (ParseException pe) {
            System.out.println("Illegal format, use follwing format example: March 15, 2014 2:30 PM");
        }
    }

}
