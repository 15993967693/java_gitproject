package package3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		B b=new B();
		A c=new B();
		System.out.println("a.i="+a.i+","+"a.j="+a.j+","+"a.plus()="+a.plus());
									//����A�е�plus(),iΪA�е�
		System.out.println("b.i="+b.i+","+"b.j="+b.j+","+"b.k="+b.k+","+"b.plus()="+b.plus());
									//����B�е�plus(),iΪB�е�
		//System.out.println("c.i="+c.i+","+"c.j="+c.j+","+"c.k="+c.k+","+"c.plus()="+c.plus());
									//k��B�����ӵģ���ת�Ͷ���ֻ�ܵ�����д
		System.out.println("c.i="+c.i+","+"c.j="+c.j+","+"c.plus()="+c.plus());
	}

}
