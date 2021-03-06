/**
 * 
 */
package exceptions;

import java.io.Serializable;

import pokerBase.Deck;
import pokerEnums.eDeckExceptionType;
import pokerEnums.eHandExceptionType;

/**
 * @author Bert.Gibbons
 *
 */
public class DeckException extends Exception implements Serializable  {

	private Deck d;
	private eDeckExceptionType eT;

	public DeckException(Deck d, eDeckExceptionType eT) {
		super();
		this.d = d;
		this.eT = eT;
	}

	public Deck getD() {
		return d;
	}

	public eDeckExceptionType geteT() {
		return eT;
	}
	
	
	
}
