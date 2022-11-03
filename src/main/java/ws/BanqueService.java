package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;


//POJO plain old java object

//banqueservice is webservice
@WebService(serviceName = "BanqueWs")
public class BanqueService {

    @WebMethod(operationName = "Convert")
    public double conversion(@WebParam(name = "montant") double mt)
    {
        return mt*10.5;
    }

    @WebMethod(operationName = "GetCompte")
    public Compte getCompte(@WebParam(name = "Code") int code)
    {
        return new Compte(code,Math.random()*9888,new Date());
    }

    @WebMethod(operationName = "ListeDesCompte")
    public List<Compte> listCompte()
    {
        return List.of(
                new Compte(1,Math.random()*9888,new Date()),
                new Compte(2,Math.random()*9888,new Date()),
                new Compte(3,Math.random()*9888,new Date())
        );
    }
}
