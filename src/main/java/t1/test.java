package t1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Project name(项目名称)：Spring使用AspectJ_annotation
 * Package(包名): t1
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/24
 * Time(创建时间)： 19:27
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    public static void main(String[] args)
    {
        ApplicationContext context2 = new AnnotationConfigApplicationContext(AppConfig.class);
        UserDao userDao = context2.getBean("userDao", UserDao.class);
        userDao.add();
        userDao.modify();
        userDao.delete();
        userDao.get();
    }
}
