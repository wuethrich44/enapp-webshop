//
// Generated By:JAX-WS RI IBM 2.2.1-07/09/2014 01:53 PM(foreman)- (JAXB RI IBM 2.2.3-07/07/2014 12:56 PM(foreman)-)
//


package ch.hslu.edu.enapp.webshop.webservice;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "Item_Port", targetNamespace = "urn:microsoft-dynamics-schemas/page/item")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ItemPort {


    /**
     * 
     * @param no
     * @return
     *     returns ch.hslu.edu.enapp.webshop.webservice.Item
     */
    @WebMethod(operationName = "Read", action = "urn:microsoft-dynamics-schemas/page/item:Read")
    @WebResult(name = "Item", targetNamespace = "urn:microsoft-dynamics-schemas/page/item")
    @RequestWrapper(localName = "Read", targetNamespace = "urn:microsoft-dynamics-schemas/page/item", className = "ch.hslu.edu.enapp.webshop.webservice.Read")
    @ResponseWrapper(localName = "Read_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/item", className = "ch.hslu.edu.enapp.webshop.webservice.ReadResult")
    @Action(input = "urn:microsoft-dynamics-schemas/page/item:Read", output = "urn:microsoft-dynamics-schemas/page/item:Item_Port:ReadResponse")
    public Item read(
        @WebParam(name = "No", targetNamespace = "urn:microsoft-dynamics-schemas/page/item")
        String no);

    /**
     * 
     * @param setSize
     * @param bookmarkKey
     * @param filter
     * @return
     *     returns ch.hslu.edu.enapp.webshop.webservice.ItemList
     */
    @WebMethod(operationName = "ReadMultiple", action = "urn:microsoft-dynamics-schemas/page/item:ReadMultiple")
    @WebResult(name = "ReadMultiple_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/item")
    @RequestWrapper(localName = "ReadMultiple", targetNamespace = "urn:microsoft-dynamics-schemas/page/item", className = "ch.hslu.edu.enapp.webshop.webservice.ReadMultiple")
    @ResponseWrapper(localName = "ReadMultiple_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/item", className = "ch.hslu.edu.enapp.webshop.webservice.ReadMultipleResult")
    @Action(input = "urn:microsoft-dynamics-schemas/page/item:ReadMultiple", output = "urn:microsoft-dynamics-schemas/page/item:Item_Port:ReadMultipleResponse")
    public ItemList readMultiple(
        @WebParam(name = "filter", targetNamespace = "urn:microsoft-dynamics-schemas/page/item")
        List<ItemFilter> filter,
        @WebParam(name = "bookmarkKey", targetNamespace = "urn:microsoft-dynamics-schemas/page/item")
        String bookmarkKey,
        @WebParam(name = "setSize", targetNamespace = "urn:microsoft-dynamics-schemas/page/item")
        int setSize);

    /**
     * 
     * @param key
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "IsUpdated", action = "urn:microsoft-dynamics-schemas/page/item:IsUpdated")
    @WebResult(name = "IsUpdated_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/item")
    @RequestWrapper(localName = "IsUpdated", targetNamespace = "urn:microsoft-dynamics-schemas/page/item", className = "ch.hslu.edu.enapp.webshop.webservice.IsUpdated")
    @ResponseWrapper(localName = "IsUpdated_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/item", className = "ch.hslu.edu.enapp.webshop.webservice.IsUpdatedResult")
    @Action(input = "urn:microsoft-dynamics-schemas/page/item:IsUpdated", output = "urn:microsoft-dynamics-schemas/page/item:Item_Port:IsUpdatedResponse")
    public boolean isUpdated(
        @WebParam(name = "Key", targetNamespace = "urn:microsoft-dynamics-schemas/page/item")
        String key);

    /**
     * 
     * @param item
     */
    @WebMethod(operationName = "Create", action = "urn:microsoft-dynamics-schemas/page/item:Create")
    @RequestWrapper(localName = "Create", targetNamespace = "urn:microsoft-dynamics-schemas/page/item", className = "ch.hslu.edu.enapp.webshop.webservice.Create")
    @ResponseWrapper(localName = "Create_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/item", className = "ch.hslu.edu.enapp.webshop.webservice.CreateResult")
    @Action(input = "urn:microsoft-dynamics-schemas/page/item:Create", output = "urn:microsoft-dynamics-schemas/page/item:Item_Port:CreateResponse")
    public void create(
        @WebParam(name = "Item", targetNamespace = "urn:microsoft-dynamics-schemas/page/item", mode = WebParam.Mode.INOUT)
        Holder<Item> item);

    /**
     * 
     * @param itemList
     */
    @WebMethod(operationName = "CreateMultiple", action = "urn:microsoft-dynamics-schemas/page/item:CreateMultiple")
    @RequestWrapper(localName = "CreateMultiple", targetNamespace = "urn:microsoft-dynamics-schemas/page/item", className = "ch.hslu.edu.enapp.webshop.webservice.CreateMultiple")
    @ResponseWrapper(localName = "CreateMultiple_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/item", className = "ch.hslu.edu.enapp.webshop.webservice.CreateMultipleResult")
    @Action(input = "urn:microsoft-dynamics-schemas/page/item:CreateMultiple", output = "urn:microsoft-dynamics-schemas/page/item:Item_Port:CreateMultipleResponse")
    public void createMultiple(
        @WebParam(name = "Item_List", targetNamespace = "urn:microsoft-dynamics-schemas/page/item", mode = WebParam.Mode.INOUT)
        Holder<ItemList> itemList);

    /**
     * 
     * @param item
     */
    @WebMethod(operationName = "Update", action = "urn:microsoft-dynamics-schemas/page/item:Update")
    @RequestWrapper(localName = "Update", targetNamespace = "urn:microsoft-dynamics-schemas/page/item", className = "ch.hslu.edu.enapp.webshop.webservice.Update")
    @ResponseWrapper(localName = "Update_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/item", className = "ch.hslu.edu.enapp.webshop.webservice.UpdateResult")
    @Action(input = "urn:microsoft-dynamics-schemas/page/item:Update", output = "urn:microsoft-dynamics-schemas/page/item:Item_Port:UpdateResponse")
    public void update(
        @WebParam(name = "Item", targetNamespace = "urn:microsoft-dynamics-schemas/page/item", mode = WebParam.Mode.INOUT)
        Holder<Item> item);

    /**
     * 
     * @param itemList
     */
    @WebMethod(operationName = "UpdateMultiple", action = "urn:microsoft-dynamics-schemas/page/item:UpdateMultiple")
    @RequestWrapper(localName = "UpdateMultiple", targetNamespace = "urn:microsoft-dynamics-schemas/page/item", className = "ch.hslu.edu.enapp.webshop.webservice.UpdateMultiple")
    @ResponseWrapper(localName = "UpdateMultiple_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/item", className = "ch.hslu.edu.enapp.webshop.webservice.UpdateMultipleResult")
    @Action(input = "urn:microsoft-dynamics-schemas/page/item:UpdateMultiple", output = "urn:microsoft-dynamics-schemas/page/item:Item_Port:UpdateMultipleResponse")
    public void updateMultiple(
        @WebParam(name = "Item_List", targetNamespace = "urn:microsoft-dynamics-schemas/page/item", mode = WebParam.Mode.INOUT)
        Holder<ItemList> itemList);

    /**
     * 
     * @param key
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "Delete", action = "urn:microsoft-dynamics-schemas/page/item:Delete")
    @WebResult(name = "Delete_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/item")
    @RequestWrapper(localName = "Delete", targetNamespace = "urn:microsoft-dynamics-schemas/page/item", className = "ch.hslu.edu.enapp.webshop.webservice.Delete")
    @ResponseWrapper(localName = "Delete_Result", targetNamespace = "urn:microsoft-dynamics-schemas/page/item", className = "ch.hslu.edu.enapp.webshop.webservice.DeleteResult")
    @Action(input = "urn:microsoft-dynamics-schemas/page/item:Delete", output = "urn:microsoft-dynamics-schemas/page/item:Item_Port:DeleteResponse")
    public boolean delete(
        @WebParam(name = "Key", targetNamespace = "urn:microsoft-dynamics-schemas/page/item")
        String key);

}
