package edu.isu.cs.cs2263.hw02;

public interface PushbackTokenizer {
    // return the next token
    String nextToken();
    // returns true if and only if there are more tokens
    boolean hasMoreTokens();
    // the token read is pushed back, so it can be read again using nextToken.
    void pushback();
}