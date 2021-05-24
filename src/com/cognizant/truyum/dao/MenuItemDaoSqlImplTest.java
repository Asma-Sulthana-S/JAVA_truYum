package com.cognizant.truyum.dao;

import java.util.*;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.sql.*;
import java.util.*;

public class MenuItemDaoSqlImplTest {
	public static void testGetMenuItemListAdmin()
	{
		//MenuItemDao menuItemDao;
		MenuItemDaoSqlImpl menuItemDao = null;
		try
		{
			menuItemDao = new MenuItemDaoSqlImpl();
			ArrayList<MenuItem> menuItems = new ArrayList <MenuItem>();
			menuItems = menuItemDao.getMenuItemListAdmin();
            System.out.println("Menu item list for admin"); 
            System.out.println(String.format("%-25s%-25s%-25s%-25s%-25s%-25s\n","Name","Price","Active","Date Of Launch","Category","Free Delivery"));   
			for (MenuItem items : menuItems) {

				System.out.println(String.format("%-25s%-25s%-25s%-25s%-25s%-25s\n",items.getName(),items.getPrice(),items.isActive(),items.getDateOfLaunch(),items.getCategory(),items.isFreeDelivery()));

			}	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void testGetMenuItemListCustomer()
	{
		
		//MenuItemDao menuItemDao;

		try {

			MenuItemDao menuItemDao = new MenuItemDaoSqlImpl();

			ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();

			menuItems = menuItemDao.getMenuItemListCustomer();

			System.out.println("Menu item list for customer"); 

			System.out.println(String.format("%-25s%-25s%-25s%-25s%-25s%-25s\n","Name","Price","Active","Date Of Launch","Category","Free Delivery"));

			for (MenuItem items : menuItems) {

				System.out.println(String.format("%-25s%-25s%-25s%-25s%-25s%-25s\n",items.getName(),items.getPrice(),items.isActive(),items.getDateOfLaunch(),items.getCategory(),items.isFreeDelivery()));


			}

		} catch (Exception e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}
	}
	public static void testmodifyMenuItem()
	{
		try {

			MenuItem menuItem= new MenuItem((long) 05,"Chocolate Brownie", "Dessert",(float)170.0, true,true, DateUtil.convertToDate("02/11/2019"));
				
			
			
			MenuItemDaoSqlImpl menuItemDao = new MenuItemDaoSqlImpl();
			menuItemDao.modifyMenuItem(menuItem);

			MenuItem Obj=menuItemDao.getMenuItem(menuItem.getId());
			
			if(Obj.getPrice()==170)
			{


			System.out.println(String.format("%-25s%-25s%-25s%-25s%-25s%-25s\n","Name","Price","Active","Date Of Launch","Category","Free Delivery")); 

			System.out.println(String.format("%-25s%-25s%-25s%-25s%-25s%-25s\n",Obj.getName(),Obj.getPrice(),Obj.isActive(),Obj.getDateOfLaunch(),Obj.getCategory(),Obj.isFreeDelivery()));


			System.out.println("Modification Done");
			}
		else
			System.out.println("Modification not done");
			

		} catch (Exception e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}
	}
	
	public static void main(String[] args) throws CartEmptyException
	{
		testGetMenuItemListAdmin();
		testGetMenuItemListCustomer();
        testmodifyMenuItem();
		
		
	}

	
}