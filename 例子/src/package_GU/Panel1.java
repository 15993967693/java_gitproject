package package_GU;
import javax.swing.*;
import java.awt.*;
public class Panel1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Panel1 gui=new Panel1();
		gui.go();
	}

	private void go() {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame();
		JPanel panel=new JPanel();
		panel.setBackground(Color.darkGray);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));//���캯����Ҫ֪�������ĸ�����Լ�ʹ���ĸ���
		JButton button=new JButton("click me");
		JButton buttonTwo=new JButton("bliss");
		JButton buttonThree=new JButton("three");
		panel.add(buttonThree);
		panel.add(buttonTwo);
		panel.add(button);
		frame.getContentPane().add(BorderLayout.EAST, panel);
		frame.setSize(250, 200);
		frame.setVisible(true);
	}

}
