import java.util.HashMap;
import java.util.Map;

public enum Season {

	SPRING("pl","Wiosna"),
	SUMMER("pl","Lato"),
	AUTUMN("pl","Jesień"),
	WINTER("pl","Zima");
	
	private Map<String, String> translations = new HashMap<>();
	
	private Season(String language, String translation) {
		addTranslation(language, translation);
	}
	
	public String getTranslation(String language) {
		return this.translations.get(language);
	}
	public void addTranslation(String language, String translation) {
		translations.put(language, translation);
	}
	
}
