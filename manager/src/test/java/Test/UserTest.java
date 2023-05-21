package Test;

import com.itheima.pojo.c_course;
import com.itheima.pojo.s_school;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class UserTest
{
    @Test
    public void userFindByIdTest()
    {
        String resources ="mybatis-config.xml";
        Reader reader=null;
        try {
            reader = Resources.getResourceAsReader(resources);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
        SqlSessionFactory sqlMapper=new SqlSessionFactoryBuilder().build(reader);
        SqlSession session=sqlMapper.openSession();

       c_course b=new c_course();
       b.setId(1);
       b.setHours(8);

        c_course de=new c_course();

        de.setName("大数据存储");
        de.setHours(32);
        de.setSchools(1);
        int a=session.update("updateUser",b);
        int d=session.insert("addUser",de);
        List<c_course> list2=session.selectList("findById","2");
        List<c_course> list1=session.selectList("dgg","计算机学院");
        List<c_course> list3=session.selectList("dypp");

        session.commit();
        System.out.println(a);
        System.out.println(d);
        System.out.println(list2);
        System.out.println(list1);
        System.out.println(list3);



        session.close();

    }


}
