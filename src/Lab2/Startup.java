/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

/**
 *
 * @author James
 */
public class Startup {

    public static void main(String[] args) {
        DateService ds = new DateService();

        String date = "03/15/2014";

        ds.convertStringToDate(date);

        date = "March 15, 2014 2:30 PM";

        ds.convertStringToCalendar(date);
    }

}
