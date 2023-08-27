package kadai_004;

public class Score_Chapter04 {

	public static void main(String[] args) {
		int scoreSum = 0;
		int[] scoreArray = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		String[] nameArray = { "Aさん", "Bさん", "Cさん", "Dさん", "Eさん", "Fさん", "Gさん", "Hさん", "Iさん", "Jさん" };
		for (int i = 0; i < scoreArray.length; i++) {
			System.out.println(nameArray[i] + "の点数は" + scoreArray[i] + "点");
			scoreSum += scoreArray[i];
		}
		System.out.println("テストの平均点は" + scoreSum / scoreArray.length + "点");
	}
}
