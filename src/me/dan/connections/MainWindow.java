package me.dan.connections;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.JProgressBar;

public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ArrayList<JToggleButton> selected;
	private String[] layout;

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
		buttons[2] = tglbtnNewToggleButton_2;
		
		JToggleButton tglbtnNewToggleButton_3 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_3.setBounds(340, 74, 90, 90);
		contentPane.add(tglbtnNewToggleButton_3);
		buttons[3] = tglbtnNewToggleButton_3;
		
		JToggleButton tglbtnNewToggleButton_4 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_4.setBounds(40, 175, 90, 90);
		contentPane.add(tglbtnNewToggleButton_4);
		buttons[4] = tglbtnNewToggleButton_4;
		
		JToggleButton tglbtnNewToggleButton_5 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_5.setBounds(140, 175, 90, 90);
		contentPane.add(tglbtnNewToggleButton_5);
		buttons[5] = tglbtnNewToggleButton_5;
		
		JToggleButton tglbtnNewToggleButton_6 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_6.setBounds(240, 175, 90, 90);
		contentPane.add(tglbtnNewToggleButton_6);
		buttons[6] = tglbtnNewToggleButton_6;
		
		JToggleButton tglbtnNewToggleButton_7 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_7.setBounds(340, 175, 90, 90);
		contentPane.add(tglbtnNewToggleButton_7);
		buttons[7] = tglbtnNewToggleButton_7;
		
		JToggleButton tglbtnNewToggleButton_8 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_8.setBounds(40, 276, 90, 90);
		contentPane.add(tglbtnNewToggleButton_8);
		buttons[8] = tglbtnNewToggleButton_8;
		
		JToggleButton tglbtnNewToggleButton_9 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_9.setBounds(140, 276, 90, 90);
		contentPane.add(tglbtnNewToggleButton_9);
		buttons[9] = tglbtnNewToggleButton_9;
		
		JToggleButton tglbtnNewToggleButton_10 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_10.setBounds(240, 276, 90, 90);
		contentPane.add(tglbtnNewToggleButton_10);
		buttons[10] = tglbtnNewToggleButton_10;
		
		JToggleButton tglbtnNewToggleButton_11 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_11.setBounds(340, 276, 90, 90);
		contentPane.add(tglbtnNewToggleButton_11);
		buttons[11] = tglbtnNewToggleButton_11;
		
		JToggleButton tglbtnNewToggleButton_12 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_12.setBounds(40, 377, 90, 90);
		contentPane.add(tglbtnNewToggleButton_12);
		buttons[12] = tglbtnNewToggleButton_12;
		
		JToggleButton tglbtnNewToggleButton_13 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_13.setBounds(140, 377, 90, 90);
		contentPane.add(tglbtnNewToggleButton_13);
		buttons[13] = tglbtnNewToggleButton_13;
		
		JToggleButton tglbtnNewToggleButton_14 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_14.setBounds(240, 377, 90, 90);
		contentPane.add(tglbtnNewToggleButton_14);
		buttons[14] = tglbtnNewToggleButton_14;
		
		JToggleButton tglbtnNewToggleButton_15 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_15.setBounds(340, 377, 90, 90);
		contentPane.add(tglbtnNewToggleButton_15);
		buttons[15] = tglbtnNewToggleButton_15;
		
		for (JToggleButton j : buttons) {
			j.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					updateSelected(j, j.isSelected());
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

		layout = new String[16];
		layout[0] = wg1.getWord1();
		layout[1] = wg1.getWord2();
		layout[2] = wg1.getWord3();
		layout[3] = wg1.getWord4();

		layout[4] = wg2.getWord1();
		layout[5] = wg2.getWord2();
		layout[6] = wg2.getWord2();
		layout[7] = wg2.getWord2();

		layout[8] = wg3.getWord1();
		layout[9] = wg3.getWord2();
		layout[10] = wg3.getWord3();
		layout[11] = wg3.getWord4();

		layout[12] = wg4.getWord1();
		layout[13] = wg4.getWord2();
		layout[14] = wg4.getWord3();
		layout[15] = wg4.getWord4();

		List<String> toShuffle = Arrays.asList(layout);
		Collections.shuffle(toShuffle);
		toShuffle.toArray(layout);

		for (int i = 0; i < 16; i++) {
			buttons[i].setText(layout[i]);
		}

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
					String[] newLayout = new String[16];
					if (inGroup1) {
						newLayout[0] = wg1.getWord1();
						newLayout[1] = wg1.getWord2();
						newLayout[2] = wg1.getWord3();
						newLayout[3] = wg1.getWord4();
					}

					// TODO: remaining groups!

					var remaining = new ArrayList<String>();
					for (String word : layout) {
						if (!wg1.contains(word)) {
							remaining.add(word);
						}
					}

					Collections.shuffle(remaining);
					for (int i = 0; i < remaining.size(); i++) {
						newLayout[i+4] = remaining.get(i);
					}

					layout = newLayout;
					for (int i = 0; i < 16; i++) {
						buttons[i].setText(layout[i]);
						buttons[i].setSelected(false);
					}
					/*
					for (int i = 0; i < 4; i++) {
						JToggleButton toMove = selected.get(i);
						int positionInLayout = -1;
						for (int j = 0; j < 16; j++) {
							if (toMove.getText().equals(layout[j])) {
								positionInLayout = j;
								break;
							}
						}

						if (positionInLayout > 3) {

						}
					}*/
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
		System.out.println(selected.size());
	}
}
