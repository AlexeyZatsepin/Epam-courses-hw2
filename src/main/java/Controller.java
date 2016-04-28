import java.util.Scanner;

/**
 * Created by Alex on 4/28/16.
 */
public class Controller {
    Model model;
    View view;

    public Controller(Model model,View view) {
        this.model=model;
        this.view=view;
    }

    public void mainProcess(){
        view.printMessage(View.ENTER_TITLE);

        Scanner scanner= new Scanner(System.in);
        int a=inputIntValueWithScanner(scanner);
        int b=inputIntValueWithScanner(scanner);
        int c=inputIntValueWithScanner(scanner);
        model.generateX(a,b,c);
        int result=model.answer();

        view.printMessage(View.RESULT+String.valueOf(result));
    }

    public int inputIntValueWithScanner(Scanner sc) {
        view.printMessage(View.USER_INPUT);

        while( !sc.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT_DATA);
            sc.next();
        }

        return sc.nextInt();
    }



}
