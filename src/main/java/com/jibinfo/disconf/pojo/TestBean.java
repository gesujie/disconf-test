package com.jibinfo.disconf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.log4j.Log4j;

/**
 * Created by admin on 2017/1/18.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Log4j
public class TestBean {

    private Integer id;

    private String name;


    private String sex;


}
