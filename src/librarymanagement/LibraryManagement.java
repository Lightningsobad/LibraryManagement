package librarymanagement;

import data.Shelf;
import java.util.Scanner;

/**
 *
 * @author quang
 */
public class LibraryManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shelf sh = new Shelf();
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
                    sh.removeABook();
                    break;
                case 6:
                    System.out.println("Tạm biệt, hẹn gặp lại!");
                    break;
                default:
                    System.out.println("Xin lỗi! Hãy chọn số trong khoảng từ 1 đến 6");
                    break;
            }
        } while (choice != 6);

    }

    public static void printMenu() {
        System.out.println("**************************************************");
        System.out.println("Chào mừng đến với chương trình quản lí thư viện");
        System.out.println("Chọn 1: Thêm sách");
        System.out.println("Chọn 2: Hiển thị thông tin sách hiện có");
        System.out.println("Chọn 3: Tìm kiếm sách");
        System.out.println("Chọn 4: Sửa thông tin sách");
        System.out.println("Chọn 5: Xóa sách");
        System.out.println("Chọn 6: Thoát");
    }

}
