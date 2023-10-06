package kadai_024;

public class JyankenExec_Chapter24 {

	public static void main(String[] args) {
		Intro();
		Jyanken_Chapter24 jyanken = new Jyanken_Chapter24();
		String myHand = jyanken.getMyChoice();
		String opponentHand = jyanken.getRandom();
		System.out.println("自分の手は" + myHand);
		System.out.println("相手の手は" + opponentHand);
		jyanken.playGame(myHand,opponentHand);
	}
	
	public static void Intro() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
	}

}
