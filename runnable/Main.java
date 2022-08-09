import java.io.*;
class Main implements Runnable
{
    public void run(){  
        System.out.println("Running...");  
    }  
	public static void main(String[] args) {
	    Main m = new Main();
	    Thread t1= new Thread(m);
	    System.out.println("Name of t1:"+t1.getName());
	    t1.start();
        
	}
}
