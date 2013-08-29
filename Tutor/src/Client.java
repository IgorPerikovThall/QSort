public class Client {
	public static void main(String[] args) {
		int[] mas = {-1, 0, 10, 15, -24, 39, 3, -5, 14};
		sort(mas);
		for (int i = 0; i < mas.length; i++) 
			System.out.println(mas[i]);
	}

	public static void sort(int[] mas) {
		quickSort(mas, 0, mas.length - 1);
	}
	
	public static void quickSort(int[] mas, int low, int high) {
		int i = low; int j = high;
		int pivot = mas[(low + high) / 2];
		while (i <= j) {
			while(mas[i] < pivot) {
				i++;
			}
			while(mas[j] > pivot) {
				j--;
			}
			
			if (i <= j) {
				int temp = mas[i];
				mas[i] = mas[j];
				mas[j] = temp;
				
				i++;
				j--;
			}
		}
		if (low < j) {
			quickSort(mas ,low, j);
		}
		if (high > i) {
			quickSort(mas ,i, high);
		}
	}
}