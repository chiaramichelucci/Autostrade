public class Veicoli {
String modello, marca, targa;
int anno, assi, peso, altezza;
int a2=2, a3=3, a4=4;
double TariffaUnitaria;

public Veicoli (String modello, String marca, String targa, int anno, int assi, int p, int h) {
	this.modello=modello;
	this.marca=marca;
	this.targa=targa;
	this.anno=anno;
	this.assi=assi;
	this.peso=p;
	this.altezza=h;
}

public String getModello() {
	return modello;
}
public String getMarca() {
	return marca;
}
public String getTarga() {
	return targa;
}
public int getAnno() {
	return anno;
}
public int getAssi() {
	return assi;
}
public int getPeso() {
	return peso;
}
public int getAltezza() {
	return altezza;
}

public int getClasse() {

	if(assi==a2)
	{if(altezza>130)
	{return 2;
	}
	else {return 1;}
}
	if(assi==a3)
	{return 3;}
	if(assi==a4)
	{return 4;}
	return 5; 
}

public double getTariffaUnitaria() {

	if(assi==a2)
	{if(altezza>130) {
		TariffaUnitaria=0.5;
	return TariffaUnitaria;
	} }
	if(assi==a2){
		if(altezza<=130)
	{TariffaUnitaria=0.3; return TariffaUnitaria;}
	}
	if(assi==a3)
	{TariffaUnitaria=0.7; return TariffaUnitaria;}
	if(assi==a4)
	{TariffaUnitaria=0.9; return TariffaUnitaria;}
	TariffaUnitaria=0.12; return TariffaUnitaria; 
}

}