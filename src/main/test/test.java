import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context-mybatis.xml",
        "classpath:spring-context-druid.xml"})
public class test {
    @Test
    public void test1(){

    }
}
