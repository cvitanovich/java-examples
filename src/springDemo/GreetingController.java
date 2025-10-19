package springDemo;


import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    @PostMapping("/greet")
    public String greet(@RequestBody GreetingRequest request) {
        return "Hello, " + request.getName() + "!";
    }
}