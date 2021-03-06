package ch.hslu.edu.enapp.webshop.jsf;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;
import javax.inject.Named;

import ch.hslu.edu.enapp.webshop.common.CustomerServiceLocal;
import ch.hslu.edu.enapp.webshop.common.dto.AuthgroupDTO;
import ch.hslu.edu.enapp.webshop.common.dto.CustomerDTO;

@Named
@SessionScoped
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    CustomerServiceLocal customerService;

    public void logout(final ActionEvent event) throws IOException {
        final ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        externalContext.invalidateSession();
        externalContext.redirect(externalContext.getRequestContextPath()
                + "/ibm_security_logout?logoutExitPage=index.xhtml");
    }

    public List<CustomerDTO> getCustomers() {
        return customerService.getAllCustomers();
    }

    public boolean isInAdminGroup() {
        CustomerDTO currentCustomer = getCurrentCustomer();

        if (currentCustomer == null) {
            return false;
        }

        List<AuthgroupDTO> authgroups = currentCustomer.getAuthgroups();

        for (AuthgroupDTO authgroupDTO : authgroups) {
            if ("adminRole".equals(authgroupDTO.getGroupname())) {
                return true;
            }
        }

        return false;
    }

    public CustomerDTO getCurrentCustomer() {
        return customerService.getCurrentCustomer();
    }

    public void changeCustomer(CustomerDTO customerDTO) {
        customerService.updateCustomer(customerDTO);
    }

}
