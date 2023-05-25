package Tuan6.ThucHanh1;

import java.io.*;

public class BaiThucHanh1 {
    public static void main(String[] args) {
        try {
            String content = "Hello World!"; // bước 4: nhập vào một chuỗi bất kỳ
            // Bước 2: Tạo file Chung.dat
            File file = new File("Chung.dat");
            // Bước 3: Tạo đối tượng FileOutputStream để ghi dữ liệu vào file đặt tên là Chung.dat
            FileOutputStream fos = new FileOutputStream(file);
            // Bước 5: Ghi chuỗi nhập trên vào file
            byte[] byteContent = content.getBytes();
            //Tạo 1 mảng byte và dùng phương thức getBytes để lưu các dữ liệu của mảng đó
            // Nghĩa toàn bộ Chuyển đổi chuỗi contenr thành mã unicode và dùng getBytes để lưu lại
            fos.write(byteContent);
            //ghi toàn bộ dữu liêuj trong mảng vào file đc chỉ định
            fos.flush();
            //để đảm bảo tất cả dữu liệu dc đẩy xuống file trc khi close
            fos.close();
            // Bước 9: Đóng đối tượng FileOutputStream

            // Bước 6: Mở file chung.dat kiểm tra dữ liệu trong file
            FileInputStream fis = new FileInputStream(file);
            int readByte;
            while((readByte = fis.read()) != -1) { // Bước 8: Đọc dữ liệu sử dụng phương thức read()
                System.out.print((char)readByte);
            }
            fis.close();
            // Bước 9: Đóng đối tượng FileInputStream
        } catch(IOException e) {
            // Bước 10: Xử lý ngoại lệ
            e.printStackTrace();
        }
    }

}
//   * Lớp FileInputStream/FileOutputStream thuộc package java.io
//   * Lớp này có 3 phương thức khởi tạo:
//        FileInputStream(String name)
//        FileOutputStream(String name)
//        FileOutputStream(String name, boolean append)
//        Thường dùng phương thức khởi tạo FileInputStream/String name để tạo đối tượng.
//   * 4 yếu tố của phương thức read():
//        Trả về số nguyên thể hiện ký tự được đọc được từ file.
//        Đọc dữ liệu theo byte từ file.
//        Đọc tối đa số lượng byte cho trước.
//        Nếu đã đọc hết EOF sẽ trả về -1.
//   * 4 yếu tố của phương thức write():
//        Không trả về giá trị nào cả.
//        Ghi dữ liệu theo byte vào file.
//        Ghi nhiều dữ liệu cùng lúc.
//        Nếu file đã tồn tại thì sẽ ghi đè lên dữ liệu cũ.
//   * 4 yếu tố của phương thức close():
//        Giải phóng tài nguyên được cấp phát cho đối tượng.
//        Đóng file đang được mở.
//        Không trả về giá trị nào cả.
//        Nếu được gọi khi file đã được đóng thì sẽ không làm gì cả.
//    * Phương thức read() ném ra ngoại lệ IOException. Để xử lý được ngoại lệ này ta sử dụng try-catch hoặc throws.
//    * Phương thức write() ném ra ngoại lệ IOException. Để xử lý được ngoại lệ này ta sử dụng try-catch hoặc throws.
//    * Phương thức khởi tạo ném ra ngoại lệ FileNotFoundException khi file không tồn tại.
//        Để xử lý được ngoại lệ này ta sử dụng try-catch hoặc throws.