/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;


/**
 *
 * @author James
 */
public class Startup {

    public static void main(String[] args) {
        DateService ds = new DateService();

        String date = "03/15/2014";
        try {
            ds.convertStringToDate(date);
        } catch (NullPointerException | EmptyValueException eve) {
            System.out.println(eve.getLocalizedMessage());
        }
        date = "March 15, 2014 2:30 PM";
        try {
            ds.convertStringToCalendar(date);
        } catch (NullPointerException | EmptyValueException eve) {
            System.out.println(eve.getLocalizedMessage());
        }
    }

}
