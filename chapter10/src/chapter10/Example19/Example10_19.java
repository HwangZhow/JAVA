package chapter10.Example19;
import java.io.*;
public class Example10_19 {
	public static void main(String[] args) {
		File file=new File("Example10_19.java");
		WindowFileLock win=new WindowFileLock(file);
		win.setTitle("ʹ���ļ���");
	}

}
