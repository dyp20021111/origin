package Test;

import com.itheima.pojo.Customer;
import com.itheima.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyBatisTest {
    @Test
    public void findCustomerByNameAndJobsTest()
    {
        SqlSession session= MybatisUtils.getSession();
        Customer customer=new Customer();
        customer.setUsername("jack");
        customer.setJobs("teacher");
        List<Customer> customers=session.selectList("com.itheima.mapper"+".CustomerMapper.findCustomerByNameAndJob",customer);
        for(Customer customer2:customers)
        {
            System.out.println(customer2);
        }
        session.close();
    }


}
