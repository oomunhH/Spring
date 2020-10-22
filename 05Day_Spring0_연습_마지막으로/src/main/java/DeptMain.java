import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.DeptService;

public class DeptMain {

	public static void main(String[] args) {

	GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("classpath:Dept.xml");
	DeptService service=ctx.getBean("dept1",DeptService.class);
	System.out.println(service);
	
	List<String> list=service.list();
	System.out.println(list);
	for (String s : list) {
		System.out.println(s);
	}
	}
}
