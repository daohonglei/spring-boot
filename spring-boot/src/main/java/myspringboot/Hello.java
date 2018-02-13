package myspringboot;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Hello {
	
	@RequestMapping("/hello1")
	public String hello(){
		return "hello";
	}
	
	@RequestMapping(value="/getDemo",produces="text/plain;charset=UTF-8")
	public Demo getDemo(){
		Demo demo = new Demo();
		demo.setId(1);
		demo.setName("李四");
		demo.setCreateTime(new Date());
		demo.setRemarks("备注");
		return demo;
	}
}
