package UT4.apartado4_5;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ObtieneFichero implements Serializable {
	byte[] contenidoFichero;

	public ObtieneFichero(byte[] contenidoFichero) {
		this.contenidoFichero = contenidoFichero;
	}

	public byte[] getContenidoFichero() {
		return contenidoFichero;
	}
}
