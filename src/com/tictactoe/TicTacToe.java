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
		
		if(userinput.toLowerCase().equals("x")) {
			user="x";
			computer="o";
			System.out.println("user="+user+", computer="+computer);
		}else if(userinput.toLowerCase().equals("o")) {
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
		System.out.println(board[7]+"  |  "+board[8]+"  |  "+board[9]);
		System.out.println("-----------------------");
		System.out.println(board[4]+"  |  "+board[5]+"  |  "+board[6]);
		System.out.println("-----------------------");
		System.out.println(board[1]+"  |  "+board[2]+"  |  "+board[3]);
	}
	
	public void makeMove() {
		getinput();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter ur choice: ");
		int choice=sc.nextInt();
		switch(choice){
		case 1:
			if(board[1]=='\0') {
			board[1]=user.charAt(0);
			}
			break;
		case 2:
			if(board[2]=='\0') {
			board[2]=user.charAt(0);
			}
			break;
		case 3:
			if(board[3]=='\0') {
			board[3]=user.charAt(0);
			}
			break;
		case 4:
			if(board[4]=='\0') {
			board[4]=user.charAt(0);
			}
			break;
		case 5:
			if(board[5]=='\0') {
			board[5]=user.charAt(0);
			}
			break;
		case 6:
			if(board[6]=='\0') {
			board[6]=user.charAt(0);
			}
			break;
		case 7:
			if(board[7]=='\0') {
			board[7]=user.charAt(0);
			}
			break;
		case 8:
			if(board[8]=='\0') {
			board[8]=user.charAt(0);
			}
			break;
		case 9:
			if(board[9]=='\0') {
			board[9]=user.charAt(0);
			}
			break;
		default:
			System.out.println("Entered wrong choice..");
		}
		
		showboard();
		
	}
	
	public static void main(String[] args) {
		TicTacToe game= new TicTacToe();
		System.out.println("Tic Tac Toe Game");
		game.getboard();
		game.getinput();
		game.showboard();
		game.makeMove();
	}

}
