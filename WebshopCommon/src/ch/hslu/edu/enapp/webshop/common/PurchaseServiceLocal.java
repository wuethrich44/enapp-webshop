package ch.hslu.edu.enapp.webshop.common;

import java.util.List;

import javax.ejb.Local;

import ch.hslu.edu.enapp.webshop.common.dto.PurchaseitemDTO;

@Local
public interface PurchaseServiceLocal {

    void order(List<PurchaseitemDTO> purchaseitemList);

}
