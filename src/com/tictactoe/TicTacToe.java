package com.tictactoe;

public class TicTacToe {

	public void usecase1() {
		char[] board=new char[10];
		for(int i=1;i<10;i++) {
			 board[i]='\0';
		}
		System.out.println(board);
	}
	public static void main(String[] args) {
		TicTacToe gameobj= new TicTacToe();
		gameobj.usecase1();
		System.out.println("Tic Tac Toe Game");

	}

}