package com.decker.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.decker.constants.Constants;
import com.decker.constants.Constants.COLOR;
import com.decker.constants.Constants.SYMBOL;

public class Deck {

	private List<Card> Cards = new ArrayList<Card>();

	public static int cardDealindex = 0;

	public List<Card> getCards() {
		return Cards;
	}

	public Card dealCard() {
		if (cardDealindex < this.Cards.size()) {
			return this.getCards().get(cardDealindex++);
		} else {
			cardDealindex = 0;
			populate();
			return this.getCards().get(cardDealindex);
		}
	}

	public void addCard(Card card) {
		this.Cards.add(card);
	}

	public void populate() {
		for (COLOR C : COLOR.values()) {
			for (SYMBOL E : SYMBOL.values()) {
				for (String cardVal : Constants.cardArr) {
					Card card = new Card();
					card.setSymbol(E.name());
					card.setValue(cardVal);
					card.setColor(C.name());
					this.Cards.add(card);
				}
			}
		}
	}

	public void print() {
		for (Card card : this.Cards) {
			System.out.println(card);
		}
	}

}
