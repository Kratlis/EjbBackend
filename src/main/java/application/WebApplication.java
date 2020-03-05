package application;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.io.Serializable;

@ApplicationPath("/api")
public class WebApplication extends Application implements Serializable {
}
