package ch.hslu.edu.enapp.webshop.jsf;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import ch.hslu.edu.enapp.webshop.common.ProdcutServiceLocal;
import ch.hslu.edu.enapp.webshop.common.dto.ProductDTO;

@Named
@SessionScoped
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    ProdcutServiceLocal productService;

    public List<ProductDTO> getProductList() {
        return productService.getAll();
    }

}
