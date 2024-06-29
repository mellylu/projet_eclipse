
package server_soap;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the server_soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _Exception_QNAME = new QName("http://server_soap/", "Exception");
    private static final QName _Compte_QNAME = new QName("http://server_soap/", "compte");
    private static final QName _CreateAccount_QNAME = new QName("http://server_soap/", "createAccount");
    private static final QName _CreateAccountResponse_QNAME = new QName("http://server_soap/", "createAccountResponse");
    private static final QName _DeleteAllAccounts_QNAME = new QName("http://server_soap/", "deleteAllAccounts");
    private static final QName _DeleteAllAccountsResponse_QNAME = new QName("http://server_soap/", "deleteAllAccountsResponse");
    private static final QName _DeleteCompte_QNAME = new QName("http://server_soap/", "deleteCompte");
    private static final QName _DeleteCompteResponse_QNAME = new QName("http://server_soap/", "deleteCompteResponse");
    private static final QName _GetCompte_QNAME = new QName("http://server_soap/", "getCompte");
    private static final QName _GetCompteResponse_QNAME = new QName("http://server_soap/", "getCompteResponse");
    private static final QName _GetComptes_QNAME = new QName("http://server_soap/", "getComptes");
    private static final QName _GetComptesResponse_QNAME = new QName("http://server_soap/", "getComptesResponse");
    private static final QName _GetSolde_QNAME = new QName("http://server_soap/", "getSolde");
    private static final QName _GetSoldeResponse_QNAME = new QName("http://server_soap/", "getSoldeResponse");
    private static final QName _UpdateCompte_QNAME = new QName("http://server_soap/", "updateCompte");
    private static final QName _UpdateCompteResponse_QNAME = new QName("http://server_soap/", "updateCompteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: server_soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Exception }
     * 
     * @return
     *     the new instance of {@link Exception }
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     * @return
     *     the new instance of {@link Compte }
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link CreateAccount }
     * 
     * @return
     *     the new instance of {@link CreateAccount }
     */
    public CreateAccount createCreateAccount() {
        return new CreateAccount();
    }

    /**
     * Create an instance of {@link CreateAccountResponse }
     * 
     * @return
     *     the new instance of {@link CreateAccountResponse }
     */
    public CreateAccountResponse createCreateAccountResponse() {
        return new CreateAccountResponse();
    }

    /**
     * Create an instance of {@link DeleteAllAccounts }
     * 
     * @return
     *     the new instance of {@link DeleteAllAccounts }
     */
    public DeleteAllAccounts createDeleteAllAccounts() {
        return new DeleteAllAccounts();
    }

    /**
     * Create an instance of {@link DeleteAllAccountsResponse }
     * 
     * @return
     *     the new instance of {@link DeleteAllAccountsResponse }
     */
    public DeleteAllAccountsResponse createDeleteAllAccountsResponse() {
        return new DeleteAllAccountsResponse();
    }

    /**
     * Create an instance of {@link DeleteCompte }
     * 
     * @return
     *     the new instance of {@link DeleteCompte }
     */
    public DeleteCompte createDeleteCompte() {
        return new DeleteCompte();
    }

    /**
     * Create an instance of {@link DeleteCompteResponse }
     * 
     * @return
     *     the new instance of {@link DeleteCompteResponse }
     */
    public DeleteCompteResponse createDeleteCompteResponse() {
        return new DeleteCompteResponse();
    }

    /**
     * Create an instance of {@link GetCompte }
     * 
     * @return
     *     the new instance of {@link GetCompte }
     */
    public GetCompte createGetCompte() {
        return new GetCompte();
    }

    /**
     * Create an instance of {@link GetCompteResponse }
     * 
     * @return
     *     the new instance of {@link GetCompteResponse }
     */
    public GetCompteResponse createGetCompteResponse() {
        return new GetCompteResponse();
    }

    /**
     * Create an instance of {@link GetComptes }
     * 
     * @return
     *     the new instance of {@link GetComptes }
     */
    public GetComptes createGetComptes() {
        return new GetComptes();
    }

    /**
     * Create an instance of {@link GetComptesResponse }
     * 
     * @return
     *     the new instance of {@link GetComptesResponse }
     */
    public GetComptesResponse createGetComptesResponse() {
        return new GetComptesResponse();
    }

    /**
     * Create an instance of {@link GetSolde }
     * 
     * @return
     *     the new instance of {@link GetSolde }
     */
    public GetSolde createGetSolde() {
        return new GetSolde();
    }

    /**
     * Create an instance of {@link GetSoldeResponse }
     * 
     * @return
     *     the new instance of {@link GetSoldeResponse }
     */
    public GetSoldeResponse createGetSoldeResponse() {
        return new GetSoldeResponse();
    }

    /**
     * Create an instance of {@link UpdateCompte }
     * 
     * @return
     *     the new instance of {@link UpdateCompte }
     */
    public UpdateCompte createUpdateCompte() {
        return new UpdateCompte();
    }

    /**
     * Create an instance of {@link UpdateCompteResponse }
     * 
     * @return
     *     the new instance of {@link UpdateCompteResponse }
     */
    public UpdateCompteResponse createUpdateCompteResponse() {
        return new UpdateCompteResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     */
    @XmlElementDecl(namespace = "http://server_soap/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Compte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Compte }{@code >}
     */
    @XmlElementDecl(namespace = "http://server_soap/", name = "compte")
    public JAXBElement<Compte> createCompte(Compte value) {
        return new JAXBElement<>(_Compte_QNAME, Compte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAccount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateAccount }{@code >}
     */
    @XmlElementDecl(namespace = "http://server_soap/", name = "createAccount")
    public JAXBElement<CreateAccount> createCreateAccount(CreateAccount value) {
        return new JAXBElement<>(_CreateAccount_QNAME, CreateAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAccountResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateAccountResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server_soap/", name = "createAccountResponse")
    public JAXBElement<CreateAccountResponse> createCreateAccountResponse(CreateAccountResponse value) {
        return new JAXBElement<>(_CreateAccountResponse_QNAME, CreateAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAllAccounts }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteAllAccounts }{@code >}
     */
    @XmlElementDecl(namespace = "http://server_soap/", name = "deleteAllAccounts")
    public JAXBElement<DeleteAllAccounts> createDeleteAllAccounts(DeleteAllAccounts value) {
        return new JAXBElement<>(_DeleteAllAccounts_QNAME, DeleteAllAccounts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAllAccountsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteAllAccountsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server_soap/", name = "deleteAllAccountsResponse")
    public JAXBElement<DeleteAllAccountsResponse> createDeleteAllAccountsResponse(DeleteAllAccountsResponse value) {
        return new JAXBElement<>(_DeleteAllAccountsResponse_QNAME, DeleteAllAccountsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteCompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://server_soap/", name = "deleteCompte")
    public JAXBElement<DeleteCompte> createDeleteCompte(DeleteCompte value) {
        return new JAXBElement<>(_DeleteCompte_QNAME, DeleteCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteCompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server_soap/", name = "deleteCompteResponse")
    public JAXBElement<DeleteCompteResponse> createDeleteCompteResponse(DeleteCompteResponse value) {
        return new JAXBElement<>(_DeleteCompteResponse_QNAME, DeleteCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://server_soap/", name = "getCompte")
    public JAXBElement<GetCompte> createGetCompte(GetCompte value) {
        return new JAXBElement<>(_GetCompte_QNAME, GetCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server_soap/", name = "getCompteResponse")
    public JAXBElement<GetCompteResponse> createGetCompteResponse(GetCompteResponse value) {
        return new JAXBElement<>(_GetCompteResponse_QNAME, GetCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComptes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetComptes }{@code >}
     */
    @XmlElementDecl(namespace = "http://server_soap/", name = "getComptes")
    public JAXBElement<GetComptes> createGetComptes(GetComptes value) {
        return new JAXBElement<>(_GetComptes_QNAME, GetComptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComptesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetComptesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server_soap/", name = "getComptesResponse")
    public JAXBElement<GetComptesResponse> createGetComptesResponse(GetComptesResponse value) {
        return new JAXBElement<>(_GetComptesResponse_QNAME, GetComptesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSolde }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSolde }{@code >}
     */
    @XmlElementDecl(namespace = "http://server_soap/", name = "getSolde")
    public JAXBElement<GetSolde> createGetSolde(GetSolde value) {
        return new JAXBElement<>(_GetSolde_QNAME, GetSolde.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSoldeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSoldeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server_soap/", name = "getSoldeResponse")
    public JAXBElement<GetSoldeResponse> createGetSoldeResponse(GetSoldeResponse value) {
        return new JAXBElement<>(_GetSoldeResponse_QNAME, GetSoldeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateCompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://server_soap/", name = "updateCompte")
    public JAXBElement<UpdateCompte> createUpdateCompte(UpdateCompte value) {
        return new JAXBElement<>(_UpdateCompte_QNAME, UpdateCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateCompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server_soap/", name = "updateCompteResponse")
    public JAXBElement<UpdateCompteResponse> createUpdateCompteResponse(UpdateCompteResponse value) {
        return new JAXBElement<>(_UpdateCompteResponse_QNAME, UpdateCompteResponse.class, null, value);
    }

}
