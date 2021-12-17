package luis.ortiz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext app1 = new ClassPathXmlApplicationContext("com/uce/edu/archivo/beansp.xml");
		Paciente pacien = (Paciente) app1.getBean("paciente");
		System.out.println(pacien.getNombre());
		System.out.println(pacien.getApellido());
		System.out.println(pacien.getEdad());
		
	//	app.getBean(Cuenta.class);
		
		
	/*	Cuenta miCuentaPrueba = (Cuenta) app.getBean("cuenta");
		miCuentaPrueba.setNumero("23");
		miCuentaPrueba.setSaldo(10);
		
		Cuenta miCuentaPrueba = new Cuenta("1234",100);*/
		
		
		
		//JEE
		//CDI
		
		//IoC por constructor
		Profesor profe = (Profesor) app1.getBean("profesor");
		//int edadTotal = estu.getEdad()+10;
		System.out.println(profe.getNombre() + " " + profe.getApellido()+ " " + profe.getProfesion()+" "+ profe.getUniversidad()+ "");
		
	}

	

}
