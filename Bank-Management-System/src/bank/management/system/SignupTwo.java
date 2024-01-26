
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class SignupTwo extends JFrame implements ActionListener
{
   
    
    JTextField pan,addhar;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religions,category,income,education,occupation;
    String formno;
    
    
    SignupTwo(String formno){
        
        this.formno=formno;
        
        setLayout(null);
        
        setTitle("New Account Application Form - Page 2");
        
         JLabel additionalDetails=new JLabel("page 2 : Additional Datails");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add (additionalDetails);
        
        JLabel religion=new JLabel("Religion :");
        religion.setFont(new Font("Raleway",Font.BOLD,20));
        religion.setBounds(100, 140, 100, 30);
        add (religion);
        
        String valReligion[]={"Hindu","Muslim","Sikh","Christian","Others"};
        religions = new JComboBox(valReligion);
        religions.setBounds(300,140,400,30);
        religions.setFont(new Font("Raleway",Font.BOLD,14));
        religions.setBackground(Color.WHITE);
        add (religions);
        
        JLabel cate=new JLabel("Category :");
        cate.setFont(new Font("Raleway",Font.BOLD,20));
        cate.setBounds(100, 190, 200, 30);
        add (cate);
        
        String valCategory[]={"OBC","General","Open","SC","Other"};
        category = new JComboBox(valCategory);
        category.setFont(new Font ("Railway",Font.BOLD,14));
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add (category);
        
        JLabel incomes=new JLabel("Income :");
        incomes.setFont(new Font("Raleway",Font.BOLD,20));
        incomes.setBounds(100, 240, 200, 30);
        add (incomes);
        
       String valIncome[]={"Null","< 1,50,000","< 2,50,000","< 5,00,000","Upto 10,00,000"};
        income = new JComboBox(valIncome);
        income.setFont(new Font ("Railway",Font.BOLD,14));
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);
        
         JLabel edu=new JLabel("Educationl ");
        edu.setFont(new Font("Raleway",Font.BOLD,20));
        edu.setBounds(100, 290, 200, 30);
        add (edu);
        
         JLabel qualify=new JLabel("Qulification :");
        qualify.setFont(new Font("Raleway",Font.BOLD,20));
        qualify.setBounds(100, 315, 200, 30);
        add (qualify);
 
        String educationValues[]={"Non-Graduate","Graduate","Poast-Graduate","Doctrate","Others"};
        education = new JComboBox(educationValues);
        education.setFont(new Font ("Railway",Font.BOLD,14));
        education.setBounds(300,315,400,30);
        education.setBackground(Color.WHITE);
        add(education);
        
         JLabel marital=new JLabel("Occupation :");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100, 390, 200, 30);
        add (marital);
        
        String occupationValues[]={"Salaried","Self-Employed","Business","Student","Government"};
        occupation = new JComboBox(occupationValues);
        occupation.setFont(new Font ("Railway",Font.BOLD,14));
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);              
        
        JLabel address=new JLabel("PAN Number:");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100, 440, 200, 30);
        add (address);
        
        pan=new JTextField();
        pan.setFont(new Font ("Railway",Font.BOLD,14));
        pan.setBounds(300,440,400,30);
        add (pan);
        
        JLabel city=new JLabel("Addhar Number :");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100, 490, 200, 30);
        add (city);
        
        addhar =new JTextField();
        addhar.setFont(new Font ("Railway",Font.BOLD,14));
        addhar.setBounds(300,490,400,30);
        add (addhar);
        
       JLabel state=new JLabel("Senior Citizen:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100, 540, 200, 30);
        add (state);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300,540,60,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450,540,120,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup seniorgroup = new ButtonGroup();
        seniorgroup.add(syes);
        seniorgroup.add(sno);
        
        JLabel pin=new JLabel("Existing Account :");
        pin.setFont(new Font("Raleway",Font.BOLD,20));
        pin.setBounds(100, 590, 200, 30);
        add (pin);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup existgroup = new ButtonGroup();
        existgroup.add(eyes);
        existgroup.add(eno);
       
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Railway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String sreligion =(String)religions.getSelectedItem();
        String scategory =(String)category.getSelectedItem();
        String sincome =(String)income.getSelectedItem();
        String seducation =(String)education.getSelectedItem();
        String soccupation =(String)occupation.getSelectedItem();
        String seniorcitizen=null;
        if (syes.isSelected()){
        seniorcitizen ="Yes";
        }else if (sno.isSelected()){
        seniorcitizen ="No";
         }
        String sexistingaccount=null;
        if (eyes.isSelected()){
        sexistingaccount ="Yes";
        }else if (eno.isSelected()){
        sexistingaccount ="No";
         }
     
        String span = pan.getText();
        String saddhar = addhar.getText();
      
    
       try {
        
        Conn c = new Conn();
        String query = "insert into signuptwo values (' "+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saddhar+"','"+seniorcitizen+"','"+sexistingaccount+"')";
        c.s.executeUpdate(query);
        
        
        //signupThree Object
        
        setVisible(false);
        new SignupThree(formno).setVisible(true);
       
       }
    catch (Exception e){
        System.out.println(e);
       
    }
    
}
  
    public static void main(String args[]) {
        new SignupTwo("");
    }
}



  
   