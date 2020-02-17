package com.bridgelabz.service;

import java.io.IOException;

public interface ServicesProvidingInterface
{
	public void addThecompany(String filepath)throws IOException;
	public void deleteThecompany(String filepath);
	public void editTheCompanyToPurchase(String filepath);
	public void editTheCompanyToSell(String filepath);
	public void searchTheSingleCompanyDetails(String filepath);
	public void DisplayTheEntireCompantDetails(String filepath);
}
