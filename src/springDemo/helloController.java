package springDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class helloController {
 
    @GetMapping("/")
    public String sayHello() {
        return "Hello, World! <br>" +
                "This is our first message — a simple one, but classic:";
    }
 
}