package be.ordina.dsmrgenerator.controller;

import be.ordina.dsmrgenerator.service.P1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

@RequestMapping("/api/v1")
@RestController
public class Controller {
    private P1Service p1Service;

    @Autowired
    public Controller(P1Service p1Service) {
        this.p1Service = p1Service;
    }

    @GetMapping("/hello")
    public SseEmitter hello() {
        SseEmitter emitter = new SseEmitter();

        Thread thread = new Thread(() -> {
            try {
                while (true) {
                    emitter.send(p1Service.p1Simulator());
                    Thread.sleep(1000); // Send "Hello" every 1 second
                }
            } catch (Exception e) {
                emitter.complete();
            }
        });
        thread.start();

        return emitter;
    }


    @GetMapping("/simulator")
    public String p1Simulator() throws InterruptedException {
        return p1Service.p1Simulator();
    }
}
