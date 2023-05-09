package Proxy;

public class RealProxy implements iProxy {
    @Override
    public void darBienvenida() {
        System.out.println("Bienvenido al maravilloso IDE Eclipse \n");
    }
    
    @Override 
    public void despedida() {
    	System.out.println("Me despido de esto, me voy a IntelliJ");
    }
}
