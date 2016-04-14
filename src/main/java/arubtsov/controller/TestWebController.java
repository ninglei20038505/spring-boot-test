package arubtsov.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import arubtsov.service.RedisService;

@RestController
public class TestWebController {

	@Autowired
	private RedisService redisService;

	private Logger logger = LoggerFactory.getLogger(getClass());

	@RequestMapping(value = "/echo", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public String echo() {
		logger.info("Hello init Docker!!!!!!!!!!!!!!!!!!!");
		return "Hello init Docker!!!!!!!!!!!!!!!!!!!";
	}

	@RequestMapping(value = "/redis/get/{key}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public String rGet(@PathVariable("key") String key) {
		String vString = redisService.get(key);
		logger.info("redisService: {}", vString);
		return "Redis Value:" + vString;
	}

	@RequestMapping(value = "/redis/set/{key}/{value}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public String rSet(@PathVariable("key") String key, @PathVariable("value") String value) {
		redisService.set(key, value);
		logger.info("redisService:  key : {} ,value : {} SET OK", key, value);
		return "Redis Value: SET OK key:" + key + ",value:" + value;
	}

}
