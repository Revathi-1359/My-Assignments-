package week1.Day2;

public class Browser {
    public void launchBrowser(){
        String browserName = "Chrome";
    System.out.println("Browser launched successfully");
    System.out.println("browserName:"+browserName);
    }

    public void loadUrl(){
        System.out.println("Application url loaded successfully");

    }
    public static void main(String[] args) {
        Browser browserAction = new Browser();
        browserAction.launchBrowser();
        browserAction.loadUrl();

    }

}
