/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facil;

/**
 *
 * @author T107
 */
public class Intermedia implements Runnable{
    
    public static void main(String args[]){
     //creamos el thread
        Runnable r=new Intermedia();
        
    Thread t1=new Thread(r);
    Thread t2=new Thread(r);
    Thread t3=new Thread(r);
    //inicializamos
    t1.start();
     t2.start();
     t3.start();
   
     t1.setName("impresion");
     t2.setName("conexion");
     t3.setName("guardar");
     
    } @Override
            public void run(){
                //ejecutarse
                
                try{
                System.out.println(Thread.currentThread().getName());
                
                    if (Thread.currentThread().getName().equals("conexion"))Thread.sleep(8000);
                     if (Thread.currentThread().getName().equals("guardar"))Thread.sleep(16000);
                      if (Thread.currentThread().getName().equals("impresion"))Thread.sleep(24000);
                      
                }catch(Exception e){}
}
            
}