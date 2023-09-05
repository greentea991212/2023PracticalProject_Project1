package section2.MinHyuk.WordMaster;
import java.util.ArrayList;
import java.util.Scanner;

//ICRUD interface에 대한 실질적 구현
public class WordCRUD implements ICRUD{

    ArrayList<Word>list;
    Scanner s;

    WordCRUD(Scanner s){

        list = new ArrayList<>();
        this.s = s;
    }
    @Override
    public Object add() {
        System.out.print("=> 난이도(1,2,3) & 새 단어 입력 : ");
        int level = s.nextInt();
        String word = s.nextLine();

        System.out.print("뜻 입력 : ");
        String meaning = s.nextLine();

        return new Word(0,level,word,meaning);
    }

    public void addWord(){

        Word one = (Word)add();
        list.add(one);
    }

    @Override
    public int update(Object obj) {
        return 0;
    }

    @Override
    public int delete(Object obj) {
        return 0;
    }

    @Override
    public void selectOne(int id) {

    }

    public void listALl(){
        System.out.println("-------------------------");
        for(int i = 0; i < list.size(); i++){
            System.out.print((i+1) + " ");
            System.out.println(list.get(i).toString());
        }
        System.out.println("-------------------------");
    }
}
