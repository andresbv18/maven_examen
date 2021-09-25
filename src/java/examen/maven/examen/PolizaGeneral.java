package maven.examen;

public class PolizaGeneral extends Poliza{
@Override
	public String toString() {
		return "PolizaGeneral [codigoDescuento=" + codigoDescuento + ", numeroSeguro=" + numeroSeguro + "]";
	}
public String codigoDescuento;
public int numeroSeguro;
public String getCodigoDescuento() {
	return codigoDescuento;
}
public void setCodigoDescuento(String codigoDescuento) {
	this.codigoDescuento = codigoDescuento;
}
public int getNumeroSeguro() {
	return numeroSeguro;
}
public void setNumeroSeguro(int numeroSeguro) {
	this.numeroSeguro = numeroSeguro;
}
}
