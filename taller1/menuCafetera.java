package taller1;

import javax.swing.JOptionPane;

public class menuCafetera extends Cafetera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cafetera cafetera = new Cafetera(1000, 0);
		int opcion = 0;
		do {
				opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
																		 "1 - Llenar cafetera\n"+ 
																		 "2 - Vaciar Cafetera\n" +
																		 "3 - Servir taza\n" +
																		 "4 - salir\n"+
																		 "\n______Capacidad cafetera m�ximo 1000cc_____\n" +
																		 "Capacidad Actual: " + cafetera.capacidaActual
																		));
				;
				switch (opcion) {
				case 1:
					cafetera.agregarElCafe(Integer.parseInt(JOptionPane.showInputDialog(null, "Cuanto cafe desea a�adir: ")));
					JOptionPane.showMessageDialog(null,"La capacidad maxima de la cafetera es de 1000cc: " + 
														cafetera.capacidaActual);
					break;
				case 2: 
					JOptionPane.showMessageDialog(null, "Vaciando cafetera......");
					cafetera.vaciarCafetera();
					break;
				case 3:
					cafetera.servirTaza(Integer.parseInt(JOptionPane.showInputDialog(null, "Cuanto cafe desea a�adir a su taza:\n " +
																							"\nCapacidad actual de caf�: " + 
																							cafetera.capacidaActual)));
					JOptionPane.showMessageDialog(null, "Sirviendo taza de caf� con la capacidad actual.....");
					break;

				default:
					if(opcion > 4) JOptionPane.showMessageDialog(null, "Opcion invalida");
					else JOptionPane.showMessageDialog(null, "Saliendo............");
					break;
				}

		} while (opcion != 4);
		
	}

}
