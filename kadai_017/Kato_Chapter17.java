package kadai_017;

abstract public class Kato_Chapter17 {
	
	public String familyName;
	public String givenName;
	public String address;

	public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}
	
	abstract public void eachIntroduce();
	
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
}