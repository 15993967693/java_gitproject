package package2;
import package1.*;
public class SubClass2 extends SuperClass1 {
	void limit() {
		//SuperClass.i++;	//i�ڱ����ڿɷ��ʣ�����������һ�����з��ʣ����Բ���
		//j++;				//����ʵ����Աj�����Լ̳�
		//super.j++;			//����ʵ����Աj��������super����
		
		SuperClass.j1--;	//����static��Աj1�����������Ե���
		
		j1++;				//����static��Աj1�����Լ̳�
		
		//SuperClass.k++;	//SuperClass��˽�г�Աֻ���ڱ������
		SuperClass1.m--;		//����Ȩ�ޣ��κεط����ɷ���
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperClass1 sup=new SuperClass1();
		//System.out.println(sup.j++);//�����Աj���ö��󲻿��Ե���
		//sup.limit();//�����Աj���ö��󲻿��Ե���
		System.out.println(sup.j1++);
	}

}
