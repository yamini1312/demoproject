package samplejava;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class reUsable {
	  WebDriver driver;
	public void openBrowser(){
	  try{
		  driver=  new FirefoxDriver() ;
			driver.get("https://www.amazon.com");
			driver.manage().window().maximize();
	  }catch(Exception e){
		  e.getMessage();
	  }
		
		
	}
	public boolean comparetext(String expected, String actual){
		boolean flag = false;
		try{
			if (expected.equals(actual))
			{
			  flag = true;
			}
			
			
			
		}catch(Exception e){
		  e.getMessage();	
		}
		return flag;
	}
	public void clickelement(String obj){
		
		try{
			System.out.println(obj);
			driver.findElement(By.xpath(obj)).click();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	public void closebrowser() {

			try {

				driver.close();
				
			} catch (Exception e) {
				e.getMessage();
			}
		}
		public String getTitle() {
			String title=null;
			try {

				 title = driver.getTitle();
				
			} catch (Exception e) {
				e.getMessage();
			}
			return title;
		}

		

	public String gettext(String obj){
		String str = null;
		try{
			str = driver.findElement(By.xpath(obj)).getText();
		}catch(Exception e){
			e.getMessage();
		}
		return str;
	}
//	public String (String obj){
//		String str = null;
//		try{
//			str = driver.findElement(By.xpath(obj)).getText();
//		}catch(Exception e){
//			e.getMessage();
//		}
//		return str;
//	}
	
	
}
