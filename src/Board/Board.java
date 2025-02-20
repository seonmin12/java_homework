package Board;

import lombok.Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import static Board.BoardExample.mainMenu;

@Data
public class Board {

    private int bno;
    private String btitle; // 수정: static 제거
    private String bcontent; // 수정: static 제거
    private String bwriter; // 수정: static 제거
    private Date bdate;

    // 게시물 번호 자동증가
    static int boardCounter = 1;

    static List<Board> boardlist = new ArrayList<Board>();

    public Board(int bno, String btitle, String bcontent, String bwriter, String dateStr) throws ParseException {
        this.bno = bno;
        this.btitle = btitle;
        this.bcontent = bcontent;
        this.bwriter = bwriter;
        this.bdate = new SimpleDateFormat("yyyy.MM.dd").parse(dateStr);
    }

    public Board() {
    }

    static void create() throws ParseException {
        Scanner sc = new Scanner(System.in);

            System.out.println();
            System.out.println("\t[새 게시물 입력]");
            System.out.print("\t제목: ");
            String title = sc.nextLine();
            System.out.print("\t내용: ");
            String content = sc.nextLine();
            System.out.print("\t작성자: ");
            String writer = sc.nextLine();

            System.out.println("\t------------------------------------");
            System.out.println("\t보조 메뉴: 1. ok | 2. Cancel");
            System.out.print("\t메뉴 선택: ");
            int select = sc.nextInt();
            sc.nextLine();

            if(select == 1){
                Board newBoard = new Board(boardCounter++, title, content, writer, new SimpleDateFormat("yyyy.MM.dd").format(new Date()));
                boardlist.add(newBoard);

                System.out.println("새 게시물이 추가되었습니다.");
                list();


            }else if(select == 2){
                System.out.println("게시물 작성 취소");

            }


    }

    static void read() throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("[게시물 목록]");
        System.out.println();
        System.out.println("\t------------------------------------------------------");
        System.out.println("\t no   writer        date        title ");
        System.out.println("\t------------------------------------------------------");
        for(Board board : boardlist){
            System.out.printf(" %-4d %-10s %-12s %s\n",
                    board.getBno(),
                    board.getBwriter(),
                    board.getBdate().toString(),
                    board.getBtitle()
            );
        }
        System.out.println("\t------------------------------------------------------");
        System.out.println();
        mainMenu();
        System.out.println();
        System.out.println("[게시물 읽기]");
        System.out.print("bno: ");
        int choice = sc.nextInt();
        sc.nextLine(); // 버퍼처리

        // 게시글 번호에 해당하는 게시글 찾기
        Board selectedBoard = null;
        for(Board board : boardlist){
            if(board.getBno() == choice){
                selectedBoard = board;
                break;
            }
        }

        if(selectedBoard != null){
            System.out.println("\n[게시물 읽기]");
            System.out.println("번호: " + selectedBoard.getBno());
            System.out.println("제목: " + selectedBoard.getBtitle());
            System.out.println("내용: " + selectedBoard.getBcontent());
            System.out.println("작성자: " + selectedBoard.getBwriter());
            System.out.println("날짜: " + new SimpleDateFormat("yyyy.MM.dd").format(selectedBoard.getBdate()));
        }

        System.out.println("-------------------------------------------");
        System.out.println("\t보조 메뉴: 1. Update | 2. Delete | 3. List");
        System.out.print("메뉴 선택: ");
        int select = sc.nextInt();
        sc.nextLine();

        switch(select){
            case 1:
                update(selectedBoard);
                break;

            case 2:
                delete(selectedBoard);
                break;

            case 3:
                System.out.println("목록으로 돌아갑니다");
                list();


        }
    }

    static void clear(){
        boardlist.clear();
        System.out.println("전체 삭제 되었습니다");
        list();
    }

    static void exit(){
        System.out.println("**게시판 종료**");
        System.exit(0);
    }

    // 게시물 수정 메서드
    public static void update(Board board) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n[수정 내용 입력]");
        System.out.print("제목: ");
        String newTitle = sc.nextLine();
        System.out.print("내용: ");
        String newContent = sc.nextLine();
        System.out.print("작성자: ");
        String newWriter = sc.nextLine();

        System.out.println("-------------------------------------------");
        System.out.println("\t보조 메뉴: 1. OK | 2. Cancel");
        System.out.print("메뉴 선택: ");
        int confirm = sc.nextInt();
        sc.nextLine(); // 버퍼 처리

        if (confirm == 1) {
            board.setBtitle(newTitle);
            board.setBcontent(newContent);
            board.setBwriter(newWriter);
            board.setBdate(new Date()); // 수정된 날짜 업데이트
            System.out.println("게시물이 수정되었습니다.");
        } else if(confirm == 2) {
            System.out.println("수정을 취소했습니다.");
        }
        list();
        System.out.println("변경되었습니다");
    }

    // 게시물 삭제 메소드
    public static void delete(Board board){
        boardlist.remove(board);
        list();
        System.out.println("삭제되었습니다.");
    }

    public static void list() {
        System.out.println("\n[게시물 목록]");
        System.out.println("------------------------------------------------------");
        System.out.println(" No   Writer       Date        Title");
        System.out.println("------------------------------------------------------");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        for (Board board : boardlist) {
                System.out.printf(" %-4d %-10s %-12s %s\n", board.getBno(), board.getBwriter(), sdf.format(board.getBdate()), board.getBtitle());
            }

        System.out.println("------------------------------------------------------");
    }
    static {
        try {
            boardlist.add(new Board(boardCounter++, "게시판에 오신 것을 환영합니다.", "안녕하세요! 여기에 글을 남겨보세요.", "winter", "2024.01.02"));
            boardlist.add(new Board(boardCounter++, "올 겨울은 많이 춥습니다.", "추운 겨울이네요. 따뜻하게 입으세요!", "winter", "2024.01.01"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}



