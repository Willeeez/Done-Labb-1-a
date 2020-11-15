package main.java;

import javax.swing.JOptionPane;
class Addition {
	public static void main (String[] args) {
		String v = JOptionPane.showInputDialog("Skriv här");
		if(v.isEmpty() || v.contains("Hej")) {
			System.out.println("Ogiltigt");
			System.exit(1);

		}

		System.out.println(v);

	}
}
