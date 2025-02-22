
package server_soap;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.FaultAction;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BanqueWS", targetNamespace = "http://server_soap/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueWS {


    /**
     * 
     * @param montant
     * @return
     *     returns long
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createAccount", targetNamespace = "http://server_soap/", className = "server_soap.CreateAccount")
    @ResponseWrapper(localName = "createAccountResponse", targetNamespace = "http://server_soap/", className = "server_soap.CreateAccountResponse")
    @Action(input = "http://server_soap/BanqueWS/createAccountRequest", output = "http://server_soap/BanqueWS/createAccountResponse")
    public long createAccount(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

    /**
     * 
     * @throws Exception_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "deleteAllAccounts", targetNamespace = "http://server_soap/", className = "server_soap.DeleteAllAccounts")
    @ResponseWrapper(localName = "deleteAllAccountsResponse", targetNamespace = "http://server_soap/", className = "server_soap.DeleteAllAccountsResponse")
    @Action(input = "http://server_soap/BanqueWS/deleteAllAccountsRequest", output = "http://server_soap/BanqueWS/deleteAllAccountsResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://server_soap/BanqueWS/deleteAllAccounts/Fault/Exception")
    })
    public void deleteAllAccounts()
        throws Exception_Exception
    ;

    /**
     * 
     * @param code
     * @param solde
     * @throws Exception_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "updateCompte", targetNamespace = "http://server_soap/", className = "server_soap.UpdateCompte")
    @ResponseWrapper(localName = "updateCompteResponse", targetNamespace = "http://server_soap/", className = "server_soap.UpdateCompteResponse")
    @Action(input = "http://server_soap/BanqueWS/updateCompteRequest", output = "http://server_soap/BanqueWS/updateCompteResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://server_soap/BanqueWS/updateCompte/Fault/Exception")
    })
    public void updateCompte(
        @WebParam(name = "code", targetNamespace = "")
        long code,
        @WebParam(name = "solde", targetNamespace = "")
        double solde)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSolde", targetNamespace = "http://server_soap/", className = "server_soap.GetSolde")
    @ResponseWrapper(localName = "getSoldeResponse", targetNamespace = "http://server_soap/", className = "server_soap.GetSoldeResponse")
    @Action(input = "http://server_soap/BanqueWS/getSoldeRequest", output = "http://server_soap/BanqueWS/getSoldeResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://server_soap/BanqueWS/getSolde/Fault/Exception")
    })
    public double getSolde(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns server_soap.Compte
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompte", targetNamespace = "http://server_soap/", className = "server_soap.GetCompte")
    @ResponseWrapper(localName = "getCompteResponse", targetNamespace = "http://server_soap/", className = "server_soap.GetCompteResponse")
    @Action(input = "http://server_soap/BanqueWS/getCompteRequest", output = "http://server_soap/BanqueWS/getCompteResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://server_soap/BanqueWS/getCompte/Fault/Exception")
    })
    public Compte getCompte(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0)
        throws Exception_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List<server_soap.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getComptes", targetNamespace = "http://server_soap/", className = "server_soap.GetComptes")
    @ResponseWrapper(localName = "getComptesResponse", targetNamespace = "http://server_soap/", className = "server_soap.GetComptesResponse")
    @Action(input = "http://server_soap/BanqueWS/getComptesRequest", output = "http://server_soap/BanqueWS/getComptesResponse")
    public List<Compte> getComptes();

    /**
     * 
     * @param code
     * @throws Exception_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "deleteCompte", targetNamespace = "http://server_soap/", className = "server_soap.DeleteCompte")
    @ResponseWrapper(localName = "deleteCompteResponse", targetNamespace = "http://server_soap/", className = "server_soap.DeleteCompteResponse")
    @Action(input = "http://server_soap/BanqueWS/deleteCompteRequest", output = "http://server_soap/BanqueWS/deleteCompteResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://server_soap/BanqueWS/deleteCompte/Fault/Exception")
    })
    public void deleteCompte(
        @WebParam(name = "code", targetNamespace = "")
        long code)
        throws Exception_Exception
    ;

}
