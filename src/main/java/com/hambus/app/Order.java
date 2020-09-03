package com.hambus.app;

import lombok.Builder;
import lombok.NonNull;

@Builder
public class Order{
	@NonNull public int OrderId;
	@NonNull public String ProductOrdered;
	
	
}