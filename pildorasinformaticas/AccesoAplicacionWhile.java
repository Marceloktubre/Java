import javax.swing.*;
public class AccesoAplicacionWhile {

	public static void main(String[] args) {
		
		String clave = "Marcelo";
		
		String pass = "";
		
		while (clave.equals(pass)==false) {
			
			pass = JOptionPane.showInputDialog("Introduce la contraseņa,por favor");
			
			if(clave.equals(pass)==false) {
				
				System.out.println("Contraseņa incorrecta");
			}
			
		}
		
		System.out.println("Contraseņa correcta. Acceso permitido");
	}

}
