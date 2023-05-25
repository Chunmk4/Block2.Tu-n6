package Tuan6.ThucHanh2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BaiThucHanh2 bth2 = new BaiThucHanh2();

        try {
            bth2.writeData("hoc OOP","data.dat");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
