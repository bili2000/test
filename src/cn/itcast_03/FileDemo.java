package cn.itcast_03;

import java.io.File;
import java.io.IOException;

/*
 * File�ķ���
 * 2.ɾ������
 * 		public boolean delete()
 */
public class FileDemo {
	public static void main(String[] args) throws IOException {
		//�����ļ�
		File file1 = new File("F:\\aaa\\bbb\\ccc\\ddd");
		File file2 = new File("F:\\aaa\\bbb\\ccc\\ddd\\b.txt");
		System.out.println("mkdirs:"+file1.mkdirs());
		System.out.println("createNewFile:"+file2.createNewFile());
		
		//ɾ�����ܣ���Ҫɾ��b.txt����ļ�
		System.out.println("delete:"+file2.delete());
		
		//��Ҫɾ��ddd����ļ���(Ҫ���ļ��ڲ��ܰ����ļ����ļ���)
		//ɾ���ļ���Ҫ������������ɾ��
		File file3 = new File("F:\\aaa\\bbb\\ccc\\ddd");
		System.out.println("delete:"+file3.delete());
	}
}
