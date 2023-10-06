package kadai_024;

import java.util.Random;
import java.util.Scanner;

public class Jyanken_Chapter24 {
	
	private String myHand = "";
	private String opponentHand = "";

	public String getMyChoice() {
		while(true) {
			Scanner scan = new Scanner(System.in);
			String letter = scan.next();
			if (letter.equals("r")) {
				myHand = "グー";
				scan.close();
				break;
			} else if (letter.equals("s")) {
				myHand = "チョキ";
				scan.close();
				break;
			} else if (letter.equals("p")) {
				myHand = "パー";
				scan.close();
				break;
			} else {
				System.out.println("もう一度入力してください(グーはr/チョキはs/パーはp)");
				letter = "";
				continue;
			}
		}
		return myHand;
	}
	
	public String getRandom() {
		Random rand = new Random();
		int num = rand.nextInt(3) + 1;
		if (num == 1) {
			opponentHand = "グー";
		}
		if (num == 2) {
			opponentHand = "チョキ";
		}
		if (num == 3) {
			opponentHand = "パー";
		}
		return opponentHand;
	}
	
	public void playGame(String myhand, String opponentHand) {
		if((myhand.equals("グー") && opponentHand.equals("チョキ")) || 
		   (myhand.equals("チョキ") && opponentHand.equals("パー")) ||
		   (myhand.equals("パー") && opponentHand.equals("グー"))) {
			System.out.println("自分の勝ちです");
		}
		else if((myhand.equals("グー") && opponentHand.equals("グー")) || 
		   (myhand.equals("チョキ") && opponentHand.equals("チョキ")) ||
		   (myhand.equals("パー") && opponentHand.equals("パー"))) {
			System.out.println("あいこです");
		}
		else if((myhand.equals("グー") && opponentHand.equals("パー")) || 
		   (myhand.equals("チョキ") && opponentHand.equals("グー")) ||
		   (myhand.equals("パー") && opponentHand.equals("チョキ"))) {
			System.out.println("相手の勝ちです");
		}
	}
}
