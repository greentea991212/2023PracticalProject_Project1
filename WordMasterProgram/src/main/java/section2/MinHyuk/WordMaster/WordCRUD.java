package section2.MinHyuk.WordMaster;
import java.io.*;
import java.sql.Array;

import java.util.Scanner;
import java.util.LinkedList;

public class WordCRUD implements ICRUD{

    LinkedList<Word>list;
    Scanner s;
    final String fileName = "Dictionary.txt";
    WordCRUD(Scanner s){

        list = new LinkedList<>();
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

    public void addItem(){

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

    public LinkedList<Integer> listALl(String keyword){

        LinkedList<Integer> idList = new LinkedList<>();
        int count = 0;
        System.out.println("-------------------------");
        for(int i = 0; i < list.size(); i++){
            String word = list.get(i).getWord();
            if(!word.contains(keyword)) continue;
            System.out.print((count+1) + " ");
            System.out.println(list.get(i).toString());
            idList.add(i);
            count++;
        }
        System.out.println("-------------------------");
        return idList;
    }
    public void updateItem() {

        System.out.print("=> 수정할 단어 검색 : ");
        String keyword = s.next();
        LinkedList<Integer> idList = this.listALl(keyword);
        System.out.print("수정할 번호 선택 : ");
        int id = s.nextInt();

        s.nextLine();

        System.out.print("=> 뜻 입력 : ");
        String meaning = s.nextLine();
        Word word = list.get(idList.get(id-1));
        word.setMeaning(meaning);
        System.out.println("단어가 수정되었습니다.");
    }

    public void deleteItem() {

        System.out.print("=> 삭제할 단어 검색 : ");
        String keyword = s.next();
        LinkedList<Integer> idList = this.listALl(keyword);
        System.out.print("=> 삭제할 번호 선택 : ");
        int id = s.nextInt();

        s.nextLine();

        System.out.print("=> 정말로 삭제 하시겠습니까?(Y/N) : ");
        String answer = s.next();
        if(answer.equalsIgnoreCase("y")) {

            list.remove((int)idList.get(id - 1));
            System.out.println("단어가 삭제 되었습니다.");
        }
        else {

            System.out.println("취소 되었습니다.");
        }
    }

}
