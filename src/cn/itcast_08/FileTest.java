package cn.itcast_08;

import java.io.File;

/*
 * �ж�E��Ŀ¼���Ƿ��к�׺��Ϊ.jpg���ļ�������У���������ļ�����
 * ������
 * 		1.��װe�ж�Ŀ¼
 * 		2.��ȡ��Ŀ¼�������ļ������ļ��е�File����
 * 		3.����File���飬�õ�ÿһ��File����Ȼ���ж�
 * 		4.�Ƿ����ļ�
 * 			�ǣ������ж��Ƿ���.jpg��β
 * 				�ǣ���������ļ���
 * 				�񣺲����
 * 			�񣺲����
 */
public class FileTest {
	public static void main(String[] args) {
		//��װf�ж�Ŀ¼
		File file = new File("e:\\");
		
		//��ȡ��Ŀ¼�������ļ������ļ��е�File����
		File[] fileArr = file.listFiles();
		for(File x : fileArr) {
			if(x.isFile()) {
				if(x.getName().endsWith(".jpg"))
					System.out.println(x.getName());
			}
		}
	}
}
