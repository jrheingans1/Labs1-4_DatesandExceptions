package Lab1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Invoice {

    private int gracePeriod = 15;

    private Calendar invoiceDate = Calendar.getInstance();
    private Calendar dueDate;

    private Date date;
    private SimpleDateFormat simpleDateFormat;

    public Invoice() {
        setInvoiceDate(Calendar.getInstance());
    }

    public String getFormattedInvoiceDate() {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss a");
        return dateFormat.format(getInvoiceDate().getTime());
    }

//    public Calendar getFutureDueDate() {
//        setDueDate((Calendar) getInvoiceDate().clone());
//        getDueDate().add(Calendar.DATE, getGracePeriod());
//        return getDueDate();
//    }

    public String getDueDateAsString() {
        setSimpleDateFormat(new SimpleDateFormat("MM/dd/YYYY"));
        setDueDate((Calendar) getInvoiceDate().clone());
        getDueDate().add(Calendar.DATE, getGracePeriod());
        setDate(getDueDate().getTime());
        return getSimpleDateFormat().format(getDate());
    }

    public Calendar getInvoiceDate() {
        return invoiceDate;
    }

    public final void setInvoiceDate(Calendar invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public Calendar getDueDate() {

        return dueDate;
    }

    public final void setDueDate(Calendar dueDate) {
        this.dueDate = dueDate;
    }

    public int getGracePeriod() {
        return gracePeriod;
    }

    public final void setGracePeriod(int gracePeriod) {
        this.gracePeriod = gracePeriod;
    }

    public Date getDate() {
        return date;
    }

    public final void setDate(Date date) {
        this.date = date;
    }

    public SimpleDateFormat getSimpleDateFormat() {
        return simpleDateFormat;
    }

    public final void setSimpleDateFormat(SimpleDateFormat simpleDateFormat) {
        this.simpleDateFormat = simpleDateFormat;
    }

}
