package com.bridgelabz.service;

public interface ServicesProvidingInterface
{
public void addItemToInventory(String filepath,Object o);
public void deleteItemFromInventory(String filepath);
public void displayTheInventory(String filepath);
public void editTheItemValue(String filepath);
public void totalValueOfInventory(String filepath);
public void totalWeightOfInventory(String filepath);
public void totalPriceOfInventory(String filepath);
}
