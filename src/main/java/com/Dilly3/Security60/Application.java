package com.Dilly3.Security60;


import com.Dilly3.Security60.models.AppUSer;
import com.Dilly3.Security60.models.Role;
import com.Dilly3.Security60.models.Roles;
import com.Dilly3.Security60.repository.IRoleRepository;
import com.Dilly3.Security60.repository.IUserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class Application {
//	private final IUserRepository userRepo;
//	private final IRoleRepository roleRepo;
//	private final PasswordEncoder encoder;
//
//	public Application(IUserRepository userRepo, IRoleRepository roleRepo, PasswordEncoder encoder) {
//		this.userRepo = userRepo;
//		this.roleRepo = roleRepo;
//		this.encoder = encoder;
//	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);


	}

//	@Bean
//	CommandLineRunner run(){
//		return args -> {
//			AppUSer user1 =
//					new AppUSer("michael9", encoder.encode("123456"),"michael9@gmail.com" );
//			//roleRepo.saveAll(Arrays.asList(new Roles(1,Role.ADMIN), new Roles(2,Role.USER)));
//			Set<Roles> roles1 = new HashSet<>();
//			roles1.add(roleRepo.findByRole(Role.ADMIN).orElseThrow());
//			roles1.add(roleRepo.findByRole(Role.USER).orElseThrow());
//			user1.setAuthorities(roles1);
//			userRepo.save(user1);
//			Set<Roles> roles2 = new HashSet<>();
//			roles2.add(roleRepo.findByRole(Role.USER).orElseThrow());
//			AppUSer user2 =
//					new AppUSer("michael7",encoder.encode("123456"),"michael7@gmail.com");
//			user2.setAuthorities(roles2);
//			userRepo.save(user2);
//		};
//	}

}
