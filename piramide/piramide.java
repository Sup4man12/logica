package piramide;
class piramide {
	public static void main(String [] args){
		int tamanhoatual = 1;
	 	int tamanhopiramide = Integer.parseInt(args[0]);
 //		int tamanhopiramide = 5;
		for (int b = 0; b < tamanhopiramide; b++){
		for(int a = 0; a < tamanhopiramide - tamanhoatual/2 ; a++){
				System.out.print (" ");
	      
	}
	for (int a =0; a < tamanhoatual; a++) {
				System.out.print ("o");
			}
				System.out.println("");
				tamanhoatual+=2;
		}
	}
}
