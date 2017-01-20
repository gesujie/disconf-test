package com.jibinfo.disconf.config;

import com.baidu.disconf.client.common.annotations.DisconfFile;
import com.baidu.disconf.client.common.annotations.DisconfFileItem;
import com.baidu.disconf.client.common.annotations.DisconfUpdateService;
import com.baidu.disconf.client.common.update.IDisconfUpdate;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 2017/1/18.
 */
@Service
@Scope("singleton")
@DisconfFile(filename = "test.properties")
@DisconfUpdateService(classes = {TestConfig.class})
@ToString
@Setter
public class TestConfig implements IDisconfUpdate{

    private String env;

    private String version;


    private String appName;

    @DisconfFileItem(name = "env", associateField = "env")
    public String getEnv() {
        return env;
    }

    @DisconfFileItem(name = "version", associateField = "version")
    public String getVersion() {
        return version;
    }


    @DisconfFileItem(name = "app.name", associateField = "appName")
    public String getAppName() {
        return appName;
    }

    @Override
    public void reload() throws Exception {
    }
}
