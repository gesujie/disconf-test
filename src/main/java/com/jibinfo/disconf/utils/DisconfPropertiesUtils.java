package com.jibinfo.disconf.utils;

import com.baidu.disconf.client.usertools.DisconfDataGetter;

import java.util.Map;

public class DisconfPropertiesUtils {
    /**
     * 获取配置文件属性
     * @param fullFileName   文件名
     * @param fileItem       key值
     * @return
     */
    public static String getPropertiesValue(String fullFileName,String fileItem ){
        Object value = DisconfDataGetter.getByFileItem(fullFileName,fileItem);
        if(null != value){
            return value.toString();
        }
        return null;

    }


    /**
     * 获取配置文件里的所有属性
     * @param fullFileName  文件名
     * @return
     */
    public static Map<String,Object> getProperties(String fullFileName){
        return DisconfDataGetter.getByFile(fullFileName);
    }


    /**
     * 获取配置文件属性值(有默认值)
     * @param fullFileName   文件名
     * @param fileItem       key值
     * @param defaultValue   默认值
     * @return
     */
    public static String getPropertiesValue(String fullFileName,String fileItem,String defaultValue){
        Object value = DisconfDataGetter.getByFileItem(fullFileName,fileItem);
        if(null != value){
            return value.toString();
        }
        return defaultValue;

    }

}
