package Tuan6.ThucHanh2;

import java.io.*;

public class BaiThucHanh2 {
    // Phân tích 4 yếu tố
    //yto1: writData
    //yto2: input string data, sting name
    //yto3: output: boolean
//    yto4: ghi du lieu vào  file theo các tham số truyền vào
    public boolean writeData(String data, String filrName) throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream(filrName);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            bos.write(data.getBytes());

            bos.close();
            return true;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw e;
        }

    }
}



