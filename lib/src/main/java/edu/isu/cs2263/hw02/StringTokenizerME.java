package edu.isu.cs2263.hw02;
import java.util.StringTokenizer;

public class StringTokenizerME implements PushbackTokenizer {

    @Override
    public String nextToken() {
        return null;
    }

    @Override
    public boolean hasMoreTokens() {
        return false;
    }

    @Override
    public void pushback() {

    }


    public static void main(String[] args) {

        StringTokenizer st = new StringTokenizer("this is a test");
        System.out.println(st.countTokens());

    }
}
