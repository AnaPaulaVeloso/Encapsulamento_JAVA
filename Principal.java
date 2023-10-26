package principal;
import padrao.Carro;
public class Principal {


			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Carro ferrari = new Carro("Ferrari", "XYZ", 2017, 7.2, 173);
				ferrari.setTanque(80);
				ferrari.setVelocidade(10);
				System.out.println(ferrari.getMarca());
				System.out.println(ferrari.acelerar());
				ferrari.setVelocidade(35.0);
				System.out.println(ferrari.frear());
				System.out.println(ferrari.getAno());
				System.out.println(ferrari.getMarca());
				ferrari.calcular(2.0);
			}

		

	}