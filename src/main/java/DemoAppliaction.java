/**
 * Created by admin on 2017/1/17.
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan(basePackages = {"com.jibinfo.disconf"})
@PropertySource({"classpath:application.properties"})
@ImportResource({"classpath:disconf.xml"})//引入disconf
public class DemoAppliaction {
    public static void main(String[] args) {
        SpringApplication.run(DemoAppliaction.class, args);
    }
}