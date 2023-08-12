package com.example.jpapractise;

import com.example.jpapractise.dao.UserRepository;
import com.example.jpapractise.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

@SpringBootApplication
public class JpapractiseApplication {

	public static void main(String[] args) {

		SpringApplication.run(JpapractiseApplication.class, args);

//		ApplicationContext context = SpringApplication.run(JpapractiseApplication.class, args);
//
//		UserRepository userRepository = context.getBean(UserRepository.class);

//		User user = new User();
//		user.setName("ajay");
//		user.setCity("jabalpur");
//		user.setStatus("deveopler");

//		User result = userRepository.save(user);
//		System.out.println(user)


/**------------------------- THESE ARE THE PREDEFINED METHODS --------------------------------- **/

		/** CREATE USER **/
//		User user1 = new User();
//		user1.setName("ankit");
//		user1.setCity("bhaghel");
//		user1.setStatus("deveopler");
//
//		User user2 = new User();
//		user2.setName("aman");
//		user2.setCity("patel");
//		user2.setStatus("manager");

//		saving single user
//		User res = userRepository.save(user1);
//		System.out.println("DONE " + res.toString());

//		User user3 = new User();
//		user3.setName("John");
//		user3.setCity("Doe");
//		user3.setStatus("engineer");
//
//		User user4 = new User();
//		user4.setName("Alice");
//		user4.setCity("Smith");
//		user4.setStatus("designer");
//
//		User user5 = new User();
//		user5.setName("Bob");
//		user5.setCity("Johnson");
//		user5.setStatus("analyst");
//
//		User user6 = new User();
//		user6.setName("Sarah");
//		user6.setCity("Williams");
//		user6.setStatus("supervisor");
//
//		User user7 = new User();
//		user7.setName("Michael");
//		user7.setCity("Brown");
//		user7.setStatus("consultant");
//
//		User user8 = new User();
//		user8.setName("Emily");
//		user8.setCity("Davis");
//		user8.setStatus("coordinator");
//
//		User user9 = new User();
//		user9.setName("David");
//		user9.setCity("Wilson");
//		user9.setStatus("team lead");
//
//		User user10 = new User();
//		user10.setName("Olivia");
//		user10.setCity("Taylor");
//		user10.setStatus("administrator");
//
//		//saving multiple user
//		List<User> users = List.of(user1,user2,user3,user4,user5,user6,user7,user8,user9,user10);
//		Iterable<User> result =  userRepository.saveAll(users);

//		result.forEach(user -> {
//			System.out.println("User - "+ user);
//		});


		/** UPDATE USER **/
//		Optional<User> user = userRepository.findById(102);
//		User res = user.get();
//
//		res.setName("ram");
//		userRepository.save(res);
//
//		System.out.println(res);

		/** GET USER **/
//		Optional<User> user = userRepository.findById(102);
//		User res = user.get();
//		System.out.println(res);

//		Iterable<User> iterator = userRepository.findAll();
//		Iterator<User> iterator1 = iterator.iterator();
//		while (iterator1.hasNext()){
//			User user = iterator1.next();
//			System.out.println(user);
//		}

//		iterator.forEach(new Consumer<User>() {
//			@Override
//			public void accept(User user) {
//				System.out.println(user);
//			}
//		});

//		iterator.forEach(user -> {
//			System.out.println(user);
//		});

//		iterator.forEach(System.out::println);

		/** DELETE USER **/
//		userRepository.deleteById(103);

//		Iterable<User> allUser = userRepository.findAll();
//		allUser.forEach(user -> {System.out.println(user);});
//
//		userRepository.deleteAll(allUser);
		
		
/**------------------------- THESE ARE THE PREDEFINED METHODS --------------------------------- **/

//		List<User> aman = userRepository.findByName("Aman");
//		aman.forEach(user -> System.out.println(user));

//		List<User> users = userRepository.getAllUser();
//		users.forEach(user1 -> System.out.println(users));

//		List<User> users = userRepository.getUserByName("ankit");
//		users.forEach(user1 -> System.out.println(user1));

//		List<User> users = userRepository.getUserByNameAndCity("aman","patel");
//		users.forEach(user1 -> System.out.println(user1));

//		List<User> users = userRepository.getUsers();
//		users.forEach(user1 -> System.out.println(user1));

	}

//	@Autowired
//	BookService bookService;
//
//	@Override
//	public void run(String... args) throws Exception {
//		Book book1 = new Book(1, "java in action","Kathy","Tech",900.00);
//		bookService.addBook(book1);
//
//		Book book2 = new Book(2, "python in action","ross","Tech",1900.00);
//		bookService.addBook(book2);
//
//		Book book3 = new Book(3, "spring in action","rod","Tech",3200.00);
//		bookService.addBook(book3);


//		List<Book> allBook = bookService.getAll();
//		allBook.forEach(c -> System.out.println(c));

//		List<Book> books = bookService.getByAuthor("rod");
//		if (books != null) books.forEach(System.out::println);
//	}
}
