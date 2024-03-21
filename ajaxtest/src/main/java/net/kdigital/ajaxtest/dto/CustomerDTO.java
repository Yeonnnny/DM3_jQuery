package net.kdigital.ajaxtest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import net.kdigital.ajaxtest.entity.CustomerEntity;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class CustomerDTO {
    private Long customerNum;
    private String username;
    private String email;


    public static CustomerDTO toDTO(CustomerEntity customerEntity) {
        return CustomerDTO.builder()
                .customerNum(customerEntity.getCustomerNum())
                .email(customerEntity.getEmail())
                .username(customerEntity.getUsername())
                .build();
    }

}
