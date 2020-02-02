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
		File file = new File("E:/aa.txt");// 鏂囦欢榛樿灏卞垱寤哄湪浣犲垱寤虹殑椤圭洰涓嬮潰锛屽埛鏂板嵆鍙湅鍒�
		System.out.println(file.exists());// 鍒ゆ柇鏂囦欢鏄惁瀛樺湪
		file.createNewFile();// 鍒涘缓鏂囦欢锛屼笉鏄枃浠跺す
		System.out.println(file.exists());// 鍐嶆鍒ゆ柇鏄惁瀛樺湪
		System.out.println(file.getName());// 鑾峰彇鏂囦欢鐨勫悕瀛�
		System.out.println(file.getAbsolutePath());// 鑾峰彇鏂囦欢鐨勭粷瀵硅矾寰�
		System.out.println(file.getPath());// 鑾峰彇鏂囦欢鐨勭浉瀵硅矾寰�
		System.out.println(file.getParent());// 鑾峰彇鏂囦欢鐨勭埗璺緞
		System.out.println(file.canRead());// 鏂囦欢鏄惁鍙
		System.out.println(file.canWrite());// 鏂囦欢鏄惁鍙啓
		System.out.println(file.length());// 鏂囦欢鐨勯暱搴�
		System.out.println(file.lastModified());// 鏂囦欢鏈�鍚庝竴娆′慨鏀圭殑鏃堕棿
		System.out.println(file.isDirectory());// 鍒ゆ柇鏂囦欢鏄惁鏄竴涓洰褰�
		System.out.println(file.isHidden());// 鏂囦欢鏄惁闅愯棌
		System.out.println(file.isFile());// 鍒ゆ柇鏂囦欢鏄惁瀛樺湪
		System.out.println("---我的修改---00----3----------00001010101------");

		File file1 = new File("E:/bb");// 1
		String[] str = file1.list();// 鑾峰彇鎸囧畾鐩綍涓嬬殑鎵�鏈夋枃浠舵垨鑰呮枃浠跺す鐨勫悕绉版暟缁�
		for (String s : str) {// 鍔犲己for寰幆閬嶅巻杈撳嚭
			System.out.println(s);
		}

		System.out.println("------------4--------------");
		File file2 = new File("E:/bb");
		File[] f = file2.listFiles();// 鑾峰彇鎸囧畾鐩綍涓嬬殑鎵�鏈夋枃浠舵垨鑰呮枃浠跺す鐨凢ile鏁扮粍
		for (File fi : f) {// 鍔犲己for寰幆閬嶅巻杈撳嚭
			System.out.println(fi);

			System.out.println("--------5--------------");
			//鏌ユ壘鍚庣紑鍚嶆槸jpg鎴栬�呮槸png鐨勫浘鐗囨牸寮�
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
			if (fi.isDirectory()) {// 鍒ゆ柇濡傛灉鏄竴涓洰褰�
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

		String[] str5 = file5.list(new FilenameFilter() {// 杩囨护鍣紝鍖垮悕鍐呴儴绫�

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
		// FileOutputStream()鍚庨潰鍔爐rue鎸囨枃浠跺悗闈㈠彲杩藉姞

		int a = fis.read();// read()涓�娆¤鍙栦竴涓瓧鑺�
		System.out.println(a);// 璇诲彇鐨勪竴涓瓧鑺傝緭鍑�

		for (int i = 0; i < 5; i++) {

			fos.write(520);// write()涓�娆″啓涓�涓瓧鑺�
		}

		fis.close();// 涓�瀹氳寰楀叧闂祦锛屽吇鎴愬ソ涔犳儻
		fos.close();

		System.out.println("-------9--------------");

		FileInputStream fis9 = new FileInputStream("E:/bb/01010101.png");
		FileOutputStream fos9 = new FileOutputStream("E:/bb/ee.png");
		// 濡傛灉娌℃湁bbb.txt,浼氬垱寤哄嚭涓�涓�

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

		// FileReader绫荤殑read()鏂规硶鍙互鎸夌収瀛楃澶у皬璇诲彇
		FileReader fr = new FileReader("E:/bb/123.txt");
		int b2;
		while ((b2 = fr.read()) != -1) {
			System.out.println((char) b2);// int绫诲瀷杞负瀛楃鍨�
		}
		fr.close();

		// FileWriter绫荤殑write()鏂规硶鍙互鑷姩鎶婂瓧绗﹁浆涓哄瓧鑺傚啓鍑�
		FileWriter fw = new FileWriter("E:/bb/123.txt", true);
		fw.write("aaa");
		fw.close();

		// 瀛楃娴佺殑鎷疯礉
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
		          //BufferedReader鍜孊ufferedWriter鐨勪娇鐢細
		          int b3;
		          while((b3=br.read())!=-1){
		              bw.write((char)b3);
		          }
		          br.close();
		          bw.close();

	}

}
