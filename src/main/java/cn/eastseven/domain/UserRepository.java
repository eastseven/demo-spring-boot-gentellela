package cn.eastseven.domain;

import org.springframework.data.repository.CrudRepository;

//@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
}