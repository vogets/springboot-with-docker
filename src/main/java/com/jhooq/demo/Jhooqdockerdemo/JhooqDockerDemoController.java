package com.jhooq.demo.Jhooqdockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.net.InetAddress;

@RestController
public class JhooqDockerDemoController {

    @GetMapping("/hello")
    public String hello() {
        String ip="";
         try {
            ip = InetAddress.getLocalHost().getHostAddress();
            System.out.printf("%s", ip);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "K8s Demo - Hello from: "+ip;
    }
}
