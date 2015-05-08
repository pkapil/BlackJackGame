package com.decker.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BlackJackHand {

	List<Card> cards = new ArrayList<Card>();

	public List<Card> getCards() {
		return cards;
	}

	public void addCard(Card card) {
		this.cards.add(card);
	}

	public boolean isBlackJack() {
		return getCardCount() == 21;
	}

	public boolean isBurst() {
		return getCardCount() > 21;
	}

	public boolean isEligibletoPlay() {
		return getCardCount() < 21;
	}

	public int getCardCount() {
		String[] valArr = { "A", "J", "Q", "K" };
		int count = 0;
		for (Card card : this.getCards()) {
			if (Arrays.asList(valArr).contains(card.getValue())) {
				switch (card.getValue()) {
				case "A":
					count += 11;
					break;
				default:
					count += 10;
					break;
				}
			} else {
				count += Integer.parseInt(card.getValue());
			}
		}
		return count;
	}

}
