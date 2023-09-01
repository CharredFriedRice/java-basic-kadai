package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		int serviceCost = 0;
		int userAge = 30;
		switch(userAge)
		{
		case 10:
			serviceCost = 1000;
			break;
		case 20:
			serviceCost = 2000;
			break;
		case 30:
			serviceCost = 3000;
			break;
		case 40:
			serviceCost = 3000;
			break;
		case 50:
			serviceCost = 4000;
			break;
		case 60:
			serviceCost = 4000;
			break;
		case 70:
			serviceCost = 4000;
			break;
		case 80:
			serviceCost = 5000;
			break;
		default:
			serviceCost = 500;
			break;
		}
		System.out.println(userAge + "代の料金は" + serviceCost + "円");
	}
}
