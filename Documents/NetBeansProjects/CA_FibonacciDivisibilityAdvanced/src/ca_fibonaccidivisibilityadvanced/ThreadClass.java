package ca_fibonaccidivisibilityadvanced;

import java.util.ArrayList;

public class ThreadClass implements Runnable{

    String name;
    ArrayList<Integer> input;
    Thread thrd;

    ArrayList<Integer> output = new ArrayList<Integer>();

    
    
    ThreadClass(String name, ArrayList input) {
        thrd = new Thread(this, name);
        this.input = input;
        this.name = name;
        thrd.start();
    }

    public void run() {

        System.out.println(name + " starts" + " with input " + input);
        ProcessData pd = new ProcessData(name, input);

        output.addAll(pd.processValues());
        System.out.println("output from " + name + " " + output.toString());

    }

}
