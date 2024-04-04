package ql.vn.qlsp.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user")
@Data
public class UserEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @Column(name = "username")
    private String userName;
    @Column(name = "password")
    private String passWord;
    private String sdt;
    private int role;
    @Column(name = "create_time")
    private Date createTime;
    private String gmail;

}
