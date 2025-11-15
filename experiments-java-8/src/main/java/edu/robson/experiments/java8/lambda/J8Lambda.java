package edu.robson.experiments.java8.lambda;

public class J8Lambda {

    protected boolean flag = false;

    public void instanceNoSet() {
        Doable d  = () -> System.out.println("Didn't set it");
        d.doIt();
    }

    public void instanceSet() {
        Doable d  = () -> {
            System.out.println("Set it");
            flag = true;
        };
        d.doIt();
    }

    public void instanceSetNoCall() {
        Doable d  = () -> {
            System.out.println("Set it but not called");
            flag = true;
        };
    }

    public String instanceReturning() {
        Returnable r  = a -> a;
        return r.returnIt("abc");
    }
}
