package kadai_017;

public class KatoTaro_Chapter17 extends Kato_Chapter17 {

	public void setGivenName() {
		familyName = "加藤";
		givenName = "太郎";
		address = "東京都中野区〇×";
	}

	@Override
	public void eachIntroduce() {
		System.out.println("私はJavaが得意です");
	}
}
