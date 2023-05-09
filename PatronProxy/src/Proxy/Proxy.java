package Proxy;

public class Proxy implements iProxy{
	
	private RealProxy realProxy;

    public Proxy() {
        this.realProxy = new RealProxy();
    }
    
    @Override 
    public void despedida() {
    	
    }

    @Override
    public void darBienvenida() {
        before();
        realProxy.darBienvenida();
        after();
        realProxy.despedida();
    }

    private void before() {
        System.out.println("- Antes de llamar al metodo darBienvenida() \n");
    }

    private void after() {
        System.out.println("- Despues de llamar al metodo darBienvenida() \n");
    }
}


