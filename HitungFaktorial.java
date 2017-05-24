import java.io.*;

public class HitungFaktorial
{
	int hasil = 1;	
	
	public int Hitung(int _angka)
	{
		
		if(_angka == 0 || _angka == 1)
		{
			System.out.println(_angka + "! = " + hasil);
		}
		else
		{
			hasil = _angka;
			System.out.print(_angka + "! = ");
			for(int i=1; i < _angka; _angka--)
			{					
				hasil = hasil * (_angka - 1);
				System.out.print(_angka + " x ");
				
				if(_angka == 2){
					System.out.print("1");
				}
			}		
		}
		
		return hasil;
	}
	
	public static void main(String[] args)
	{	
		HitungFaktorial Hf = new HitungFaktorial();
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
		String angka = "";
		
		System.out.print("Masukan angka faktorial : ");
		
		try
		{
			angka = Br.readLine();
			System.out.println("\nHasil : " + Hf.Hitung(Integer.parseInt(angka)));
		}
		catch(IOException ioe)
		{
			System.out.println("IO error ketika input.");
			System.exit(1);
		}	
	}
}