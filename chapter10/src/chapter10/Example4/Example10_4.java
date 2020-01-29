package chapter10.Example4;
import java.io.*;
public class Example10_4 {
	public static void main(String[] args) {
		int n=-1;
		byte []a=new byte[100];
		try{
			File f=new File("F:\\workspace\\chapter10\\src\\chapter10\\Example4\\Example10_4.java");
			InputStream in=new FileInputStream(f);
			while((n=in.read(a,0,100))!=-1){
				String s=new String(a,0,n);
				System.out.println(s);
			}
			in.close();
		}
		catch(IOException e){
			System.out.println("File read Error"+e);
		}
	}
}
