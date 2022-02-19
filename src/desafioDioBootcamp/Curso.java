package desafioDioBootcamp;

public class Curso extends Conteudo{
	
	private int cargaHoraria;
	
	public Curso() {
		
	}
	
	
	@Override
	public double somarXP() {
		return XP_PADRAO * getCargaHoraria();
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
	}
	
	

}
