package me.dan.connections;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.JProgressBar;

public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ArrayList<JToggleButton> selected;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 617);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		JToggleButton[] buttons = new JToggleButton[16];
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		tglbtnNewToggleButton.setBounds(40, 74, 90, 90);
		contentPane.add(tglbtnNewToggleButton);
		buttons[0] = tglbtnNewToggleButton;
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_1.setBounds(140, 74, 90, 90);
		contentPane.add(tglbtnNewToggleButton_1);
		buttons[1] = tglbtnNewToggleButton_1;
		
		JToggleButton tglbtnNewToggleButton_2 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_2.setBounds(240, 74, 90, 90);
		contentPane.add(tglbtnNewToggleButton_2);
		
		JToggleButton tglbtnNewToggleButton_3 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_3.setBounds(340, 74, 90, 90);
		contentPane.add(tglbtnNewToggleButton_3);
		
		JToggleButton tglbtnNewToggleButton_4 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_4.setBounds(40, 175, 90, 90);
		contentPane.add(tglbtnNewToggleButton_4);
		
		JToggleButton tglbtnNewToggleButton_5 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_5.setBounds(140, 175, 90, 90);
		contentPane.add(tglbtnNewToggleButton_5);
		
		JToggleButton tglbtnNewToggleButton_6 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_6.setBounds(240, 175, 90, 90);
		contentPane.add(tglbtnNewToggleButton_6);
		
		JToggleButton tglbtnNewToggleButton_7 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_7.setBounds(340, 175, 90, 90);
		contentPane.add(tglbtnNewToggleButton_7);
		
		JToggleButton tglbtnNewToggleButton_8 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_8.setBounds(40, 276, 90, 90);
		contentPane.add(tglbtnNewToggleButton_8);
		
		JToggleButton tglbtnNewToggleButton_9 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_9.setBounds(140, 276, 90, 90);
		contentPane.add(tglbtnNewToggleButton_9);
		
		JToggleButton tglbtnNewToggleButton_10 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_10.setBounds(240, 276, 90, 90);
		contentPane.add(tglbtnNewToggleButton_10);
		
		JToggleButton tglbtnNewToggleButton_11 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_11.setBounds(340, 276, 90, 90);
		contentPane.add(tglbtnNewToggleButton_11);
		
		JToggleButton tglbtnNewToggleButton_12 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_12.setBounds(40, 377, 90, 90);
		contentPane.add(tglbtnNewToggleButton_12);
		
		JToggleButton tglbtnNewToggleButton_13 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_13.setBounds(140, 377, 90, 90);
		contentPane.add(tglbtnNewToggleButton_13);
		
		JToggleButton tglbtnNewToggleButton_14 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_14.setBounds(240, 377, 90, 90);
		contentPane.add(tglbtnNewToggleButton_14);
		
		JToggleButton tglbtnNewToggleButton_15 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_15.setBounds(340, 377, 90, 90);
		contentPane.add(tglbtnNewToggleButton_15);
		
		for (JToggleButton j : buttons) {
			j.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					updateSelected(tglbtnNewToggleButton, tglbtnNewToggleButton.isSelected());
				}
			});
		}
		
		
		JButton btnShuffle = new JButton("Shuffle");
		btnShuffle.setBounds(241, 506, 89, 23);
		contentPane.add(btnShuffle);
		
		JProgressBar guessesBar = new JProgressBar();
		guessesBar.setValue(85);
		guessesBar.setBounds(164, 540, 146, 14);
		contentPane.add(guessesBar);

		////////////////////////////////////////////

		WordGroup wg1 = new WordGroup("potato", "potato", "potato", "potato");
		WordGroup wg2 = new WordGroup("quack", "quack", "quack", "quack");
		WordGroup wg3 = new WordGroup("turd", "turd", "turd", "turd");
		WordGroup wg4 = new WordGroup("meatball", "meatball", "meatball", "meatball");

		tglbtnNewToggleButton.setText(wg1.getWord1());
		tglbtnNewToggleButton_1.setText(wg1.getWord2());
		tglbtnNewToggleButton_2.setText(wg1.getWord3());
		tglbtnNewToggleButton_3.setText(wg1.getWord4());

		tglbtnNewToggleButton_4.setText(wg2.getWord1());
		tglbtnNewToggleButton_5.setText(wg2.getWord2());
		tglbtnNewToggleButton_6.setText(wg2.getWord2());
		tglbtnNewToggleButton_7.setText(wg2.getWord2());

		tglbtnNewToggleButton_8.setText(wg3.getWord1());
		tglbtnNewToggleButton_9.setText(wg3.getWord2());
		tglbtnNewToggleButton_10.setText(wg3.getWord3());
		tglbtnNewToggleButton_11.setText(wg3.getWord4());

		tglbtnNewToggleButton_12.setText(wg4.getWord1());
		tglbtnNewToggleButton_13.setText(wg4.getWord2());
		tglbtnNewToggleButton_14.setText(wg4.getWord3());
		tglbtnNewToggleButton_15.setText(wg4.getWord4());

		selected = new ArrayList<JToggleButton>();
		JButton btnSubmit = new JButton("Check");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean inGroup1 = false;
				boolean inGroup2 = false;
				boolean inGroup3 = false;
				boolean inGroup4 = false;
				for (JToggleButton j : selected) {
					inGroup1 = inGroup1 || wg1.contains(j.getText());
					inGroup2 = inGroup2 || wg2.contains(j.getText());
					inGroup3 = inGroup3 || wg3.contains(j.getText());
					inGroup4 = inGroup4 || wg4.contains(j.getText());
				}

				boolean isCorrect = inGroup1 ^ inGroup2 ^ inGroup3 ^ inGroup4;
				if (isCorrect) {
					JOptionPane.showMessageDialog(null, "Yay!");
				} else {
					JOptionPane.showMessageDialog(null, "boo...");
				}
			}
		});
		btnSubmit.setBounds(140, 506, 89, 23);
		contentPane.add(btnSubmit);
	}

	private void updateSelected(JToggleButton j, boolean add) {
		if (add) {
			if (selected.size() == 4) {
				j.setSelected(false);
			} else {
				selected.add(j);
			}
		} else {
			selected.remove(j);
		}
		System.out.println(selected);
	}
}
