import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.PersonDTO;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("classpath:person.xml");
		PersonDTO person1=ctx.getBean("person1",PersonDTO.class);
		PersonDTO person2=ctx.getBean("person2",PersonDTO.class);
		
		System.out.println(person1);
		System.out.println(person2);
	}

}
