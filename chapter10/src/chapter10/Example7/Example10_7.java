package chapter10.Example7;
import java.io.*;
import java.util.*;
public class Example10_7 {
	public static void main(String[] args) {
		File fRead=new File("english.txt");
		File fWrite=new File("englishCount.txt");
		try{
			Writer out=new FileWriter(fWrite);
			BufferedWriter bufferedWrite=new BufferedWriter(out);
			Reader in=new FileReader(fRead);
			BufferedReader bufferedRead=new BufferedReader(in);
			String str=null;
			while((str=bufferedRead.readLine())!=null){
				StringTokenizer fenxi=new StringTokenizer(str);
				int count=fenxi.countTokens();
				str=str+" 句子中单词的个数："+count;
				bufferedWrite.write(str);
				bufferedWrite.newLine();
			}
			bufferedWrite.close();
			out.close();
			in=new FileReader(fWrite);
			bufferedRead=new BufferedReader(in);
			String s=null;
			System.out.println(fWrite.getName()+"内容：");
			while((s=bufferedRead.readLine())!=null){
				System.out.println(s);
			}
			bufferedRead.close();
			in.close();
		}
		catch(IOException e){
			System.out.println(e.toString());
		}
	}
}
