package t1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Project name(项目名称)：Spring使用AspectJ_annotation
 * Package(包名): t1
 * Class(类名): MyAspect
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/24
 * Time(创建时间)： 19:22
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Component // 定义成 Bean
@Aspect //定义为切面
public class MyAspect
{
    @Before("execution(* t1.UserDao.add(..))")
    public void before(JoinPoint joinPoint)
    {
        System.out.println("前置增强……" + joinPoint);
    }

    @After("execution(* t1.UserDao.get(..))")
    public void after(JoinPoint joinPoint)
    {
        System.out.println("最终增强……" + joinPoint);
    }

    /**
     * 将包下的 UserDao 类中的 get() 方法 定义为一个切点
     */
    @Pointcut(value = "execution(* t1.UserDao.get(..))")
    public void pointCut1()
    {
    }

    /**
     * 将包下的 UserDao 类中的 delete() 方法 定义为一个切点
     */
    @Pointcut(value = "execution(* t1.UserDao.delete(..))")
    public void pointCut2()
    {
    }

    //使用切入点引用
    @Around("MyAspect.pointCut2()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
    {
        System.out.println("环绕增强……1");
        proceedingJoinPoint.proceed();
        System.out.println("环绕增强……2");
        return null;
    }

    //使用切入点表达式
    @AfterReturning(value = "execution(* t1.UserDao.modify(..))", returning = "returnValue")
    public void afterReturning(Object returnValue)
    {
        System.out.println("后置返回增强……,方法返回值为：" + returnValue);
    }
}
