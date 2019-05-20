package cn.itcast_07;

import java.io.File;

/*
 * 5.File�ĸ߼���ȡ���ܣ�
 * public String[] list() ����ȡָ��Ŀ¼���µ������ļ������ļ��е���������
 * public File[] listFiles() ����ȡָ��Ŀ¼�µ������ļ������ļ��е�File����
 * 
 */
public class FileDemo {
	public static void main(String[] args) {
		//�����ļ�����
		File file = new File("F:\\");
		
		//public String[] list() ����ȡָ��Ŀ¼���µ������ļ������ļ��е���������
		String[] s = file.list();
		for(String x: s) {
			System.out.println(x);
		}
		System.out.println("--------------");
		
		//public File[] listFiles() ����ȡָ��Ŀ¼�µ������ļ������ļ��е�File����
		File[] f = file.listFiles();
		for(File x: f) {
			System.out.println(x.getName());
			//��������Զ����ļ���/�ļ�f������������
		}
		
		
	}
}
