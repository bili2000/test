package cn.itcast_04;

import java.io.File;

/*
 * 3.���������ܣ�public boolean renameTo(File dest)
 * 		���·������ͬ�����Ǹ�����
 * 		���·������ͬ�����Ǹ���������
 * ·�����̷���ʼ������·��	c:\\a.txt
 * ·�������̷���ʼ�����·��	a.txt
 */
public class FileDemo {
	public static void main(String[] args) {
		//����һ���ļ�����
		//File file = new File("2012������˴���.jpg");
		//������Ҫ������Ϊ ������.jpg
		File file2 = new File("������.jpg");
		//public boolean renameTo(File dest)
		//System.out.println("renameTo:"+file.renameTo(file2));
		
		File file3 = new File("e:\\������.jpg");
		System.out.println("renameTo:"+file2.renameTo(file3));
	}
}
