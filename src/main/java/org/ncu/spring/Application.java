package org.ncu.spring;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
	

	public static void main(String[] args) {
			ApplicationContext context=	SpringApplication.run(Application.class, args);
			 bidrepository bidRepository = context.getBean(bidrepository.class);
			bid b=new bid();
			
			 bidRepository.save(b);
			 bidRepository.findById(1);
			  AuctionService a= context.getBean(AuctionService.class);
			  a.createAuction("Auction1");
		      a.placeBid(1, b);
		      a.getAuctionDetails(1);
			
	}

}