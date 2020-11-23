package MP1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Layout implements ActionListener{
	
	JFrame jfrm,num,jnew;
	JButton b[][]=new JButton[9][9];
	JButton bc[]=new JButton[9];
	JMenuItem jmiClear,jmiEasy,jmiMedium,jmiHard,jmiRules,jmiSoln;
	int i,j,i1,j1,count1=1,count2=1,count3=1;
	
	Layout(){
		jfrm=new JFrame("Sudoku");
		jfrm.setLayout(new GridLayout());
		jfrm.setSize(600,600);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setVisible(true);
	
		JMenuBar jmb = new JMenuBar();
		JMenu jmEdit= new JMenu("Edit");
		jmiClear= new JMenuItem("Clear");
		jmEdit.add(jmiClear);
		jmb.add(jmEdit);
		JMenu jmHelp = new JMenu("Help");
		jmiRules= new JMenuItem("Rules");
		jmiSoln= new JMenuItem("Solution");
		jmHelp.add(jmiRules);
		jmHelp.add(jmiSoln);
		JMenu jmiDiff= new JMenu("Difficulty");
		jmiEasy = new JMenuItem("Easy");
		jmiMedium = new JMenuItem("Medium");
		jmiHard = new JMenuItem("Hard");
		jmiDiff.add(jmiEasy);
		jmiDiff.add(jmiMedium);
		jmiDiff.add(jmiHard);
		jmEdit.add(jmiDiff);
		jmb.add(jmHelp);
		jfrm.setJMenuBar(jmb);

		jmiEasy.addActionListener(this);
		jmiMedium.addActionListener(this);
		jmiHard.addActionListener(this);
		jmiRules.addActionListener(this);
		jmiClear.addActionListener(this);
		
		Font bfont=new Font("Arial", Font.BOLD, 18);
		
		for(i=0;i<9;i++) {
			for(j=0;j<9;j++) {
			b[i][j] = new JButton();
    		jfrm.add(b[i][j]);
    		b[i][j].setBackground(Color.WHITE);
    		b[i][j].setFont(bfont);
		}
		}
		
		jfrm.setLayout(new GridLayout(9,9));
	}
	void logic(int i, int j) {
		if(i>=0 && i<3) {
			if(j>=0 && j<3) {
				
				b[i][j].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e1) {
							num = new JFrame("Memos");
							num.setLayout(new GridLayout());
							num.setSize(340,340);
							num.setVisible(true);
							
							Font bfont=new Font("Arial", Font.BOLD, 18);
							for(int i1=0;i1<9;i1++) {
								bc[i1] = new JButton();
						    	num.add(bc[i1]);
						    	bc[i1].setFont(bfont);
							}
							
							bc[0].setText("1");
							bc[1].setText("2");
							bc[2].setText("3");
							bc[3].setText("4");
							bc[4].setText("5");
							bc[5].setText("6");
							bc[6].setText("7");
							bc[7].setText("8");
							bc[8].setText("9");
							
							bc[0].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="1"||b[i1][j].getText()=="1") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=0;i1<3;i1++) {
											for(j1=0;j1<3;j1++) {
												if(b[i1][j1].getText()=="1") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("1");
										num.dispose();
								}
							});
							bc[1].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="2"||b[i1][j].getText()=="2") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=0;i1<3;i1++) {
											for(j1=0;j1<3;j1++) {
												if(b[i1][j1].getText()=="2") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("2");
										num.dispose();
								}
							});
							bc[2].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="3"||b[i1][j].getText()=="3") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=0;i1<3;i1++) {
											for(j1=0;j1<3;j1++) {
												if(b[i1][j1].getText()=="3") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("3");
										num.dispose();
								}
							});
							bc[3].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="4"||b[i1][j].getText()=="4") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=0;i1<3;i1++) {
											for(j1=0;j1<3;j1++) {
												if(b[i1][j1].getText()=="4") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("4");
										num.dispose();
								}
							});
							bc[4].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="5"||b[i1][j].getText()=="5") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=0;i1<3;i1++) {
											for(j1=0;j1<3;j1++) {
												if(b[i1][j1].getText()=="5") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("5");
										num.dispose();
								}
							});
							bc[5].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="6"||b[i1][j].getText()=="6") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=0;i1<3;i1++) {
											for(j1=0;j1<3;j1++) {
												if(b[i1][j1].getText()=="6") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("6");
										num.dispose();
								}
							});
							bc[6].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="7"||b[i1][j].getText()=="7") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=0;i1<3;i1++) {
											for(j1=0;j1<3;j1++) {
												if(b[i1][j1].getText()=="7") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("7");
										num.dispose();
								}
							});
							bc[7].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="8"||b[i1][j].getText()=="8") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=0;i1<3;i1++) {
											for(j1=0;j1<3;j1++) {
												if(b[i1][j1].getText()=="8") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("8");
										num.dispose();
								}	
							});
							bc[8].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="9"||b[i1][j].getText()=="9") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=0;i1<3;i1++) {
											for(j1=0;j1<3;j1++) {
												if(b[i1][j1].getText()=="9") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("9");
										num.dispose();
								}
							});
							
							num.setLayout(new GridLayout(3,3));
							
					}
				});
			}
			else if(j>=3 && j<6) {
				b[i][j].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e1) {

							num = new JFrame("Memos");
							num.setLayout(new GridLayout());
							num.setSize(340,340);
							num.setVisible(true);
							
							Font bfont=new Font("Arial", Font.BOLD, 18);
							
							for(int i1=0;i1<9;i1++) {
								bc[i1] = new JButton();
						    	num.add(bc[i1]);
						    	bc[i1].setFont(bfont);
							}
												
							bc[0].setText("1");
							bc[1].setText("2");
							bc[2].setText("3");
							bc[3].setText("4");
							bc[4].setText("5");
							bc[5].setText("6");
							bc[6].setText("7");
							bc[7].setText("8");
							bc[8].setText("9");
							
							bc[0].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="1"||b[i1][j].getText()=="1") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=0;i1<3;i1++) {
											for(j1=3;j1<6;j1++) {
												if(b[i1][j1].getText()=="1") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("1");
										num.dispose();
								}
							});
							bc[1].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="2"||b[i1][j].getText()=="2") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=0;i1<3;i1++) {
											for(j1=3;j1<6;j1++) {
												if(b[i1][j1].getText()=="2") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("2");
										num.dispose();
								}
							});
							bc[2].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="3"||b[i1][j].getText()=="3") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=0;i1<3;i1++) {
											for(j1=3;j1<6;j1++) {
												if(b[i1][j1].getText()=="3") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("3");
										num.dispose();
								}
							});
							bc[3].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="4"||b[i1][j].getText()=="4") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=0;i1<3;i1++) {
											for(j1=3;j1<6;j1++) {
												if(b[i1][j1].getText()=="4") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("4");
										num.dispose();
								}
							});
							bc[4].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="5"||b[i1][j].getText()=="5") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=0;i1<3;i1++) {
											for(j1=3;j1<6;j1++) {
												if(b[i1][j1].getText()=="5") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("5");
										num.dispose();
								}
							});
							bc[5].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="6"||b[i1][j].getText()=="6") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=0;i1<3;i1++) {
											for(j1=3;j1<6;j1++) {
												if(b[i1][j1].getText()=="6") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("6");
										num.dispose();
								}
							});
							bc[6].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="7"||b[i1][j].getText()=="7") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=0;i1<3;i1++) {
											for(j1=3;j1<6;j1++) {
												if(b[i1][j1].getText()=="7") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("7");
										num.dispose();
								}
							});
							bc[7].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="8"||b[i1][j].getText()=="8") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=0;i1<3;i1++) {
											for(j1=3;j1<6;j1++) {
												if(b[i1][j1].getText()=="8") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("8");
										num.dispose();
								}	
							});
							bc[8].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="9"||b[i1][j].getText()=="9") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=0;i1<3;i1++) {
											for(j1=3;j1<6;j1++) {
												if(b[i1][j1].getText()=="9") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("9");
										num.dispose();
								}
							});
							
							num.setLayout(new GridLayout(3,3));
					}
				});
			}
			else if(j>=6 && j<9) {
				b[i][j].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e1) {

							num = new JFrame("Memos");
							num.setLayout(new GridLayout());
							num.setSize(340,340);
							num.setVisible(true);
							
							Font bfont=new Font("Arial", Font.BOLD, 18);
							
							for(int i1=0;i1<9;i1++) {
								bc[i1] = new JButton();
						    	num.add(bc[i1]);
						    	bc[i1].setFont(bfont);
							}
												
							bc[0].setText("1");
							bc[1].setText("2");
							bc[2].setText("3");
							bc[3].setText("4");
							bc[4].setText("5");
							bc[5].setText("6");
							bc[6].setText("7");
							bc[7].setText("8");
							bc[8].setText("9");
							
							bc[0].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="1"||b[i1][j].getText()=="1") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=0;i1<3;i1++) {
											for(j1=6;j1<9;j1++) {
												if(b[i1][j1].getText()=="1") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("1");
										num.dispose();
								}
							});
							bc[1].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="2"||b[i1][j].getText()=="2") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=0;i1<3;i1++) {
											for(j1=6;j1<9;j1++) {
												if(b[i1][j1].getText()=="2") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("2");
										num.dispose();
								}
							});
							bc[2].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="3"||b[i1][j].getText()=="3") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=0;i1<3;i1++) {
											for(j1=6;j1<9;j1++) {
												if(b[i1][j1].getText()=="3") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("3");
										num.dispose();
								}
							});
							bc[3].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="4"||b[i1][j].getText()=="4") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=0;i1<3;i1++) {
											for(j1=6;j1<9;j1++) {
												if(b[i1][j1].getText()=="4") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("4");
										num.dispose();
								}
							});
							bc[4].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="5"||b[i1][j].getText()=="5") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=0;i1<3;i1++) {
											for(j1=6;j1<9;j1++) {
												if(b[i1][j1].getText()=="5") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("5");
										num.dispose();
								}
							});
							bc[5].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="6"||b[i1][j].getText()=="6") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=0;i1<3;i1++) {
											for(j1=6;j1<9;j1++) {
												if(b[i1][j1].getText()=="6") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("6");
										num.dispose();
								}
							});
							bc[6].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="7"||b[i1][j].getText()=="7") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=0;i1<3;i1++) {
											for(j1=6;j1<9;j1++) {
												if(b[i1][j1].getText()=="7") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("7");
										num.dispose();
								}
							});
							bc[7].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="8"||b[i1][j].getText()=="8") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=0;i1<3;i1++) {
											for(j1=6;j1<9;j1++) {
												if(b[i1][j1].getText()=="8") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("8");
										num.dispose();
								}	
							});
							bc[8].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="9"||b[i1][j].getText()=="9") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=0;i1<3;i1++) {
											for(j1=6;j1<9;j1++) {
												if(b[i1][j1].getText()=="9") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("9");
										num.dispose();
								}
							});
							
							num.setLayout(new GridLayout(3,3));
					}
				});
			}
		}
		else if(i>=3 && i<6) {
			if(j>=0 && j<3) {
				b[i][j].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e1) {

							num = new JFrame("Memos");
							num.setLayout(new GridLayout());
							num.setSize(340,340);
							num.setVisible(true);
							
							Font bfont=new Font("Arial", Font.BOLD, 18);
							
							for(int i1=0;i1<9;i1++) {
								bc[i1] = new JButton();
						    	num.add(bc[i1]);
						    	bc[i1].setFont(bfont);
							}
												
							bc[0].setText("1");
							bc[1].setText("2");
							bc[2].setText("3");
							bc[3].setText("4");
							bc[4].setText("5");
							bc[5].setText("6");
							bc[6].setText("7");
							bc[7].setText("8");
							bc[8].setText("9");
							
							bc[0].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="1"||b[i1][j].getText()=="1") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=3;i1<6;i1++) {
											for(j1=0;j1<3;j1++) {
												if(b[i1][j1].getText()=="1") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("1");
										num.dispose();
								}
							});
							bc[1].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="2"||b[i1][j].getText()=="2") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=3;i1<6;i1++) {
											for(j1=0;j1<3;j1++) {
												if(b[i1][j1].getText()=="2") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("2");
										num.dispose();
								}
							});
							bc[2].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="3"||b[i1][j].getText()=="3") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=3;i1<6;i1++) {
											for(j1=0;j1<3;j1++) {
												if(b[i1][j1].getText()=="3") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("3");
										num.dispose();
								}
							});
							bc[3].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="4"||b[i1][j].getText()=="4") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=3;i1<6;i1++) {
											for(j1=0;j1<3;j1++) {
												if(b[i1][j1].getText()=="4") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("4");
										num.dispose();
								}
							});
							bc[4].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="5"||b[i1][j].getText()=="5") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=3;i1<6;i1++) {
											for(j1=0;j1<3;j1++) {
												if(b[i1][j1].getText()=="5") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("5");
										num.dispose();
								}
							});
							bc[5].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="6"||b[i1][j].getText()=="6") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=3;i1<6;i1++) {
											for(j1=0;j1<3;j1++) {
												if(b[i1][j1].getText()=="6") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("6");
										num.dispose();
								}
							});
							bc[6].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="7"||b[i1][j].getText()=="7") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=3;i1<6;i1++) {
											for(j1=0;j1<3;j1++) {
												if(b[i1][j1].getText()=="7") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("7");
										num.dispose();
								}
							});
							bc[7].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="8"||b[i1][j].getText()=="8") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=3;i1<6;i1++) {
											for(j1=0;j1<3;j1++) {
												if(b[i1][j1].getText()=="8") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("8");
										num.dispose();
								}	
							});
							bc[8].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="9"||b[i1][j].getText()=="9") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=3;i1<6;i1++) {
											for(j1=0;j1<3;j1++) {
												if(b[i1][j1].getText()=="9") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("9");
										num.dispose();
								}
							});
							
							num.setLayout(new GridLayout(3,3));
					}
				});
			}
			else if(j>=3 && j<6) {
				b[i][j].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e1) {

							num = new JFrame("Memos");
							num.setLayout(new GridLayout());
							num.setSize(340,340);
							num.setVisible(true);
							
							Font bfont=new Font("Arial", Font.BOLD, 18);
							
							for(int i1=0;i1<9;i1++) {
								bc[i1] = new JButton();
						    	num.add(bc[i1]);
						    	bc[i1].setFont(bfont);
							}
												
							bc[0].setText("1");
							bc[1].setText("2");
							bc[2].setText("3");
							bc[3].setText("4");
							bc[4].setText("5");
							bc[5].setText("6");
							bc[6].setText("7");
							bc[7].setText("8");
							bc[8].setText("9");
							
							bc[0].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="1"||b[i1][j].getText()=="1") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=3;i1<6;i1++) {
											for(j1=3;j1<6;j1++) {
												if(b[i1][j1].getText()=="1") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("1");
										num.dispose();
								}
							});
							bc[1].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="2"||b[i1][j].getText()=="2") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=3;i1<6;i1++) {
											for(j1=3;j1<6;j1++) {
												if(b[i1][j1].getText()=="2") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("2");
										num.dispose();
								}
							});
							bc[2].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="3"||b[i1][j].getText()=="3") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=3;i1<6;i1++) {
											for(j1=3;j1<6;j1++) {
												if(b[i1][j1].getText()=="3") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("3");
										num.dispose();
								}
							});
							bc[3].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="4"||b[i1][j].getText()=="4") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=3;i1<6;i1++) {
											for(j1=3;j1<6;j1++) {
												if(b[i1][j1].getText()=="4") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("4");
										num.dispose();
								}
							});
							bc[4].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="5"||b[i1][j].getText()=="5") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=3;i1<6;i1++) {
											for(j1=3;j1<6;j1++) {
												if(b[i1][j1].getText()=="5") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("5");
										num.dispose();
								}
							});
							bc[5].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="6"||b[i1][j].getText()=="6") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=3;i1<6;i1++) {
											for(j1=3;j1<6;j1++) {
												if(b[i1][j1].getText()=="6") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("6");
										num.dispose();
								}
							});
							bc[6].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="7"||b[i1][j].getText()=="7") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=3;i1<6;i1++) {
											for(j1=3;j1<6;j1++) {
												if(b[i1][j1].getText()=="7") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("7");
										num.dispose();
								}
							});
							bc[7].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="8"||b[i1][j].getText()=="8") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=3;i1<6;i1++) {
											for(j1=3;j1<6;j1++) {
												if(b[i1][j1].getText()=="8") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("8");
										num.dispose();
								}	
							});
							bc[8].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="9"||b[i1][j].getText()=="9") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=3;i1<6;i1++) {
											for(j1=3;j1<6;j1++) {
												if(b[i1][j1].getText()=="9") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("9");
										num.dispose();
								}
							});
							
							num.setLayout(new GridLayout(3,3));
					}
				});
			}
			else if(j>=6 && j<9) {
				b[i][j].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e1) {

							num = new JFrame("Memos");
							num.setLayout(new GridLayout());
							num.setSize(340,340);
							num.setVisible(true);
							
							Font bfont=new Font("Arial", Font.BOLD, 18);
							
							for(int i1=0;i1<9;i1++) {
								bc[i1] = new JButton();
						    	num.add(bc[i1]);
						    	bc[i1].setFont(bfont);
							}
												
							bc[0].setText("1");
							bc[1].setText("2");
							bc[2].setText("3");
							bc[3].setText("4");
							bc[4].setText("5");
							bc[5].setText("6");
							bc[6].setText("7");
							bc[7].setText("8");
							bc[8].setText("9");
							
							bc[0].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="1"||b[i1][j].getText()=="1") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=3;i1<6;i1++) {
											for(j1=6;j1<9;j1++) {
												if(b[i1][j1].getText()=="1") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("1");
										num.dispose();
								}
							});
							bc[1].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="2"||b[i1][j].getText()=="2") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=3;i1<6;i1++) {
											for(j1=6;j1<9;j1++) {
												if(b[i1][j1].getText()=="2") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("2");
										num.dispose();
								}
							});
							bc[2].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="3"||b[i1][j].getText()=="3") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=3;i1<6;i1++) {
											for(j1=6;j1<9;j1++) {
												if(b[i1][j1].getText()=="3") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("3");
										num.dispose();
								}
							});
							bc[3].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="4"||b[i1][j].getText()=="4") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=3;i1<6;i1++) {
											for(j1=6;j1<9;j1++) {
												if(b[i1][j1].getText()=="4") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("4");
										num.dispose();
								}
							});
							bc[4].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="5"||b[i1][j].getText()=="5") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=3;i1<6;i1++) {
											for(j1=6;j1<9;j1++) {
												if(b[i1][j1].getText()=="5") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("5");
										num.dispose();
								}
							});
							bc[5].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="6"||b[i1][j].getText()=="6") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=3;i1<6;i1++) {
											for(j1=6;j1<9;j1++) {
												if(b[i1][j1].getText()=="6") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("6");
										num.dispose();
								}
							});
							bc[6].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="7"||b[i1][j].getText()=="7") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=3;i1<6;i1++) {
											for(j1=6;j1<9;j1++) {
												if(b[i1][j1].getText()=="7") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("7");
										num.dispose();
								}
							});
							bc[7].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="8"||b[i1][j].getText()=="8") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=3;i1<6;i1++) {
											for(j1=6;j1<9;j1++) {
												if(b[i1][j1].getText()=="8") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("8");
										num.dispose();
								}	
							});
							bc[8].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="9"||b[i1][j].getText()=="9") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=3;i1<6;i1++) {
											for(j1=6;j1<9;j1++) {
												if(b[i1][j1].getText()=="9") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("9");
										num.dispose();
								}
							});
							
							num.setLayout(new GridLayout(3,3));
					}
				});
			}
		}
		else if(i>=6 && i<9) {
			if(j>=0 && j<3) {
				b[i][j].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e1) {

							num = new JFrame("Memos");
							num.setLayout(new GridLayout());
							num.setSize(340,340);
							num.setVisible(true);
							
							Font bfont=new Font("Arial", Font.BOLD, 18);
							
							for(int i1=0;i1<9;i1++) {
								bc[i1] = new JButton();
						    	num.add(bc[i1]);
						    	bc[i1].setFont(bfont);
							}
												
							bc[0].setText("1");
							bc[1].setText("2");
							bc[2].setText("3");
							bc[3].setText("4");
							bc[4].setText("5");
							bc[5].setText("6");
							bc[6].setText("7");
							bc[7].setText("8");
							bc[8].setText("9");
							
							bc[0].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="1"||b[i1][j].getText()=="1") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=6;i1<9;i1++) {
											for(j1=0;j1<3;j1++) {
												if(b[i1][j1].getText()=="1") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("1");
										num.dispose();
								}
							});
							bc[1].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="2"||b[i1][j].getText()=="2") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=6;i1<9;i1++) {
											for(j1=0;j1<3;j1++) {
												if(b[i1][j1].getText()=="2") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("2");
										num.dispose();
								}
							});
							bc[2].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="3"||b[i1][j].getText()=="3") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=6;i1<9;i1++) {
											for(j1=0;j1<3;j1++) {
												if(b[i1][j1].getText()=="3") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("3");
										num.dispose();
								}
							});
							bc[3].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="4"||b[i1][j].getText()=="4") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=6;i1<9;i1++) {
											for(j1=0;j1<3;j1++) {
												if(b[i1][j1].getText()=="4") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("4");
										num.dispose();
								}
							});
							bc[4].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="5"||b[i1][j].getText()=="5") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=6;i1<9;i1++) {
											for(j1=0;j1<3;j1++) {
												if(b[i1][j1].getText()=="5") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("5");
										num.dispose();
								}
							});
							bc[5].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="6"||b[i1][j].getText()=="6") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=6;i1<9;i1++) {
											for(j1=0;j1<3;j1++) {
												if(b[i1][j1].getText()=="6") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("6");
										num.dispose();
								}
							});
							bc[6].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="7"||b[i1][j].getText()=="7") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=6;i1<9;i1++) {
											for(j1=0;j1<3;j1++) {
												if(b[i1][j1].getText()=="7") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("7");
										num.dispose();
								}
							});
							bc[7].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="8"||b[i1][j].getText()=="8") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=6;i1<9;i1++) {
											for(j1=0;j1<3;j1++) {
												if(b[i1][j1].getText()=="8") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("8");
										num.dispose();
								}	
							});
							bc[8].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="9"||b[i1][j].getText()=="9") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=6;i1<9;i1++) {
											for(j1=0;j1<3;j1++) {
												if(b[i1][j1].getText()=="9") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("9");
										num.dispose();
								}
							});
							
							num.setLayout(new GridLayout(3,3));
					}
				});
			}
			else if(j>=3 && j<6) {
				b[i][j].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e1) {

							num = new JFrame("Memos");
							num.setLayout(new GridLayout());
							num.setSize(340,340);
							num.setVisible(true);
							
							Font bfont=new Font("Arial", Font.BOLD, 18);
							
							for(int i1=0;i1<9;i1++) {
								bc[i1] = new JButton();
						    	num.add(bc[i1]);
						    	bc[i1].setFont(bfont);
							}
												
							bc[0].setText("1");
							bc[1].setText("2");
							bc[2].setText("3");
							bc[3].setText("4");
							bc[4].setText("5");
							bc[5].setText("6");
							bc[6].setText("7");
							bc[7].setText("8");
							bc[8].setText("9");
							
							bc[0].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="1"||b[i1][j].getText()=="1") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=6;i1<9;i1++) {
											for(j1=3;j1<6;j1++) {
												if(b[i1][j1].getText()=="1") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("1");
										num.dispose();
								}
							});
							bc[1].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="2"||b[i1][j].getText()=="2") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=6;i1<9;i1++) {
											for(j1=3;j1<6;j1++) {
												if(b[i1][j1].getText()=="2") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("2");
										num.dispose();
								}
							});
							bc[2].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="3"||b[i1][j].getText()=="3") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=6;i1<9;i1++) {
											for(j1=3;j1<6;j1++) {
												if(b[i1][j1].getText()=="3") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("3");
										num.dispose();
								}
							});
							bc[3].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="4"||b[i1][j].getText()=="4") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=6;i1<9;i1++) {
											for(j1=3;j1<6;j1++) {
												if(b[i1][j1].getText()=="4") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("4");
										num.dispose();
								}
							});
							bc[4].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="5"||b[i1][j].getText()=="5") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=6;i1<9;i1++) {
											for(j1=3;j1<6;j1++) {
												if(b[i1][j1].getText()=="5") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("5");
										num.dispose();
								}
							});
							bc[5].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="6"||b[i1][j].getText()=="6") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=6;i1<9;i1++) {
											for(j1=3;j1<6;j1++) {
												if(b[i1][j1].getText()=="6") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("6");
										num.dispose();
								}
							});
							bc[6].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="7"||b[i1][j].getText()=="7") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=6;i1<9;i1++) {
											for(j1=3;j1<6;j1++) {
												if(b[i1][j1].getText()=="7") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("7");
										num.dispose();
								}
							});
							bc[7].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="8"||b[i1][j].getText()=="8") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=6;i1<9;i1++) {
											for(j1=3;j1<6;j1++) {
												if(b[i1][j1].getText()=="8") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("8");
										num.dispose();
								}	
							});
							bc[8].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="9"||b[i1][j].getText()=="9") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=6;i1<9;i1++) {
											for(j1=3;j1<6;j1++) {
												if(b[i1][j1].getText()=="9") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("9");
										num.dispose();
								}
							});
							
							num.setLayout(new GridLayout(3,3));
					}
				});
			}
			else if(j>=6 && j<9) {
				b[i][j].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e1) {

							num = new JFrame("Memos");
							num.setLayout(new GridLayout());
							num.setSize(340,340);
							num.setVisible(true);
							
							Font bfont=new Font("Arial", Font.BOLD, 18);
							
							for(int i1=0;i1<9;i1++) {
								bc[i1] = new JButton();
						    	num.add(bc[i1]);
						    	bc[i1].setFont(bfont);
							}
												
							bc[0].setText("1");
							bc[1].setText("2");
							bc[2].setText("3");
							bc[3].setText("4");
							bc[4].setText("5");
							bc[5].setText("6");
							bc[6].setText("7");
							bc[7].setText("8");
							bc[8].setText("9");
							
							bc[0].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="1"||b[i1][j].getText()=="1") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=6;i1<9;i1++) {
											for(j1=6;j1<9;j1++) {
												if(b[i1][j1].getText()=="1") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("1");
										num.dispose();
								}
							});
							bc[1].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="2"||b[i1][j].getText()=="2") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=6;i1<9;i1++) {
											for(j1=6;j1<9;j1++) {
												if(b[i1][j1].getText()=="2") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("2");
										num.dispose();
								}
							});
							bc[2].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="3"||b[i1][j].getText()=="3") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=6;i1<9;i1++) {
											for(j1=6;j1<9;j1++) {
												if(b[i1][j1].getText()=="3") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("3");
										num.dispose();
								}
							});
							bc[3].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="4"||b[i1][j].getText()=="4") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=6;i1<9;i1++) {
											for(j1=6;j1<9;j1++) {
												if(b[i1][j1].getText()=="4") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("4");
										num.dispose();
								}
							});
							bc[4].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="5"||b[i1][j].getText()=="5") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=6;i1<9;i1++) {
											for(j1=6;j1<9;j1++) {
												if(b[i1][j1].getText()=="5") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("5");
										num.dispose();
								}
							});
							bc[5].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="6"||b[i1][j].getText()=="6") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=6;i1<9;i1++) {
											for(j1=6;j1<9;j1++) {
												if(b[i1][j1].getText()=="6") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("6");
										num.dispose();
								}
							});
							bc[6].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="7"||b[i1][j].getText()=="7") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=6;i1<9;i1++) {
											for(j1=6;j1<9;j1++) {
												if(b[i1][j1].getText()=="7") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("7");
										num.dispose();
								}
							});
							bc[7].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="8"||b[i1][j].getText()=="8") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=6;i1<9;i1++) {
											for(j1=6;j1<9;j1++) {
												if(b[i1][j1].getText()=="8") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("8");
										num.dispose();
								}	
							});
							bc[8].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e2) {
									b[i][j].setBackground(Color.WHITE);
									b[i][j].setForeground(Color.BLACK);
										for(i1=0;i1<9;i1++) {
											if(b[i][i1].getText()=="9"||b[i1][j].getText()=="9") {
												b[i][j].setBackground(Color.RED);
												break;
											}
										}
										for(i1=6;i1<9;i1++) {
											for(j1=6;j1<9;j1++) {
												if(b[i1][j1].getText()=="9") {
													b[i][j].setBackground(Color.RED);
													break;
												}
											}
										}
										b[i][j].setText("9");
										num.dispose();
								}
							});
							
							num.setLayout(new GridLayout(3,3));
					}
				});
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jmiRules) {
			jnew = new JFrame("HELP");
			jnew.setLayout(new FlowLayout());
			jnew.setSize(500,500);
			jnew.setVisible(true);
			
			JLabel rules = new JLabel();
			String msg = "<html><b>1)</b> There is only one valid solution to each Sudoku game. <br><br> <b>2)</b> When you start a Sudoku game, some of the cells would be pre-filled.<br>You cannot change these numbers in the course of the game. <br><br> <b>3)</b> Each column must contain all the numbers from 1 to 9 and no two numbers<br>in the same column of a Sudoku puzzle can be the same. <br><br> <b<4)</b> Each row must contain all the numbers from 1 to 9 and no two numbers<br>in the same row of a Sudoku puzzle can be the same. <br><br> <b>5)</b> Each 3X3 grid must contain all the numbers from 1 to 9 and no two numbers<br>in the same 3X3 grid of a Sudoku puzzle can be the same.</html>";
			rules.setText(msg);
			jnew.add(rules);
			}
		
		if(e.getSource()==jmiClear) {
			for(i=0;i<9;i++) {
				for(j=0;j<9;j++) {
					b[i][j].setBackground(Color.WHITE);
					if(b[i][j].getForeground()==Color.BLACK) {
						b[i][j].setText("");
					}
				}
			}
		}
		
		if(e.getSource()==jmiEasy) {
			for(i=0;i<9;i++) {
				for(j=0;j<9;j++) {
					ActionListener[] listeners = b[i][j].getActionListeners();
					for(ActionListener listener : listeners) {
						b[i][j].removeActionListener(listener);
					}
				}
			}
		for(i=0;i<9;i++) {
			for(j=0;j<9;j++) {
				b[i][j].setText("");
			}
		}
			if(count1==1) {
			b[0][0].setForeground(Color.GRAY);
			b[0][0].setText("1");
			b[0][3].setForeground(Color.GRAY);
			b[0][3].setText("4");
			b[0][4].setForeground(Color.GRAY);
			b[0][4].setText("8");
			b[0][5].setForeground(Color.GRAY);
			b[0][5].setText("9");
			b[0][8].setForeground(Color.GRAY);
			b[0][8].setText("6");
			b[1][0].setForeground(Color.GRAY);
			b[1][0].setText("7");
			b[1][1].setForeground(Color.GRAY);
			b[1][1].setText("3");
			b[1][7].setForeground(Color.GRAY);
			b[1][7].setText("4");
			b[2][5].setForeground(Color.GRAY);
			b[2][5].setText("1");
			b[2][6].setForeground(Color.GRAY);
			b[2][6].setText("2");
			b[2][7].setForeground(Color.GRAY);
			b[2][7].setText("9");
			b[2][8].setForeground(Color.GRAY);
			b[2][8].setText("5");
			b[3][2].setForeground(Color.GRAY);
			b[3][2].setText("7");
			b[3][3].setForeground(Color.GRAY);
			b[3][3].setText("1");
			b[3][4].setForeground(Color.GRAY);
			b[3][4].setText("2");
			b[3][6].setForeground(Color.GRAY);
			b[3][6].setText("6");
			b[4][0].setForeground(Color.GRAY);
			b[4][0].setText("5");
			b[4][3].setForeground(Color.GRAY);
			b[4][3].setText("7");
			b[4][5].setForeground(Color.GRAY);
			b[4][5].setText("3");
			b[4][8].setForeground(Color.GRAY);
			b[4][8].setText("8");
			b[5][2].setForeground(Color.GRAY);
			b[5][2].setText("6");
			b[5][4].setForeground(Color.GRAY);
			b[5][4].setText("9");
			b[5][5].setForeground(Color.GRAY);
			b[5][5].setText("5");
			b[5][6].setForeground(Color.GRAY);
			b[5][6].setText("7");
			b[6][0].setForeground(Color.GRAY);
			b[6][0].setText("9");
			b[6][1].setForeground(Color.GRAY);
			b[6][1].setText("1");
			b[6][2].setForeground(Color.GRAY);
			b[6][2].setText("4");
			b[6][3].setForeground(Color.GRAY);
			b[6][3].setText("6");
			b[7][1].setForeground(Color.GRAY);
			b[7][1].setText("2");
			b[7][7].setForeground(Color.GRAY);
			b[7][7].setText("3");
			b[7][8].setForeground(Color.GRAY);
			b[7][8].setText("7");
			b[8][0].setForeground(Color.GRAY);
			b[8][0].setText("8");
			b[8][3].setForeground(Color.GRAY);
			b[8][3].setText("5");
			b[8][4].setForeground(Color.GRAY);
			b[8][4].setText("1");
			b[8][5].setForeground(Color.GRAY);
			b[8][5].setText("2");
			b[8][8].setForeground(Color.GRAY);
			b[8][8].setText("4");
			
			logic(0,1);
			logic(0,2);
			logic(0,6);
			logic(0,7);
			logic(1,2);
			logic(1,3);
			logic(1,4);
			logic(1,5);
			logic(1,6);
			logic(1,8);
			logic(2,0);
			logic(2,1);
			logic(2,2);
			logic(2,3);
			logic(2,4);
			logic(3,0);
			logic(3,1);
			logic(3,5);
			logic(3,7);
			logic(3,8);
			logic(4,1);
			logic(4,2);
			logic(4,4);
			logic(4,6);
			logic(4,7);
			logic(5,0);
			logic(5,1);
			logic(5,3);
			logic(5,7);
			logic(5,8);
			logic(6,4);
			logic(6,5);
			logic(6,6);
			logic(6,7);
			logic(6,8);
			logic(7,0);
			logic(7,2);
			logic(7,3);
			logic(7,4);
			logic(7,5);
			logic(7,6);
			logic(8,1);
			logic(8,2);
			logic(8,6);
			logic(8,7);
			
			count1++;
			}
			else if(count1==2) {
				b[0][0].setForeground(Color.GRAY);
				b[0][0].setText("2");
				b[0][2].setForeground(Color.GRAY);
				b[0][2].setText("5");
				b[0][5].setForeground(Color.GRAY);
				b[0][5].setText("9");
				b[0][8].setForeground(Color.GRAY);
				b[0][8].setText("4");
				b[1][6].setForeground(Color.GRAY);
				b[1][6].setText("3");
				b[1][8].setForeground(Color.GRAY);
				b[1][8].setText("7");
				b[2][0].setForeground(Color.GRAY);
				b[2][0].setText("7");
				b[2][3].setForeground(Color.GRAY);
				b[2][3].setText("8");
				b[2][4].setForeground(Color.GRAY);
				b[2][4].setText("5");
				b[2][5].setForeground(Color.GRAY);
				b[2][5].setText("6");
				b[2][7].setForeground(Color.GRAY);
				b[2][7].setText("1");
				b[3][0].setForeground(Color.GRAY);
				b[3][0].setText("4");
				b[3][1].setForeground(Color.GRAY);
				b[3][1].setText("5");
				b[3][3].setForeground(Color.GRAY);
				b[3][3].setText("7");
				b[4][2].setForeground(Color.GRAY);
				b[4][2].setText("9");
				b[4][6].setForeground(Color.GRAY);
				b[4][6].setText("1");
				b[5][5].setForeground(Color.GRAY);
				b[5][5].setText("2");
				b[5][7].setForeground(Color.GRAY);
				b[5][7].setText("8");
				b[5][8].setForeground(Color.GRAY);
				b[5][8].setText("5");
				b[6][1].setForeground(Color.GRAY);
				b[6][1].setText("2");
				b[6][3].setForeground(Color.GRAY);
				b[6][3].setText("4");
				b[6][4].setForeground(Color.GRAY);
				b[6][4].setText("1");
				b[6][5].setForeground(Color.GRAY);
				b[6][5].setText("8");
				b[6][8].setForeground(Color.GRAY);
				b[6][8].setText("6");
				b[7][0].setForeground(Color.GRAY);
				b[7][0].setText("6");
				b[7][2].setForeground(Color.GRAY);
				b[7][2].setText("8");
				b[8][0].setForeground(Color.GRAY);
				b[8][0].setText("1");
				b[8][3].setForeground(Color.GRAY);
				b[8][3].setText("2");
				b[8][6].setForeground(Color.GRAY);
				b[8][6].setText("7");
				b[8][8].setForeground(Color.GRAY);
				b[8][8].setText("8");
				
				logic(0,1);
				logic(0,3);
				logic(0,4);
				logic(0,6);
				logic(0,7);
				logic(1,0);
				logic(1,1);
				logic(1,2);
				logic(1,3);
				logic(1,4);
				logic(1,5);
				logic(1,7);
				logic(2,1);
				logic(2,2);
				logic(2,6);
				logic(2,8);
				logic(3,2);
				logic(3,4);
				logic(3,5);
				logic(3,6);
				logic(3,7);
				logic(3,8);
				logic(4,0);
				logic(4,1);
				logic(4,3);
				logic(4,4);
				logic(4,5);
				logic(4,7);
				logic(4,8);
				logic(5,0);
				logic(5,1);
				logic(5,2);
				logic(5,3);
				logic(5,4);
				logic(5,6);
				logic(6,0);
				logic(6,2);
				logic(6,6);
				logic(6,7);
				logic(7,1);
				logic(7,3);
				logic(7,4);
				logic(7,5);
				logic(7,6);
				logic(7,7);
				logic(7,8);
				logic(8,1);
				logic(8,2);
				logic(8,4);
				logic(8,5);
				logic(8,7);
				
				count1++;
			}
			else if(count1==3) {
				b[0][0].setForeground(Color.GRAY);
				b[0][0].setText("5");
				b[0][1].setForeground(Color.GRAY);
				b[0][1].setText("1");
				b[0][2].setForeground(Color.GRAY);
				b[0][2].setText("9");
				b[0][3].setForeground(Color.GRAY);
				b[0][3].setText("2");
				b[0][5].setForeground(Color.GRAY);
				b[0][5].setText("7");
				b[1][2].setForeground(Color.GRAY);
				b[1][2].setText("4");
				b[1][4].setForeground(Color.GRAY);
				b[1][4].setText("9");
				b[1][6].setForeground(Color.GRAY);
				b[1][6].setText("7");
				b[1][7].setForeground(Color.GRAY);
				b[1][7].setText("2");
				b[2][1].setForeground(Color.GRAY);
				b[2][1].setText("6");
				b[2][4].setForeground(Color.GRAY);
				b[2][4].setText("4");
				b[2][5].setForeground(Color.GRAY);
				b[2][5].setText("3");
				b[3][1].setForeground(Color.GRAY);
				b[3][1].setText("4");
				b[3][2].setForeground(Color.GRAY);
				b[3][2].setText("5");
				b[3][3].setForeground(Color.GRAY);
				b[3][3].setText("3");
				b[3][4].setForeground(Color.GRAY);
				b[3][4].setText("8");
				b[3][6].setForeground(Color.GRAY);
				b[3][6].setText("2");
				b[3][7].setForeground(Color.GRAY);
				b[3][7].setText("7");
				b[5][1].setForeground(Color.GRAY);
				b[5][1].setText("2");
				b[5][2].setForeground(Color.GRAY);
				b[5][2].setText("3");
				b[5][4].setForeground(Color.GRAY);
				b[5][4].setText("1");
				b[5][5].setForeground(Color.GRAY);
				b[5][5].setText("5");
				b[5][6].setForeground(Color.GRAY);
				b[5][6].setText("9");
				b[5][7].setForeground(Color.GRAY);
				b[5][7].setText("4");
				b[6][3].setForeground(Color.GRAY);
				b[6][3].setText("4");
				b[6][4].setForeground(Color.GRAY);
				b[6][4].setText("5");
				b[6][7].setForeground(Color.GRAY);
				b[6][7].setText("3");
				b[7][1].setForeground(Color.GRAY);
				b[7][1].setText("5");
				b[7][2].setForeground(Color.GRAY);
				b[7][2].setText("6");
				b[7][4].setForeground(Color.GRAY);
				b[7][4].setText("7");
				b[7][6].setForeground(Color.GRAY);
				b[7][6].setText("4");
				b[8][3].setForeground(Color.GRAY);
				b[8][3].setText("1");
				b[8][5].setForeground(Color.GRAY);
				b[8][5].setText("6");
				b[8][6].setForeground(Color.GRAY);
				b[8][6].setText("8");
				b[8][7].setForeground(Color.GRAY);
				b[8][7].setText("5");
				b[8][8].setForeground(Color.GRAY);
				b[8][8].setText("7");
				
				logic(0,4);
				logic(0,6);
				logic(0,7);
				logic(0,8);
				logic(1,0);
				logic(1,1);
				logic(1,3);
				logic(1,5);
				logic(1,8);
				logic(2,0);
				logic(2,2);
				logic(2,3);
				logic(2,6);
				logic(2,7);
				logic(2,8);
				logic(3,0);
				logic(3,5);
				logic(3,8);
				logic(4,0);
				logic(4,1);
				logic(4,2);
				logic(4,3);
				logic(4,4);
				logic(4,5);
				logic(4,6);
				logic(4,7);
				logic(4,8);
				logic(5,0);
				logic(5,3);
				logic(5,8);
				logic(6,0);
				logic(6,1);
				logic(6,2);
				logic(6,5);
				logic(6,6);
				logic(6,8);
				logic(7,0);
				logic(7,3);
				logic(7,5);
				logic(7,7);
				logic(7,8);
				logic(8,0);
				logic(8,1);
				logic(8,2);
				logic(8,4);
				
				count1++;
			}
			else if(count1==4) {
				b[0][2].setForeground(Color.GRAY);
				b[0][2].setText("3");
				b[0][4].setForeground(Color.GRAY);
				b[0][4].setText("4");
				b[0][5].setForeground(Color.GRAY);
				b[0][5].setText("2");
				b[0][7].setForeground(Color.GRAY);
				b[0][7].setText("9");
				b[1][1].setForeground(Color.GRAY);
				b[1][1].setText("9");
				b[1][4].setForeground(Color.GRAY);
				b[1][4].setText("6");
				b[1][6].setForeground(Color.GRAY);
				b[1][6].setText("5");
				b[2][0].setForeground(Color.GRAY);
				b[2][0].setText("5");
				b[2][7].setForeground(Color.GRAY);
				b[2][7].setText("1");
				b[3][2].setForeground(Color.GRAY);
				b[3][2].setText("1");
				b[3][3].setForeground(Color.GRAY);
				b[3][3].setText("7");
				b[3][6].setForeground(Color.GRAY);
				b[3][6].setText("2");
				b[3][7].setForeground(Color.GRAY);
				b[3][7].setText("8");
				b[3][8].setForeground(Color.GRAY);
				b[3][8].setText("5");
				b[4][2].setForeground(Color.GRAY);
				b[4][2].setText("8");
				b[4][6].setForeground(Color.GRAY);
				b[4][6].setText("1");
				b[5][0].setForeground(Color.GRAY);
				b[5][0].setText("3");
				b[5][1].setForeground(Color.GRAY);
				b[5][1].setText("2");
				b[5][2].setForeground(Color.GRAY);
				b[5][2].setText("9");
				b[5][5].setForeground(Color.GRAY);
				b[5][5].setText("8");
				b[5][6].setForeground(Color.GRAY);
				b[5][6].setText("7");
				b[6][1].setForeground(Color.GRAY);
				b[6][1].setText("3");
				b[6][8].setForeground(Color.GRAY);
				b[6][8].setText("1");
				b[7][2].setForeground(Color.GRAY);
				b[7][2].setText("5");
				b[7][4].setForeground(Color.GRAY);
				b[7][4].setText("9");
				b[7][7].setForeground(Color.GRAY);
				b[7][7].setText("2");
				b[8][1].setForeground(Color.GRAY);
				b[8][1].setText("8");
				b[8][3].setForeground(Color.GRAY);
				b[8][3].setText("2");
				b[8][4].setForeground(Color.GRAY);
				b[8][4].setText("1");
				b[8][6].setForeground(Color.GRAY);
				b[8][6].setText("6");
				               
				logic(0,0);
				logic(0,1);
				logic(0,3);
				logic(0,6);
				logic(0,8);
				logic(1,0);
				logic(1,2);
				logic(1,3);
				logic(1,5);
				logic(1,7);
				logic(1,8);
				logic(2,1);
				logic(2,2);
				logic(2,3);
				logic(2,4);
				logic(2,5);
				logic(2,6);
				logic(2,8);
				logic(3,0);
				logic(3,1);
				logic(3,4);
				logic(3,5);
				logic(4,0);
				logic(4,1);
				logic(4,3);
				logic(4,4);
				logic(4,5);
				logic(4,7);
				logic(4,8);
				logic(5,3);
				logic(5,4);
				logic(5,7);
				logic(5,8);
				logic(6,0);
				logic(6,2);
				logic(6,3);
				logic(6,4);
				logic(6,5);
				logic(6,6);
				logic(6,7);
				logic(7,0);
				logic(7,1);
				logic(7,3);
				logic(7,5);
				logic(7,6);
				logic(7,8);
				logic(8,0);
				logic(8,2);
				logic(8,5);
				logic(8,7);
				logic(8,8);
				                
				count1++;
			}

			else if(count1==5) {
				b[0][1].setForeground(Color.GRAY);
				b[0][1].setText("6");
				b[0][5].setForeground(Color.GRAY);
				b[0][5].setText("5");
				b[0][6].setForeground(Color.GRAY);
				b[0][6].setText("7");
				b[0][8].setForeground(Color.GRAY);
				b[0][8].setText("2");
				b[1][2].setForeground(Color.GRAY);
				b[1][2].setText("4");
				b[1][4].setForeground(Color.GRAY);
				b[1][4].setText("9");
				b[1][5].setForeground(Color.GRAY);
				b[1][5].setText("6");
				b[1][7].setForeground(Color.GRAY);
				b[1][7].setText("1");
				b[2][0].setForeground(Color.GRAY);
				b[2][0].setText("8");
				b[2][1].setForeground(Color.GRAY);
				b[2][1].setText("7");
				b[2][2].setForeground(Color.GRAY);
				b[2][2].setText("1");
				b[2][3].setForeground(Color.GRAY);
				b[2][3].setText("3");
				b[2][5].setForeground(Color.GRAY);
				b[2][5].setText("2");
				b[3][0].setForeground(Color.GRAY);
				b[3][0].setText("5");
				b[3][4].setForeground(Color.GRAY);
				b[3][4].setText("7");
				b[3][5].setForeground(Color.GRAY);
				b[3][5].setText("1");
				b[3][6].setForeground(Color.GRAY);
				b[3][6].setText("3");
				b[4][1].setForeground(Color.GRAY);
				b[4][1].setText("3");
				b[4][4].setForeground(Color.GRAY);
				b[4][4].setText("5");
				b[4][7].setForeground(Color.GRAY);
				b[4][7].setText("7");
				b[5][2].setForeground(Color.GRAY);
				b[5][2].setText("7");
				b[5][3].setForeground(Color.GRAY);
				b[5][3].setText("8");
				b[5][4].setForeground(Color.GRAY);
				b[5][4].setText("2");
				b[5][8].setForeground(Color.GRAY);
				b[5][8].setText("5");
				b[6][3].setForeground(Color.GRAY);
				b[6][3].setText("5");
				b[6][5].setForeground(Color.GRAY);
				b[6][5].setText("9");
				b[6][6].setForeground(Color.GRAY);
				b[6][6].setText("6");
				b[6][7].setForeground(Color.GRAY);
				b[6][7].setText("8");
				b[6][8].setForeground(Color.GRAY);
				b[6][8].setText("7");
				b[7][1].setForeground(Color.GRAY);
				b[7][1].setText("8");
				b[7][3].setForeground(Color.GRAY);
				b[7][3].setText("2");
				b[7][4].setForeground(Color.GRAY);
				b[7][4].setText("6");
				b[7][6].setForeground(Color.GRAY);
				b[7][6].setText("1");
				b[8][0].setForeground(Color.GRAY);
				b[8][0].setText("7");
				b[8][2].setForeground(Color.GRAY);
				b[8][2].setText("6");
				b[8][3].setForeground(Color.GRAY);
				b[8][3].setText("4");
				b[8][7].setForeground(Color.GRAY);
				b[8][7].setText("2");
				
				logic(0,0);
				logic(0,2);
				logic(0,3);
				logic(0,4);
				logic(0,7);
				logic(1,0);
				logic(1,1);
				logic(1,3);
				logic(1,6);
				logic(1,8);
				logic(2,4);
				logic(2,6);
				logic(2,7);
				logic(2,8);
				logic(3,1);
				logic(3,2);
				logic(3,3);
				logic(3,7);
				logic(3,8);
				logic(4,0);
				logic(4,2);
				logic(4,3);
				logic(4,5);
				logic(4,6);
				logic(4,8);
				logic(5,0);
				logic(5,1);
				logic(5,5);
				logic(5,6);
				logic(5,7);
				logic(6,0);
				logic(6,1);
				logic(6,2);
				logic(6,4);
				logic(7,0);
				logic(7,2);
				logic(7,5);
				logic(7,7);
				logic(7,8);
				logic(8,1);
				logic(8,4);
				logic(8,5);
				logic(8,6);
				logic(8,8);
				
				count1=1;
			}
			jmiSoln.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e1) {
						for(i=0;i<9;i++) {
							for(j=0;j<9;j++) {
								ActionListener[] listeners = b[i][j].getActionListeners();
								for(ActionListener listener : listeners) {
									b[i][j].removeActionListener(listener);
								}
							}
						}
						for(i=0;i<9;i++) {
							for(j=0;j<9;j++) {
								b[i][j].setForeground(Color.BLACK);
							}
						}
					if(count1==2) {
						b[0][1].setText("5");
                        b[0][2].setText("2");
                        b[0][6].setText("3");
                        b[0][7].setText("7");
                        b[1][2].setText("9");
                        b[1][3].setText("2");
                        b[1][4].setText("5");
                        b[1][5].setText("6");
                        b[1][6].setText("8");
                        b[1][8].setText("1");
                        b[2][0].setText("4");
                        b[2][1].setText("6");
                        b[2][2].setText("8");
                        b[2][3].setText("3");
                        b[2][4].setText("7");
                        b[3][0].setText("3");
                        b[3][1].setText("8");
                        b[3][5].setText("4");
                        b[3][7].setText("5");
                        b[3][8].setText("9");
                        b[4][1].setText("9");
                        b[4][2].setText("1");
                        b[4][4].setText("6");
                        b[4][6].setText("4");
                        b[4][7].setText("2");
                        b[5][0].setText("2");
                        b[5][1].setText("4");
                        b[5][3].setText("8");
                        b[5][7].setText("1");
                        b[5][8].setText("3");
                        b[6][4].setText("3");
                        b[6][5].setText("7");
                        b[6][6].setText("5");
                        b[6][7].setText("8");
                        b[6][8].setText("2");
                        b[7][0].setText("6");
                        b[7][2].setText("5");
                        b[7][3].setText("9");
                        b[7][4].setText("4");
                        b[7][5].setText("8");
                        b[7][6].setText("1");
                        b[8][1].setText("7");
                        b[8][2].setText("3");
                        b[8][6].setText("9");
                        b[8][7].setText("6");
					}
					else if(count1==3) {
						 b[0][1].setText("1");
	                        b[0][3].setText("3");
	                        b[0][4].setText("7");
	                        b[0][6].setText("8");
	                        b[0][7].setText("6");
	                        b[1][0].setText("9");
	                        b[1][1].setText("8");
	                        b[1][2].setText("6");
	                        b[1][3].setText("1");
	                        b[1][4].setText("2");
	                        b[1][5].setText("4");
	                        b[1][7].setText("5");
	                        b[2][1].setText("3");
	                        b[2][2].setText("4");
	                        b[2][6].setText("2");
	                        b[2][8].setText("9");
	                        b[3][2].setText("2");
	                        b[3][4].setText("8");
	                        b[3][5].setText("1");
	                        b[3][6].setText("6");
	                        b[3][7].setText("9");
	                        b[3][8].setText("3");
	                        b[4][0].setText("8");
	                        b[4][1].setText("6");
	                        b[4][3].setText("5");
	                        b[4][4].setText("4");
	                        b[4][5].setText("3");
	                        b[4][7].setText("7");
	                        b[4][8].setText("2");
	                        b[5][0].setText("3");
	                        b[5][1].setText("7");
	                        b[5][2].setText("1");
	                        b[5][3].setText("6");
	                        b[5][4].setText("9");
	                        b[5][6].setText("4");
	                        b[6][0].setText("5");
	                        b[6][2].setText("7");
	                        b[6][6].setText("9");
	                        b[6][7].setText("3");
	                        b[7][1].setText("4");
	                        b[7][3].setText("9");
	                        b[7][4].setText("3");
	                        b[7][5].setText("7");
	                        b[7][6].setText("5");
	                        b[7][7].setText("2");
	                        b[7][8].setText("1");
	                        b[8][1].setText("9");
	                        b[8][2].setText("3");
	                        b[8][4].setText("6");
	                        b[8][5].setText("5");
	                        b[8][7].setText("4");
					}
					else if(count1==4) {
						b[0][4].setText("6");
                        b[0][6].setText("3");
                        b[0][7].setText("8");
                        b[0][8].setText("4");
                        b[1][0].setText("8");
                        b[1][1].setText("3");
                        b[1][3].setText("5");
                        b[1][5].setText("1");
                        b[1][8].setText("6");
                        b[2][0].setText("2");
                        b[2][2].setText("7");
                        b[2][3].setText("8");
                        b[2][6].setText("1");
                        b[2][7].setText("9");
                        b[2][8].setText("5");
                        b[3][0].setText("6");
                        b[3][5].setText("9");
                        b[3][8].setText("1");
                        b[4][0].setText("9");
                        b[4][1].setText("8");
                        b[4][2].setText("1");
                        b[4][3].setText("7");
                        b[4][4].setText("2");
                        b[4][5].setText("4");
                        b[4][6].setText("5");
                        b[4][7].setText("6");
                        b[4][8].setText("3");
                        b[5][0].setText("7");
                        b[5][3].setText("6");
                        b[5][8].setText("8");
                        b[6][0].setText("1");
                        b[6][1].setText("7");
                        b[6][2].setText("8");
                        b[6][5].setText("2");
                        b[6][6].setText("6");
                        b[6][8].setText("9");
                        b[7][0].setText("3");
                        b[7][3].setText("9");
                        b[7][5].setText("8");
                        b[7][7].setText("1");
                        b[7][8].setText("2");
                        b[8][0].setText("4");
                        b[8][1].setText("9");
                        b[8][2].setText("2");
                        b[8][4].setText("3");
					}
					else if(count1==5) {
						b[0][0].setText("6");
                        b[0][1].setText("1");
                        b[0][3].setText("5");
                        b[0][6].setText("8");
                        b[0][8].setText("7");
                        b[1][0].setText("8");
                        b[1][2].setText("7");
                        b[1][3].setText("3");
                        b[1][5].setText("1");
                        b[1][7].setText("4");
                        b[1][8].setText("2");
                        b[2][1].setText("4");
                        b[2][2].setText("2");
                        b[2][3].setText("9");
                        b[2][4].setText("8");
                        b[2][5].setText("7");
                        b[2][6].setText("3");
                        b[2][8].setText("6");
                        b[3][0].setText("4");
                        b[3][1].setText("6");
                        b[3][4].setText("3");
                        b[3][5].setText("9");
                        b[4][0].setText("7");
                        b[4][1].setText("5");
                        b[4][3].setText("4");
                        b[4][4].setText("2");
                        b[4][5].setText("6");
                        b[4][7].setText("3");
                        b[4][8].setText("9");
                        b[5][3].setText("1");
                        b[5][4].setText("5");
                        b[5][7].setText("6");
                        b[5][8].setText("4");
                        b[6][0].setText("2");
                        b[6][2].setText("6");
                        b[6][3].setText("8");
                        b[6][4].setText("7");
                        b[6][5].setText("4");
                        b[6][6].setText("9");
                        b[6][7].setText("5");
                        b[7][0].setText("1");
                        b[7][1].setText("7");
                        b[7][3].setText("6");
                        b[7][5].setText("3");
                        b[7][6].setText("4");
                        b[7][8].setText("8");
                        b[8][0].setText("9");
                        b[8][2].setText("4");
                        b[8][5].setText("5");
                        b[8][7].setText("7");
                        b[8][8].setText("3");
					}
					else if(count1==1) {
						b[0][0].setText("3");
	                    b[0][2].setText("9");
	                    b[0][3].setText("1");
	                    b[0][4].setText("8");
	                    b[0][7].setText("4");
	                    b[1][0].setText("2");
	                    b[1][1].setText("5");
	                    b[1][3].setText("7");
	                    b[1][6].setText("8");
	                    b[1][7].setText("3");
	                    b[2][4].setText("4");
	                    b[2][6].setText("9");
	                    b[2][7].setText("5");
	                    b[2][8].setText("6");
	                    b[3][1].setText("4");
	                    b[3][2].setText("2");
	                    b[3][3].setText("6");
	                    b[3][7].setText("9");
	                    b[3][8].setText("8");
	                    b[4][0].setText("6");
	                    b[4][2].setText("8");
	                    b[4][3].setText("9");
	                    b[4][5].setText("4");
	                    b[4][6].setText("2");
	                    b[4][8].setText("1");
	                    b[5][0].setText("1");
	                    b[5][1].setText("9");
	                    b[5][5].setText("3");
	                    b[5][6].setText("4");
	                    b[5][7].setText("6");
	                    b[6][0].setText("4");
	                    b[6][1].setText("2");
	                    b[6][2].setText("3");
	                    b[6][4].setText("1");
	                    b[7][0].setText("9");
	                    b[7][2].setText("5");
	                    b[7][5].setText("7");
	                    b[7][7].setText("3");
	                    b[7][8].setText("4");
	                    b[8][1].setText("1");
	                    b[8][4].setText("3");
	                    b[8][5].setText("8");
	                    b[8][6].setText("5");
	                    b[8][8].setText("9");
					}				}
			});
		}
		
		else if(e.getSource()==jmiMedium) {
            
            for(i=0;i<9;i++)
                for(j=0;j<9;j++)
                {
                    b[i][j].setText("");
                    b[i][j].setBackground(Color.WHITE);
                }
            if(count2==1)
            {
	            b[0][1].setForeground(Color.GRAY);
	            b[0][1].setText("8");
	            b[0][7].setForeground(Color.GRAY);
	            b[0][7].setText("3");
	            b[0][8].setForeground(Color.GRAY);
	            b[0][8].setText("2");
	            b[1][0].setForeground(Color.GRAY);
	            b[1][0].setText("4");
	            b[1][5].setForeground(Color.GRAY);
	            b[1][5].setText("6");
	            b[1][6].setForeground(Color.GRAY);
	            b[1][6].setText("5");
	            b[2][4].setForeground(Color.GRAY);
	            b[2][4].setText("3");
	            b[2][6].setForeground(Color.GRAY);
	            b[2][6].setText("1");
	            b[3][2].setForeground(Color.GRAY);
	            b[3][2].setText("3");
	            b[3][3].setForeground(Color.GRAY);
	            b[3][3].setText("6");
	            b[3][5].setForeground(Color.GRAY);
	            b[3][5].setText("5");
	            b[3][6].setForeground(Color.GRAY);
	            b[3][6].setText("4");
	            b[4][0].setForeground(Color.GRAY);
	            b[4][0].setText("1");
	            b[4][8].setForeground(Color.GRAY);
	            b[4][8].setText("6");
	            b[5][2].setForeground(Color.GRAY);
	            b[5][2].setText("4");
	            b[5][3].setForeground(Color.GRAY);
	            b[5][3].setText("8");
	            b[5][5].setForeground(Color.GRAY);
	            b[5][5].setText("7");
	            b[5][6].setForeground(Color.GRAY);
	            b[5][6].setText("9");
	            b[6][2].setForeground(Color.GRAY);
	            b[6][2].setText("9");
	            b[6][4].setForeground(Color.GRAY);
	            b[6][4].setText("5");
	            b[7][2].setForeground(Color.GRAY);
	            b[7][2].setText("8");
	            b[7][3].setForeground(Color.GRAY);
	            b[7][3].setText("7");
	            b[7][8].setForeground(Color.GRAY);
	            b[7][8].setText("9");
	            b[8][0].setForeground(Color.GRAY);
	            b[8][0].setText("6");
	            b[8][1].setForeground(Color.GRAY);
	            b[8][1].setText("2");
	            b[8][7].setForeground(Color.GRAY);
	            b[8][7].setText("8");
	            
	            logic(0,0);
	            logic(0,2);
	            logic(0,3);
	            logic(0,4);
	            logic(0,5);
	            logic(0,6);
	            logic(1,1);
	            logic(1,2);
	            logic(1,3);
	            logic(1,4);
	            logic(1,7);
	            logic(1,8);
	            logic(2,0);
	            logic(2,1);
	            logic(2,2);
	            logic(2,3);
	            logic(2,5);
	            logic(2,7);
	            logic(2,8);
	            logic(3,0);
	            logic(3,1);
	            logic(3,4);
	            logic(3,7);
	            logic(3,8);
	            logic(4,1);
	            logic(4,2);
	            logic(4,3);
	            logic(4,4);
	            logic(4,5);
	            logic(4,6);
	            logic(4,7);
	            logic(5,0);
	            logic(5,1);
	            logic(5,4);
	            logic(5,7);
	            logic(5,8);
	            logic(6,0);
	            logic(6,1);
	            logic(6,3);
	            logic(6,5);
	            logic(6,6);
	            logic(6,7);
	            logic(6,8);
	            logic(7,0);
	            logic(7,1);
	            logic(7,4);
	            logic(7,5);
	            logic(7,6);
	            logic(7,7);
	            logic(8,2);
	            logic(8,3);
	            logic(8,4);
	            logic(8,5);
	            logic(8,6);
	            logic(8,8);
	            
	            count2++;
            }
            else if(count2==2)
            {
                b[0][2].setForeground(Color.GRAY);
                b[0][2].setText("6");
                b[0][4].setForeground(Color.GRAY);
                b[0][4].setText("9");
                b[0][6].setForeground(Color.GRAY);
                b[0][6].setText("2");
                b[1][3].setForeground(Color.GRAY);
                b[1][3].setText("7");
                b[1][5].setForeground(Color.GRAY);
                b[1][5].setText("2");
                b[2][1].setForeground(Color.GRAY);
                b[2][1].setText("9");
                b[2][3].setForeground(Color.GRAY);
                b[2][3].setText("5");
                b[2][5].setForeground(Color.GRAY);
                b[2][5].setText("8");
                b[2][7].setForeground(Color.GRAY);
                b[2][7].setText("7");
                b[3][0].setForeground(Color.GRAY);
                b[3][0].setText("9");
                b[3][4].setForeground(Color.GRAY);
                b[3][4].setText("3");
                b[3][8].setForeground(Color.GRAY);
                b[3][8].setText("6");
                b[4][0].setForeground(Color.GRAY);
                b[4][0].setText("7");
                b[4][1].setForeground(Color.GRAY);
                b[4][1].setText("5");
                b[4][7].setForeground(Color.GRAY);
                b[4][7].setText("1");
                b[4][8].setForeground(Color.GRAY);
                b[4][8].setText("9");
                b[5][0].setForeground(Color.GRAY);
                b[5][0].setText("1");
                b[5][4].setForeground(Color.GRAY);
                b[5][4].setText("4");
                b[5][8].setForeground(Color.GRAY);
                b[5][8].setText("5");
                b[6][1].setForeground(Color.GRAY);
                b[6][1].setText("1");
                b[6][3].setForeground(Color.GRAY);
                b[6][3].setText("3");
                b[6][5].setForeground(Color.GRAY);
                b[6][5].setText("9");
                b[6][7].setForeground(Color.GRAY);
                b[6][7].setText("8");
                b[7][3].setForeground(Color.GRAY);
                b[7][3].setText("2");
                b[7][5].setForeground(Color.GRAY);
                b[7][5].setText("1");
                b[8][2].setForeground(Color.GRAY);
                b[8][2].setText("9");
                b[8][4].setForeground(Color.GRAY);
                b[8][4].setText("8");
                b[8][6].setForeground(Color.GRAY);
                b[8][6].setText("1");
            
                logic(0,0);
                logic(0,1);
                logic(0,3);
                logic(0,5);
                logic(0,7);
                logic(0,8);
                logic(1,0);
                logic(1,1);
                logic(1,2);
                logic(1,4);
                logic(1,6);
                logic(1,7);
                logic(1,8);
                logic(2,0);
                logic(2,2);
                logic(2,4);
                logic(2,6);
                logic(2,8);
                logic(3,1);
                logic(3,2);
                logic(3,3);
                logic(3,5);
                logic(3,6);
                logic(3,7);
                logic(4,2);
                logic(4,3);
                logic(4,4);
                logic(4,5);
                logic(4,6);
                logic(5,1);
                logic(5,2);
                logic(5,3);
                logic(5,5);
                logic(5,6);
                logic(5,7);
                logic(6,0);
                logic(6,2);
                logic(6,4);
                logic(6,6);
                logic(6,8);
                logic(7,0);
                logic(7,1);
                logic(7,2);
                logic(7,4);
                logic(7,6);
                logic(7,7);
                logic(7,8);
                logic(8,0);
                logic(8,1);
                logic(8,3);
                logic(8,5);
                logic(8,7);
                logic(8,8);
                
                count2++;
            }
            else if(count2==3)
            {
                b[0][0].setForeground(Color.GRAY);
                b[0][0].setText("1");
                b[0][1].setForeground(Color.GRAY);
                b[0][1].setText("4");
                b[0][3].setForeground(Color.GRAY);
                b[0][3].setText("5");
                b[0][5].setForeground(Color.GRAY);
                b[0][5].setText("6");
                b[0][6].setForeground(Color.GRAY);
                b[0][6].setText("3");
                b[1][0].setForeground(Color.GRAY);
                b[1][0].setText("3");
                b[1][7].setForeground(Color.GRAY);
                b[1][7].setText("8");
                b[2][0].setForeground(Color.GRAY);
                b[2][0].setText("9");
                b[2][1].setForeground(Color.GRAY);
                b[2][1].setText("8");
                b[2][2].setForeground(Color.GRAY);
                b[2][2].setText("2");
                b[2][3].setForeground(Color.GRAY);
                b[2][3].setText("4");
                b[2][4].setForeground(Color.GRAY);
                b[2][4].setText("1");
                b[2][5].setForeground(Color.GRAY);
                b[2][5].setText("3");
                b[3][3].setForeground(Color.GRAY);
                b[3][3].setText("8");
                b[3][8].setForeground(Color.GRAY);
                b[3][8].setText("9");
                b[4][1].setForeground(Color.GRAY);
                b[4][1].setText("7");
                b[4][2].setForeground(Color.GRAY);
                b[4][2].setText("6");
                b[4][3].setForeground(Color.GRAY);
                b[4][3].setText("3");
                b[4][6].setForeground(Color.GRAY);
                b[4][6].setText("1");
                b[4][7].setForeground(Color.GRAY);
                b[4][7].setText("2");
                b[5][0].setForeground(Color.GRAY);
                b[5][0].setText("8");
                b[5][5].setForeground(Color.GRAY);
                b[5][5].setText("1");
                b[6][3].setForeground(Color.GRAY);
                b[6][3].setText("2");
                b[6][4].setForeground(Color.GRAY);
                b[6][4].setText("3");
                b[6][5].setForeground(Color.GRAY);
                b[6][5].setText("7");
                b[6][6].setForeground(Color.GRAY);
                b[6][6].setText("8");
                b[6][7].setForeground(Color.GRAY);
                b[6][7].setText("1");
                b[6][8].setForeground(Color.GRAY);
                b[6][8].setText("5");
                b[7][1].setForeground(Color.GRAY);
                b[7][1].setText("5");
                b[7][8].setForeground(Color.GRAY);
                b[7][8].setText("6");
                b[8][2].setForeground(Color.GRAY);
                b[8][2].setText("8");
                b[8][3].setForeground(Color.GRAY);
                b[8][3].setText("6");
                b[8][5].setForeground(Color.GRAY);
                b[8][5].setText("5");
                b[8][7].setForeground(Color.GRAY);
                b[8][7].setText("3");
                b[8][8].setForeground(Color.GRAY);
                b[8][8].setText("4");
            
                logic(0,2);
                logic(0,4);
                logic(0,7);
                logic(0,8);
                logic(1,1);
                logic(1,2);
                logic(1,3);
                logic(1,4);
                logic(1,5);
                logic(1,6);
                logic(1,8);
                logic(2,6);
                logic(2,7);
                logic(2,8);
                logic(3,0);
                logic(3,1);
                logic(3,2);
                logic(3,4);
                logic(3,5);
                logic(3,6);
                logic(3,7);
                logic(4,0);
                logic(4,4);
                logic(4,5);
                logic(4,8);
                logic(5,1);
                logic(5,2);
                logic(5,3);
                logic(5,4);
                logic(5,6);
                logic(5,7);
                logic(5,8);
                logic(6,0);
                logic(6,1);
                logic(6,2);
                logic(7,0);
                logic(7,2);
                logic(7,3);
                logic(7,4);
                logic(7,5);
                logic(7,6);
                logic(7,7);
                logic(8,0);
                logic(8,1);
                logic(8,4);
                logic(8,6);
            
                count2++;
            }
            else if(count2==4)
            {
                b[0][3].setForeground(Color.GRAY);
                b[0][3].setText("1");
                b[0][5].setForeground(Color.GRAY);
                b[0][5].setText("9");
                b[1][2].setForeground(Color.GRAY);
                b[1][2].setText("6");
                b[1][4].setForeground(Color.GRAY);
                b[1][4].setText("4");
                b[1][6].setForeground(Color.GRAY);
                b[1][6].setText("8");
                b[2][1].setForeground(Color.GRAY);
                b[2][1].setText("3");
                b[2][7].setForeground(Color.GRAY);
                b[2][7].setText("1");
                b[3][0].setForeground(Color.GRAY);
                b[3][0].setText("3");
                b[3][3].setForeground(Color.GRAY);
                b[3][3].setText("7");
                b[3][5].setForeground(Color.GRAY);
                b[3][5].setText("1");
                b[3][8].setForeground(Color.GRAY);
                b[3][8].setText("6");
                b[4][0].setForeground(Color.GRAY);
                b[4][0].setText("5");
                b[4][4].setForeground(Color.GRAY);
                b[4][4].setText("8");
                b[4][8].setForeground(Color.GRAY);
                b[4][8].setText("7");
                b[5][1].setForeground(Color.GRAY);
                b[5][1].setText("2");
                b[5][7].setForeground(Color.GRAY);
                b[5][7].setText("9");
                b[6][2].setForeground(Color.GRAY);
                b[6][2].setText("3");
                b[6][6].setForeground(Color.GRAY);
                b[6][6].setText("2");
                b[7][1].setForeground(Color.GRAY);
                b[7][1].setText("4");
                b[7][2].setForeground(Color.GRAY);
                b[7][2].setText("8");
                b[7][4].setForeground(Color.GRAY);
                b[7][4].setText("3");
                b[7][6].setForeground(Color.GRAY);
                b[7][6].setText("6");
                b[7][7].setForeground(Color.GRAY);
                b[7][7].setText("7");
                b[8][1].setForeground(Color.GRAY);
                b[8][1].setText("6");
                b[8][3].setForeground(Color.GRAY);
                b[8][3].setText("5");
                b[8][5].setForeground(Color.GRAY);
                b[8][5].setText("4");
                b[8][7].setForeground(Color.GRAY);
                b[8][7].setText("8");
                
                logic(0,0);
                logic(0,1);
                logic(0,2);
                logic(0,4);
                logic(0,6);
                logic(0,7);
                logic(0,8);
                logic(1,0);
                logic(1,1);
                logic(1,3);
                logic(1,5);
                logic(1,7);
                logic(1,8);
                logic(2,0);
                logic(2,2);
                logic(2,3);
                logic(2,4);
                logic(2,5);
                logic(2,6);
                logic(2,8);
                logic(3,1);
                logic(3,2);
                logic(3,4);
                logic(3,6);
                logic(3,7);
                logic(4,1);
                logic(4,2);
                logic(4,3);
                logic(4,5);
                logic(4,6);
                logic(4,7);
                logic(5,0);
                logic(5,2);
                logic(5,3);
                logic(5,4);
                logic(5,5);
                logic(5,6);
                logic(5,8);
                logic(6,0);
                logic(6,1);
                logic(6,3);
                logic(6,4);
                logic(6,5);
                logic(6,7);
                logic(6,8);
                logic(7,0);
                logic(7,3);
                logic(7,5);
                logic(7,8);
                logic(8,0);
                logic(8,2);
                logic(8,4);
                logic(8,6);
                logic(8,8);
            
                count2++;
            
            }
            else if(count2==5)
            {
                b[0][3].setForeground(Color.GRAY);
                b[0][3].setText("6");
                b[0][4].setForeground(Color.GRAY);
                b[0][4].setText("8");
                b[1][2].setForeground(Color.GRAY);
                b[1][2].setText("1");
                b[1][5].setForeground(Color.GRAY);
                b[1][5].setText("2");
                b[1][6].setForeground(Color.GRAY);
                b[1][6].setText("4");
                b[1][7].setForeground(Color.GRAY);
                b[1][7].setText("6");
                b[2][4].setForeground(Color.GRAY);
                b[2][4].setText("1");
                b[3][0].setForeground(Color.GRAY);
                b[3][0].setText("1");
                b[4][6].setForeground(Color.GRAY);
                b[4][6].setText("6");
                b[4][7].setForeground(Color.GRAY);
                b[4][7].setText("5");
                b[5][1].setForeground(Color.GRAY);
                b[5][1].setText("8");
                b[5][3].setForeground(Color.GRAY);
                b[5][3].setText("4");
                b[5][5].setForeground(Color.GRAY);
                b[5][5].setText("5");
                b[5][7].setForeground(Color.GRAY);
                b[5][7].setText("7");
                b[6][1].setForeground(Color.GRAY);
                b[6][1].setText("2");
                b[6][3].setForeground(Color.GRAY);
                b[6][3].setText("7");
                b[6][8].setForeground(Color.GRAY);
                b[6][8].setText("4");
                b[7][0].setForeground(Color.GRAY);
                b[7][0].setText("4");
                b[7][2].setForeground(Color.GRAY);
                b[7][2].setText("3");
                b[7][6].setForeground(Color.GRAY);
                b[7][6].setText("1");
                b[8][5].setForeground(Color.GRAY);
                b[8][5].setText("6");
                b[8][6].setForeground(Color.GRAY);
                b[8][6].setText("5");
                
                logic(0,0);
                logic(0,1);
                logic(0,2);
                logic(0,5);
                logic(0,6);
                logic(0,7);
                logic(0,8);
                logic(1,0);
                logic(1,1);
                logic(1,3);
                logic(1,4);
                logic(1,8);
                logic(2,0);
                logic(2,1);
                logic(2,2);
                logic(2,3);
                logic(2,5);
                logic(2,6);
                logic(2,7);
                logic(2,8);
                logic(3,1);
                logic(3,2);
                logic(3,3);
                logic(3,4);
                logic(3,5);
                logic(3,6);
                logic(3,7);
                logic(3,8);
                logic(4,0);
                logic(4,1);
                logic(4,2);
                logic(4,3);
                logic(4,4);
                logic(4,5);
                logic(4,8);
                logic(5,0);
                logic(5,2);
                logic(5,4);
                logic(5,6);
                logic(5,8);
                logic(6,0);
                logic(6,2);
                logic(6,4);
                logic(6,5);
                logic(6,6);
                logic(6,7);
                logic(7,1);
                logic(7,3);
                logic(7,4);
                logic(7,5);
                logic(7,7);
                logic(7,8);
                logic(8,0);
                logic(8,1);
                logic(8,2);
                logic(8,3);
                logic(8,4);
                logic(8,7);
                logic(8,8);
            
                count2=1;
            }
            jmiSoln.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e4) {
                	for(i=0;i<9;i++) {
						for(j=0;j<9;j++) {
							ActionListener[] listeners = b[i][j].getActionListeners();
							for(ActionListener listener : listeners) {
								b[i][j].removeActionListener(listener);
							}
						}
					}
                	for(i=0;i<9;i++) {
						for(j=0;j<9;j++) {
							b[i][j].setForeground(Color.BLACK);
						}
					}
                    if(count2==2)
                    {
	                    b[0][0].setText("9");
	                    b[0][2].setText("1");
	                    b[0][3].setText("5");
	                    b[0][4].setText("7");
	                    b[0][5].setText("4");
	                    b[0][6].setText("6");
	                    b[1][1].setText("3");
	                    b[1][2].setText("2");
	                    b[1][3].setText("1");
	                    b[1][4].setText("8");
	                    b[1][7].setText("9");
	                    b[1][8].setText("7");
	                    b[2][0].setText("7");
	                    b[2][1].setText("5");
	                    b[2][2].setText("6");
	                    b[2][3].setText("9");
	                    b[2][5].setText("2");
	                    b[2][7].setText("4");
	                    b[2][8].setText("8");
	                    b[3][0].setText("8");
	                    b[3][1].setText("9");
	                    b[3][4].setText("2");
	                    b[3][7].setText("7");
	                    b[3][8].setText("1");
	                    b[4][1].setText("7");
	                    b[4][2].setText("5");
	                    b[4][3].setText("3");
	                    b[4][4].setText("4");
	                    b[4][5].setText("9");
	                    b[4][6].setText("8");
	                    b[4][7].setText("2");
	                    b[5][0].setText("2");
	                    b[5][1].setText("6");
	                    b[5][4].setText("1");
	                    b[5][7].setText("5");
	                    b[5][8].setText("3");
	                    b[6][0].setText("3");
	                    b[6][1].setText("1");
	                    b[6][3].setText("2");
	                    b[6][5].setText("8");
	                    b[6][6].setText("7");
	                    b[6][7].setText("6");
	                    b[6][8].setText("4");
	                    b[7][0].setText("5");
	                    b[7][1].setText("4");
	                    b[7][4].setText("6");
	                    b[7][5].setText("3");
	                    b[7][6].setText("2");
	                    b[7][7].setText("1");
	                    b[8][2].setText("7");
	                    b[8][3].setText("4");
	                    b[8][4].setText("9");
	                    b[8][5].setText("1");
	                    b[8][6].setText("3");
	                    b[8][8].setText("5");
                    }
                    else if(count2==3)
                    {	
                        b[0][0].setText("8");
                        b[0][1].setText("7");
                        b[0][3].setText("4");
                        b[0][5].setText("3");
                        b[0][7].setText("5");
                        b[0][8].setText("1");                        
                        b[1][0].setText("3");
                        b[1][1].setText("4");
                        b[1][2].setText("5");
                        b[1][4].setText("1");
                        b[1][6].setText("9");
                        b[1][7].setText("6");
                        b[1][8].setText("8");                        
                        b[2][0].setText("2");
                        b[2][2].setText("1");
                        b[2][4].setText("6");
                        b[2][6].setText("4");
                        b[2][8].setText("3");                        
                        b[3][1].setText("8");
                        b[3][2].setText("2");
                        b[3][3].setText("1");
                        b[3][5].setText("5");
                        b[3][6].setText("7");
                        b[3][7].setText("4");                        
                        b[4][2].setText("4");
                        b[4][3].setText("8");
                        b[4][4].setText("2");
                        b[4][5].setText("6");
                        b[4][6].setText("3");
                        b[5][1].setText("6");
                        b[5][2].setText("3");
                        b[5][3].setText("9");
                        b[5][5].setText("7");
                        b[5][6].setText("8");
                        b[5][7].setText("2");
                        b[6][0].setText("4");
                        b[6][2].setText("7");
                        b[6][4].setText("5");
                        b[6][6].setText("6");
                        b[6][8].setText("2");                
                        b[7][0].setText("6");
                        b[7][1].setText("3");
                        b[7][2].setText("8");
                        b[7][4].setText("7");
                        b[7][6].setText("5");
                        b[7][7].setText("9");
                        b[7][8].setText("4");
                        b[8][0].setText("5");
                        b[8][1].setText("2");
                        b[8][3].setText("6");
                        b[8][5].setText("4");
                        b[8][7].setText("3");
                        b[8][8].setText("7");
                    }
                    if(count2==4)
                    {
                        
                    b[0][2].setText("7");            
                    b[0][4].setText("8");
                    b[0][7].setText("9");
                    b[0][8].setText("2");
                    b[1][1].setText("6");
                    b[1][2].setText("5");
                    b[1][3].setText("9");
                    b[1][4].setText("7");
                    b[1][5].setText("2");
                    b[1][6].setText("4");
                    b[1][8].setText("1");
                    b[2][6].setText("6");
                    b[2][7].setText("5");
                    b[2][8].setText("7");
                    b[3][0].setText("5");
                    b[3][1].setText("3");
                    b[3][2].setText("1");
                    b[3][4].setText("2");
                    b[3][5].setText("4");
                    b[3][6].setText("7");
                    b[3][7].setText("6");
                    b[4][0].setText("4");
                    b[4][4].setText("5");
                    b[4][5].setText("9");
                    b[4][8].setText("8");
                    b[5][1].setText("2");
                    b[5][2].setText("9");
                    b[5][3].setText("7");
                    b[5][4].setText("6");
                    b[5][6].setText("5");
                    b[5][7].setText("4");
                    b[5][8].setText("3");
                    b[6][0].setText("6");
                    b[6][1].setText("9");
                    b[6][2].setText("4");
                    b[7][0].setText("2");
                    b[7][2].setText("3");
                    b[7][3].setText("1");
                    b[7][4].setText("4");
                    b[7][5].setText("8");
                    b[7][6].setText("9");
                    b[7][7].setText("7");
                    b[8][0].setText("7");
                    b[8][1].setText("1");
                    b[8][4].setText("9");
                    b[8][6].setText("2");
                    }
                    else if(count2==5)
                    {
                        b[0][0].setText("8");
                        b[0][1].setText("7");
                        b[0][2].setText("5");            
                        b[0][4].setText("2");
                        b[0][6].setText("3");
                        b[0][7].setText("6");
                        b[0][8].setText("4");
                        b[1][0].setText("2");
                        b[1][1].setText("1");
                        b[1][3].setText("3");
                        b[1][5].setText("7");
                        b[1][7].setText("5");
                        b[1][8].setText("9");
                        b[2][0].setText("4");
                        b[2][2].setText("9");
                        b[2][3].setText("8");
                        b[2][4].setText("6");
                        b[2][5].setText("5");
                        b[2][6].setText("7");
                        b[2][8].setText("2");
                        b[3][1].setText("8");
                        b[3][2].setText("4");
                        b[3][4].setText("9");
                        b[3][6].setText("5");
                        b[3][7].setText("2");
                        b[4][1].setText("9");
                        b[4][2].setText("1");
                        b[4][3].setText("2");
                        b[4][5].setText("6");
                        b[4][6].setText("4");
                        b[4][7].setText("3");
                        b[5][0].setText("6");
                        b[5][2].setText("7");
                        b[5][3].setText("4");
                        b[5][4].setText("5");
                        b[5][5].setText("3");
                        b[5][6].setText("1");
                        b[5][8].setText("8");
                        b[6][0].setText("9");
                        b[6][1].setText("5");
                        b[6][3].setText("6");
                        b[6][4].setText("7");
                        b[6][5].setText("8");
                        b[6][7].setText("4");
                        b[6][8].setText("1");
                        b[7][0].setText("1");
                        b[7][3].setText("9");
                        b[7][5].setText("2");
                        b[7][8].setText("5");
                        b[8][0].setText("7");
                        b[8][2].setText("2");
                        b[8][4].setText("1");
                        b[8][6].setText("9");
                        b[8][8].setText("3");
                    }
                    else if(count2==1)
                    {
                        b[0][0].setText("2");
                        b[0][1].setText("3");
                        b[0][2].setText("4");            
                        b[0][5].setText("9");
                        b[0][6].setText("7");
                        b[0][7].setText("1");
                        b[0][8].setText("5");
                        b[1][0].setText("8");
                        b[1][1].setText("5");
                        b[1][3].setText("3");
                        b[1][4].setText("7");
                        b[1][8].setText("9");
                        b[2][0].setText("6");
                        b[2][1].setText("9");
                        b[2][2].setText("7");
                        b[2][3].setText("5");
                        b[2][5].setText("4");
                        b[2][6].setText("2");
                        b[2][7].setText("8");
                        b[2][8].setText("3");
                        b[3][1].setText("6");
                        b[3][2].setText("5");
                        b[3][3].setText("8");
                        b[3][4].setText("9");
                        b[3][5].setText("7");
                        b[3][6].setText("3");
                        b[3][7].setText("4");
                        b[3][8].setText("2");
                        b[4][0].setText("7");
                        b[4][1].setText("4");
                        b[4][2].setText("9");
                        b[4][3].setText("1");
                        b[4][4].setText("2");
                        b[4][5].setText("3");
                        b[4][8].setText("8");
                        b[5][0].setText("3");
                        b[5][2].setText("2");
                        b[5][4].setText("6");
                        b[5][6].setText("9");
                        b[5][8].setText("1");
                        b[6][0].setText("5");
                        b[6][2].setText("6");
                        b[6][4].setText("3");
                        b[6][5].setText("1");
                        b[6][6].setText("8");
                        b[6][7].setText("9");
                        b[7][1].setText("7");
                        b[7][3].setText("9");
                        b[7][4].setText("5");
                        b[7][5].setText("8");
                        b[7][7].setText("2");
                        b[7][8].setText("6");
                        b[8][0].setText("9");
                        b[8][1].setText("1");
                        b[8][2].setText("8");
                        b[8][3].setText("2");
                        b[8][4].setText("4");
                        b[8][7].setText("3");
                        b[8][8].setText("7");
                    }
            
                }
            });                    
        }
		else if(e.getSource()==jmiHard) {
			for(i=0;i<9;i++) {
				for(j=0;j<9;j++) {
					ActionListener[] listeners = b[i][j].getActionListeners();
					for(ActionListener listener : listeners) {
						b[i][j].removeActionListener(listener);
					}
				}
			}
			for(i=0;i<9;i++) {
				for(j=0;j<9;j++) {
					b[i][j].setText("");
				}
			}
			if(count3==1) {
			b[0][1].setForeground(Color.GRAY);
			b[0][1].setText("2");
			b[1][3].setForeground(Color.GRAY);
			b[1][3].setText("6");
			b[1][8].setForeground(Color.GRAY);
			b[1][8].setText("3");
			b[2][1].setForeground(Color.GRAY);
			b[2][1].setText("7");
			b[2][2].setForeground(Color.GRAY);
			b[2][2].setText("4");
			b[2][4].setForeground(Color.GRAY);
			b[2][4].setText("8");
			b[3][5].setForeground(Color.GRAY);
			b[3][5].setText("3");
			b[3][8].setForeground(Color.GRAY);
			b[3][8].setText("2");
			b[4][1].setForeground(Color.GRAY);
			b[4][1].setText("8");
			b[4][4].setForeground(Color.GRAY);
			b[4][4].setText("4");
			b[4][7].setForeground(Color.GRAY);
			b[4][7].setText("1");
			b[5][0].setForeground(Color.GRAY);
			b[5][0].setText("6");
			b[5][3].setForeground(Color.GRAY);
			b[5][3].setText("5");
			b[6][4].setForeground(Color.GRAY);
			b[6][4].setText("1");
			b[6][6].setForeground(Color.GRAY);
			b[6][6].setText("7");
			b[6][7].setForeground(Color.GRAY);
			b[6][7].setText("8");
			b[7][0].setForeground(Color.GRAY);
			b[7][0].setText("5");
			b[7][5].setForeground(Color.GRAY);
			b[7][5].setText("9");
			b[8][7].setForeground(Color.GRAY);
			b[8][7].setText("4");
			
			logic(0,0);
			logic(0,2);
			logic(0,3);
			logic(0,4);
			logic(0,5);
			logic(0,6);
			logic(0,7);
			logic(0,8);
			logic(1,0);
			logic(1,1);
			logic(1,2);
			logic(1,4);
			logic(1,5);
			logic(1,6);
			logic(1,7);
			logic(2,0);
			logic(2,3);
			logic(2,5);
			logic(2,6);
			logic(2,7);
			logic(2,8);
			logic(3,0);
			logic(3,1);
			logic(3,2);
			logic(3,3);
			logic(3,4);
			logic(3,6);
			logic(3,7);
			logic(4,0);
			logic(4,2);
			logic(4,3);
			logic(4,5);
			logic(4,6);
			logic(4,8);
			logic(5,1);
			logic(5,2);
			logic(5,4);
			logic(5,5);
			logic(5,6);
			logic(5,7);
			logic(5,8);
			logic(6,0);
			logic(6,1);
			logic(6,2);
			logic(6,3);
			logic(6,5);
			logic(6,8);
			logic(7,1);
			logic(7,2);
			logic(7,3);
			logic(7,4);
			logic(7,6);
			logic(7,7);
			logic(7,8);
			logic(8,0);
			logic(8,1);
			logic(8,2);
			logic(8,3);
			logic(8,4);
			logic(8,5);
			logic(8,6);
			logic(8,8);
			
			count3++;
			}
			else if(count3==2){
				b[0][2].setForeground(Color.GRAY);
				b[0][2].setText("1");
				b[0][3].setForeground(Color.GRAY);
				b[0][3].setText("5");
				b[1][1].setForeground(Color.GRAY);
				b[1][1].setText("8");
				b[1][5].setForeground(Color.GRAY);
				b[1][5].setText("3");
				b[1][6].setForeground(Color.GRAY);
				b[1][6].setText("1");
				b[1][7].setForeground(Color.GRAY);
				b[1][7].setText("4");
				b[2][1].setForeground(Color.GRAY);
				b[2][1].setText("4");
				b[2][4].setForeground(Color.GRAY);
				b[2][4].setText("8");
				b[2][8].setForeground(Color.GRAY);
				b[2][8].setText("3");
				b[3][1].setForeground(Color.GRAY);
				b[3][1].setText("7");
				b[3][4].setForeground(Color.GRAY);
				b[3][4].setText("5");
				b[3][8].setForeground(Color.GRAY);
				b[3][8].setText("8");
				b[4][2].setForeground(Color.GRAY);
				b[4][2].setText("6");
				b[4][3].setForeground(Color.GRAY);
				b[4][3].setText("9");
				b[4][5].setForeground(Color.GRAY);
				b[4][5].setText("8");
				b[4][6].setForeground(Color.GRAY);
				b[4][6].setText("3");
				b[5][0].setForeground(Color.GRAY);
				b[5][0].setText("3");
				b[5][4].setForeground(Color.GRAY);
				b[5][4].setText("2");
				b[5][7].setForeground(Color.GRAY);
				b[5][7].setText("5");
				b[6][0].setForeground(Color.GRAY);
				b[6][0].setText("5");
				b[6][4].setForeground(Color.GRAY);
				b[6][4].setText("7");
				b[6][7].setForeground(Color.GRAY);
				b[6][7].setText("1");
				b[7][1].setForeground(Color.GRAY);
				b[7][1].setText("2");
				b[7][2].setForeground(Color.GRAY);
				b[7][2].setText("7");
				b[7][3].setForeground(Color.GRAY);
				b[7][3].setText("1");
				b[7][7].setForeground(Color.GRAY);
				b[7][7].setText("9");
				b[8][5].setForeground(Color.GRAY);
				b[8][5].setText("4");
				b[8][6].setForeground(Color.GRAY);
				b[8][6].setText("5");
				
				logic(0,0);
				logic(0,1);
				logic(0,4);
				logic(0,5);
				logic(0,6);
				logic(0,7);
				logic(0,8);
				logic(1,0);
				logic(1,2);
				logic(1,3);
				logic(1,4);
				logic(1,8);
				logic(2,0);
				logic(2,2);
				logic(2,3);
				logic(2,5);
				logic(2,6);
				logic(2,7);
				logic(3,0);
				logic(3,2);
				logic(3,3);
				logic(3,5);
				logic(3,6);
				logic(3,7);
				logic(4,0);
				logic(4,1);
				logic(4,4);
				logic(4,7);
				logic(4,8);
				logic(5,1);
				logic(5,2);
				logic(5,3);
				logic(5,5);
				logic(5,6);
				logic(5,8);
				logic(6,1);
				logic(6,2);
				logic(6,3);
				logic(6,5);
				logic(6,6);
				logic(6,8);
				logic(7,0);
				logic(7,4);
				logic(7,5);
				logic(7,6);
				logic(7,8);
				logic(8,0);
				logic(8,1);
				logic(8,2);
				logic(8,3);
				logic(8,4);
				logic(8,7);
				logic(8,8);
				
				count3++;
			}
			else if(count3==3) {
				b[1][5].setForeground(Color.GRAY);
				b[1][5].setText("3");
				b[1][7].setForeground(Color.GRAY);
				b[1][7].setText("8");
				b[1][8].setForeground(Color.GRAY);
				b[1][8].setText("5");
				b[2][2].setForeground(Color.GRAY);
				b[2][2].setText("1");
				b[2][4].setForeground(Color.GRAY);
				b[2][4].setText("2");
				b[3][3].setForeground(Color.GRAY);
				b[3][3].setText("5");
				b[3][5].setForeground(Color.GRAY);
				b[3][5].setText("7");
				b[4][2].setForeground(Color.GRAY);
				b[4][2].setText("4");
				b[4][6].setForeground(Color.GRAY);
				b[4][6].setText("1");
				b[5][1].setForeground(Color.GRAY);
				b[5][1].setText("9");
				b[6][0].setForeground(Color.GRAY);
				b[6][0].setText("5");
				b[6][7].setForeground(Color.GRAY);
				b[6][7].setText("7");
				b[6][8].setForeground(Color.GRAY);
				b[6][8].setText("3");
				b[7][2].setForeground(Color.GRAY);
				b[7][2].setText("2");
				b[7][4].setForeground(Color.GRAY);
				b[7][4].setText("1");
				b[8][4].setForeground(Color.GRAY);
				b[8][4].setText("4");
				b[8][8].setForeground(Color.GRAY);
				b[8][8].setText("9");
				
				logic(0,0);
				logic(0,1);
				logic(0,2);
				logic(0,3);
				logic(0,4);
				logic(0,5);
				logic(0,6);
				logic(0,7);
				logic(0,8);
				logic(1,0);
				logic(1,1);
				logic(1,2);
				logic(1,3);
				logic(1,4);
				logic(1,6);
				logic(2,0);
				logic(2,1);
				logic(2,3);
				logic(2,5);
				logic(2,6);
				logic(2,7);
				logic(2,8);
				logic(3,0);
				logic(3,1);
				logic(3,2);
				logic(3,4);
				logic(3,6);
				logic(3,7);
				logic(3,8);
				logic(4,0);
				logic(4,1);
				logic(4,3);
				logic(4,4);
				logic(4,5);
				logic(4,7);
				logic(4,8);
				logic(5,0);
				logic(5,2);
				logic(5,3);
				logic(5,4);
				logic(5,5);
				logic(5,6);
				logic(5,7);
				logic(6,1);
				logic(6,2);
				logic(6,3);
				logic(6,4);
				logic(6,5);
				logic(6,6);
				logic(7,0);
				logic(7,1);
				logic(7,3);
				logic(7,5);
				logic(7,6);
				logic(7,7);
				logic(7,8);
				logic(8,0);
				logic(8,1);
				logic(8,2);
				logic(8,3);
				logic(8,5);
				logic(8,6);
				logic(8,7);
				
				count3++;
			}
			else if(count3==4) {
				b[0][3].setForeground(Color.GRAY);
				b[0][3].setText("6");
				b[0][6].setForeground(Color.GRAY);
				b[0][6].setText("4");
				b[1][0].setForeground(Color.GRAY);
				b[1][0].setText("7");
				b[1][5].setForeground(Color.GRAY);
				b[1][5].setText("3");
				b[1][6].setForeground(Color.GRAY);
				b[1][6].setText("6");
				b[2][4].setForeground(Color.GRAY);
				b[2][4].setText("9");
				b[2][5].setForeground(Color.GRAY);
				b[2][5].setText("1");
				b[2][7].setForeground(Color.GRAY);
				b[2][7].setText("8");
				b[4][1].setForeground(Color.GRAY);
				b[4][1].setText("5");
				b[4][3].setForeground(Color.GRAY);
				b[4][3].setText("1");
				b[4][4].setForeground(Color.GRAY);
				b[4][4].setText("8");
				b[4][8].setForeground(Color.GRAY);
				b[4][8].setText("3");
				b[5][3].setForeground(Color.GRAY);
				b[5][3].setText("3");
				b[5][5].setForeground(Color.GRAY);
				b[5][5].setText("6");
				b[5][7].setForeground(Color.GRAY);
				b[5][7].setText("4");
				b[5][8].setForeground(Color.GRAY);
				b[5][8].setText("5");
				b[6][1].setForeground(Color.GRAY);
				b[6][1].setText("4");
				b[6][3].setForeground(Color.GRAY);
				b[6][3].setText("2");
				b[6][7].setForeground(Color.GRAY);
				b[6][7].setText("6");
				b[7][0].setForeground(Color.GRAY);
				b[7][0].setText("9");
				b[7][2].setForeground(Color.GRAY);
				b[7][2].setText("3");
				b[8][1].setForeground(Color.GRAY);
				b[8][1].setText("2");
				b[8][6].setForeground(Color.GRAY);
				b[8][6].setText("1");
				
				logic(0,0);
				logic(0,1);
				logic(0,2);
				logic(0,4);
				logic(0,5);
				logic(0,7);
				logic(0,8);
				logic(1,1);
				logic(1,2);
				logic(1,3);
				logic(1,4);
				logic(1,7);
				logic(1,8);
				logic(2,0);
				logic(2,1);
				logic(2,2);
				logic(2,3);
				logic(2,6);
				logic(2,8);
				logic(3,0);
				logic(3,1);
				logic(3,2);
				logic(3,3);
				logic(3,4);
				logic(3,5);
				logic(3,6);
				logic(3,7);
				logic(3,8);
				logic(4,0);
				logic(4,2);
				logic(4,5);
				logic(4,6);
				logic(4,7);
				logic(5,0);
				logic(5,1);
				logic(5,2);
				logic(5,4);
				logic(5,6);
				logic(6,0);
				logic(6,2);
				logic(6,4);
				logic(6,5);
				logic(6,6);
				logic(6,8);
				logic(7,1);
				logic(7,3);
				logic(7,4);
				logic(7,5);
				logic(7,6);
				logic(7,7);
				logic(7,8);
				logic(8,0);
				logic(8,2);
				logic(8,3);
				logic(8,4);
				logic(8,5);
				logic(8,7);
				logic(8,8);
				
				count3++;
			}
			else if(count3==5) {
				b[0][0].setForeground(Color.GRAY);
				b[0][0].setText("7");
				b[0][3].setForeground(Color.GRAY);
				b[0][3].setText("1");
				b[0][5].setForeground(Color.GRAY);
				b[0][5].setText("8");
				b[1][1].setForeground(Color.GRAY);
				b[1][1].setText("9");
				b[1][7].setForeground(Color.GRAY);
				b[1][7].setText("3");
				b[1][8].setForeground(Color.GRAY);
				b[1][8].setText("2");
				b[2][5].setForeground(Color.GRAY);
				b[2][5].setText("5");
				b[3][6].setForeground(Color.GRAY);
				b[3][6].setText("1");
				b[4][0].setForeground(Color.GRAY);
				b[4][0].setText("9");
				b[4][1].setForeground(Color.GRAY);
				b[4][1].setText("6");
				b[4][4].setForeground(Color.GRAY);
				b[4][4].setText("2");
				b[5][6].setForeground(Color.GRAY);
				b[5][6].setText("8");
				b[7][2].setForeground(Color.GRAY);
				b[7][2].setText("5");
				b[7][5].setForeground(Color.GRAY);
				b[7][5].setText("1");
				b[8][0].setForeground(Color.GRAY);
				b[8][0].setText("3");
				b[8][1].setForeground(Color.GRAY);
				b[8][1].setText("2");
				b[8][8].setForeground(Color.GRAY);
				b[8][8].setText("6");
				
				logic(0,1);
				logic(0,2);
				logic(0,4);
				logic(0,6);
				logic(0,7);
				logic(0,8);
				logic(1,0);
				logic(1,2);
				logic(1,3);
				logic(1,4);
				logic(1,5);
				logic(1,6);
				logic(2,0);
				logic(2,1);
				logic(2,2);
				logic(2,3);
				logic(2,4);
				logic(2,6);
				logic(2,7);
				logic(2,8);
				logic(3,0);
				logic(3,1);
				logic(3,2);
				logic(3,3);
				logic(3,4);
				logic(3,5);
				logic(3,7);
				logic(3,8);
				logic(4,2);
				logic(4,3);
				logic(4,5);
				logic(4,6);
				logic(4,7);
				logic(4,8);
				logic(5,0);
				logic(5,1);
				logic(5,2);
				logic(5,3);
				logic(5,4);
				logic(5,5);
				logic(5,7);
				logic(5,8);
				logic(6,0);
				logic(6,1);
				logic(6,2);
				logic(6,3);
				logic(6,4);
				logic(6,5);
				logic(6,6);
				logic(6,7);
				logic(6,8);
				logic(7,0);
				logic(7,1);
				logic(7,3);
				logic(7,4);
				logic(7,6);
				logic(7,7);
				logic(7,8);
				logic(8,2);
				logic(8,3);
				logic(8,4);
				logic(8,5);
				logic(8,6);
				logic(8,7);
				
				count3=1;
			}
			
			jmiSoln.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e1) {
					for(i=0;i<9;i++) {
						for(j=0;j<9;j++) {
							ActionListener[] listeners = b[i][j].getActionListeners();
							for(ActionListener listener : listeners) {
								b[i][j].removeActionListener(listener);
							}
						}
					}
					for(i=0;i<9;i++) {
						for(j=0;j<9;j++) {
							b[i][j].setForeground(Color.BLACK);
						}
					}
					if(count3==2) {
						b[0][0].setText("1");
                        b[0][2].setText("6");
                        b[0][3].setText("4");
                        b[0][4].setText("3");
                        b[0][5].setText("7");
                        b[0][6].setText("9");
                        b[0][7].setText("5");
                        b[0][8].setText("8");
                        b[1][0].setText("8");
                        b[1][1].setText("9");
                        b[1][2].setText("5");
                        b[1][4].setText("2");
                        b[1][5].setText("1");
                        b[1][6].setText("4");
                        b[1][7].setText("7");
                        b[2][0].setText("3");
                        b[2][3].setText("9");
                        b[2][5].setText("5");
                        b[2][6].setText("1");
                        b[2][7].setText("2");
                        b[2][8].setText("6");
                        b[3][0].setText("4");
                        b[3][1].setText("5");
                        b[3][2].setText("7");
                        b[3][3].setText("1");
                        b[3][4].setText("9");
                        b[3][6].setText("8");
                        b[3][7].setText("6");
                        b[4][0].setText("9");
                        b[4][2].setText("3");
                        b[4][3].setText("2");
                        b[4][5].setText("6");
                        b[4][6].setText("5");
                        b[4][8].setText("7");
                        b[5][1].setText("1");
                        b[5][2].setText("2");
                        b[5][4].setText("7");
                        b[5][5].setText("8");
                        b[5][6].setText("3");
                        b[5][7].setText("9");
                        b[5][8].setText("4");
                        b[6][0].setText("2");
                        b[6][1].setText("6");
                        b[6][2].setText("9");
                        b[6][3].setText("3");
                        b[6][5].setText("4");
                        b[6][8].setText("5");
                        b[7][1].setText("4");
                        b[7][2].setText("8");
                        b[7][3].setText("7");
                        b[7][4].setText("6");
                        b[7][6].setText("2");
                        b[7][7].setText("3");
                        b[7][8].setText("1");
                        b[8][0].setText("7");
                        b[8][1].setText("3");
                        b[8][2].setText("1");
                        b[8][3].setText("8");
                        b[8][4].setText("5");
                        b[8][5].setText("2");
                        b[8][6].setText("6");
                        b[8][8].setText("9");
					}
					else if(count3==3) {
						b[0][0].setText("6");
                        b[0][1].setText("3");
                        b[0][2].setText("1");
                        b[0][3].setText("5");
                        b[0][4].setText("4");
                        b[0][5].setText("2");
                        b[0][6].setText("7");
                        b[0][7].setText("8");
                        b[0][8].setText("9");
                        b[1][0].setText("7");
                        b[1][1].setText("8");
                        b[1][2].setText("2");
                        b[1][3].setText("6");
                        b[1][4].setText("9");
                        b[1][5].setText("3");
                        b[1][6].setText("1");
                        b[1][7].setText("4");
                        b[1][8].setText("5");
                        b[2][0].setText("9");
                        b[2][1].setText("4");
                        b[2][2].setText("5");
                        b[2][3].setText("7");
                        b[2][4].setText("8");
                        b[2][5].setText("1");
                        b[2][6].setText("2");
                        b[2][7].setText("6");
                        b[2][8].setText("3");
                        b[3][0].setText("1");
                        b[3][1].setText("7");
                        b[3][2].setText("4");
                        b[3][3].setText("3");
                        b[3][4].setText("5");
                        b[3][5].setText("6");
                        b[3][6].setText("9");
                        b[3][7].setText("2");
                        b[3][8].setText("8");
                        b[4][0].setText("2");
                        b[4][1].setText("5");
                        b[4][2].setText("6");
                        b[4][3].setText("9");
                        b[4][4].setText("1");
                        b[4][5].setText("8");
                        b[4][6].setText("3");
                        b[4][7].setText("7");
                        b[4][8].setText("4");
                        b[5][0].setText("3");
                        b[5][1].setText("9");
                        b[5][2].setText("8");
                        b[5][3].setText("4");
                        b[5][4].setText("2");
                        b[5][5].setText("7");
                        b[5][6].setText("6");
                        b[5][7].setText("5");
                        b[5][8].setText("1");
                        b[6][0].setText("5");
                        b[6][1].setText("6");
                        b[6][2].setText("3");
                        b[6][3].setText("8");
                        b[6][4].setText("7");
                        b[6][5].setText("9");
                        b[6][6].setText("4");
                        b[6][7].setText("1");
                        b[6][8].setText("2");
                        b[7][0].setText("4");
                        b[7][1].setText("2");
                        b[7][2].setText("7");
                        b[7][3].setText("1");
                        b[7][4].setText("3");
                        b[7][5].setText("5");
                        b[7][6].setText("8");
                        b[7][7].setText("9");
                        b[7][8].setText("6");
                        b[8][0].setText("8");
                        b[8][1].setText("1");
                        b[8][2].setText("9");
                        b[8][3].setText("2");
                        b[8][4].setText("6");
                        b[8][5].setText("4");
                        b[8][6].setText("5");
                        b[8][7].setText("3");
                        b[8][8].setText("7");
					}
					else if(count3==4) {
						b[0][0].setText("9");
                        b[0][1].setText("8");
                        b[0][2].setText("7");
                        b[0][3].setText("6");
                        b[0][4].setText("5");
                        b[0][5].setText("4");
                        b[0][6].setText("3");
                        b[0][7].setText("2");
                        b[0][8].setText("1");
                        b[1][0].setText("2");
                        b[1][1].setText("4");
                        b[1][2].setText("6");
                        b[1][3].setText("1");
                        b[1][4].setText("7");
                        b[1][5].setText("3");
                        b[1][6].setText("9");
                        b[1][7].setText("8");
                        b[1][8].setText("5");
                        b[2][0].setText("3");
                        b[2][1].setText("5");
                        b[2][2].setText("1");
                        b[2][3].setText("9");
                        b[2][4].setText("2");
                        b[2][5].setText("8");
                        b[2][6].setText("7");
                        b[2][7].setText("4");
                        b[2][8].setText("6");
                        b[3][0].setText("1");
                        b[3][1].setText("2");
                        b[3][2].setText("8");
                        b[3][3].setText("5");
                        b[3][4].setText("3");
                        b[3][5].setText("7");
                        b[3][6].setText("6");
                        b[3][7].setText("9");
                        b[3][8].setText("4");
                        b[4][0].setText("6");
                        b[4][1].setText("3");
                        b[4][2].setText("4");
                        b[4][3].setText("8");
                        b[4][4].setText("9");
                        b[4][5].setText("2");
                        b[4][6].setText("1");
                        b[4][7].setText("5");
                        b[4][8].setText("7");
                        b[5][0].setText("7");
                        b[5][1].setText("9");
                        b[5][2].setText("5");
                        b[5][3].setText("4");
                        b[5][4].setText("6");
                        b[5][5].setText("1");
                        b[5][6].setText("8");
                        b[5][7].setText("3");
                        b[5][8].setText("2");
                        b[6][0].setText("5");
                        b[6][1].setText("1");
                        b[6][2].setText("9");
                        b[6][3].setText("2");
                        b[6][4].setText("8");
                        b[6][5].setText("6");
                        b[6][6].setText("4");
                        b[6][7].setText("7");
                        b[6][8].setText("3");
                        b[7][0].setText("4");
                        b[7][1].setText("7");
                        b[7][2].setText("2");
                        b[7][3].setText("3");
                        b[7][4].setText("1");
                        b[7][5].setText("9");
                        b[7][6].setText("5");
                        b[7][7].setText("6");
                        b[7][8].setText("8");
                        b[8][0].setText("8");
                        b[8][1].setText("6");
                        b[8][2].setText("3");
                        b[8][3].setText("7");
                        b[8][4].setText("4");
                        b[8][5].setText("5");
                        b[8][6].setText("2");
                        b[8][7].setText("1");
                        b[8][8].setText("9");
					}
					else if(count3==5) {
						b[0][0].setText("5");
                        b[0][1].setText("8");
                        b[0][2].setText("1");
                        b[0][3].setText("6");
                        b[0][4].setText("7");
                        b[0][5].setText("2");
                        b[0][6].setText("4");
                        b[0][7].setText("3");
                        b[0][8].setText("9");
                        b[1][0].setText("7");
                        b[1][1].setText("9");
                        b[1][2].setText("2");
                        b[1][3].setText("8");
                        b[1][4].setText("4");
                        b[1][5].setText("3");
                        b[1][6].setText("6");
                        b[1][7].setText("5");
                        b[1][8].setText("1");
                        b[2][0].setText("3");
                        b[2][1].setText("6");
                        b[2][2].setText("4");
                        b[2][3].setText("5");
                        b[2][4].setText("9");
                        b[2][5].setText("1");
                        b[2][6].setText("7");
                        b[2][7].setText("8");
                        b[2][8].setText("2");
                        b[3][0].setText("4");
                        b[3][1].setText("3");
                        b[3][2].setText("8");
                        b[3][3].setText("9");
                        b[3][4].setText("5");
                        b[3][5].setText("7");
                        b[3][6].setText("2");
                        b[3][7].setText("1");
                        b[3][8].setText("6");
                        b[4][0].setText("2");
                        b[4][1].setText("5");
                        b[4][2].setText("6");
                        b[4][3].setText("1");
                        b[4][4].setText("8");
                        b[4][5].setText("4");
                        b[4][6].setText("9");
                        b[4][7].setText("7");
                        b[4][8].setText("3");
                        b[5][0].setText("1");
                        b[5][1].setText("7");
                        b[5][2].setText("9");
                        b[5][3].setText("3");
                        b[5][4].setText("2");
                        b[5][5].setText("6");
                        b[5][6].setText("8");
                        b[5][7].setText("4");
                        b[5][8].setText("5");
                        b[6][0].setText("8");
                        b[6][1].setText("4");
                        b[6][2].setText("5");
                        b[6][3].setText("2");
                        b[6][4].setText("1");
                        b[6][5].setText("9");
                        b[6][6].setText("3");
                        b[6][7].setText("6");
                        b[6][8].setText("7");
                        b[7][0].setText("9");
                        b[7][1].setText("1");
                        b[7][2].setText("3");
                        b[7][3].setText("7");
                        b[7][4].setText("6");
                        b[7][5].setText("8");
                        b[7][6].setText("5");
                        b[7][7].setText("2");
                        b[7][8].setText("4");
                        b[8][0].setText("6");
                        b[8][1].setText("2");
                        b[8][2].setText("7");
                        b[8][3].setText("4");
                        b[8][4].setText("3");
                        b[8][5].setText("5");
                        b[8][6].setText("1");
                        b[8][7].setText("9");
                        b[8][8].setText("8");
					}
					else if(count3==1) {
						b[0][0].setText("7");
                        b[0][1].setText("5");
                        b[0][2].setText("2");
                        b[0][3].setText("1");
                        b[0][4].setText("3");
                        b[0][5].setText("8");
                        b[0][6].setText("6");
                        b[0][7].setText("9");
                        b[0][8].setText("4");
                        b[1][0].setText("1");
                        b[1][1].setText("9");
                        b[1][2].setText("8");
                        b[1][3].setText("7");
                        b[1][4].setText("4");
                        b[1][5].setText("6");
                        b[1][6].setText("5");
                        b[1][7].setText("3");
                        b[1][8].setText("2");
                        b[2][0].setText("4");
                        b[2][1].setText("3");
                        b[2][2].setText("6");
                        b[2][3].setText("2");
                        b[2][4].setText("9");
                        b[2][5].setText("5");
                        b[2][6].setText("7");
                        b[2][7].setText("8");
                        b[2][8].setText("1");
                        b[3][0].setText("2");
                        b[3][1].setText("8");
                        b[3][2].setText("3");
                        b[3][3].setText("4");
                        b[3][4].setText("5");
                        b[3][5].setText("9");
                        b[3][6].setText("1");
                        b[3][7].setText("6");
                        b[3][8].setText("7");
                        b[4][0].setText("9");
                        b[4][1].setText("6");
                        b[4][2].setText("1");
                        b[4][3].setText("8");
                        b[4][4].setText("2");
                        b[4][5].setText("7");
                        b[4][6].setText("3");
                        b[4][7].setText("4");
                        b[4][8].setText("5");
                        b[5][0].setText("5");
                        b[5][1].setText("7");
                        b[5][2].setText("4");
                        b[5][3].setText("6");
                        b[5][4].setText("1");
                        b[5][5].setText("3");
                        b[5][6].setText("8");
                        b[5][7].setText("2");
                        b[5][8].setText("9");
                        b[6][0].setText("6");
                        b[6][1].setText("1");
                        b[6][2].setText("9");
                        b[6][3].setText("3");
                        b[6][4].setText("7");
                        b[6][5].setText("2");
                        b[6][6].setText("4");
                        b[6][7].setText("5");
                        b[6][8].setText("8");
                        b[7][0].setText("8");
                        b[7][1].setText("4");
                        b[7][2].setText("5");
                        b[7][3].setText("9");
                        b[7][4].setText("6");
                        b[7][5].setText("1");
                        b[7][6].setText("2");
                        b[7][7].setText("7");
                        b[7][8].setText("3");
                        b[8][0].setText("3");
                        b[8][1].setText("2");
                        b[8][2].setText("7");
                        b[8][3].setText("5");
                        b[8][4].setText("8");
                        b[8][5].setText("4");
                        b[8][6].setText("9");
                        b[8][7].setText("1");
                        b[8][8].setText("6");
					}
				}
			});
	}
}
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Layout();
			}
		});
	}
}

