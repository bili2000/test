package cn.itcast_08;

import java.io.File;
import java.io.FilenameFilter;

/*
 * 判断E盘目录下是否有后缀名为.jpg的文件，如果有，就输出此文件名称。方法有
 * 1.先获取所有的，然后遍历的时候，依次判断，如果满足条件就输出。
 * 2.获取的时候就已经是满足条件的了，然后输出即可。
 * 
 * 要想实现这个效果，就必须学习一个接口：文件名称过滤器
 * public String[] list(FilenameFilter filter)
 * public File[] listFiles(FilenameFilter filter)
 * 
 */
public class FileDemo {
	public static void main(String[] args) {
		//封装f判断目录
		File file = new File("e:\\");
		
		//获取的时候就已经是满足条件的了，然后输出即可
		//public String[] list(FilenameFilter filter)
		//要重写accept()方法的判断
		String[] strArr = file.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				//return false;
				//return true;
				//通过这个测试，我们就知道了，到底把这个文件夹或者文件的名称是否加不加到数组中，取决于这里的返回值是true还是false
				//所以，这个的true或者false应该是我们通过某种判断得到的(即判断语句在这里写)
//				 File file = new File(dir,name);
//				 boolean flag = file.isFile();
//				 boolean flag2 = name.endsWith(".jpg");
//				 return flag && flag2;
				return new File(dir,name).isFile() && name.endsWith(".jpg");
			}
		});
		
		for(String x : strArr) {
			System.out.println(x);
		}
	}
}
