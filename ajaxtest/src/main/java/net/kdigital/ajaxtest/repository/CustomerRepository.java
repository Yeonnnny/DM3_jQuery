package net.kdigital.ajaxtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import net.kdigital.ajaxtest.entity.CustomerEntity;
// import org.springframework.stereotype.Repository;


// @Repository  //JpaRepository에 이미 이 애노테이션이 존재하고, 그걸 상속받으므로 굳이 쓸 이유가 없음
public interface CustomerRepository extends JpaRepository<CustomerEntity,Long>{

}
