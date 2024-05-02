import javax.swing.*; 
public class 
Registration { public static void main(String[] args) { 
JFrame f = new JFrame("Label Example"); 
JLabel l1, l2, l3, l4, l5,l6,l7; 
 
 
 
JTextField t1, t2,t3; l3 = new JLabel("Registration Form "); 
l3.setBounds(50, 0, 200, 30); l1 = new JLabel("Name: "); 
l1.setBounds(50, 50, 100, 30); t1 = 
new JTextField(""); 
t1.setBounds(110, 50, 200, 30); l2 = 
new JLabel("Address: "); 
l2.setBounds(50,100, 100, 30); 
JTextArea area = new JTextArea(""); 
area.setBounds(110,100, 200, 50); l4 
= new JLabel("Phone No.: "); 
l4.setBounds(50, 180, 100, 30); t2 = 
new JTextField(""); 
t2.setBounds(110, 180, 200, 30); l6 
= new JLabel("Email: "); 
l6.setBounds(50, 220, 100, 30); t3 = 
new JTextField(""); 
t3.setBounds(110, 220, 200, 30); 
f.add(l6); f.add(t3); l5 = new 
JLabel("Gender: "); 
l5.setBounds(50, 260, 100, 30); 
JRadioButton r1 = new JRadioButton("Male"); 
JRadioButton r2 = new 
JRadioButton("Female"); r1.setBounds(110, 
260, 100, 30); r2.setBounds(110, 290, 100, 30); 
ButtonGroup bg = new ButtonGroup(); 
 
 
 
f.add(l5); 
bg.add(r1); 
bg.add(r2); 
f.add(area); 
f.add(r1); 
f.add(r2); 
f.add(l4); 
f.add(t2); 
f.add(l1); 
f.add(l3); 
f.add(l2); f.add(t1); l7 = new 
JLabel("Please Select Subject: "); 
l7.setBounds(500, 50, 170, 30); 
f.add(l7); 
JCheckBox checkBox1 = new JCheckBox("Mathematics"); 
checkBox1.setBounds(500,100, 100,30); 
f.add(checkBox1); 
JCheckBox checkBox2 = new JCheckBox("Physics"); 
checkBox2.setBounds(500,130, 100,30); 
f.add(checkBox2); 
 JCheckBox checkBox3 = new JCheckBox("Chemistry"); 
checkBox3.setBounds(500,160, 100,30); 
f.add(checkBox3); 
JCheckBox checkBox4 = new JCheckBox("Data Science"); 
checkBox4.setBounds(650,100, 100,30); 
f.add(checkBox4); 
 
 
 
JCheckBox checkBox5 = new JCheckBox("Operating System"); 
checkBox5.setBounds(650,130, 150,30); 
f.add(checkBox5); 
 JCheckBox checkBox6 = new JCheckBox("Foreign Language"); 
checkBox6.setBounds(650,160, 150,30); 
f.add(checkBox6); 
 JButton b=new JButton("SUBMIT"); 
b.setBounds(350,320,95,30); 
f.add(b); 
f.setSize(1000, 600); 
f.setLayout(null); 
f.setVisible(true); 
} 
}