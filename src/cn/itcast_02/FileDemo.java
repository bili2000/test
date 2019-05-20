package cn.itcast_02;

import java.io.File;
import java.io.IOException;

/*
 * File�ĳ��÷���
 * 1.�������ܣ�
 * 		public boolean createNewFile() �����ļ�����������������ļ����Ͳ�������
 * 		public boolean mkdir() �����ļ��У���������������ļ��У��Ͳ�������
 * 		public boolean mkdirs() �����ļ��У�������ļ��в����ڣ�����㴴�����
 * 
 * ע�⣺����㴴���ļ����ļ�������д�̷�·������ô��Ĭ������Ŀ·���¡�
 */
public class FileDemo {
	public static void main(String[] args) throws IOException {
		//������Ҫ��f���´���һ���ļ���demo
		//public boolean mkdir()
		File file = new File("F:\\demo");
		System.out.println("mkdir:"+file.mkdir());
		
		//������Ҫ��f��Ŀ¼demo�´���һ���ļ���a.txt
		//public boolean createNewFile() 
		File file2 = new File("F:\\demo\\a.txt");
		System.out.println("createNewFile:"+file2.createNewFile());
		
		//������Ҫ��f��Ŀ¼test�´���aaaĿ¼������һ���ļ���b.txt
		//��mkdir()����Ŀ¼(�Ӹ�Ŀ¼�𲽴���Ŀ¼)������createNewFile()�����ļ�
//		File file3 = new File("F:\\test");		//Ŀ¼�Ӹ�Ŀ¼�𲽴���
//		System.out.println("mkdir:"+file3.mkdir());
//		File file4 = new File("F:\\test\\aaa");
//		System.out.println("mkdir:"+file4.mkdir());
//		File file5 = new File("F:\\test\\\\aaa\\b.txt");	//createNewFile()ʹ��ǰ����Ŀ¼�Ѿ�����
//		System.out.println("createNewFile:"+file5.createNewFile());
		
		//��ʵ�����и��򵥵ķ���
		File file6 = new File("F:\\aaa\\bbb\\ccc\\ddd");
		File file7 = new File("F:\\aaa\\bbb\\ccc\\ddd\\b.txt");
		System.out.println("mkdirs:"+file6.mkdirs());		//һ�δ����༶�ļ���
		System.out.println("createNewFile:"+file7.createNewFile());
		
		//����㴴���ļ����ļ�������д�̷�·������ô��Ĭ������Ŀ·���¡�
		File file8 = new File("c.txt");
		System.out.println("createNewFile:"+file8.createNewFile());
		File file9 = new File("aaa\\bbb\\ccc\\ddd");
		System.out.println("mkdirs:"+file9.mkdirs());
	}
}
