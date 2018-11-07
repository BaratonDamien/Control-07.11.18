package org.Centrale;

public class Centrale {
	int id;
	ReservEnergie reservEnergie;
	
	public Centrale (int id) {
		this.id= id;
		reservEnergie = new ReservEnergie();
	}
	
	public int getId(){
		return id;
	}
	
	public void setId() {
		this.id=id;
	}

	public boolean consommerEnergie(int n){
		if(reservEnergie.consommer(n)) {
			return true;
		}
		else {
			return false;
		}
	}
}
