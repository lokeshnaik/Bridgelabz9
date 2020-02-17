package controller;

import java.io.IOException;

import model.BeanClass;
import repository.RepositoryMethodsImplementation;
import utility.InputScanner;



public class Main {

public static void main(String[] args) throws IOException
{
int choice;
do
{
System.out.println("1.Add the person details:");
System.out.println("2.Delete the person details:");
System.out.println("3.Edit person details:");
System.out.println("4.Search the person details:");
/*System.out.println("5.To sort by name:");
System.out.println("6.To sort by Zip code:");
System.out.println("7.To sort by Phone number:");*/
System.out.println("8.Search the single person details:");
System.out.println("9.To exit the program:");
System.out.print("Enter your choice:");
choice=InputScanner.integerInput();
RepositoryMethodsImplementation repository=new RepositoryMethodsImplementation();
String filepath="/home/bridgelabz/eclipse-workspace/BridgeLabz7/AddressBookProgram/src/repository/sample7.json";
switch(choice)
{
case 1:
{
BeanClass bean=new BeanClass();
repository.addThePersonDetails(filepath,bean);
break;
}
case 2:
{
repository.deleteThePersonDetails(filepath);
break;
}
case 3:
{
repository.editPersonDetails(filepath);
break;
}
case 4:
{
repository.searchThePersonDetails(filepath);
break;
}
/*case 5:
{
	repository.sortByName(filepath);
}
case 6:
{
	repository.sortByZip(filepath);
}
case 7:
{
	repository.sortByPhoneNumber(filepath);
}*/
case 8:
{
	repository.searchTheSinglePersonDetails(filepath);
	break;
}
case 9:
{
  choice=-1;
break;
}
default:
{
System.out.println("Invalid Option");
}
}
}while(choice!=-1);
}

}