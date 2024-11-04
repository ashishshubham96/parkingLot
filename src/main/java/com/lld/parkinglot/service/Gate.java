package com.lld.parkinglot.service;

import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

public class Gate {
	
	Map<Integer, Entrance> entranceGate = new ConcurrentSkipListMap<>();
	
	Map<Integer, Entrance> exitGate = new ConcurrentSkipListMap<>();
	
	

}
