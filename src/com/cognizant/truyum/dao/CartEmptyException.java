
package com.cognizant.truyum.dao;

import java.util.*;

public class CartEmptyException extends Exception{

	public CartEmptyException()
	{
		
		System.out.println("cart is empty");
	}
}
