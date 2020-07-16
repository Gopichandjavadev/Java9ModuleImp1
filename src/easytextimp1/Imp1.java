package easytextimp1;

import java.util.List;

import easytextapi.Analyzer;

public class Imp1 implements Analyzer {
    
    public String getName() {
        return "algorithm name";
    }

    public double analyze(List<List<String>> text) {
       System.out.println(text);
       return 0; 
    }
}
