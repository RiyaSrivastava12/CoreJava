package lab8;

import java.io.*;

public class CopyDataThread {
	public static void main(String[] args) throws Exception {
		
		InputStream in = new FileInputStream(new File("G:\\eclipse-workspace\\Lab_Assignment\\src\\lab8\\source.txt"));
		OutputStream out = new FileOutputStream(new File("G:\\eclipse-workspace\\Lab_Assignment\\src\\lab8\\target.txt"));
		byte[] buf = new byte[1024];
		int len;

		while ((len = in.read(buf)) > 0) {
			out.write(buf, 0, len);
		}
		in.close();
		out.close();
		BufferedReader in1 = new BufferedReader(new FileReader("G:\\eclipse-workspace\\Lab_Assignment\\src\\lab8\\target.txt"));
		String str;

		while ((str = in1.readLine()) != null) {
			System.out.println(str);
		}
		in.close();
	}
}