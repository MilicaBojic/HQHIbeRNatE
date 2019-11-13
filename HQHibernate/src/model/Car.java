package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //ENTITET JE SVE ONO O CEMU CUVAMO PODATKE 
//AKO SE NESTO NE OBELEZI KAO ENTITET, NECE BITI OMOGUCEN NJEGOV UNOS U BAZU!
//Iznad citave klase jer se na nju odnosi; odredjuje koja klasa treba da se ponasa kao entitet- mapiranje se radi na toj klasi.
public class Car {
		//U ovoj klasi se definisu atributi automobila,id, konstruktor, geteri i seteri. Geter za id je potreban da bi se kasnije moglo po id-u pretrazivati.
	
	@Id  // Odnosi se SAMO NA POLJE ISPOD!!!!!- PRIMARY KEY
	@GeneratedValue (strategy = GenerationType.IDENTITY) //AUTO INCREMENT
	private int idCar;
	private String marka;
	private String model;
	private int godiste;
	private double cena;
	private boolean registracija;
	
	public Car(String marka, String model, int godiste, double cena, boolean registracija) {
		super();
		this.marka = marka;
		this.model = model;
		this.godiste = godiste;
		this.cena = cena;
		this.registracija = registracija;
	}
	public int getIdCar() {
		return idCar;
	}
	public void setIdCar(int idCar) {
		this.idCar = idCar;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getGodiste() {
		return godiste;
	}
	public void setGodiste(int godiste) {
		this.godiste = godiste;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	public boolean isRegistracija() {
		return registracija;
	}
	public void setRegistracija(boolean registracija) {
		this.registracija = registracija;
	}
	
	
	
}
