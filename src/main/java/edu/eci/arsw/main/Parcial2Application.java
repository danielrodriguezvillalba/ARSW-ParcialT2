
import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.arsw.connection.HttpConnectionService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"edu.eci.arsw"})
public class Parcial2Application {
	public static void main(String[] args) throws UnirestException {
		SpringApplication.run(Parcial2Application.class,args);

	}

}


