package com.sbeans;

import org.springframework.stereotype.Component;

@Component
public final class BlueDart implements Courier {

	@Override
	public String deliver(int oid) {
		
		return "\nOID => "+oid+" :: Ordered item are kept for Delivery by bDart";
	}

}
