package projectiPhone;

public class iPhone implements Browser, Music, Phone{

    @Override
    public void updatePage() {
        System.out.println("Updating page.");
    }
    
    @Override
    public void viewPage() {
        System.out.println("Open new aba.");
    }

    @Override
    public void addNewPage() {
        System.out.println("Add new page.");
    }

    @Override
    public void callPhone() {
        System.out.println("Do call...");
    }

    @Override
    public void attendPhone() {
        System.out.println("Attend call...");
    }
    

    @Override
    public void playMusic() {
        System.out.println("Playing music: ");
    }

    @Override
    public void selectMusic() {
        System.out.println("Selecting music: ");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pausing music: ");
    }


}
