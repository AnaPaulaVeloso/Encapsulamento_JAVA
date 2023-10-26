package padrao;
import java.util.Scanner;

public class Carro {
	
		private String marca;
		private String modelo;
		private int ano;
		private double motor;
		private double tanque;
		public double velocidade;
		public double valorGasolina;
		public double tanqueCheio;
		public double gastoTanque;
		Scanner ler = new Scanner(System.in);
		
		public Carro (String marca, String modelo, int ano, double motor, int tanque) { 
		 this.marca = marca;									
		 this.modelo = modelo;
		 this.ano = ano;
		 this.motor = motor;
		 this.setTanque(tanque);
		}
	
			// TODO Auto-generated constructor stub
		
		
		public void girarChave() {
			System.out.println("Ligou ou desligou");
			
		}
		public double acelerar() {
			if (velocidade >=1) {
				System.out.println("Acelerando...");
				velocidade += 20;
			}if (velocidade == 180) {
				System.out.println("Você atingiu a velocidade maxima");
				}
			return velocidade;
		
			             
		}
		public double frear () {
			if (velocidade >=1) {
				System.out.println("Freando...");
				velocidade -=20;
			} if (velocidade == 0) {
				System.out.println("Parado");
			}
			return velocidade;
		}
		public void setVelocidade (double vel) {
			this.velocidade += vel;
		}
		public void setMarca (String marca) {
			this.marca = marca;
		}
		public String getMarca() {
			return this.marca;
		}
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public int getAno() {
			return ano;
		}
		public void setAno(int ano) {
			this.ano = ano;
		}
		public double getMotor() {
			return motor;
		}
		public void setMotor(double motor) {
			this.motor = motor;
		}
		public void calcular(double valorGasolina) {
			
			this.valorGasolina = valorGasolina;
			System.out.println("Digite o quanto foi gasto do tanque: ");
			gastoTanque = ler.nextDouble();
			tanqueCheio = tanque - gastoTanque;
			System.out.println("Para encher o tanque custará: R$" + (valorGasolina * tanqueCheio) );
		}

		public double getTanque() {
			return tanque;
		}

		public void setTanque(double tanque) {
			this.tanque = tanque;
		}
		
	}

	