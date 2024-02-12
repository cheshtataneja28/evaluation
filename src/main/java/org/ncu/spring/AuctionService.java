package org.ncu.spring;
import java.util.*;
public interface AuctionService 
{
	 void createAuction(String auctionDetails);
	 void placeBid(int auctionId, bid b);
	 String getAuctionDetails(int auctionId);
}
