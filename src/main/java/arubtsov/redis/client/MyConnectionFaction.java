package arubtsov.redis.client;

import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

import arubtsov.bean.Environments;

public class MyConnectionFaction extends JedisConnectionFactory {

	private Environments env;

	public MyConnectionFaction() {
		super.setHostName(env.getAddr());
		super.setPort(Integer.parseInt(env.getPort()));
	}

}
