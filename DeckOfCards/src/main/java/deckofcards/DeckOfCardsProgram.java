package deckofcards;

import com.bridgelabz.utility.Utility;

public class DeckOfCardsProgram 
{
  public static void main(String [] args)
  {
	  System.out.println("Program of deck of cards");
	  String []cards=new String[] {"Clubs","Diamonds","Hearts","Spades"};
	  String []array=new String[] {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
	 String []deckofcards=new String[52];
	 int k=0;
	  for(int i=0;i<4;i++)
	  {
		  for(int j=0;j<13;j++)
		  {
			  deckofcards[k]=cards[i]+array[j];
			  k++;
		  }
	  }
	  Utility.shufflingOfCards(deckofcards,k); 
	  Utility.distrubtingCards(deckofcards,k);
  }
  public static void display(String cards[],int number)
   {
	  int i=0;
	  System.out.println("First person having cards:");
	  while(i<9)
	  {
		  System.out.print(cards[i]+" ");
		  i++;
	  }
	  System.out.println();
	  System.out.println("Second person having cards:");
	  while(i<18)
	  {
		  System.out.print(cards[i]+" ");
		  i++;
	  }
	  System.out.println();
	  System.out.println("Third person having cards:");
	  while(i<27)
	  {
		  System.out.print(cards[i]+" ");
		  i++;
	  }
	  System.out.println();
	  System.out.println("Fourth person having cards:");
	  while(i<36)
	  {
		  System.out.print(cards[i]+" ");
		  i++;
	  }
   }
}
