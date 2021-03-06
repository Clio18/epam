package lesson1.task4.Task4MVC;

public class Controller {
    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void rotateArrayToLeft() {
        model.setArray();
        view.printArray
                (model.getArrayFromLine
                        (model.getArrayInString()));
    }
    public void rotateArrayToRight(){
        view.printArray
                (model.getArrayFromLine
                        (model.rotateArrayToRight //revers String to get spin to right
                                (model.getArrayInString())));
    }
}
