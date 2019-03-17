package com.xworkz.springjdbc.dto;

public class ZooDTO {
	private String animalType;
	private int quantity;
	private int shellNo;
	private boolean veg;
	
	public ZooDTO() {
		System.out.println("created.....\t" + this.getClass().getSimpleName());
	}

	public ZooDTO(String animalType, int quantity, int shellNo, boolean veg) {
		super();
		this.animalType = animalType;
		this.quantity = quantity;
		this.shellNo = shellNo;
		this.veg = veg;
	}

	public String getAnimalType() {
		return animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getShellNo() {
		return shellNo;
	}

	public void setShellNo(int shellNo) {
		this.shellNo = shellNo;
	}

	public boolean isVeg() {
		return veg;
	}

	public void setVeg(boolean veg) {
		this.veg = veg;
	}

	@Override
	public String toString() {
		return "ZooDTO [animalType=" + animalType + ", quantity=" + quantity + ", shellNo=" + shellNo + ", veg=" + veg
				+ "]";
	}

	
	
}
