package mypackage;


public class MainRemote {
    public static void main(String[] args) {
        Honda h = new Honda();
        Computer myNoteBook = new Computer();

        Controllable ctrl = new Honda();

        RemoteControl rm = new RemoteControl(h);
        RemoteControl rmMyNoteBook = new RemoteControl(myNoteBook);

        rm.start();
        rm.stop();
        rmMyNoteBook.start();
    }
}
