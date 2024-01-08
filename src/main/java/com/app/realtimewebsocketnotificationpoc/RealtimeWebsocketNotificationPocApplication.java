package com.app.realtimewebsocketnotificationpoc;

import com.app.realtimewebsocketnotificationpoc.model.Account;
import com.app.realtimewebsocketnotificationpoc.model.enums.Role;
import com.app.realtimewebsocketnotificationpoc.repository.AccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Set;

@SpringBootApplication
public class RealtimeWebsocketNotificationPocApplication implements CommandLineRunner {

	private final PasswordEncoder passwordEncoder;
	private final AccountRepository accountRepository;

    public RealtimeWebsocketNotificationPocApplication(PasswordEncoder passwordEncoder,
													   AccountRepository accountRepository) {
        this.passwordEncoder = passwordEncoder;
        this.accountRepository = accountRepository;
    }

    public static void main(String[] args) {
		SpringApplication.run(RealtimeWebsocketNotificationPocApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Account admin = new Account();
		admin.setFirstName("Mr. Admin");
		admin.setLastName("1");
		admin.setUsername("admin1");
		admin.setEmail("admin1@realtimenotificationpoc.com");
		admin.setPassword(passwordEncoder.encode("admin1"));
		admin.setRoles(Set.of(Role.ADMIN));
		accountRepository.save(admin);
	}

}
