import java.util.*;

public class Codeforces371_2B {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		String[] s = in.nextLine().split(" ");
		in.close();
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < s.length; i++) {
			set.add(Integer.parseInt(s[i]));
		}
		if (set.size() > 3) {
			System.out.println("NO");
			return;
		} else if (set.size() < 3) {
			System.out.println("YES");
			return;
		} else {
			int[] arr = new int[set.size()];
			int j = 0;
			for (int i : set) {
				arr[j] = i;
				j++;
			}
			for (int i = 0; i < arr.length - 1; i++)
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			for (int i = 0; i < 1; i++)
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			if(arr[2] - arr[1] == arr[1] - arr[0]){
				System.out.println("YES");
				return;
			}
			else{
				System.out.println("NO");
				return;
			}
		}
	}

}
