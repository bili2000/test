package cn.itcast_08;

import java.io.File;
import java.io.FilenameFilter;

/*
 * �ж�E��Ŀ¼���Ƿ��к�׺��Ϊ.jpg���ļ�������У���������ļ����ơ�������
 * 1.�Ȼ�ȡ���еģ�Ȼ�������ʱ�������жϣ�������������������
 * 2.��ȡ��ʱ����Ѿ��������������ˣ�Ȼ��������ɡ�
 * 
 * Ҫ��ʵ�����Ч�����ͱ���ѧϰһ���ӿڣ��ļ����ƹ�����
 * public String[] list(FilenameFilter filter)
 * public File[] listFiles(FilenameFilter filter)
 * 
 */
public class FileDemo {
	public static void main(String[] args) {
		//��װf�ж�Ŀ¼
		File file = new File("e:\\");
		
		//��ȡ��ʱ����Ѿ��������������ˣ�Ȼ���������
		//public String[] list(FilenameFilter filter)
		//Ҫ��дaccept()�������ж�
		String[] strArr = file.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				//return false;
				//return true;
				//ͨ��������ԣ����Ǿ�֪���ˣ����װ�����ļ��л����ļ��������Ƿ�Ӳ��ӵ������У�ȡ��������ķ���ֵ��true����false
				//���ԣ������true����falseӦ��������ͨ��ĳ���жϵõ���(���ж����������д)
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
