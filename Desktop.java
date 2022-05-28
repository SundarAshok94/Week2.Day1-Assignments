package org.system;

public class Desktop extends Computer{
	
	public void desktopSize() {
		
		System.out.println("15inch");
	}
	
	public static void main(String[] args) {
		
		Desktop D=new Desktop();
		D.computerModel();
		D.desktopSize();
		
	}

}
