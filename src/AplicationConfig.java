import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;


@ApplicationPath("/rest")
public class AplicationConfig extends ResourceConfig { //klases pavadinima galima bet koki
    public AplicationConfig(){
        packages("rest");
    }
}
