package com.brideglabz.stockaccountmanagement.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.brideglabz.stockaccountmanagement.utilityscanner.UtilityScanner;

public class BeanClass 
{
	private String stockname;
	  private double shareprice;
	  private double noofshares ;
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  public BeanClass() throws IOException
	  {
	  System.out.print("Enter the stockname:");
	  this.stockname=br.readLine();
	  System.out.print("Enter the shareprice:");
	  this.shareprice=UtilityScanner.doubleInput();
	  System.out.print("Enter the noofshares:");
	  this.noofshares=UtilityScanner.doubleInput();
	  }
	  public String getStockname() {
		return stockname;
	}
	public void setStockname(String stockname) {
		this.stockname = stockname;
	}
	public double getShareprice() {
		return shareprice;
	}
	public void setShareprice(double shareprice) {
		this.shareprice = shareprice;
	}
	public double getNoofshares() {
		return noofshares;
	}
	public void setNoofshares(double noofshares) {
		this.noofshares = noofshares;
	}


}
