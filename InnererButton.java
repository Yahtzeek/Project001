import javax.swing.*;
import java.awt.event.*;
import java.awt.*;



class InnererButton {


SJFrame frame;
JButton b;


	public static void main(String[] args) {
		InnererButton gui = new InnererButton();
		gui.los();
	}


	public void los() {

		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		b = new JButton("A");
		b.addActionListener(new BListener());

		frame.add(BorderLayout.WEST, b);
		frame.setSize(200,100);
		frame.setVisible(true);
	}


	class BListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (b.getText().equals("A")) {
				b.setText("B");
			} else {
				b.setText("A");
			}
		}
	}

}