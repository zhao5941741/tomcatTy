package net.bestjade.ty.web;

import net.bestjade.ty.entity.Test;
import net.bestjade.ty.service.TestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("test")
public class TestController {
    @Resource
    private TestService testService;


    @PostMapping("save")
    private ResponseEntity<Test> save(@RequestBody Test test) {
        boolean b = testService.save(test);
        return ResponseEntity.ok(test);
    }
}
