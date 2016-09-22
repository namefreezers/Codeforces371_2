import java.util.Scanner;

public class Codeforces371_2A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] s = in.nextLine().split(" ");
		in.close();
		long[] arr = new long[5];
		for (int i = 0; i < s.length; i++) {
			arr[i] = Long.parseLong(s[i]);
		}
		long res = 0;
		if (arr[0] > arr[3] || arr[1] < arr[2]) {
			System.out.println(0);
			return;
		}
		boolean[] b = new boolean[2];
		if (arr[0] <= arr[2])
			b[0] = true;
		if (arr[1] <= arr[3])
			b[1] = true;
		if (b[0]) {
			if (b[1]) {
				res += arr[1] - arr[2] + 1;
				if (arr[4] >= arr[2] && arr[4] <= arr[1])
					res--;
			} else {
				res += arr[3] - arr[2] + 1;
				if (arr[4] >= arr[2] && arr[4] <= arr[3])
					res--;
			}
		} else {
			if (b[1]) {
				res += arr[1] - arr[0] + 1;
				if (arr[4] >= arr[0] && arr[4] <= arr[1])
					res--;
			} else {
				res += arr[3] - arr[0] + 1;
				if (arr[4] >= arr[0] && arr[4] <= arr[3])
					res--;
			}
		}
		System.out.println(res);
	}

}
