package package1;

public class SuperClass1 extends SuperClass{
	void limit() {
		//SuperClass.i++;					//i�ڱ����ڿɷ��ʣ�super������
		SuperClass.j1++;				//j�ڱ����������пɷ���
		SuperClass a=new SuperClass();	//ʵ����Ա�ö������
		a.j++;
		//SuperClass.k++;				//SuperClass��˽�г�Ա����һ�����в��ܷ���
		SuperClass.m--;					//����Ȩ�ޣ��κεֵ����ɷ���
	}
}
