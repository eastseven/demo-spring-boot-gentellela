package cn.eastseven.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import javax.persistence.*;

@Data
//@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "t_users")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "enabled")
    private int enabled;

    public User(User user) {
        if (user != null) {
            this.userId = user.getUserId();
            this.username = user.getUsername();
            this.password = user.getPassword();
            this.email = user.getEmail();
            this.enabled = user.getEnabled();
        }
    }

//    public User(Long userId, String username, String password, String email, int enabled) {
//        this.userId = userId;
//        this.username = username;
//        this.password = password;
//        this.email = email;
//        this.enabled = enabled;
//    }
//
//    public Long getUserId() {
//        return userId;
//    }
//
//    public void setUserId(Long userId) {
//        this.userId = userId;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public int getEnabled() {
//        return enabled;
//    }
//
//    public void setEnabled(int enabled) {
//        this.enabled = enabled;
//    }
}