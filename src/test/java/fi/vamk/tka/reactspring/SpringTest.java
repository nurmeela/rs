package fi.vamk.tka.reactspring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import fi.vamk.tka.reactspring.model.*;
@RunWith(SpringRunner.class)
@SpringBootTest
@Configuration
@ComponentScan(basePackages = {"fi.vamk.tka.reactspring"}) // are you sure you wanna scan all the packages?



@EnableJpaRepositories(basePackageClasses = UserRepository.class) // assuming you have all the spring data repo in the same package.
public class SpringTest{
    @Autowired
    
    private UserRepository repository;
    
    @Test
    public void addingUserTest(){
        
        
        User item = new User();
        item.setName("Tuomas");
        
        
        repository.save(item);
        
        

    }
}