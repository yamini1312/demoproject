package samplejava;

public class testmain {

	public static void main(String[] args) {
		reUsable RU=new reUsable();
		RU.openBrowser();
		String gettext = RU.gettext(".//*[@id='nav-xshop']/a[2]");
		System.out.println(gettext);
		RU.clickelement(".//*[@id='nav-xshop']/a[2]");
		

		

	}

}
