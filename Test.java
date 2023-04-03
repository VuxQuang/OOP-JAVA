package Test;
import javax.swing.UIManager;

import View.QLSVView;
public class Test {
		public static void main(String[] args) {
			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				new QLSVView();
			} catch (Exception e) {
				e.printStackTrace();
			}	
			}
		}

