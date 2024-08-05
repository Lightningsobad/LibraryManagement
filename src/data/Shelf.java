package data;

import java.util.*;

/**
 *
 * @author quang
 */
public class Shelf {

    private Scanner sc = new Scanner(System.in);
    private List<Book> arr = new ArrayList();

    public void addABook() {    //thêm một cuốn sách
        String id;
        String title;
        String author;
        double price;
        while (true) {
            try {
                System.out.println("Thêm cuốn sách thứ #" + (arr.size() + 1) + ":");
                System.out.print("Nhập mã sách: ");
                id = sc.nextLine();
                System.out.print("Nhập tiêu đề: ");
                title = sc.nextLine();
                System.out.print("Nhập tác giả: ");
                author = sc.nextLine();
                System.out.print("Nhập giá tiền: ");
                price = Double.parseDouble(sc.nextLine());
                arr.add(new Book(id, title, author, price));   //nhập xong ném vào trong giỏ    
                System.out.println("Thêm thành công!");
                break;
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Thông tin nhập không hợp lệ, vui lòng nhập lại!");
            }

        }

    }

    private Book searchABook(String id) {
        //để là private vì mình muốn re-use ở bên dưới mà thôi
        //object chấm ko xổ ra em hàm này được vì để private
        //hàm nhận đầu vào là một chuỗi, trả về là một object 
        if (arr.isEmpty()) {
            return null;
        } else {
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i).getId().equalsIgnoreCase(id)) {
                    return arr.get(i);
                }
            }
        }
        return null;
    }
    public void printBookList() {
        if (arr.isEmpty()) {
            System.out.println("Danh sách rỗng, chưa có cuốn sách nào được thêm");
        } else {

            System.out.println("Hiện tại có " + arr.size() + " cuốn sách: ");
            Book.printTitle();
            for (Book x : arr) {
                x.printData();
            }
        }
    }

    public void searchABook() { //tìm kiếm một cuốn sách
        String id;
        System.out.print("Nhập vào mã sách bạn muốn tìm kiếm: ");
        id = sc.nextLine();
        Book b1 = searchABook(id);
        if (b1 == null) {
            System.out.println("Không tìm thấy sách!");
        } else {
            System.out.println("Đây là sách bạn muốn tìm: ");
            b1.printData();
        }
        
        }
    

    public void updateABook() {
        String id;
        System.out.print("Nhập vào mã sách bạn muốn sửa: ");
        id = sc.nextLine();
        Book b1 = searchABook(id);
        if (b1 == null) {
            System.out.println("Không tìm thấy sách!");
        } else {
            System.out.println("Đây là sách bạn muốn sửa: ");
            b1.printData();
            while (true) {
                try {
                    System.out.println("Mời sửa thông tin của sách: ");
                    System.out.print("Mã sách: ");
                    b1.setId(sc.nextLine());
                    System.out.print("Tiêu đề: ");
                    b1.setTitle(sc.nextLine());
                    System.out.print("Tác giả: ");
                    b1.setAuthor(sc.nextLine());
                    System.out.print("Giá: ");
                    b1.setPrice(Double.parseDouble(sc.nextLine()));
                    System.out.println("Chỉnh sửa thành công!");
                    System.out.println("Thông tin của sách sau khi chỉnh sửa:");
                    b1.printData();
                    break;
                } catch (InputMismatchException | NumberFormatException e) {
                    System.out.println("Chương trình có lỗi: " + e.toString());
                }

            }

        }
    }

    public void removeABook() {
        String id;
        System.out.print("Nhập vào mã sách bạn muốn xóa: ");
        id = sc.nextLine();
        Book b1 = searchABook(id);
        if (b1 == null) {
            System.out.println("Không tìm thấy sách!");
        } else {
            arr.remove(b1);
            System.out.println("Xóa thành công!");
        }

    }

    public void sortBooksByTittle() {
        SortByTitle st = new SortByTitle();
        Collections.sort(arr, st);
    }

    public void sortBooksByPrice() {
        SortByPrice sp = new SortByPrice();
        Collections.sort(arr, sp);
    }
    

}
