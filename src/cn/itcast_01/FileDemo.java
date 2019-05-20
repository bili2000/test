package cn.itcast_01;

import java.io.File;

/*
 * 我们要实现IO的操作，就必须知道硬盘上文件的表现形式。
 * 而Java就提供了一个类File供我们使用。
 * 
 * File：文件和目录路径名(文件夹)的抽象表示形式。
 * 构造方法：
 * 		public File(String pathname) ：根据一个路径得到File对象
 * 		public File(String parent,String child) ：根据一个目录和一个子文件/目录得到File对象
 * 		public File(File parent,String child) ：根据一个父File对象和一个子文件/目录得到File对象
 * 
 * 
 */
public class FileDemo {
	public static void main(String[] args) {
		//public File(String pathname) ：根据一个路径得到File对象
		//把F:\\demo\\a.txt封装成一个File对象
		File file = new File("F:\\demo\\a.txt");
		
		//public File(String parent,String child) ：根据一个目录和一个子文件/目录得到File对象
		File file2 = new File("F:\\demo","a.txt");
		
		//public File(File parent,String child) ：根据一个父File对象和一个子文件/目录得到File对象
		File file3 = new File("F:\\demo");
		File file4 = new File(file3,"a.txt");
		
		//以上三种方式其实效果一样
	}
}
