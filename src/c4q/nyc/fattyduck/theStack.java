package c4q.nyc.fattyduck;
import java.util.Arrays;

/**
 * Created by fattyduck on 6/10/15.
 */
public class theStack
{
    private String[] stackArray;
    private int stackSize;
    private int topOfStack;

    public theStack(int size){
        stackSize = size;
        stackArray = new String[size];
        Arrays.fill(stackArray, "-1");

    }

    public void push(String input){
        if(topOfStack+1<stackSize){
            topOfStack++;
            stackArray[topOfStack]=input;
        }else{
            
        }
    }
}
