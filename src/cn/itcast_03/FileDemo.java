package cn.itcast_03;

import java.io.File;
import java.io.IOException;

/*
 * File的方法
 * 2.删除功能
 * 		public boolean delete()
 */
public class FileDemo {
	public static void main(String[] args) throws IOException {
		//创建文件
		File file1 = new File("F:\\aaa\\bbb\\ccc\\ddd");
		File file2 = new File("F:\\aaa\\bbb\\ccc\\ddd\\b.txt");
		System.out.println("mkdirs:"+file1.mkdirs());
		System.out.println("createNewFile:"+file2.createNewFile());
		
		//删除功能：我要删除b.txt这个文件
		System.out.println("delete:"+file2.delete());
		
		//我要删除ddd这个文件夹(要求文件内不能包含文件和文件夹)
		//删除文件夹要求由下往上逐级删除
		File file3 = new File("F:\\aaa\\bbb\\ccc\\ddd");
		System.out.println("delete:"+file3.delete());
	}
}
