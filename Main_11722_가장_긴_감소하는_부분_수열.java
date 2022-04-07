package ing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

// 12,400kb
// 100ms

public class Main_11722_가장_긴_감소하는_부분_수열 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	//
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N + 1];

		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		int[] dp = new int[N + 1];
		Arrays.fill(dp, 1);

		int max = 1;
		for (int i = 2; i <= N; i++) {
			for (int j = 1; j < i; j++) {
				if (arr[i] < arr[j] && dp[i] < dp[j] + 1) {
					dp[i] = dp[j] + 1;
				}
			}
			max = dp[i] > max ? dp[i] : max;
		}
		bw.write(Integer.toString(max));
		bw.flush();
		bw.close();
	}
}