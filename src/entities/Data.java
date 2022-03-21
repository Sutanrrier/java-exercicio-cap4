package entities;

public class Data {
	public int	dia;
	public int	mes;
	public int	ano;
	
	public String formatData() {
		return dia+"/"+mes+"/"+ano;
	}
}
