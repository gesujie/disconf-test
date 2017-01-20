package com.jibinfo.disconf.app;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.log4j.Log4j;

/**
 * Created by admin on 2017/1/20.
 */
@Log4j
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class JavaBean {

    private  int id;

    private  String name;

    private  String sex;

    public static void main(String[] args) {
        JavaBean bean = new JavaBean();
        bean.setId(1);
    }

}
