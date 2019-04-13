package com.allInJava.thinkingInJava.chapter2;

/**
 * @author: yuhang
 * @date: 2019/4/13
 */
public class ShowProperties {

    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
        /**
         * 运行结果 主要是系统属性
         * D:\study\java\jdk1.8.0_131\bin\java.exe "-javaagent:D:\study\java\idea\IntelliJ IDEA 2018.1.5\lib\idea_rt.jar=50348:D:\study\java\idea\IntelliJ IDEA 2018.1.5\bin" -Dfile.encoding=UTF-8 -classpath D:\study\java\jdk1.8.0_131\jre\lib\charsets.jar;D:\study\java\jdk1.8.0_131\jre\lib\deploy.jar;D:\study\java\jdk1.8.0_131\jre\lib\ext\access-bridge-64.jar;D:\study\java\jdk1.8.0_131\jre\lib\ext\cldrdata.jar;D:\study\java\jdk1.8.0_131\jre\lib\ext\dnsns.jar;D:\study\java\jdk1.8.0_131\jre\lib\ext\jaccess.jar;D:\study\java\jdk1.8.0_131\jre\lib\ext\jfxrt.jar;D:\study\java\jdk1.8.0_131\jre\lib\ext\localedata.jar;D:\study\java\jdk1.8.0_131\jre\lib\ext\nashorn.jar;D:\study\java\jdk1.8.0_131\jre\lib\ext\sunec.jar;D:\study\java\jdk1.8.0_131\jre\lib\ext\sunjce_provider.jar;D:\study\java\jdk1.8.0_131\jre\lib\ext\sunmscapi.jar;D:\study\java\jdk1.8.0_131\jre\lib\ext\sunpkcs11.jar;D:\study\java\jdk1.8.0_131\jre\lib\ext\zipfs.jar;D:\study\java\jdk1.8.0_131\jre\lib\javaws.jar;D:\study\java\jdk1.8.0_131\jre\lib\jce.jar;D:\study\java\jdk1.8.0_131\jre\lib\jfr.jar;D:\study\java\jdk1.8.0_131\jre\lib\jfxswt.jar;D:\study\java\jdk1.8.0_131\jre\lib\jsse.jar;D:\study\java\jdk1.8.0_131\jre\lib\management-agent.jar;D:\study\java\jdk1.8.0_131\jre\lib\plugin.jar;D:\study\java\jdk1.8.0_131\jre\lib\resources.jar;D:\study\java\jdk1.8.0_131\jre\lib\rt.jar;D:\code\idea-workspace\AllInJava\thinkingInJava\target\classes com.allInJava.thinkingInJava.chapter2.ShowProperties
         * -- listing properties --
         * java.runtime.name=Java(TM) SE Runtime Environment
         * sun.boot.library.path=D:\study\java\jdk1.8.0_131\jre\bin
         * java.vm.version=25.131-b11
         * java.vm.vendor=Oracle Corporation
         * java.vendor.url=http://java.oracle.com/
         * path.separator=;
         * java.vm.name=Java HotSpot(TM) 64-Bit Server VM
         * file.encoding.pkg=sun.io
         * user.script=
         * user.country=CN
         * sun.java.launcher=SUN_STANDARD
         * sun.os.patch.level=
         * java.vm.specification.name=Java Virtual Machine Specification
         * user.dir=D:\code\idea-workspace\AllInJava
         * java.runtime.version=1.8.0_131-b11
         * java.awt.graphicsenv=sun.awt.Win32GraphicsEnvironment
         * java.endorsed.dirs=D:\study\java\jdk1.8.0_131\jre\lib\en...
         * os.arch=amd64
         * java.io.tmpdir=C:\Users\yuhang\AppData\Local\Temp\
         * line.separator=
         *
         * java.vm.specification.vendor=Oracle Corporation
         * user.variant=
         * os.name=Windows 10
         * sun.jnu.encoding=GBK
         * java.library.path=D:\study\java\jdk1.8.0_131\bin;C:\Win...
         * java.specification.name=Java Platform API Specification
         * java.class.version=52.0
         * sun.management.compiler=HotSpot 64-Bit Tiered Compilers
         * os.version=10.0
         * user.home=C:\Users\yuhang
         * user.timezone=
         * java.awt.printerjob=sun.awt.windows.WPrinterJob
         * file.encoding=UTF-8
         * java.specification.version=1.8
         * user.name=yuhang
         * java.class.path=D:\study\java\jdk1.8.0_131\jre\lib\ch...
         * java.vm.specification.version=1.8
         * sun.arch.data.model=64
         * java.home=D:\study\java\jdk1.8.0_131\jre
         * sun.java.command=com.allInJava.thinkingInJava.chapter2...
         * java.specification.vendor=Oracle Corporation
         * user.language=zh
         * awt.toolkit=sun.awt.windows.WToolkit
         * java.vm.info=mixed mode
         * java.version=1.8.0_131
         * java.ext.dirs=D:\study\java\jdk1.8.0_131\jre\lib\ex...
         * sun.boot.class.path=D:\study\java\jdk1.8.0_131\jre\lib\re...
         * java.vendor=Oracle Corporation
         * file.separator=\
         * java.vendor.url.bug=http://bugreport.sun.com/bugreport/
         * sun.cpu.endian=little
         * sun.io.unicode.encoding=UnicodeLittle
         * sun.desktop=windows
         * sun.cpu.isalist=amd64
         * yuhang
         * D:\study\java\jdk1.8.0_131\bin;C:\Windows\Sun\Java\bin;C:\Windows\system32;C:\Windows;C:\Program Files (x86)\Common Files\NetSarang;C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\Windows\System32\OpenSSH\;D:\study\java\jdk1.8.0_131\bin;D:\study\apache-maven-3.5.0\bin;D:\study\apache-tomcat-8.5.9\bin;D:\study\git\Git\bin;D:\study\mysql\mysql5.5\bin\bin;C:\Program Files\MySQL\MySQL Server 5.5\bin;D:\study\git\Git\cmd;C:\Users\yuhang\AppData\Local\Microsoft\WindowsApps;;.
         */
    }
}
