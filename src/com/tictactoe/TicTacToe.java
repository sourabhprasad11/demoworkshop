package com.tictactoe;
import java.util.Scanner;

public class TicTacToe {
	static char[] board;
	static String user;
	static String computer;
	
	public void getboard() {
		board=new char[10];
		for(int i=1;i<10;i++) {
			 board[i]='\0';
		}
		System.out.println(board);
	}
	
	public void getinput() {
		System.out.println("Enter the input for the game => x,o");
		Scanner input=new Scanner(System.in);
		String userinput=input.next();
		
		if(userinput.equals("x")) {
			user="x";
			computer="o";
			System.out.println("user="+user+", computer="+computer);
		}else if(userinput.equals("o")) {
			computer="x";
			user="o";
			System.out.println("user="+user+", computer="+computer);
		}
		else {
			System.out.println("Wrong input");
			getinput();
		}
					
	}
	
	public void showboard() {
		System.out.println("	|	|	");
		System.out.println("-----------------------");
		System.out.println("	|	|	");
		System.out.println("-----------------------");
		System.out.println("	|	|	");
	}
	
	
	public static void main(String[] args) {
		TicTacToe game= new TicTacToe();
		System.out.println("Tic Tac Toe Game");
		game.getboard();
		game.getinput();
		game.showboard();

	}

}
