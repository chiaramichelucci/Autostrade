public class Pedaggio {
int   max=90, iva;
double  TariffaUnitaria, pedaggio, km, km1, km2, k, w;

public Pedaggio ( int iva, double t, double km1, double km2) {
	this.TariffaUnitaria=t;
	this.iva=iva;
	this.km1=km1;
	this.km2=km2;
}
public double getPedaggio() {
	k=km1-km2;
	km=Math.abs(k);
	pedaggio=TariffaUnitaria*km;
	w=pedaggio*(iva/100);
	pedaggio=pedaggio+w;
	w=(int)pedaggio*10;
	if(w>max) {pedaggio=pedaggio+1;}
	return pedaggio;
}
public double kmPercorsi() {
	k=km1-km2;
	km=Math.abs(k);
	return km;
}
public int getIva() {
	return iva;
}
public double getTariffa() {
	return TariffaUnitaria; 
}
public double getKm1() {
	return km1;
}
public double getKm2() {
	return km2;
}
}
