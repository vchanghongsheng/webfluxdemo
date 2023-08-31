package com.example.webfluxdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: webfluxdemo
 * @description:
 * @author: hons.chang
 * @since: 2023-07-06 08:36
 **/
@RestController
@RequestMapping("/demo")
public class DemoContorller {

//    @GetMapping(value = "/flux-stream")
//    public Mono<String> fluxStream(@RequestParam("name") String name) throws InterruptedException {
//        System.out.println("name = " + name);
//        Thread.sleep(10000);
//        return Mono.just(name);
//    }
//
//
//    @GetMapping(value = "/test1")
//    public Mono<Void> test1(@RequestParam("name") String name) throws InterruptedException {
//        System.out.println("test1 name = " + name);
//        return Mono.empty();
//    }


//    @GetMapping(value = "/pre")
//    public Mono<RespVO<TokenVO>> pre(@RequestParam("name") String name) throws InterruptedException {
//        long currentTimeMillis = System.currentTimeMillis();
//        //转换成yyyy-MM-dd HH:mm:ss格式的字符串
//        String time = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date(currentTimeMillis));
//        System.out.println("pre name = " + name + "===" + time);
//        TokenVO tokenVO = new TokenVO();
//        tokenVO.setAccessToken(name);
//        return Mono.just(RespVO.success(tokenVO));
//    }
//
//    @PostMapping(value = "/post")
//    public Mono<String> post(ReqVO reqVO) throws InterruptedException {
//        System.out.println("post name = " + reqVO.getName());
//        return Mono.just(reqVO.getName());
//    }
//
//
//    @GetMapping(value = "/sla")
//    public Mono<String> sla(@RequestParam("name") String name) {
//        long currentTimeMillis = System.currentTimeMillis();
//        //转换成yyyy-MM-dd HH:mm:ss格式的字符串
//        String time = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date(currentTimeMillis));
//        System.out.println(name + ":" + time);
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        return Mono.just(name);
//    }
//
//
//    @GetMapping(value = "/error")
//    public Mono<String> error(@RequestParam("name") String name) {
//        long currentTimeMillis = System.currentTimeMillis();
//        String time = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date(currentTimeMillis));
//        System.out.println("error name = " + name + ":" + time);
//        return Mono.just(name);
//    }
//
//
//    public static void main(String[] args) {
//        //帮我写一个逻辑,如果是master或者小于1.0的版本全部执行,如果不是,就只执行小于等于当前版本号的脚本
//
//
//    }


//    @GetMapping(value = "/demo1")
//    public Mono<Integer> demo1() throws InterruptedException {
//        Demo1 demo1 = new Demo1();
//        demo1.get();
//        return Mono.just(demo1.count);
//    }
//
//
//    @GetMapping(value = "/demo2")
//    public Mono<Integer> demo2() throws InterruptedException {
//        Demo2 demo2 = new Demo2();
//        demo2.get();
//        return Mono.just(demo2.count);
//    }
}
