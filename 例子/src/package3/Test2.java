package package3;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2 a=new A2();
		B2 b=new B2();
		A2 c=new B2();
		System.out.println("a.i="+a.i+","+"a.j="+a.j+","+"a.plus="+a.plus());
								//����A�е�plus()��iΪA�е�
		System.out.println("b.i="+b.i+","+"b.j="+b.j+","+"b.k="+b.k+","+"b.plus()="+b.plus());
								//����B�е�plus(),iΪB�е�
		//System.out.println("c.i="+c.i+","+"c.j="+c.j+","+"c.plus()="+"c.plus());
		System.out.println("c.i="+c.i+","+"c.j="+c.j+","+"c.plus()="+c.plus());
	}

}
