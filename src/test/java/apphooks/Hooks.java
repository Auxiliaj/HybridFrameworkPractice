package apphooks;




import com.drivermanager.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import com.utility.CommonUtilities;

public class Hooks {
	//public static WebDriver driver;
	
//	private static String scenarioName=null;
//
//	public static String getScenarioName() {
//		return scenarioName;
//	}
	
	@Before
	public void beforeSenario() {
		System.out.println("Execution Started");
		try{
		CommonUtilities commonUtilities=new CommonUtilities();
			commonUtilities.loadProperties();
			if(DriverManager.driver==null)
			{
				System.out.println("Instantiating driver");
				DriverManager.driverInitialization();;
				CommonUtilities.initElements();
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}		
	}
	
	@After
	public void afterSenario() {
		try{
		CommonUtilities commonUtilities=new CommonUtilities();
		commonUtilities.loadProperties();
				DriverManager.driver.quit();
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}	}
}

