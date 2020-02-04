package com.cw.gmall.user;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.cw.gmall.user.mapper"})
public class GamllUserApplication {

    public static void main(String[] args) {
        SpringApplication.run( GamllUserApplication.class, args );
    }

}
