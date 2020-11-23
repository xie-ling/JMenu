package com.ing.GUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainUI extends JFrame{
	private JMenu lookMenu,editMenu,historyMenu,helpMenu;
	private JMenuItem copyItem,pasteItem;
	
	public MainUI() {
		super("计算器"); 
		
		//add menu
		JMenuBar bar = new JMenuBar();
		lookMenu = new JMenu("查看(V)");
		editMenu = new JMenu("编辑(E)");
		copyItem = new JMenuItem("复制  Ctrl+C");
		pasteItem = new JMenuItem("粘贴  Ctrl+V");
		historyMenu = new JMenu("历史记录");
		
		editMenu.add(copyItem);
		editMenu.add(pasteItem);
		editMenu.addSeparator();
		editMenu.add(historyMenu);
		
		helpMenu = new JMenu("帮助(H)");
		bar.add(lookMenu);
		bar.add(editMenu);
		bar.add(helpMenu);
		
		
		Container defaultPanel = getContentPane();
		BorderLayout border = new BorderLayout();
		defaultPanel.add(BorderLayout.NORTH, bar);
		
		this.setSize(400, 500);
		setLocation(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new MainUI();
	}
}

