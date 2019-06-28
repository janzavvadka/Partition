import java.util.Arrays;

public class Partition {

	public static void main(String args[]) {
		int[] arr = {6, 3, 1, 2, 8, 9, 0, 4};
		int partitionPosition = partition(arr, 0, arr.length - 1);

		System.out.println(Arrays.toString(arr));
		System.out.println("Partition position " + partitionPosition);

	}

	private static int partition(int arr[], int left, int right) {
		int i = left + 1;
		int j = right;
		int pivot = arr[left];

		do {
			System.out.println(Arrays.toString(arr));
			while ((i < right) && (arr[i] <= pivot)) {
				i++;
			}
			while ((j > left) && (arr[j] >= pivot)) {
				j--;
			}
			if (i < j) {
				System.out.println("SWAP: " + i + " " + j);
				swap(arr, i, j);
			}
		} while (i < j);

		if (arr[i] > pivot) {
			arr[left] = arr[i - 1];
			arr[i - 1] = pivot;
			System.out.println("SWAP: " + left + " " + (i - 1));
			return i - 1;
		} else {
			arr[left] = arr[i];
			arr[i] = pivot;
			System.out.println("SWAP: " + left + " " + i);
			return i;
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

}
