package com.qf.pojo;

import lombok.Data;

@Data
public class User {
    private Integer uid;
    private String tel;
    private String password;
    private String email;
    private String invitation;
}
