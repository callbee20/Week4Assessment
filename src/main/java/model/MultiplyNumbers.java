package model;

/**
 * @author Carson Allbee callbee
 *CIS175 - Fall 2021
 * Feb 9, 2022
 */
public class MultiplyNumbers {
	
	private int mult1;
	private int mult2;
	private int product;
	
	public MultiplyNumbers() {
		super();
	}
	
	public MultiplyNumbers(int mult1, int mult2) {
		this.mult1 = mult1;
		this.mult2 = mult2;
		product = mult1 * mult2;
	}

	/**
	 * @return the mult1
	 */
	public int getMult1() {
		return mult1;
	}

	/**
	 * @param mult1 the mult1 to set
	 */
	public void setMult1(int mult1) {
		this.mult1 = mult1;
	}

	/**
	 * @return the mult2
	 */
	public int getMult2() {
		return mult2;
	}

	/**
	 * @param mult2 the mult2 to set
	 */
	public void setMult2(int mult2) {
		this.mult2 = mult2;
	}

	/**
	 * @return the product
	 */
	public int getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(int product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "MultiplyNumbers [mult1=" + mult1 + ", mult2=" + mult2 + ", product=" + product + "]";
	}
	
	
	

}
