package arubtsov.bean;

public class Environments {

	private String addr;

	private String port;

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	@Override
	public String toString() {
		return "Environments [addr=" + addr + ", port=" + port + "]";
	}

}
