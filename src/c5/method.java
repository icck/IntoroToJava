package c5;

public class method {

	public static void main(String[] args) {
		hello();
		hello2("test");
		System.out.println(getTax(100));
		int[] array = {1,2,3,4,};
		printArray(array);

	}

	private static void hello() {
		System.out.println("hello!");

	}

	private static void hello2(String name) {
		System.out.println("hello " + name);

	}

	private static double getTax(int value) {
		return value + value * 0.10;
	}

	private static void printArray(int[] array) {
		for (int element : array) {
			System.out.println(element);
		}
	}

}
