package chapter10.Example9;
import java.io.*;
public class Example10_9 {
	public static void main(String[] args) {
		RandomAccessFile in=null;
		try{
			in=new RandomAccessFile("Example10_9.java", "rw");
			long length=in.length();
			long position=0;
			in.seek(position);
			while(position<length){
				String str=in.readLine();
				byte []b=str.getBytes("iso-8858-1");
				str=new String(b);
				position=in.getFilePointer();
				System.out.println(str);
			}
		}
		catch(IOException e){}
	}
}
