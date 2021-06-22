package Encapsulamento;

public class ControleRemoto implements Controlador {
	// ATRIBITOS
	private int volume;
	private boolean ligado;
	private boolean tocando;

	// MÉTODOS ESPECIAIS
	// CONSTRUTOR
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = true;
		this.tocando = false;
	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean getTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	@Override
	public void ligar() {
		this.setLigado(true);

	}

	@Override
	public void deligar() {
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		System.out.println("----- MENU -----");
		System.out.println("Está ligado? " + this.getLigado());
		System.out.println("Está tocando? " + this.getTocando());
		System.out.print("Volume: " + this.getVolume());
		for (int i = 0; i <= this.getVolume(); i += 10) {
			System.out.printf("| ");
		}
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando Menu... ");

	}

	@Override
	public void maisVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume() + 5);
		}else {
			System.out.println("Impossivel aumentar volume");
		}
	}

	@Override
	public void menosVolme() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume() - 5);
		}else {
			System.out.println("Impossivel diminuir volume");
		}

	}

	@Override
	public void ligarMudo() {
		if (this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}

	}

	@Override
	public void deligarMudo() {
		if (this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}

	}

	@Override
	public void play() {
		if (this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		}

	}

	@Override
	public void pause() {
		if (this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		}
	}

	// MÉTODOS ABSTRATOS
}
