package c4q.nyc.fattyduck;

/**
 * Created by fattyduck on 6/7/15.
 */
public class ArrayStructures
{
    private int[] theArray = new int[50];

    private int arraySize = 10;

    public void generateRandomArray(){
        for (int i = 0; i<arraySize; i++){
            theArray[i] = (int)(Math.random()*10)+10;
        }
    }

    public void printArray(){
        for (int i = 0; i<arraySize; i++){
            System.out.println("+--------+");
            System.out.println("| " + i + " | " + theArray[i] + " |");
        }
        System.out.println("+--------+");

    }

    public void getValueAtIndex(int index){
        if(index < arraySize)
        {
            System.out.println(theArray[index]);
        }
        else
        {
            System.out.println("No such thing");
        }

    }
    public boolean doesArrayContainValue(int value){
        boolean b = false;
        for(int i = 0; i<arraySize; i++){
            if(theArray[i]==value){
                b = true;
            }
        }
        return b;
    }

    public void deleteIndex(int index){
        if(index<arraySize){
            for(int i = index; i<arraySize-1; i++){
                theArray[i]=theArray[i+1];
            }
            arraySize--;
        }
    }

    public static void main(String[] args){
        ArrayStructures cow = new ArrayStructures();
        cow.generateRandomArray();
        cow.printArray();
        cow.getValueAtIndex(4);
        System.out.println(cow.doesArrayContainValue(10));
        cow.deleteIndex(5);
        cow.printArray();
    }

}
