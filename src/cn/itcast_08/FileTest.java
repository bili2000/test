package cn.itcast_08;

import java.io.File;

/*
 * 判断E盘目录下是否有后缀名为.jpg的文件，如果有，就输出此文件名称
 * 分析：
 * 		1.封装e判断目录
 * 		2.获取该目录下所有文件或者文件夹的File数组
 * 		3.遍历File数组，得到每一个File对象，然后判断
 * 		4.是否是文件
 * 			是：继续判断是否以.jpg结尾
 * 				是：就输出该文件名
 * 				否：不理会
 * 			否：不理会
 */
public class FileTest {
	public static void main(String[] args) {
		//封装f判断目录
		File file = new File("e:\\");
		
		//获取该目录下所有文件或者文件夹的File数组
		File[] fileArr = file.listFiles();
		for(File x : fileArr) {
			if(x.isFile()) {
				if(x.getName().endsWith(".jpg"))
					System.out.println(x.getName());
			}
		}
	}
}
