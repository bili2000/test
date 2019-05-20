package cn.itcast_07;

import java.io.File;

/*
 * 5.File的高级获取功能：
 * public String[] list() ：获取指定目录地下的所有文件或者文件夹的名称数组
 * public File[] listFiles() ：获取指定目录下的所有文件或者文件夹的File数组
 * 
 */
public class FileDemo {
	public static void main(String[] args) {
		//创建文件对象
		File file = new File("F:\\");
		
		//public String[] list() ：获取指定目录地下的所有文件或者文件夹的名称数组
		String[] s = file.list();
		for(String x: s) {
			System.out.println(x);
		}
		System.out.println("--------------");
		
		//public File[] listFiles() ：获取指定目录下的所有文件或者文件夹的File数组
		File[] f = file.listFiles();
		for(File x: f) {
			System.out.println(x.getName());
			//在这里可以对子文件夹/文件f进行其他操作
		}
		
		
	}
}
