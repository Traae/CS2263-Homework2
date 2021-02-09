/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package edu.isu.cs.cs2263.hw02;

import java.util.StringTokenizer;

public class Library implements PushbackTokenizer {
    //

    private StringTokenizer tokens;
    private String str;
    private String delim;

    private String lastToken;



    public Library(String toBeTokenized, String delimiter){
        this.str = toBeTokenized;
        this.delim = delimiter;
        lastToken = null;
        tokens = new StringTokenizer(str, delim, false );
    }


    @Override
    public String nextToken() {
        String current = tokens.nextToken();
        if (lastToken != null){
            str = str.replaceFirst(lastToken, "");
            str = str.stripLeading();
        }
        lastToken = current;
        return current;
    }

    @Override
    public boolean hasMoreTokens() {
        return tokens.hasMoreTokens();
    }

    @Override
    public void pushback() {
        if (tokens.hasMoreTokens()) {
            tokens = null;
            tokens = new StringTokenizer(str, delim);
        }
    }

    public String getStr() {
        return str;
    }
}