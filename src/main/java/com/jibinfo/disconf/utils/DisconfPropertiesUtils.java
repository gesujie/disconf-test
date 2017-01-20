package com.jibinfo.disconf.utils;

import com.baidu.disconf.client.usertools.DisconfDataGetter;

import java.util.Map;

public class DisconfPropertiesUtils {
    /**
     * @param fullFileName
     * @param fileItem
     * @return
     */
    public static String getPropertiesValue(String fullFileName,String fileItem){
        Object value = DisconfDataGetter.getByFileItem(fullFileName,fileItem);
        if(null != value){
            return value.toString();
        }
        return null;

    }



    public static Map<String,Object> getProperties(String fullFileName){
        return DisconfDataGetter.getByFile(fullFileName);
    }



    public static String getPropertiesValue(String fullFileName,String fileItem,String defaultValue){
        Object value = DisconfDataGetter.getByFileItem(fullFileName,fileItem);
        if(null != value){
            return value.toString();
        }
        return defaultValue;

    }

}
