
public class Person {

	private String vorname;
	private String nachname;
	private String beruf;
	private String nation;
	private String geschlecht;
	private int alter;
	
	
	//Konstruktoren
	
	public Person()
	{
		
	}
	
	//Konstruktoren dienen der Erstinnitalisierung von Attributen
	public Person(int alter, String vorname, String nachname, String beruf, String geschlecht, String nation)
	{
		this.alter=alter;
		this.vorname = vorname;
		this.nachname = nachname;
		this.beruf = beruf;
		this.geschlecht = geschlecht;
		this.nation = nation;
	}
	
	
	//Personen Vergleich mit geschlecht, nation und alter

	public boolean vergleich(Person p)
	{
		if(this == p)
		{
			return true;
		}
		else if(geschlecht.equals(getNation()))
		{
			if(nation.equals(getNation()))
			{
				if(alter == getAlter())
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			return false;
		}
		else
		{
			return false;
		}
		
	}
	
		
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public String getBeruf() {
		return beruf;
	}
	public void setBeruf(String beruf) {
		this.beruf = beruf;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getGeschlecht() {
		return geschlecht;
	}
	public void setGeschlecht(String geschlecht) {
		this.geschlecht = geschlecht;
	}
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	
	
	
	
	
}

