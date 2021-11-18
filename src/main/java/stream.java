import java.io.FileWriter;
import java.io.IOException;

/**
 * Project name(项目名称)：流和字符编码
 * Package(包名): PACKAGE_NAME
 * Class(类名): stream
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/18
 * Time(创建时间)： 13:08
 * Version(版本): 1.0
 * Description(描述)：
 * 数据流是 Java 进行 I/O 操作的对象，它按照不同的标准可以分为不同的类别。
 * 按照流的方向主要分为输入流和输出流两大类。
 * 数据流按照数据单位的不同分为字节流和字符流。
 * 按照功能可以划分为节点流和处理流。
 * 数据流的处理只能按照数据序列的顺序来进行，即前一个数据处理完之后才能处理后一个数据。
 * 数据流以输入流的形式被程序获取，再以输出流的形式将数据输出到其它设备。
 * 输入流
 * Java 流相关的类都封装在 java.io 包中，而且每个数据流都是一个对象。
 * 所有输入流类都是 InputStream 抽象类（字节输入流）和 Reader 抽象类（字符输入流）的子类。
 * 其中 InputStream 类是字节输入流的抽象类，是所有字节输入流的父类，
 * 名称	         作用
 * int read()	从输入流读入一个 8 字节的数据，将它转换成一个 0~ 255 的整数，返回一个整数，如果遇到输入流的结尾返回 -1
 * int read(byte[] b)	从输入流读取若干字节的数据保存到参数 b 指定的字节数组中，返回的字节数表示读取的字节数，如果遇到输入流的结尾返回 -1
 * int read(byte[] b,int off,int len)	从输入流读取若干字节的数据保存到参数 b 指定的字节数组中，其中 off 是指在数组中开始保存数据位置的起始下标，len 是指读取字节的位数。返回的是实际读取的字节数，如果遇到输入流的结尾则返回 -1
 * void close()	关闭数据流，当完成对数据流的操作之后需要关闭数据流
 * int available()	返回可以从数据源读取的数据流的位数。
 * skip(long n)	从输入流跳过参数 n 指定的字节数目
 * boolean markSupported()	判断输入流是否可以重复读取，如果可以就返回 true
 * void mark(int readLimit)	如果输入流可以被重复读取，从流的当前位置开始设置标记，readLimit 指定可以设置标记的字节数
 * void reset()	使输入流重新定位到刚才被标记的位置，这样可以重新读取标记过的数据
 * 输出流
 * 在 Java 中所有输出流类都是 OutputStream 抽象类（字节输出流）和 Writer 抽象类（字符输出流）的子类。
 * 其中 OutputStream 类是字节输出流的抽象类，是所有字节输出流的父类
 * 名称	        作用
 * int write(b)	将指定字节的数据写入到输出流
 * int write (byte[] b)	将指定字节数组的内容写入输出流
 * int write (byte[] b,int off,int len)	将指定字节数组从 off 位置开始的 len 字节的内容写入输出流
 * close()	关闭数据流，当完成对数据流的操作之后需要关闭数据流
 * flush()	刷新输出流，强行将缓冲区的内容写入输出流
 * <p>
 * System.in：标准输入流，默认设备是键盘。
 * System.out：标准输出流，默认设备是控制台。
 * System.err：标准错误流，默认设备是控制台。
 */

public class stream
{
    public static void main(String[] args)
    {
        try
        {
            int sum = 0;
            for (int i = 1; i <= 100; i++)
            {
                sum += i;
            }
            // 输出控制台
            System.out.println("计算结果1：" + sum);
            // 构建文件输出流，输出到文件f1.txt中
            FileWriter fout = new FileWriter("f1.txt");
            fout.write("计算结果2：" + sum);
            fout.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        byte[] byteData = new byte[100];
        int count = 0;
        System.out.println("请输入英文：");
        try
        {
            count = System.in.read(byteData);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.println("您输入的内容如下：");
        for (int i = 0; i < count; i++)
        {
            System.out.print((char) byteData[i]);
        }
    }
}
