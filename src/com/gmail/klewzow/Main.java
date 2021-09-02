package com.gmail.klewzow;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {

		Queue<Piople> q = new LinkedList<>(List.of(new Piople("Volovitc"), new Piople("Kutrapalli"),
				new Piople("Penny"), new Piople("Sheldon"), new Piople("Leonard")));
		for (Piople string : q) {
			System.out.println(string.getName());
		}
		System.out.println();

		try {
			q = new AutomaticMachine(2, q).processing();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		for (Piople string : q) {
			System.out.println(string.getName());
			;
		}

	}

}
