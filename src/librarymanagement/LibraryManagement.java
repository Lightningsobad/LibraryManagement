package librarymanagement;

import data.*;
import java.util.*;

/**
 *
 * @author quang
 */
public class LibraryManagement {

    private static Scanner sc = new Scanner(System.in);
    private static Shelf sh = new Shelf();

    public static void main(String[] args) {
        
        int choice;
        do {
            printMenu();
            System.out.print("Mời nhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    sh.addABook();
                    break;
                case 2:
                    sh.printBookList();
                    break;
                case 3:
                    sh.searchABook();
                    break;
                case 4:
                    sh.updateABook();
                    break;
                case 5:
                    sortBooks();
                    break;
                case 6:
                    sh.removeABook();
                    break;
                case 7:
                    System.out.println("Tạm biệt, hẹn gặp lại!");
                    break;
                default:
                    System.out.println("Xin lỗi! Hãy chọn số trong khoảng từ 1 đến 7");
                    break;
            }
        } while (choice != 7);

    }

    public static void printMenu() {
        System.out.println("**************************************************");
        System.out.println("Chào mừng đến với chương trình quản lí thư viện");
        System.out.println("Chọn 1: Thêm sách");
        System.out.println("Chọn 2: Hiển thị thông tin sách hiện có");
        System.out.println("Chọn 3: Tìm kiếm sách");
        System.out.println("Chọn 4: Sửa thông tin sách");
        System.out.println("Chọn 5: Sắp xếp danh sách hiện có");
        System.out.println("Chọn 6: Xóa sách");
        System.out.println("Chọn 7: Thoát");
    }

    public static void sortBooks() {
        int choice;
        System.out.println("Bạn muốn sắp xếp theo tiêu chí nào?");
        System.out.println("Chọn 1: Sắp xếp theo tiêu đề");
        System.out.println("Chọn 2: Sắp xếp theo giá tiền");
        do {
            System.out.print("Mời nhập lựa chọn: ");
            choice = sc.nextInt();
        } while (choice != 1 && choice != 2);
        if (choice == 1) {
            sh.sortBooksByTittle();
            System.out.println("Sắp xếp thành công!");
            System.out.println("Danh sách sau khi sắp xếp:");
            sh.printBookList();
        } else {
            sh.sortBooksByPrice();
            System.out.println("Sắp xếp thành công!");
            System.out.println("Danh sách sắp xếp tăng dần theo giá:");
            sh.printBookList();
        }

    }

}
