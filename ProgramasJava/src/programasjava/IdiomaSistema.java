package programasjava;
/*lucas*/
import java.util.Locale;
public class IdiomaSistema {
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.println (loc.getDisplayLanguage()); // imprime "English"
        System.out.println (loc.getLanguage()); // imprime "en"
    }
}
