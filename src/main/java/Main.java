/**
 * Created by Alex on 4/28/16.
 */
public class Main {
    public static void main(String[] args) {
        Controller controller= new Controller(new Model(),new View());
        controller.mainProcess();
    }
}
