package chapter10.Example22;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
public class JDKWindow extends JFrame{
	JTextField javaSourceFileName;
	JTextField javaMainClassName;
	JButton compile,run,edit;
	HandleActionEvent listener;
	public JDKWindow(){
		edit=new JButton("�ü��±����Դ�ļ�");
		compile=new JButton("�༭");
		run=new JButton("����");
		javaSourceFileName=new JTextField(10);
		javaMainClassName=new JTextField(10);
		setLayout(new FlowLayout());
		add(edit);
		add(new JLabel("����Դ�ļ�����"));
		add(javaSourceFileName);
		add(compile);
		add(new JLabel("����������"));
		add(javaMainClassName);
		add(run);
		listener=new HandleActionEvent();
		edit.addActionListener(listener);
		compile.addActionListener(listener);
		run.addActionListener(listener);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 180);
	}
	class HandleActionEvent implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==edit){
				Runtime ce=Runtime.getRuntime();
				File file=new File("c:/window","Notepad.exe");
				try{
					ce.exec(file.getAbsolutePath());
				}
				catch(Exception exp){}
			}
			else if(e.getSource()==compile){
				CompileDialog compileDialog=new CompileDialog();
				String name=javaSourceFileName.getText();
				compileDialog.compile(name);
				compileDialog.setVisible(true);
			}
			else if(e.getSource()==run){
				RunDialog runDialog=new RunDialog();
				String name=javaMainClassName.getText();
				runDialog.run(name);
				runDialog.setVisible(true);
			}
		}
	}
}
