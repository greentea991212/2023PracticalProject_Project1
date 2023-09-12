package section2.MinHyuk.WordMaster;
import java.util.Scanner;

//단어에 대한 정보를 구성하고 있는 클래스
public class Word {

    private int id;
    private int level;
    private String word;



    private String meaning;

    Scanner s;
    Word(){}
    Word(int id, int level, String word, String meaning){

        this.id = id;
        this.level = level;
        this.word = word;
        this.meaning = meaning;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    @Override
    public String toString() {

        String slevel = "";
        for(int i = 0; i < level; i++) slevel = slevel + "*";
        String str = String.format("%-3s",slevel) + String.format("%15s",word) + " " + meaning;
        return str;
    }

    public String toFileString(){

        return this.level + "|" + this.word + "|" + this.meaning;
    }

}
