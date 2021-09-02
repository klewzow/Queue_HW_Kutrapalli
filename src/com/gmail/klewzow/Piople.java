package com.gmail.klewzow;

public class Piople implements Cloneable {
	private String name;

	public Piople(String name) {
		super();
		this.name = name;
	}

	public Piople() {
		super();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return new Piople(this.getName());
	}

}
