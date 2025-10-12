package basics;

public class BrowserCommands extends Base {

	
	public void browserCommands()
	{
		String title= driver.getTitle();
		System.out.println(title);
		
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserCommands browserCommands = new BrowserCommands();
		
		browserCommands.browserInitialisation();
		browserCommands.browserCommands();

	}

}
