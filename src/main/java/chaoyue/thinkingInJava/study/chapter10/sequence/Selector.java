package chaoyue.thinkingInJava.study.chapter10.sequence;

public interface Selector {
    boolean end();
    Object current();
    void next();
}