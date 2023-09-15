package kadai_014;

public class Car_Chapter14 {
	
	private int gear = 1;
	private int speed = 10;

	public void gearChange(int afterGear) {
		this.gear = afterGear;
		if(gear <= 5) {
			speed = gear * 10;
		}
		else {
			speed = 10;
		}
	}
	
	public void run() {
		System.out.println("ギアチェンジ後の速度:時速" + speed + "km");
	}
}