package org.ncu.spring;
import java.util.*;
public interface bidrepository 
{
	bid save(bid b); // Create or update
    bid findById(int id);
    List<bid> findAll();
    void delete(int id);
}
