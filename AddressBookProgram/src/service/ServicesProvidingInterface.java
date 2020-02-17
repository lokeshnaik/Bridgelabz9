package service;

public interface ServicesProvidingInterface
{
public void addThePersonDetails(String filepath,Object o);
public void deleteThePersonDetails(String filepath);
public void editPersonDetails(String filepath);
public void searchThePersonDetails(String filepath);
//public void sortByName(String filepath);
//public void sortByZip(String filepath);
//public void sortByPhoneNumber(String filepath);
public void searchTheSinglePersonDetails(String filepath);

}