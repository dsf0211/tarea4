package cuentas;
/**
 * @author David Saavedra
 * @version 1.0 Prueba de refactorizaci�n
 */
public class CCuenta {
	
	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInteres;
	
/**
* Constructor vac�o
*/
	public CCuenta() {
	}
/**
 * Constructor con par�metros
 * @param nom Nombre del usuario
 * @param cue N�mero de la cuenta
 * @param sal Saldo actual
 * @param tipo Tipo de inter�s
 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
		tipoInteres = tipo;
	}
/**
 * 
 * @return Nombre del usuario
 */
	public String getNombre() {
		return nombre;
	}
/**
 * 
 * @param nombre Nombre del usuario
 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * 
 * @return N�mero de la cuenta
 */
	public String getCuenta() {
		return cuenta;
	}
/**
 * 
 * @param cuenta N�mero de la cuenta
 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
/**
 * 
 * @param saldo Saldo actual
 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
/**
* 
* @return Saldo actual
*/
	public double estado() {
		return saldo;
	}	
/**
 * 
 * @return Tipo de inter�s
 */
	public double getTipoInteres() {
		return tipoInteres;
	}
/**
 * 
 * @param tipoInteres Tipo de inter�s
 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
/**
 * 
 * @param cantidad Cantidad a ingresar
 * @throws Exception Error al ingresar
 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		saldo = saldo + cantidad;
	}
/**
 * 
 * @param cantidad Cantidad a retirar
 * @throws Exception Error al retirar
 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		saldo = saldo - cantidad;
	}
}
