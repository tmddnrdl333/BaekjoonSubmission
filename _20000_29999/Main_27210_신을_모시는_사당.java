package ps.BOJ._20000_29999;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 20,760kb
// 188ms

public class Main_27210_신을_모시는_사당 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());

		int min = 0, max = 0;

		int[] arr = new int[N + 1];
		st = new StringTokenizer(br.readLine());

		for (int i = 1; i <= N; i++) {
			int inp = Integer.parseInt(st.nextToken()) == 1 ? 1 : -1;
			arr[i] = arr[i - 1] + inp;
			min = arr[i] < min ? arr[i] : min;
			max = arr[i] > max ? arr[i] : max;
		}

		bw.write(max - min + "");
		bw.flush();
		bw.close();
	}
}