package cn.itcast_04;

import java.io.File;

/*
 * 3.重命名功能：public boolean renameTo(File dest)
 * 		如果路径名相同，就是改名。
 * 		如果路径名不同，就是改名并剪切
 * 路径以盘符开始：绝对路径	c:\\a.txt
 * 路径不以盘符开始：相对路径	a.txt
 */
public class FileDemo {
	public static void main(String[] args) {
		//创建一个文件对象
		//File file = new File("2012年机器人大赛.jpg");
		//需求：我要重命名为 机器人.jpg
		File file2 = new File("机器人.jpg");
		//public boolean renameTo(File dest)
		//System.out.println("renameTo:"+file.renameTo(file2));
		
		File file3 = new File("e:\\机器人.jpg");
		System.out.println("renameTo:"+file2.renameTo(file3));
	}
}
