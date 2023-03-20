package net.bestjade.ty;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("net.bestjade.ty.mapper")
public class TomcatTyApplication {
    public static void main(String[] args) {
        SpringApplication.run(TomcatTyApplication.class,args);
    }
}
