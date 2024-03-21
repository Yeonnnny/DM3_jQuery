package net.kdigital.ajaxtest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import net.kdigital.ajaxtest.dto.CustomerDTO;
import net.kdigital.ajaxtest.entity.CustomerEntity;
import net.kdigital.ajaxtest.repository.CustomerRepository;

@Service
@RequiredArgsConstructor
public class CustomerService {
    
    public final CustomerRepository repository;  // DB 연결을 위한 단순 객체

    /**
     * 전달받은 DTO를 Entity로 변환하여 DB에 save한 후
     * save 완료된 객체를 다시 받아 반환
     * @param customerDTO
     * @return dto
     */
    public CustomerDTO insert(CustomerDTO customerDTO) {
        CustomerEntity entity = CustomerEntity.toEntity(customerDTO);
        return  CustomerDTO.toDTO(repository.save(entity));
    }


    /**
     * DB의 모든 객체를 dto리스트로 반환
     * @return dtoList
     */
    public List<CustomerDTO> selectAll() {
        List<CustomerEntity> entityList =  repository.findAll(Sort.by(Sort.Direction.DESC,"customerNum"));
        
        List<CustomerDTO> dtoList = new ArrayList<>();

        entityList.forEach((entity) -> {
            dtoList.add(CustomerDTO.toDTO(entity));
        });

        return dtoList;
    }


    /**
     * 전달받은 customerNum의 고객 정보를 삭제
     * @param customerNum
     */
    public boolean delete(Long customerNum) {
        repository.deleteById(customerNum);

        // 삭제가 안되면 true, 삭제가 되면 데이터가 없어졌으므로 false
        return !repository.existsById(customerNum);
    }



}
