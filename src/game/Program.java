package game;
import java.util.Scanner;

import db.testDataBase;
import db.IDataBase;

public class Program {
	public static void main(String[] args) {
	IGameFactory gameFactory =new GameFactory();
	IDataBase db = new testDataBase();
	IChat chat = new Chat(gameFactory, db);
	Scanner in = new Scanner(System.in);
	String input;
	while(true)
	{
        input = in.nextLine();
        Reply reply = chat.ProcessRequest(input, 1);
        System.out.print(reply.botAnswer+"\n");
        if(reply.keyboardOptions != null)
        	System.out.print("you can sent: " +String.join(";", reply.keyboardOptions));
	    if (reply.botAnswer == "Game is over")
	            break; 
	};
}
}
