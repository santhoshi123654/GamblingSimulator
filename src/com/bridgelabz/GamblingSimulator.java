package com.bridgelabz;

public class GamblingSimulator {
	
	private static final int Stake = 100;
	private static final int Bet = 1;
	private static final int iS_Win = 1;
	private static final int iS_Loose = 0;

	public static void main(String[] args) {
	
		 int winAmtInADay=0,looseAmtInADay=0;
		System.out.println("gambler starting with a stake of : $" + Stake + " and bet in every game is : $" + Bet);
		double random =  Math.random()*2;
		
		switch((int)random) {
		case iS_Win:
			winAmtInADay = winAmtInADay + Bet;
			System.out.println("win amount in a day is = " + winAmtInADay);
			break;
		default :
			looseAmtInADay = looseAmtInADay - Bet;
			System.out.println("loose amount in a day = " + looseAmtInADay);
		}
	}
}
