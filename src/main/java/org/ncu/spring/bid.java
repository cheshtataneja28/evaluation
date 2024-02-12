package org.ncu.spring;

public class bid 
{
	int id;
    String bidder;
    double amount;
    long timestamp;
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getBidder() 
	{
		return bidder;
	}
	public void setBidder(String bidder) 
	{
		this.bidder = bidder;
	}
	public double getAmount() 
	{
		return amount;
	}
	public void setAmount(double amount) 
	{
		this.amount = amount;
	}
	public long getTimestamp() 
	{
		return timestamp;
	}
	public void setTimestamp(long timestamp) 
	{
		this.timestamp = timestamp;
	}
	@Override
	public String toString()
	{
		return "bid [id=" + id + ", bidder=" + bidder + ", amount=" + amount + ", timestamp=" + timestamp + "]";
	}

}
