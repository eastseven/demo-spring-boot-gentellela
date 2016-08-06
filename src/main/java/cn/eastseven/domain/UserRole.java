package cn.eastseven.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "t_user_roles")
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_role_id")
    private Long userRoleId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "role")
    private String role;

}
