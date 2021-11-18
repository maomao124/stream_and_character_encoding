import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;


/**
 * Project name(项目名称)：流和字符编码
 * Package(包名): PACKAGE_NAME
 * Class(类名): unicode
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/18
 * Time(创建时间)： 13:17
 * Version(版本): 1.0
 * Description(描述)：
 * Java 中常见编码说明如下：
 * ISO8859-1：属于单字节编码，最多只能表示 0~255 的字符范围。
 * GBK/GB2312：中文的国标编码，用来表示汉字，属于双字节编码。GBK 可以表示简体中文和繁体中文，而 GB2312 只能表示简体中文。GBK 兼容 GB2312。
 * Unicode：是一种编码规范，是为解决全球字符通用编码而设计的。UTF-8 和 UTF-16 是这种规范的一种实现，此编码不兼容 ISO8859-1 编码。Java 内部采用此编码。
 * UTF：UTF 编码兼容了 ISO8859-1 编码，同时也可以用来表示所有的语言字符，不过 UTF 编码是不定长编码，
 * 每一个字符的长度为 1~6 个字节不等。一般在中文网页中使用此编码，可以节省空间。
 * 在程序中如果处理不好字符编码，就有可能出现乱码问题。例如现在本机的默认编码是 GBK，但在程序中使用了 ISO8859-1 编码，则就会出现字符的乱码问题。
 */

public class unicode
{
    public static void main(String[] args)
    {
        System.out.println("系统默认编码：" + System.getProperty("file.encoding"));
        try
        {
            File f = new File("test.txt");
            // 实例化输出流
            OutputStream out = new FileOutputStream(f);
            byte[] b = "hello world".getBytes("GB2312");
            // 保存转码之后的数据
            out.write(b);
            // 关闭输出流
            out.close();
            System.out.println("写入完成");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
