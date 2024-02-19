/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
import java.util.ArrayList;
import java.util.List;  

/**
 *
 * @author khoan
 */
public class tesst {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> studentIds = new ArrayList<>();
        studentIds.add("S001");
        studentIds.add("S002");
        studentIds.add("S003");
        studentIds.add("S004");
        studentIds.add("S005");

        String targetId = "S00";
        int threshold = 1; // Ngưỡng cho phép lỗi

        // Tìm kiếm gần đúng
        String foundId = approximateSearch(studentIds, targetId, threshold);

        if (foundId != null) {
            System.out.println("Mã sinh viên gần đúng: " + foundId);
        } else {
            System.out.println("Không tìm thấy mã sinh viên gần đúng cho " + targetId);
        }
    }

    // Hàm tìm kiếm gần đúng
    public static String approximateSearch(List<String> studentIds, String targetId, int threshold) {
        for (String id : studentIds) {
            if (id.startsWith(targetId.substring(0, targetId.length() - threshold))) {
                return id;
            }
        }
        return null;
    }
    
}
