package net.kdigital.ajaxtest.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import net.kdigital.ajaxtest.dto.CustomerDTO;




@Controller
public class AjaxController {

    @GetMapping("/ajaxForm1")
    public String ajaxForm1() {
        return "ajaxForm1";
    }

    @GetMapping("/ajaxReq1")
    @ResponseBody   // 함수의 반환타입 String : 데이터를 의미함. 화면에 대한 정보가 아니라! -> 요청한 곳으로 데이터 다시 반환!!
    public String ajaxReq1() { 
        System.out.println("도착");
        return "안녕!";
    }

    @PostMapping("/ajaxReq2")
    @ResponseBody   // 함수의 반환타입 String : 데이터를 의미함. 화면에 대한 정보가 아니라! -> 요청한 곳으로 데이터 다시 반환!!
    public String ajaxReq2(@RequestParam(name = "username") String username,
                            @RequestParam(name = "email") String email) { 
        System.out.println(username+", "+email);
        return "success";
    }

    @PostMapping("/ajaxReq3")
    @ResponseBody   
    public Map<String,String> ajaxReq3(@RequestParam Map<String, String> map) { // 반환하고자 하는 데이터의 타입을 써주면 됨
        System.out.println(map);
        return map;
    } 

    @GetMapping("/ajaxReq4")
    @ResponseBody   
    public List<CustomerDTO> ajaxReq4() { 
        List<CustomerDTO> list = Arrays.asList(new CustomerDTO(1l,"홍길동", "hong@naver.com"),
                                                new CustomerDTO(2l,"손오공", "son@naver.com"),
                                                new CustomerDTO(3l,"김범수", "kim@naver.com"),
                                                new CustomerDTO(4l,"이재익", "lee@naver.com"),
                                                new CustomerDTO(5l,"박명수", "park@naver.com"));
        return list;
    }
    
    
    
}
