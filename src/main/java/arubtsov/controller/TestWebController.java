package arubtsov.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestWebController {

	@RequestMapping(value = "/echo", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public String echo() {
		return "Hello Docker!!!!!!!!!!!!!!!!!!!";
	}

	@RequestMapping(value = "/index/get", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public String index() {
		System.out.println("index................");
		return "Hello index!!!!!!!!!!!!!!!!!!!";
	}

}
