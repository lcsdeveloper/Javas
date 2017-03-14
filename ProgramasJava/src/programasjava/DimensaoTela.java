package programasjava;
import java.awt.Dimension;
import java.awt.Toolkit;
public class DimensaoTela {
  public static void main(String[] args) {
    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension d = tk.getScreenSize();
    System.out.println("Screen width = " + d.width);
    System.out.println("Screen height = " + d.height);
  }
}
