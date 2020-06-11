//package client;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//import org.springframework.web.client.RestTemplate;
//import net.codejava.SpringBootWebApp.entity.User;
//
//@Component
//public class CallRestService implements CommandLineRunner {
//	
//	private static void callRestService() {
//		RestTemplate restTemplate = new RestTemplate();
//		User user = restTemplate.getForObject("http://localhost:8080/users/3", User.class);
//		System.out.println("id : " + user.getId());
//		System.out.println("username: " + user.getUsername());
//		System.out.println("password: " + user.getPassword());
//		System.out.println("type: " + user.getType());
//	}
//	
//	@Override
//	public void run(String... args) throws Exception {
//		callRestService();
//	}
//
//}
