package hello;

import org.springframework.beans.factory.annotation.Autowired;

public class ConsoleHelloService implements HelloService {

	@Autowired
	private HelloProperties properties;

	@Override
	public void myFirstHello() {
		System.out.println(this.properties.getPrefix()
				+ " " + this.properties.getTarget());
	}
}
