package ch.hslu.edu.enapp.webshop.converter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import ch.hslu.edu.enapp.webshop.common.dto.PurchaseitemDTO;
import ch.hslu.edu.enapp.webshop.entity.Purchaseitem;

public class PurchaseitemConverter implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    ProductItemConverter productConverter;

    public Purchaseitem convertToEntity(PurchaseitemDTO dto) {
        Purchaseitem purchaseitem = new Purchaseitem();
        purchaseitem.setItemNo(dto.getProduct().getNo());
        purchaseitem.setPurchaseitemid(dto.getPurchaseitemid());
        purchaseitem.setQuantity(dto.getQuantity());
        purchaseitem.setUnitprice(dto.getTotalprice());
        return purchaseitem;
    }

    public PurchaseitemDTO convertToDto(Purchaseitem purchaseitem) {
        PurchaseitemDTO dto = new PurchaseitemDTO();
        dto.setItemNo(purchaseitem.getItemNo());
        dto.setPurchaseitemid(purchaseitem.getPurchaseitemid());
        dto.setQuantity(purchaseitem.getQuantity());
        dto.setTotalprice(purchaseitem.getUnitprice());
        return dto;
    }

    public List<Purchaseitem> convertListToEntity(List<PurchaseitemDTO> dtoList) {
        List<Purchaseitem> entityList = new ArrayList<>();

        for (PurchaseitemDTO dto : dtoList) {
            Purchaseitem entity = convertToEntity(dto);
            entityList.add(entity);
        }

        return entityList;
    }

    public List<PurchaseitemDTO> convertListToDto(List<Purchaseitem> entityList) {
        List<PurchaseitemDTO> dtoList = new ArrayList<>();

        for (Purchaseitem entity : entityList) {
            PurchaseitemDTO dto = convertToDto(entity);
            dtoList.add(dto);
        }

        return dtoList;
    }

}
