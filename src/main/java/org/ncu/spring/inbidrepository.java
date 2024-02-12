package org.ncu.spring;

import java.util.*;
import java.util.Map;

public class inbidrepository implements bidrepository 
{
	Map<Integer, bid> bids = new HashMap<>();
    static int idCounter = 0;
	@Override
	public bid save(bid b) 
	{
		 if (b.getId() == 0) 
		 {
	     idCounter++;
	     b.setId(idCounter);
		 }
		 bids.put(b.getId(), b);
	     return b;
	}

	public bid findById(int id) 
	{
		return bids.get(id);
	}

	@Override
	public List<bid> findAll() 
	{
		return new ArrayList<>(bids.values());
	}

	@Override
	public void delete(int id) 
	{
		bids.remove(id);
	}

}
