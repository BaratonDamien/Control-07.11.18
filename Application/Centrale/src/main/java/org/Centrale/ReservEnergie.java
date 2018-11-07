package org.Centrale;

public class ReservEnergie {
	int reserv;
	
	public ReservEnergie() {
		this.reserv = 100;
	}
	
	public int getReserv() {
		return reserv;
	}
	
	public boolean consommer(int n) {
		if((reserv - n) >= 0) {
			reserv = reserv - n;
			return true;
		}
		return false;
		
	}
}
