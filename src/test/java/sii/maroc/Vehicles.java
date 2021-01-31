package sii.maroc;

public class Vehicles {
	
	String a;
	String b;
	String c;
	String d;

	public String move(String string, String string2, String string3, String string4) {
		// TODO Auto-generated method stub
		String L = null;
		if( string2 == "Diesel" ) {
			L = "DOORS OK, MOVING." + string +"will consume " + Integer.parseInt(string4.substring(0,3))*0.05 + "L";
		}
		if((string2 == "Fuel") && (string3 != "1 3 4")) {
			L = "DOORS OK, MOVING." + string +"will consume " + Integer.parseInt(string4.substring(0,2))*0.06 + "L";
		}
		if((string2 == "Hybrid" && (string3 != "1 2 4"))) {
			L = "DOORS OK, MOVING." + string +"will consume " + Integer.parseInt(string4.substring(0,2))*0.03 + "L";
		}
		if((string2 == "Fuel") && (string3 == "1 3 4")) {
			L = "DOORS KO, BLOCKED \n"+
                    "  _\n"+
                    " | |\n"+
                    " /_|";
		}
		if((string2 == "Hybrid" && (string3 == "1 2 4"))) {
			L = "DOORS KO, BLOCKED \n"+
                    "  _\n"+
                    " | |\n"+
                    " /_|";
		}
		
		return L;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

	public String getD() {
		return d;
	}

	public void setD(String d) {
		this.d = d;
	}

	public Vehicles(String a, String b, String c, String d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public Vehicles(String string) {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Vehicles [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a == null) ? 0 : a.hashCode());
		result = prime * result + ((b == null) ? 0 : b.hashCode());
		result = prime * result + ((c == null) ? 0 : c.hashCode());
		result = prime * result + ((d == null) ? 0 : d.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicles other = (Vehicles) obj;
		if (a == null) {
			if (other.a != null)
				return false;
		} else if (!a.equals(other.a))
			return false;
		if (b == null) {
			if (other.b != null)
				return false;
		} else if (!b.equals(other.b))
			return false;
		if (c == null) {
			if (other.c != null)
				return false;
		} else if (!c.equals(other.c))
			return false;
		if (d == null) {
			if (other.d != null)
				return false;
		} else if (!d.equals(other.d))
			return false;
		return true;
	}

}
