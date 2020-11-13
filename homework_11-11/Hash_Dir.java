package 第四次作业;

import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.Scanner;

public class Hash_Dir {
	public static void dfs(String path) throws Exception{
		File dir = new File(path);
		File[] fs = dir.listFiles();
		byte[] buffer = new byte[1024];
		MessageDigest complete = MessageDigest.getInstance("SHA-1");
		int numRead = 0;
		for(int i =0; i< fs.length; i++) {
			if(fs[i].isFile()) {
				FileInputStream is = new FileInputStream(fs[i]);
				do {
					numRead = is.read(buffer);
					if(numRead > 0) {
						complete.update(buffer,0,numRead);
					}
				}while(numRead !=-1);
				is.close();
			}
			if(fs[i].isDirectory()) {
				System.out.println("***********\t文件夹："+fs[i].getPath()+File.separator+ fs[i].getName()+"\t**************");
				dfs(path + File.separator + fs[i].getName());
			}
		}
		byte[] sha1 = complete.digest();
		String result = " ";
		for(int j = 0; j < sha1.length; j++) {
			result +=Integer.toString(sha1[j]&0xFF,16);
		}
		System.out.println(result);
	}
	public static void computeSHA1(File file,String path)throws Exception{
		try {
			FileInputStream is = new FileInputStream(file);
//			byte[] sha1 = SHA1Checksum(is);
			
		byte[] buffer = new byte[1024];
		MessageDigest complete = MessageDigest.getInstance("SHA-1");
		int numRead = 0;
		do {
			numRead = is.read(buffer);
			if(numRead > 0) {
				complete.update(buffer,0,numRead);
			}
			
		}while(numRead !=-1);
		is.close();
		byte[] sha1 = complete.digest();
		String result = " ";
		for(int i = 0; i < sha1.length; i++) {
			result +=Integer.toString(sha1[i]&0xFF,16);
		}
		System.out.println(result);
		}catch(Exception e) {
		e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try {
			System.out.println("输入路径：");
			Scanner sc = new Scanner(System.in);
			String path = sc.next();
			dfs(path);
			sc.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
