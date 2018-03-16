import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by C0034 on 2018/3/15.
 */
public class TestMySql {

    public static void main(String args []) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");//指定连接类型
            conn = DriverManager.getConnection("jdbc:mysql://192.168.3.38/YDGC_CHK_DB?useSSL=false&useUnicode=true&characterEncoding=UTF-8&autoReconnect=true",
                    "root", "Pass1234");//获取连接
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
