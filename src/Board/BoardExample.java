package Board;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Board.Board.*;
import static com.sun.tools.attach.VirtualMachine.list;

public class BoardExample {
    // 메뉴 상수
    static final int create = 1;
    static final int read = 2;
    static final int clear = 3;
    static final int exit = 4;


    public static void main(String[] args) throws ParseException {
        while(true) {
            System.out.println("[게시물 목록]");
            System.out.println();
            System.out.println("\t------------------------------------------------------");
            System.out.println("\t no   writer        date        title ");
            System.out.println("\t------------------------------------------------------");
            System.out.println("   1    winter    2024.01.02  게시판에 오신 것을 환영합니다    ");
            System.out.println("   2    winter    2024.01.01  올 겨울은 많이 춥습니다.       ");
            System.out.println("\t------------------------------------------------------");

            mainMenu();
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            if (choice == create) {
                create();
            } else if (choice == read) {
                read();
            } else if (choice == clear) {
                clear();
            } else if (choice == exit) {
                exit();
            }
        }

    }

    public static void list() {
        System.out.println("\n[게시물 목록]");
        System.out.println("------------------------------------------------------");
        System.out.println(" No   Writer       Date        Title");
        System.out.println("------------------------------------------------------");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        for (Board board : boardlist) {
            System.out.printf(" %-4d %-10s %-12s %s\n",
                    board.getBno(),
                    board.getBwriter(),
                    sdf.format(board.getBdate()),
                    board.getBtitle()
            );
        }

        System.out.println("------------------------------------------------------");
    }


        static void mainMenu () {
            System.out.println("\t 메인 메뉴: 1. Create | 2. Read | 3. Clear | 4. Exit");
            System.out.print("\t 메뉴 선택: \t ");

        }



}
