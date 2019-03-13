
public class Test2_8 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		fullSort(arr, 0, arr.length - 1);
	}

	public static void fullSort(int[] arr, int start, int end) {
		if (start == end) {
			if (((arr[0] == 1) ^ (arr[1] == 2)) && ((arr[0] == 2) ^ (arr[2] == 3)) && ((arr[3] == 2) ^ (arr[2] == 4))) {
				System.out.println("ºÚ" + arr[0] + "»Æ" + arr[1] + "°×" + arr[2] + "ºì" + arr[3]);
				System.out.println();
			}
			return;
		}
		for (int i = start; i <= end; i++) {
			swap(arr, i, start);
			fullSort(arr, start + 1, end);
			swap(arr, i, start);
		}
	}
	private static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

}
