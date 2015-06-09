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

    public void insertValue(int value){
        if(arraySize<50)
        {
            theArray[arraySize] = value;

            arraySize++;
        }
    }

    public void linearsearch(int value){
        boolean hasValue = false;
        String index = "";
        System.out.println("The value is found in following index(s):");

        for(int i = 0; i<arraySize; i++){
            if(theArray[i]==value){
                hasValue=true;
                System.out.println(i + " ");
            }
        }
        if(!hasValue){
            System.out.println("None");
        }


    }

    public static void main(String[] args){
        ArrayStructures cow = new ArrayStructures();
        cow.generateRandomArray();
        cow.printArray();
        cow.getValueAtIndex(4);
        System.out.println(cow.doesArrayContainValue(10));
        cow.printArray();
        cow.insertValue(15);
        cow.printArray();
        cow.linearsearch(15);
    }

}
