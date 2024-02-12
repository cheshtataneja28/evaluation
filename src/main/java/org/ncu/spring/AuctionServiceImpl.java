package org.ncu.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class AuctionServiceImpl implements AuctionService
{
	@Autowired
	public bidrepository bdr;
	public AuctionServiceImpl(bidrepository bdr) 
	{
        this.bdr = bdr;
    }
	public void createAuction(String auctionDetails)
	{
		System.out.println("creating auction"+auctionDetails);
	}
	public void placeBid(int auctionId, bid b)
	 {
		 System.out.println("placing bid "+auctionId+b);
		 
	 }
	public String getAuctionDetails(int auctionId)
	 {
		 System.out.println("details ofauction "+auctionId);
		 return"auctiondetails";
	 }
}
