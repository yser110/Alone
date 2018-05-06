package com.alone;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *	@author Alone
 *	@time 2018-5-6 - 下午10:58:32
 *	@description
 * 
 */
@RestController
public class HelloController {

	/**
	 * value 访问地址，method 访问方式
	 * @return
	 */
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String say(){
		return "Hello Spring Boot!";
	}
}
