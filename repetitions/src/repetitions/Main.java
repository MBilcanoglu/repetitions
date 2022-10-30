package repetitions;

public class Main {

	public static void main(String[] args) {
		int[] list = { 10, 20, 20, 10, 10, 20, 5, 20 };
		int[] listOfNumbers = new int[list.length];
		int count;
		for (int i = 0; i < list.length; i++) {
			count = 0;
			if (isFind(list, i, list[i])) {
				for (int k = 0; k < list.length; k++) {
					if (list[i] == list[k]) {
						count++;
					}
				}
				if (count != 0)
					System.out.println(list[i] + " sayısı " + count + " kere tekrar etti");
			}

		}
	}

	static boolean isFind(int[] arr, int index, int value) {
		if(index!=0) {
			for (int i = (arr.length - (index + 1)); i >= 0; i--) {
				if (arr[i] == value) {
					return false;
				}
			}
		}
		
		return true;
	}

}
