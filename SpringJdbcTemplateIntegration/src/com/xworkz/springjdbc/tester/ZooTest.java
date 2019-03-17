package com.xworkz.springjdbc.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.springjdbc.dao.ZooDAO;
import com.xworkz.springjdbc.dto.ZooDTO;

public class ZooTest {

	public static void main(String[] args) {

		ApplicationContext app = new ClassPathXmlApplicationContext("resource/context.xml");
		ZooDAO zoo = app.getBean(ZooDAO.class);
		//zoo.saveZoo(new ZooDTO("cow", 15, 6, true));
		//zoo.updateZoo(new ZooDTO("bear",13,3,true));
		/*ZooDTO z=new ZooDTO();
		z.setShellNo(5);
		zoo.deleteZoo(z);*/
		
		
	}

}
