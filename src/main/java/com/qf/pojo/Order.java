package com.qf.pojo;

import lombok.Data;

@Data
public class Order {
    private Integer oid;
    private Integer cid;
    private Integer uid;
    private Integer getid;
    private Integer backid;
    private double  oprice;
    private String status;

}
