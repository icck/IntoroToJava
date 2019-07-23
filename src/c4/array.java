package c4;


public class array {

	public static void main(String[] args) {
		int[] score = new int[5];

		System.out.println(score.length);

		score[0] = 4;

		System.out.println(score[0]);

//		int[] score1 = new int[] {20, 30, 40, 50};
		int[] score2 = {20, 30, 40, 50};

		for (int i : score2) {
			System.out.println(i);


		}

	}

}
