package ch.hslu.edu.enapp.webshop.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the PURCHASEITEM database table.
 * 
 */
@Entity
@NamedQueries({
        
	@NamedQuery(name = "getPurchaseitemByPurchaseBean", query = "SELECT p FROM Purchaseitem p WHERE p.purchaseBean.purchaseid = :purchaseBean_purchaseid"),
        
	@NamedQuery(name = "getPurchaseitemByProductBean", query = "SELECT p FROM Purchaseitem p WHERE p.productBean.productid = :productBean_productid"),
	@NamedQuery(name = "getPurchaseitemByUnitprice", query = "SELECT p FROM Purchaseitem p WHERE p.unitprice = :unitprice"),
	@NamedQuery(name = "getPurchaseitemByQuantity", query = "SELECT p FROM Purchaseitem p WHERE p.quantity = :quantity"),
	@NamedQuery(name = "getPurchaseitemByDescription", query = "SELECT p FROM Purchaseitem p WHERE p.description = :description"),
	@NamedQuery(name = "getPurchaseitemByPurchaseitemid", query = "SELECT p FROM Purchaseitem p WHERE p.purchaseitemid = :purchaseitemid"),
	@NamedQuery(name = "getPurchaseitem", query = "SELECT p FROM Purchaseitem p") 
})
public class Purchaseitem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int purchaseitemid;

	private String description;

	private int quantity;

	private BigDecimal unitprice;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="PRODUCT")
	private Product productBean;

	//bi-directional many-to-one association to Purchase
	@ManyToOne
	@JoinColumn(name="PURCHASE")
	private Purchase purchaseBean;

	public Purchaseitem() {
	}

	public int getPurchaseitemid() {
		return this.purchaseitemid;
	}

	public void setPurchaseitemid(int purchaseitemid) {
		this.purchaseitemid = purchaseitemid;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getUnitprice() {
		return this.unitprice;
	}

	public void setUnitprice(BigDecimal unitprice) {
		this.unitprice = unitprice;
	}

	public Product getProductBean() {
		return this.productBean;
	}

	public void setProductBean(Product productBean) {
		this.productBean = productBean;
	}

	public Purchase getPurchaseBean() {
		return this.purchaseBean;
	}

	public void setPurchaseBean(Purchase purchaseBean) {
		this.purchaseBean = purchaseBean;
	}

}