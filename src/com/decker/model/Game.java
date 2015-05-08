package com.decker.model;

import java.util.Collections;
import java.util.Random;

public class Game {

	private Deck deck;

	public Game() {
		setUpDeck();

	}

	public Deck getDeck() {
		return deck;
	}

	public void setUpDeck() {
		this.deck = new Deck();
		deck.populate();
		long seed = System.nanoTime();
		Collections.shuffle(deck.getCards(), new Random(seed));
	}

}
