package cn.eastseven.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;

//@Repository
public interface UserRolesRepository extends CrudRepository<UserRole, Long> {

    @Query("select a.role from UserRole a, User b where b.username=?1 and a.userId=b.userId")
    List<String> findRoleByUserName(String username);

}