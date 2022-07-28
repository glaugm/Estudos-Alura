
public class TesteConversao {
	
	public static void main(String[] args) {
		double salario = 1270.650; //double 64 bits e float é ponto flutuante tb mas com 32 bits
		int valor = (int) salario; 
		System.out.println(valor);
		
		long numeroGrande = 32432423523l; //long recebe até 64 bits
		short numeroPequeno = 2131; //short recebe até 16 bits
		byte b = 127; 
		
		//DE/PARA	byte	short	char	int		long		float		double
		//byte		----	Impl.	(char)	Impl.	Impl.	Impl.	Impl.
		//short		(byte)	----	(char)	Impl.	Impl.	Impl.	Impl.
		//char		(byte)	(short)	----	Impl.	Impl.	Impl.	Impl.
		//int		(byte)	(short)	(char)	----	Impl.	Impl.	Impl.
		//long		(byte)	(short)	(char)	(int)	----	Impl.	Impl.
		//float		(byte)	(short)	(char)	(int)	(long)	----	Impl.
		//double	(byte)	(short)	(char)	(int)	(long)	(float)	----
	}
		
}
