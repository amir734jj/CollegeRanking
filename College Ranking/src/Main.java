import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

	public static void main(String[] args) {
		ArrayList<University> UniversityCollection = new ArrayList<University>();
		Document doc = null;
		try {
			doc = Jsoup.connect("http://cwur.org/2014/").get();

		} catch (IOException e) {

			e.printStackTrace();
		}

		for (Element table : doc.select("table")) {
			for (Element row : table.select("tr")) {
				Elements tds = row.select("td");
				if (tds.size() == 13) {
					UniversityCollection.add(process(tds));
				}
			}
		}
		getListOfBestEducationSystem(UniversityCollection);
	}

	public static University process(List<Element> tds) {
		int WorldRank = Integer.parseInt(tds.get(0).text().replace("+", ""));
		int NationalRank = Integer.parseInt(tds.get(3).text().replace("+", ""));
		int QualityOfEducation = Integer.parseInt(tds.get(4).text()
				.replace("+", ""));
		int AlumniEmployment = Integer.parseInt(tds.get(5).text()
				.replace("+", ""));
		int QualityOfFaculty = Integer.parseInt(tds.get(6).text()
				.replace("+", ""));
		int Publications = Integer.parseInt(tds.get(7).text().replace("+", ""));
		int Influence = Integer.parseInt(tds.get(8).text().replace("+", ""));
		int Citations = Integer.parseInt(tds.get(9).text().replace("+", ""));
		int BroadImpact = Integer.parseInt(tds.get(10).text().replace("+", ""));
		int Patents = Integer.parseInt(tds.get(11).text().replace("+", ""));
		double Score = Double.parseDouble(tds.get(12).text().replace("+", ""));
		String Institution = tds.get(1).text();
		String Country = tds.get(2).text();

		return new University(WorldRank, Institution, Country, NationalRank,
				QualityOfEducation, AlumniEmployment, QualityOfFaculty,
				Publications, Influence, Citations, BroadImpact, Patents, Score);

	}

	public static void WriteToFile(ArrayList<University> UniversityCollection) {
		PrintWriter writer;
		Iterator<University> it = UniversityCollection.iterator();
		try {
			writer = new PrintWriter("Output.txt", "UTF-16");
			while (it.hasNext())
				writer.write(it.next().toString() + "\n");
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void getListOfBestEducationSystem(
			ArrayList<University> UniversityCollection) {
		ArrayList<Country> CountryCollection = new ArrayList<Country>();
		Iterator<University> it = UniversityCollection.iterator();
		University temp;
		while (it.hasNext()) {
			temp = it.next();
			if (getIndex(CountryCollection, temp.getCountry()) == -1)
				CountryCollection.add(new Country(temp.getCountry(), 1));
			else

				CountryCollection
						.get(getIndex(CountryCollection, temp.getCountry()))
						.setNumber(
								CountryCollection.get(
										getIndex(CountryCollection,
												temp.getCountry())).getNumber() + 1);
		}
		Collections.sort(CountryCollection);

		Iterator<Country> itx = CountryCollection.iterator();
		while (itx.hasNext())
			System.out.println(itx.next());
	}

	public static int getIndex(ArrayList<Country> CountryCollection, String Name) {
		Iterator<Country> it = CountryCollection.iterator();
		int index = 0;
		while (it.hasNext()) {
			if (it.next().getName().equals(Name))
				return index;
			else
				index++;
		}
		return -1;
	}

	public static void sortCountryByNumber(ArrayList<Country> CountryCollection) {
		Iterator<Country> it = CountryCollection.iterator();
		while (it.hasNext()) {
		}
	}

}