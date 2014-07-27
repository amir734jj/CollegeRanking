public class Country implements Comparable<Object> {

	String Name;
	int Number;

	public Country(String name, int number) {
		super();
		Name = name;
		Number = number;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getNumber() {
		return Number;
	}

	public void setNumber(int number) {
		Number = number;
	}

	@Override
	public String toString() {
		return "Country [Name=" + Name + ", Number=" + Number + "]";
	}

	@Override
	public int compareTo(Object arg0) {
		Country temp = (Country) arg0;
		if (this.getNumber() > temp.getNumber())
			return 1;
		else if (this.getNumber() < temp.getNumber())
			return -1;
		else
			return 0;
	}
}
