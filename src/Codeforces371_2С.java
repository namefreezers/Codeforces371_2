import java.util.*;

public class Codeforces371_2Ñ {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		Map<Long, Integer> map = new HashMap<Long, Integer>();
		for (int i = 0; i < n; i++) {
			String[] s = in.nextLine().split(" ");
			long num;
			Integer quant = null;
			switch (s[0].charAt(0)) {
			case '+':
				num = Long.parseLong(s[1]);
				quant = map.get(num);
				if (quant == null)
					map.put(num, 1);
				else
					map.put(num, quant + 1);
				break;
			case '-':
				num = Long.parseLong(s[1]);
				quant = map.get(num);
				map.put(num, quant - 1);
				break;
			case '?':
				String t = s[1];
				int res = 0;
				for (long j : map.keySet()) {
					
					boolean b = true;
					for (int k = 0; k < t.length(); k++) {
						if ((j / Math.pow(10, k)) % 2 != t.charAt(t.length() - 1 - k)-'0')
							b = false;
					}
					for (int k = t.length(); k<19;k++){
						if((j / Math.pow(10, k)) % 2 == 1)
							b = false;
					}
					quant = map.get(j);
					if(b&&quant!=null)
						res+=quant;
					
				}
				System.out.println(res);
				break;
			}

		}

		in.close();
	}

}
