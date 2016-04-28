
public class Model{
    public int x;

    public int getX() {
        return x;
    }


    //logic
    public void generateX(int a, int b, int c){
        x=a+b+c;
    }

    public int answer(){
        double answer=Math.sqrt(x);
        return answer >= (int) answer + 0.5 ? (int) answer + 1 : (int) answer;
    }

}
