package ps.BOJ._10000_14999;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 12,548kb
// 100ms

public class Main_11055_가장_큰_증가하는_부분_수열 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N + 1];
		int[] dp = new int[N + 1];

		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		dp[1] = arr[1];

		for (int i = 2; i <= N; i++) {
			dp[i] = arr[i];
			for (int j = 1; j <= i; j++) {
				if (arr[i] > arr[j])
					dp[i] = dp[j] + arr[i] > dp[i] ? dp[j] + arr[i] : dp[i];
			}
		}

		int max = 0;
		for (int i = 1; i <= N; i++)
			max = dp[i] > max ? dp[i] : max;

		bw.write(max + "");
		bw.flush();
		bw.close();
	}
}