package kadai_017;

public class KatoIchiro_Chapter17 extends Kato_Chapter17{

	public void setGivenName() {
		familyName = "加藤";
		givenName = "一郎";
		address = "東京都中野区〇×";
	}
	
	@Override
	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
	}
}
