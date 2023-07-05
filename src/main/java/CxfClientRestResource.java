import io.quarkiverse.cxf.annotation.CXFClient;
import jakarta.enterprise.inject.Produces;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/cxf/calculator-client")
public class CxfClientRestResource {

    @CXFClient("myCalculator") 
    org.tempuri.CalculatorSoap myCalculator;

    @GET
    @Path("/add")   
    public int add(@QueryParam("a") int a, @QueryParam("b") int b) { 
        return myCalculator.add(a, b); 
    }

    @GET
    @Path("/divide")
    public int divide(@QueryParam("a") int a, @QueryParam("b") int b) {
        return myCalculator.divide(a, b); 
    }

    @GET
    @Path("/multiply")
    public int multiply(@QueryParam("a") int a, @QueryParam("b") int b) {
        return myCalculator.multiply(a, b); 
    }

}
