package t1;

import org.springframework.stereotype.Component;

/**
 * Project name(项目名称)：Spring使用AspectJ_annotation
 * Package(包名): t1
 * Class(类名): UserDaoImpl
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/24
 * Time(创建时间)： 19:16
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Component("userDao")
public class UserDaoImpl implements UserDao
{
    @Override
    public void add()
    {
        System.out.println("正在执行 UserDao 的 add 方法");
    }

    @Override
    public void delete()
    {
        System.out.println("正在执行 UserDao 的 delete 方法");
    }

    @Override
    public int modify()
    {
        System.out.println("正在执行 UserDao 的 modify 方法");
        return 1;
    }

    @Override
    public void get()
    {
        System.out.println("正在执行 UserDao 的 get 方法");
    }

}
