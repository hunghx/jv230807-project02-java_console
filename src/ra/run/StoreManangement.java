package ra.run;


import ra.business.entity.Catalog;
import ra.business.service.ICatalogService;
import ra.business.serviceimpl.CatalogServiceImpl;
import ra.business.util.InputMethods;

import java.time.LocalDateTime;
import java.util.List;

public class StoreManangement {
    private static ICatalogService catalogService = new CatalogServiceImpl();
    public static void main(String[] args) {
        // chạy chương trình

        // b1 điều hướng menu :
        // công nghệ sử dụng
        // do while để duy trì ứng dụng
        // switch case để điều hướng chức năng do người dùng nhập vào
        // I/O data


        // hiển thị menu chức năng
        do {
            System.out.println("--------- Menu chức năng ----------");
            System.out.println("1. Quản lí danh mục");
            System.out.println("2. Quản lí sản phẩm");
            System.out.println("0. Thoát chương trình");

            // yêu cầu nhập lựa chọn
            System.out.println("Hãy nhập vào lựa chọn");
            byte choice = InputMethods.getByte();
            switch (choice){
                case 1:
                    // điều hướng menu Quản lí dnah mục
                    menuCatalog();
                    break;
                case 2:
                    // điều hướng menu Quản lí sản phẩm
                    menuProduct();
                    break;
                case 3:
                    // thoát
                    System.out.println("Thoát chương trình");
                    System.exit(0);
                    break;
                default:
                    System.err.println("Lựa chọn không hợp lệ !");
                    break;
            }
        }while (true);

    }

    // xử li các chức năng của danh mục
    public static  void menuCatalog(){

    }
    // xử lí các chức năng của sản phẩm
    public static void menuProduct(){
        // lấy ra được đối tượng cần thay đổi trạng thái Catalog
        // dùng setter để thay đổi trạng thái từ true về false
        // lưu đối tượng vừa sửa vào danh sách

    }
    // chức năng hiển tị danh mục
    public static void displayCatalog(){
        List<Catalog> catalogs = catalogService.findAllOrderByCreatedDate();
        catalogs.forEach(cat->{
            System.out.printf("ID : %s - CreatedDate: - %s ",cat.getId(),cat.getCreatedDate());
        });
    }
}
