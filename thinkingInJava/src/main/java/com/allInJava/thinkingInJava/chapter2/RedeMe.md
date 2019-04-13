# 一切都是对象
java helloworld  

用引用操作对象
存储区域  

    寄存器
    栈
    堆
    方法区
基本类型  

    boolean 
    char
    byte
    short
    int
    long
    float
    double
    void
    BigInteger
    BigDecimal
类  
方法、参数、返回值  
static  
```java public class ShowProperties {
       
           public static void main(String[] args) {
               System.getProperties().list(System.out);
               System.out.println(System.getProperty("user.name"));
               System.out.println(System.getProperty("java.library.path"));
           }
    