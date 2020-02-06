package chapter10.Example18;
import java.io.*;
import javax.swing.*;
import javax.swing.ProgressMonitorInputStream;
public class Example10_18 {
	public static void main(String[] args) {
		byte b[]=new byte[30];
		try{
			FileInputStream input=new FileInputStream("Example10_18.java");
			ProgressMonitorInputStream in=new ProgressMonitorInputStream(null, "¶ÁÈ¡javaÎÄ¼þ", input);
			ProgressMonitor p=in.getProgressMonitor();
			while(in.read(b)!=-1){
				String s=new String(b);
				System.out.print(s);
				Thread.sleep(1000);
			}
		}
		catch(Exception e){}
	}

}
