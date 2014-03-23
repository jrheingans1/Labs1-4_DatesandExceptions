/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

/**
 *
 * @author James
 */
public class Startup {

    public static void main(String[] args) {
        Invoice i = new Invoice();
        System.out.println("Invoice Date: " + i.getFormattedInvoiceDate());
        System.out.println("Due Date " + i.getDueDateAsString());
    }

}
