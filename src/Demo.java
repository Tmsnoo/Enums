
public class Demo {

	public static void main(String[] args) {
		Season season = Season.SUMMER;
		Season sezon = Season.SPRING;
		
		System.out.println(season.getTranslation("pl"));
		season.addTranslation("it", "estate");
		System.out.println(season.getTranslation("it"));
		sezon.addTranslation("it", "Primavera");
		System.out.println(sezon.getTranslation("is"));
	}

}
