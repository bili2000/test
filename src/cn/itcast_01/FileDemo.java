package cn.itcast_01;

import java.io.File;

/*
 * ����Ҫʵ��IO�Ĳ������ͱ���֪��Ӳ�����ļ��ı�����ʽ��
 * ��Java���ṩ��һ����File������ʹ�á�
 * 
 * File���ļ���Ŀ¼·����(�ļ���)�ĳ����ʾ��ʽ��
 * ���췽����
 * 		public File(String pathname) ������һ��·���õ�File����
 * 		public File(String parent,String child) ������һ��Ŀ¼��һ�����ļ�/Ŀ¼�õ�File����
 * 		public File(File parent,String child) ������һ����File�����һ�����ļ�/Ŀ¼�õ�File����
 * 
 * 
 */
public class FileDemo {
	public static void main(String[] args) {
		//public File(String pathname) ������һ��·���õ�File����
		//��F:\\demo\\a.txt��װ��һ��File����
		File file = new File("F:\\demo\\a.txt");
		
		//public File(String parent,String child) ������һ��Ŀ¼��һ�����ļ�/Ŀ¼�õ�File����
		File file2 = new File("F:\\demo","a.txt");
		
		//public File(File parent,String child) ������һ����File�����һ�����ļ�/Ŀ¼�õ�File����
		File file3 = new File("F:\\demo");
		File file4 = new File(file3,"a.txt");
		
		//�������ַ�ʽ��ʵЧ��һ��
	}
}
