package maven.examen;

public class PolizaVip extends Poliza {
	@Override
	public String toString() {
		return "PolizaVip [beneficio=" + beneficio + "]";
	}

	public String beneficio;

	public String getBeneficio() {
		return beneficio;
	}

	public void setBeneficio(String beneficio) {
		this.beneficio = beneficio;
	}

}
