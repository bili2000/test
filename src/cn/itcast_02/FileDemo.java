package cn.itcast_02;

import java.io.File;
import java.io.IOException;

/*
 * File的常用方法
 * 1.创建功能：
 * 		public boolean createNewFile() 创建文件，如果存在这样的文件，就不创建了
 * 		public boolean mkdir() 创建文件夹，如果存在这样的文件夹，就不创建了
 * 		public boolean mkdirs() 创建文件夹，如果父文件夹不存在，会帮你创造出来
 * 
 * 注意：如果你创建文件或文件夹忘了写盘符路径，那么，默认在项目路径下。
 */
public class FileDemo {
	public static void main(String[] args) throws IOException {
		//需求：我要在f盘下创建一个文件夹demo
		//public boolean mkdir()
		File file = new File("F:\\demo");
		System.out.println("mkdir:"+file.mkdir());
		
		//需求：我要在f盘目录demo下创建一个文件夹a.txt
		//public boolean createNewFile() 
		File file2 = new File("F:\\demo\\a.txt");
		System.out.println("createNewFile:"+file2.createNewFile());
		
		//需求：我要在f盘目录test下创建aaa目录，创建一个文件夹b.txt
		//先mkdir()创建目录(从根目录逐步创建目录)，再用createNewFile()创建文件
//		File file3 = new File("F:\\test");		//目录从根目录逐步创建
//		System.out.println("mkdir:"+file3.mkdir());
//		File file4 = new File("F:\\test\\aaa");
//		System.out.println("mkdir:"+file4.mkdir());
//		File file5 = new File("F:\\test\\\\aaa\\b.txt");	//createNewFile()使用前提是目录已经存在
//		System.out.println("createNewFile:"+file5.createNewFile());
		
		//其实我们有更简单的方法
		File file6 = new File("F:\\aaa\\bbb\\ccc\\ddd");
		File file7 = new File("F:\\aaa\\bbb\\ccc\\ddd\\b.txt");
		System.out.println("mkdirs:"+file6.mkdirs());		//一次创建多级文件夹
		System.out.println("createNewFile:"+file7.createNewFile());
		
		//如果你创建文件或文件夹忘了写盘符路径，那么，默认在项目路径下。
		File file8 = new File("c.txt");
		System.out.println("createNewFile:"+file8.createNewFile());
		File file9 = new File("aaa\\bbb\\ccc\\ddd");
		System.out.println("mkdirs:"+file9.mkdirs());
	}
}
