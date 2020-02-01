package chapter10.Example12;

public class EncryptAndDecrypt {
	String encrypt(String sourceString,String password){
		char []p=password.toCharArray();
		int n=p.length;
		char []c=sourceString.toCharArray();
		int m=c.length;
		for(int k=0;k<m;k++){				//加密
			int mima=c[k]+p[k%n];
			c[k]=(char)mima;
		}
		return new String(c);				//返回密文
	}
	String decrypt(String sourceString,String password){
		char []p=password.toCharArray();
		int n=p.length;
		char []c=sourceString.toCharArray();
		int m=c.length;
		for(int k=0;k<m;k++){				//解密
			int mima=c[k]-p[k%n];
			c[k]=(char)mima;
		}
		return new String(c);				//返回明文
		}
}
