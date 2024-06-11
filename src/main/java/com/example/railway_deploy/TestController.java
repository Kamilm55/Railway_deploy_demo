package com.example.railway_deploy;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/test")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class TestController {

    @GetMapping
    public String test()  {
        return "TEST WORKS SUCCESSFULLY!";
    }
}
