package com.fictional.ibank.card.ccms.xmlmodel;

import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.URL;

/**
 * This class was generated by Apache CXF 3.1.4
 * 2015-11-14T18:16:58.794+08:00
 * Generated source version: 3.1.4
 *
 */
@WebServiceClient(name = "CardCustomerService",
                  wsdlLocation = "classpath:wsdl/CardCustomerService.wsdl",
                  targetNamespace = "http://services.cards.common.scb")
public class CardCustomerService_Service extends javax.xml.ws.Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://services.cards.common.scb", "CardCustomerService");
    public final static QName CardCustomerService = new QName("http://services.cards.common.scb", "CardCustomerService");
    public final static QName CardCustomerService0 = new QName("http://services.cards.common.scb", "CardCustomerService.0");
    static {
        URL url = null;
        WSDL_LOCATION = url;
    }

    public CardCustomerService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CardCustomerService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CardCustomerService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public CardCustomerService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CardCustomerService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CardCustomerService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns CardCustomerService
     */
    @WebEndpoint(name = "CardCustomerService")
    public CardCustomerService getCardCustomerService() {
        return super.getPort(CardCustomerService, CardCustomerService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CardCustomerService
     */
    @WebEndpoint(name = "CardCustomerService")
    public CardCustomerService getCardCustomerService(WebServiceFeature... features) {
        return super.getPort(CardCustomerService, CardCustomerService.class, features);
    }


    /**
     *
     * @return
     *     returns CardCustomerService
     */
    @WebEndpoint(name = "CardCustomerService.0")
    public CardCustomerService getCardCustomerService0() {
        return super.getPort(CardCustomerService0, CardCustomerService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CardCustomerService
     */
    @WebEndpoint(name = "CardCustomerService.0")
    public CardCustomerService getCardCustomerService0(WebServiceFeature... features) {
        return super.getPort(CardCustomerService0, CardCustomerService.class, features);
    }

}
