package Proxy;

public class Proxy implements iProxy{
	
	RealProxy realProxy = new RealProxy();

	@Override
	public void darBienvenida() {
		System.out.println("ANTES : TE VOY A DAR LA BIENVENIDA"); 
		realProxy.darBienvenida();
	}

}
