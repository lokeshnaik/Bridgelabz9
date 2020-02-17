package com.bridgelabz.utility;

import java.util.Scanner;

import deckofcards.DeckOfCardsProgram;

public class Utility
{
  public static void shufflingOfCards(String deckofcards[],int number)
  {
	  System.out.println("Enter number of times a cards to be shuffled:");
	  Scanner sc=new Scanner(System.in);
	 int count=sc.nextInt();
	 for(int i=0;i<count;i++)
	 {
		 int first=(int) ((Math.random()*52));
		 int second=(int) ((Math.random()*52));
		 String temp=deckofcards[first];
		 deckofcards[first]=deckofcards[second];
		 deckofcards[second]=temp;
	 }
  }
  public static void distrubtingCards(String deckofcards[],int number)
  {
	  String []cards=new String[36];
	  int j=0,k=0,l=0,m=0;
	  int count=36;
	  for(int i=0;i<36;i++)
	  {
		  cards[i]="0";
	  }
	  for(int i=0;i<9;i++)
	  {
		  j=i;
		 cards[j]=deckofcards[j];
		 k=9+i;
		 cards[k]=deckofcards[k];
		 l=18+i;
		 cards[l]=deckofcards[l];
		 m=27+i;
		 cards[m]=deckofcards[m];
	  }
	  DeckOfCardsProgram.display(cards,count);
  }
}
