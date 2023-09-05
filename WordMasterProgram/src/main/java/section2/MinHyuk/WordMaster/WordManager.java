package section2.MinHyuk.WordMaster;
import java.util.Scanner;

//wordCRUD를 사용한 실제관리
public class WordManager {

    Scanner s = new Scanner(System.in);
    private int menu;
    WordCRUD wordCRUD;

    WordManager(){

        wordCRUD = new WordCRUD(s);
    }
    public void selectMenu(){

        System.out.print("*** 영단어 마스터 ***\n");
        System.out.print("*******************\n"
        +"1. 모든 단어 보기\n"
        +"2. 수준별 단어 보기\n"
        +"3. 단어 검색\n"
        +"4. 단어 추가\n"
        +"5. 단어 수정\n"
        +"6. 단어 삭제\n"
        +"7. 파일 저장\n"
        +"0. 나가기\n"
        +"*******************\n"
        +"=> 원하는 메뉴는? ");

        menu = s.nextInt();
    }
    public void start(){

        while(true){

            selectMenu();
            if(menu == 0)break;
            if(menu == 1) {

                wordCRUD.listALl();
            }
            else if(menu == 2){

                //List of level
            }
            else if(menu == 3){

                //searching
            }
            else if(menu == 4){

                wordCRUD.addWord();
            } else if(menu == 5){

                //searching
            } else if(menu == 6){

                //searching
            } else if(menu == 7){

                //searching
            }
        }

    }
}
