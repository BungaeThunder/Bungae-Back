package bungae.thunder.cakey;

import bungae.thunder.cakey.repository.MemoryMessageRepository;
import bungae.thunder.cakey.repository.MemoryUserRepository;
import bungae.thunder.cakey.repository.MessageRepository;
import bungae.thunder.cakey.repository.UserRepository;
import bungae.thunder.cakey.service.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

@Configuration
public class SpringConfig {
    @Bean
    public UserRepository userRepository() {
        // 추후에 해당 부분은 PostgresqlUserRepository로 교체
        return new MemoryUserRepository();
    }

    @Bean
    public MessageRepository messageRepository() {
        // TODO: DB Repository
        return new MemoryMessageRepository(new HashMap<>());
    }

    @Bean
    public MessageService messageService() {
        return new MessageService(messageRepository());
    }
}
