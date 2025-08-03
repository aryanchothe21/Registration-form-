import javax.swing.*;
import java.awt.event.*;
class LoginS extends Jframe{

JLabel l1,l2,l3;
JTextField t1,t2;
JButton b1,b2;



  LoginS(String s1){

  super(s1);

}
 LoginS(){
}void setComponents(){
 l1=new JLabel("Registration form");
 l2=new JLabel("Username");
 l3=new JLabel("Password");
 t1=new JTextField("");
 t2=new JTextField("");
 b1=new JButton("Login");
 

setLayout(null);
add(l1);
add(l2);
add(l3);
add(t1);
add(t2);
add(b1);

l1.setBounds(200,100,300,30);
l2.setBounds(200,200,100,30);
l3.setBounds(200,300,100,30);
t1.setBounds(300,200,100,30);
t2.setBounds(300,300,100,30);
b1.setBounds(500,200,100,30);
b1.addActionListener(new Log());



}



 public static void main(String []args)
{  
    
 LoginS s1= new LoginS("Welcome to Registration Form");
 
    s1.setVisible(true);
    s1.setSize(700,700);
    s1.setComponents();


    }

class Log implements ActionListener{
   public void actionPerformed(ActionEvent e1)
{
  String s1=t1.getText();
String s2=t2.getText();
if(s1.equals("aryan") && s2.equals("pass"))
{
  l3.setText("login succssful");
}else{
l3.setText("login successful");

}}}}

  
