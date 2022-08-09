import java.io.*;
public class Main extends Thread
{
    public void run(){  
        System.out.println("Running...");  
    }  
	public static void main(String[] args) {
	    Main t1 = new Main();
	    System.out.println("Name of t1:"+t1.getName());
	    t1.start();
        
	}
}
