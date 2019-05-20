package cn.itcast_05;

import java.io.File;

/*
 * 4.File���жϹ���
 * 		public boolean isDirectory() �ж��Ƿ���Ŀ¼
 * 		public boolean isFile() �ж��Ƿ����ļ�
 * 		public boolean exists() �ж��Ƿ����
 * 		public boolean canRead() �ж��Ƿ�ɶ�
 * 		public boolean canWrite() �ж��Ƿ��д
 * 		public boolean isHidden() �ж��Ƿ�����
 * 
 * 
 */
public class FileDemo {
	public static void main(String[] args) {
		//�����ļ�����
		File file = new File("a.txt");
		
		System.out.println("isDirectory:"+file.isDirectory());
		System.out.println("isFile:"+file.isFile());
		System.out.println("exists:"+file.exists());
		System.out.println("canRead:"+file.canRead());
		System.out.println("canWrite:"+file.canWrite());
		System.out.println("isHidden:"+file.isHidden());
	}
}
