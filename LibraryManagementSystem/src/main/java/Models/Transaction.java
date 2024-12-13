package Models;

import java.sql.Date;

public class Transaction {
	private String transactionId;
    private String bookId;
    private String patronId;
    private Date borrowDate;
    private Date dueDate;
    private Date returnDate;
  
    private double fine;
	
    public String getTransactionId() { 
    	return transactionId; }
    
    public void setTransactionId(String transactionId) { this.transactionId = transactionId; }
    
    public String getPatronId() { return patronId; }
    
    public void setPatronId(String patronId) { this.patronId = patronId; }
    
    public String getBookId() { return bookId; }
    
    public void setBookId(String bookId) { this.bookId = bookId; }
    
    public Date getBorrowDate() { return borrowDate; }
    
    public void setBorrowDate(Date borrowDate) { this.borrowDate = borrowDate; }
    
    public Date getDueDate() { return dueDate; }
    
    public void setDueDate(Date dueDate) { this.dueDate = dueDate; }
    
    public Date getReturnDate() { return returnDate; }
    
    public void setReturnDate(Date returnDate) { this.returnDate = returnDate; }
    
    public double getFine() { return fine; }
    
    public void setFine(double fine) { this.fine = fine; }

    public static String generateTransId() {
        return "BT" + (int) (Math.random() * 1000000);
    }
    
    public void calculateFine(double ratePerDay) { //latency 
        if (null != returnDate && returnDate.after(dueDate)) {
            long overdueDays = (returnDate.getTime() - dueDate.getTime()) / (1000 * 60 * 60 * 24);//this for Convert from milliseconds to days  
            fine = overdueDays * ratePerDay;
        }
    }

    
    
	
}
