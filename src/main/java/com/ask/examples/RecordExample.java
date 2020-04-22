package com.ask.examples;

public class RecordExample {

    public static void main(String[] args) {

        //before java 14
        BeforeJava14 beforeJava14 = new BeforeJava14();
        beforeJava14.setVersion(12);
        System.out.println(beforeJava14.getVersion());

        //After Java 14
        AfterJava14 afterJava14 = new AfterJava14(14);
        System.out.println(afterJava14.version());

    }

}
//using the record
record AfterJava14(Integer version){}



class BeforeJava14 {
    private Integer version;

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
