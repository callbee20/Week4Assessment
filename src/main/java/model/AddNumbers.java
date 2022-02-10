package model;

/**
 * @author Carson Allbee callbee
 *CIS175 - Fall 2021
 * Feb 9, 2022
 */
public class AddNumbers {
	
	private int number1;
	private int number2;
	private int addedNumber;
	
	public AddNumbers() {
		super();
	}
	
	public AddNumbers(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
		addedNumber = number1 + number2;
	}

	/**
	 * @return the number1
	 */
	public int getNumber1() {
		return number1;
	}

	/**
	 * @param number1 the number1 to set
	 */
	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	/**
	 * @return the number2
	 */
	public int getNumber2() {
		return number2;
	}

	/**
	 * @param number2 the number2 to set
	 */
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	
	
	/**
	 * @return the addedNumber
	 */
	public int getAddedNumber() {
		return addedNumber;
	}

	/**
	 * @param addedNumber the addedNumber to set
	 */
	public void setAddedNumber(int addedNumber) {
		this.addedNumber = addedNumber;
	}

	@Override
	public String toString() {
		return "AddNumbers [number1=" + number1 + ", number2=" + number2 + ", addedNumber=" + addedNumber + "]";
	}
	
	


	
	
	

}
