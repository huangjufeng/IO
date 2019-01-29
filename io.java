package alibaba;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;

public class d {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("E:/aa.txt");// 文件默认就创建在你创建的项目下面，刷新即可看到
		System.out.println(file.exists());// 判断文件是否存在
		file.createNewFile();// 创建文件，不是文件夹
		System.out.println(file.exists());// 再次判断是否存在
		System.out.println(file.getName());// 获取文件的名字
		System.out.println(file.getAbsolutePath());// 获取文件的绝对路径
		System.out.println(file.getPath());// 获取文件的相对路径
		System.out.println(file.getParent());// 获取文件的父路径
		System.out.println(file.canRead());// 文件是否可读
		System.out.println(file.canWrite());// 文件是否可写
		System.out.println(file.length());// 文件的长度
		System.out.println(file.lastModified());// 文件最后一次修改的时间
		System.out.println(file.isDirectory());// 判断文件是否是一个目录
		System.out.println(file.isHidden());// 文件是否隐藏
		System.out.println(file.isFile());// 判断文件是否存在
		System.out.println("----------3----------------");

		File file1 = new File("E:/bb");// 1
		String[] str = file1.list();// 获取指定目录下的所有文件或者文件夹的名称数组
		for (String s : str) {// 加强for循环遍历输出
			System.out.println(s);
		}

		System.out.println("------------4--------------");
		File file2 = new File("E:/bb");
		File[] f = file2.listFiles();// 获取指定目录下的所有文件或者文件夹的File数组
		for (File fi : f) {// 加强for循环遍历输出
			System.out.println(fi);

			System.out.println("--------5--------------");
			//查找后缀名是jpg或者是png的图片格式
			File file3 = new File("E:/bb");// 1
			System.out.println(file3);
			String[] str2 = file3.list();
		//System.out.println(str2);
			for (String s : str2) {
				// System.out.println(s);
				if (s.endsWith(".jpg") || s.endsWith(".png")) {
					System.out.println(s);
				}
			}
		}

		System.out.println("-------6--------------");
		File file4 = new File("E:/bb");

		File[] f3 = file4.listFiles();

		for (File fi : f3) {
			if (fi.isDirectory()) {// 判断如果是一个目录
				String[] s = fi.list();
				for (String str1 : s) {
					if (str1.endsWith(".png")) {
						System.out.println(str);
					}
				}
			}
		}

		System.out.println("-------7--------------");

		File file5 = new File("E:/bb");

		String[] str5 = file5.list(new FilenameFilter() {// 过滤器，匿名内部类

			@Override
			public boolean accept(File dir, String name) {
				File f = new File(dir, name);
				return f.isFile() && f.getName().endsWith(".png");
			}
		});
		for (String s : str5) {
			System.out.println(s);
		}

		System.out.println("-------8--------------");

		FileInputStream fis = new FileInputStream("e:/bb/cc.txt");
		FileOutputStream fos = new FileOutputStream("e:/bb/bbb.txt", true);
		// FileOutputStream()后面加true指文件后面可追加

		int a = fis.read();// read()一次读取一个字节
		System.out.println(a);// 读取的一个字节输出

		for (int i = 0; i < 5; i++) {

			fos.write(520);// write()一次写一个字节
		}

		fis.close();// 一定记得关闭流，养成好习惯
		fos.close();

		System.out.println("-------9--------------");

		FileInputStream fis9 = new FileInputStream("E:/bb/01010101.png");
		FileOutputStream fos9 = new FileOutputStream("E:/bb/ee.png");
		// 如果没有bbb.txt,会创建出一个

		int b;
		while ((b = fis9.read()) != -1) {
			fos9.write(b);
		}
		fis9.close();
		fos9.close();

		System.out.println("-------10--------------");

		FileInputStream fis1 = new FileInputStream("E:/bb/123.txt");
		FileOutputStream fos1 = new FileOutputStream("E:/bb/456.txt");

		BufferedInputStream bis = new BufferedInputStream(fis1);
		BufferedOutputStream bos = new BufferedOutputStream(fos1);

		int b1;
		while ((b1 = bis.read()) != -1) {
			bos.write(b1);
		}
		bis.close();
		bos.close();

		System.out.println("-------11--------------");

		// FileReader类的read()方法可以按照字符大小读取
		FileReader fr = new FileReader("E:/bb/123.txt");
		int b2;
		while ((b2 = fr.read()) != -1) {
			System.out.println((char) b2);// int类型转为字符型
		}
		fr.close();

		// FileWriter类的write()方法可以自动把字符转为字节写出
		FileWriter fw = new FileWriter("E:/bb/123.txt", true);
		fw.write("aaa");
		fw.close();

		// 字符流的拷贝
		FileReader fr2 = new FileReader("E:/bb/123.txt");
		FileWriter fw2 = new FileWriter("E:/bb/456.txt");

		int ch;
		while ((ch = fr2.read()) != -1) {
			fw2.write(ch);
		}

		fr2.close();
		fw2.close();
		
		
		
		 BufferedReader br=new BufferedReader(new FileReader("E:/bb/12345.txt"));
		          BufferedWriter bw=new BufferedWriter(new FileWriter("E:/bb/54321.txt"));
		          //BufferedReader和BufferedWriter的使用：
		          int b3;
		          while((b3=br.read())!=-1){
		              bw.write((char)b3);
		          }
		          br.close();
		          bw.close();

	}

}
