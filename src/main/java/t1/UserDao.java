package t1;

/**
 * Project name(项目名称)：Spring使用AspectJ_annotation
 * Package(包名): t1
 * Interface(接口名): UserDao
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/24
 * Time(创建时间)： 19:16
 * Version(版本): 1.0
 * Description(描述)： 无
 */
public interface UserDao
{
    /**
     * Add.
     */
    public void add();

    /**
     * Delete.
     */
    public void delete();

    /**
     * Modify int.
     *
     * @return the int
     */
    public int modify();

    /**
     * Get.
     */
    public void get();
}
