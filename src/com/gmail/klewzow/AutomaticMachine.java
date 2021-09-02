package com.gmail.klewzow;

import java.util.Queue;

public class AutomaticMachine {
	private int valueCola;
	private Queue<Piople> q;

	public AutomaticMachine(int valueCola, Queue<Piople> q) {
		super();
		this.valueCola = valueCola;
		this.q = q;
	}

	public Queue<Piople> processing() throws CloneNotSupportedException {

		for (int i = this.valueCola; i > 0; i--) {

			Piople tmp = this.q.poll();
			q.offer(tmp);

			q.offer((Piople) tmp.clone());

		}

		return this.q;

	}

	public void setValueCola(int valueCola) {
		this.valueCola = valueCola;
	}

}
