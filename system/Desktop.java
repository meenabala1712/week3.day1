package org.system;

public class Desktop extends Computer{

	public static void desktopSize() {
		System.out.println("Size of the Desktop is : 24' ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop desk = new Desktop();
		desk.computerModel();
		desktopSize();
}
}
