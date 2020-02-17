package com.bridgelabz.model;



import java.io.BufferedReader;
import java.io.IOException;
//import java.io.IOException;
import java.io.InputStreamReader;


import com.bridgelabz.utility.InputScanner;


public class BeanClassName 
{
	  private String stockAccountCompany;
	  private String symbol;
	  private String date;
	  private double sharePrice;
	  private double noOfShares ;
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  public BeanClassName() throws IOException
	  {
		  System.out.print("Enter the stock account company:");
		  this.stockAccountCompany=InputScanner.stringInput();
		  System.out.print("Enter the symbol of the company:");
		  this.symbol=InputScanner.stringInput();
		  System.out.print("Enter the date:");
		  this.date=InputScanner.stringInput();
		  System.out.print("Enter the share price of the company:");
		  this.sharePrice=InputScanner.doubleInput();
		  System.out.print("Enter the no of shares:");
		  this.noOfShares=InputScanner.doubleInput();

		  }
	public String getstockAccountCompany() {
		return stockAccountCompany;
	}
	public void setStockAccountCompany(String stockAccountCompany) {
		this.stockAccountCompany = stockAccountCompany;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}
	public double getNoOfShares() {
		return noOfShares;
	}
	public void setNoofshares(double noOfShares) {
		this.noOfShares = noOfShares;
	}

}
