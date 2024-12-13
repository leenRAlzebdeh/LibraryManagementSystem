package Models;

import java.sql.Date;

public class Fine {

	 private String fineId;
	    private String patronId;//fine -> specific user 
	    private double amount;
	    private Date fineDate;
	    private boolean isPaid;

	   
	    public String getFineId() { return fineId; }
	    
	    public void setFineId(String fineId) { this.fineId = fineId; }
	    
	    public String getPatronId() { return patronId; }
	    
	    public void setPatronId(String patronId) { this.patronId = patronId; }
	    
	    public double getAmount() { return amount; }
	    
	    public void setAmount(double amount) { this.amount = amount; }
	    
	    public Date getFineDate() { return fineDate; }
	    
	    public void setFineDate(Date fineDate) { this.fineDate = fineDate; }
	    
	    public boolean isPaid() { return isPaid; }
	    
	    public void setPaid(boolean paid) { isPaid = paid; }

	   
	    public void markPaid() {
	        this.isPaid = true;
	    }
	
	
}
