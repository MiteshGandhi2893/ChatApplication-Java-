package chatting;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Excel
 */
import java.io.*;
import java.net.*;
import javax.swing.*;
public class Recieve extends Thread {
    String msg="";
    DataInputStream dis=null;
    JTextArea jTextArea1=null;
    public Recieve(DataInputStream dis,JTextArea jTextArea1)
    {
        this.dis=dis;
        this.jTextArea1=jTextArea1;
    }
    public void run()
    {
        while(true)
        {
            try
            {
                msg=dis.readUTF();
                jTextArea1.append("\n"+this.getName()+":"+msg+"\n");
                jTextArea1.setCaretPosition( jTextArea1.getDocument().getLength());
                
            }
            catch(Exception e)
            {
                
            }
        }
    }
    
}
