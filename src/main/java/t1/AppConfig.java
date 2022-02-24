package t1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Project name(项目名称)：Spring使用AspectJ_annotation
 * Package(包名): t1
 * Class(类名): AppConfig
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/24
 * Time(创建时间)： 19:21
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Configuration
@ComponentScan(basePackages = "t1")
@EnableAspectJAutoProxy
public class AppConfig
{

}
