package package_GU;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TextArea1 implements ActionListener{
	JTextArea text;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextArea1 gui=new TextArea1();
		gui.go();
	}

	private void go() {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame();
		JPanel panel=new JPanel();
		JButton button=new JButton("Just Click It");
		JButton button2=new JButton("button2");
		button2.addActionListener(new button2());
		button.addActionListener(this);
		text=new JTextArea(10,20);
		text.setLineWrap(true);
		
		JScrollPane scroller=new JScrollPane(text);
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		panel.add(scroller);
		panel.add(button2);
		frame.getContentPane().add(BorderLayout.CENTER,panel);
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.setSize(350,300);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		text.append("button clicked\n");
	}
	class button2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			text.append("button clickedsds\n");
		}
		
	}

}
