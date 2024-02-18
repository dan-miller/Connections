package me.dan.connections;

public class WordGroup {
    private String word1;
    private String word2;
    private String word3;
    private String word4;

    public WordGroup(String _word1, String _word2, String _word3, String _word4) {
        this.word1 = _word1;
        this.word2 = _word2;
        this.word3 = _word3;
        this.word4 = _word4;
    }

    public String getWord1() {
        return word1;
    }

    public String getWord2() {
        return word2;
    }

    public String getWord3() {
        return word3;
    }

    public String getWord4() {
        return word4;
    }

    public boolean contains(String word) {
        return (word.equals(this.getWord1()) || word.equals(this.getWord2()) || word.equals(getWord3()) || word.equals(getWord4()));
    }

}
