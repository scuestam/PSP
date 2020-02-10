package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

public class Read implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String dato(String mensaje) {
		String sdato = "";
		System.out.print(mensaje+" ");
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader flujoE = new BufferedReader (isr);
			sdato = flujoE.readLine();
		}
		catch (IOException e) {
			// TODO: handle exception
			System.err.println("Error: "+e.getMessage());
		}
		return sdato;
	}
	public int datoInt(String mensaje) {
		try {
			return Integer.parseInt(dato(mensaje));
		}
		catch (NumberFormatException e) {
			// TODO: handle exception
			return Integer.MIN_VALUE;
		}
	}
	public short datoShort(String mensaje) {
		try {
			return Short.parseShort(dato(mensaje));
		}catch (NumberFormatException e) {
			return Short.MIN_VALUE;
			
		}
	}
	public long datoLong(String mensaje) {
		try {
			return Long.parseLong(dato(mensaje));
		}catch(NumberFormatException e){
			return Long.MIN_VALUE;
		}
	}
	public  float datoFloat(String mensaje) {
		try {
			return Float.parseFloat(dato(mensaje));
		}catch(NumberFormatException e){
			return Float.NaN;
		}
	}
	public double datoDouble(String mensaje) {
		try {
			return Double.parseDouble(dato(mensaje));
		}catch(NumberFormatException e){
			return Double.MIN_VALUE;
		}
	}
	public Byte datoByte(String mensaje) {
		try {
			return Byte.parseByte(dato(mensaje));
		} catch (NumberFormatException e) {
			return Byte.MIN_VALUE;
		}
	}

}
