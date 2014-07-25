public class University {

	int WorldRank, NationalRank, QualityOfEducation, AlumniEmployment,
			QualityOfFaculty, Publications, Influence, Citations, BroadImpact,
			Patents;
	String Institution, Country;
	double Score;

	public University(int worldRank, String institution, String country,
			int nationalRank, int qualityOfEducation, int alumniEmployment,
			int qualityOfFaculty, int publications, int influence,
			int citations, int broadImpact, int patents, double score) {
		super();
		WorldRank = worldRank;
		Institution = institution;
		Country = country;
		NationalRank = nationalRank;
		QualityOfEducation = qualityOfEducation;
		AlumniEmployment = alumniEmployment;
		QualityOfFaculty = qualityOfFaculty;
		Publications = publications;
		Influence = influence;
		Citations = citations;
		BroadImpact = broadImpact;
		Patents = patents;
		Score = score;

	}

	public int getWorldRank() {
		return WorldRank;
	}

	public int getNationalRank() {
		return NationalRank;
	}

	public int getQualityOfEducation() {
		return QualityOfEducation;
	}

	public int getAlumniEmployment() {
		return AlumniEmployment;
	}

	public int getQualityOfFaculty() {
		return QualityOfFaculty;
	}

	public int getPublications() {
		return Publications;
	}

	public int getInfluence() {
		return Influence;
	}

	public int getCitations() {
		return Citations;
	}

	public int getBroadImpact() {
		return BroadImpact;
	}

	public int getPatents() {
		return Patents;
	}

	public double getScore() {
		return Score;
	}

	public String getInstitution() {
		return Institution;
	}

	public String getCountry() {
		return Country;
	}

	@Override
	public String toString() {
		return "University [WorldRank=" + WorldRank + ", Institution="
				+ Institution + ", Country=" + Country + ", NationalRank="
				+ NationalRank + ", QualityOfEducation=" + QualityOfEducation
				+ ", AlumniEmployment=" + AlumniEmployment
				+ ", QualityOfFaculty=" + QualityOfFaculty + ", Publications="
				+ Publications + ", Influence=" + Influence + ", Citations="
				+ Citations + ", BroadImpact=" + BroadImpact + ", Patents="
				+ Patents + ", Score=" + Score + "]";
	}

}
