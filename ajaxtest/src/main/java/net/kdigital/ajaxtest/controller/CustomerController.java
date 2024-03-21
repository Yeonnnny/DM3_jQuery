package net.kdigital.ajaxtest.controller;

import java.util.List;

import org.springframework.stereotype.Controller;

import lombok.RequiredArgsConstructor;
import net.kdigital.ajaxtest.dto.CustomerDTO;
import net.kdigital.ajaxtest.service.CustomerService;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequiredArgsConstructor
public class CustomerController {

    public final CustomerService service;
    

    @PostMapping("/insert")
    @ResponseBody
    public CustomerDTO insert(@ModelAttribute CustomerDTO customerDTO) {
        
        CustomerDTO dto = service.insert(customerDTO);
        System.out.println(dto);
        return dto;
    }

    @GetMapping("/selectAll")
    @ResponseBody
    public List<CustomerDTO> selectAll() {
        List<CustomerDTO> dtoList = service.selectAll();
        return dtoList;
    }
    
    @GetMapping("/delete")
    @ResponseBody
    public boolean getMethodName(@RequestParam(name = "customerNum") Long customerNum) {
        return service.delete(customerNum);
    }
    
    
    

    
}