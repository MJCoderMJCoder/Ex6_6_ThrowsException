package com.throwsexception;
/**
 * ��һ���������׳����쳣���÷������Զ��䴦����Ҳ���Բ��������ǰ��쳣�����ƽ������ø÷����ķ���������
 * ���ڷ����в������׳�����ʽ�쳣�����쳣��ʽ���ƽ������ø÷����ķ�������Ĭ���쳣����ʽ��
 * ���ڷ����в������׳�����ʽ�쳣��������ڶ���÷���ʱʹ��throws�Ӿ�����ʽ�쳣����������������벻��ͨ����
 */
public class ThrowsException {
	
	public static int calc(int x) throws Exception {
		int z = 0;
		if(x == 0)
			throw new Exception("����Ϊ��");//��ʽ�׳��쳣��ֱ���׳��쳣��ʵ��
		z = 110/x;
		return z;
	}

	public static void main(String[] args) {
		int a = 0;
		try {
			a = calc(0);
			System.out.println("a=" + a);
		} catch(Exception e) {
			//getMessage�������쳣�׳�ԭ����ַ���
			System.out.println("���÷���calcʱ�����쳣��" + e.getMessage() + "\n");
			e.printStackTrace();//������ö�ջ������Ϣ��java.lang.Exception:......	at....
		}

	}

}
