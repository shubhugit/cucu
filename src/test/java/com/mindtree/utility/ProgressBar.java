package com.mindtree.utility;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

@SuppressWarnings("serial")
public class ProgressBar extends JFrame{
	
	JProgressBar jb;    
	int i=0;     
	public ProgressBar(){    
	jb=new JProgressBar(0,100);    
	jb.setBounds(40,40,1000,30);         
	jb.setValue(0);    
	jb.setStringPainted(true);    
	add(jb);    
	setSize(1000,200);    
	jb.setForeground(Color.red);
	setLayout(null);  
	}
	public void iterate(int i) {
		jb.setValue(i);
		
	}

}
