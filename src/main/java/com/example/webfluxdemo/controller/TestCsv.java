package com.example.webfluxdemo.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @program: webfluxdemo
 * @description:
 * @author: hons.chang
 * @since: 2023-08-08 16:48
 **/
public class TestCsv {

    public static void main(String[] args) throws IOException, SQLException {

        String path="C:\\Users\\fukw\\Desktop\\1234\\1234.csv";
        csv(path);
    }
    public static boolean csv(String path) throws IOException, SQLException {
        Connection conn = TestUtil.getConn();
//        String testSql = "LOAD DATA LOCAL INFILE 'C:/Users/fukw/Desktop/big/1234.csv' INTO TABLE zb_template_items_custom_matchrule_202006pub"
//                + " FIELDS TERMINATED BY ','"
//                + " ENCLOSED BY '\"'"
//                + " ESCAPED BY ''"
//                + " LINES TERMINATED BY '\r\n'"
//                + " IGNORE 1 LINES";

        String testSql = "LOAD DATA LOCAL INFILE '/Users/changhongsheng/work/script/big/1691484563307/entry.csv' INTO TABLE entry FIELDS TERMINATED BY ',' ENCLOSED BY '\"' ESCAPED BY '' LINES TERMINATED BY '\n" +
                "' IGNORE 1 LINES";
        PreparedStatement state = conn.prepareStatement(testSql);

        System.out.println(System.currentTimeMillis());
        state.executeUpdate();
        System.out.println(System.currentTimeMillis());






        /*PreparedStatement state = null;
        int a=0;
        boolean f = false;
        CsvReader reader=new CsvReader(path,',',Charset.forName("gbk"));
        String name=new BufferedReader(new FileReader(new File(path))).readLine();
        System.out.println(name);
        //name就是表格列的名称
        reader.readHeaders();
        int len=reader.getHeaders().length;
        System.out.println(len);
        try {
        //len表示的是有几个列
            while(reader.readRecord()){  //整个while就是为了组装成为 插入语句的形式
                state = conn.prepareStatement("insert into school("+name+") values( ?, ?, ?)");
                for(int i=1;i<len+1;i++){
                    state.setString(i,reader.get(i-1) );
                }
                a=state.executeUpdate();
                if (a > 0) {
                    f = true;
                }
                }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        	TestUtil.close(state, conn);
        }*/


        return true;
    }
}
