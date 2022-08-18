# JAVA学习笔记（NUTPrince）

  

## JDK、JRE、JVM

  

### JDK

  

> JDK 的全称(Java Development Kit Java 开发工具包) 

  

​      JDK = JRE + java 的开发工具 [java, javac,javadoc,javap 等]

  

###JRE

  

> JRE(Java Runtime Environment Java 运行环境) JRE = JVM + Java 的核心类库[类] 

  

  

  

### JVM

  

> JVM是Java Virtual Machine（Java虚拟机)

  

Java虚拟机本质上就是一个程序，当它在命令行上启动的时候，就开始执行保存在某字节码文件中的指令。Java语言的可移植性正是建立在Java虚拟机的基础上。任何平台只要装有针对于该平台的Java虚拟机，字节码文件（.class）就可以在该平台上运行。这就是“一次编译，多次运行”。

  

###JDK、JRE 和 JVM 的包含关系

  

1. JDK = JRE + 开发工具集（例如 Javac,java 编译工具等)

2. JRE = JVM + Java SE 标准类库（java 核心类库）

3. 如果只想运行开发好的 .class 文件 只需要 JRE

  

## 安装JDK，配置环境变量

  

1. 安装JDK

    [JDK下载](https://www.oracle.com/java/technologies/downloads/#jdk17-windows)

  

  > 默认安装，也可选安装在其他盘（记住路径，配置环境变量需要用到）

  

2. 配置环境变量

  

  + 此电脑->属性->高级系统设置->环境变量

  

  > 在系统变量中

  >

  > 点击新建->变量名：JAVA_HOME,变量名：安装路径，确定

  >

  > ![](https://gitee.com/nutprince/image/raw/master/JAVA_Image/%E7%8E%AF%E5%A2%83%E5%8F%98%E9%87%8F1.png)

  >

  > 再双击path

  >

  > ![](https://gitee.com/nutprince/image/raw/master/JAVA_Image/%E7%8E%AF%E5%A2%83%E5%8F%98%E9%87%8F2.png)

  >

  > 点击新建

  >

  > ![](https://gitee.com/nutprince/image/raw/master/JAVA_Image/%E7%8E%AF%E5%A2%83%E5%8F%98%E9%87%8F3.png)

  >

  > 输入：%JAVA_HOME%\bin,确定

  >

  > ![](https://gitee.com/nutprince/image/raw/master/JAVA_Image/%E7%8E%AF%E5%A2%83%E5%8F%98%E9%87%8F4.png)

  

  > 测试

  >

  > win+R键，输入cmd回车

  >

  > 输入java回车

  >

  > ![测试1](https://gitee.com/nutprince/image/raw/master/JAVA_Image/%E6%B5%8B%E8%AF%951.png)

  >

  >输入javac回车

  > 

  >![测试2](https://gitee.com/nutprince/image/raw/master/JAVA_Image/%E6%B5%8B%E8%AF%952.png)

  

## JAVA运行机制

  

  ![java运行机制](https://gitee.com/nutprince/image/raw/master/JAVA_Image/java%E8%BF%90%E8%A1%8C%E6%9C%BA%E5%88%B6.png)

  

## 第一个Java程序—helloworld

  

```java

public calss Helloworld{

    public static void main(String[] args){

        System.out.println("helloworld!");

    }

}

```

  

![662E827A-FA32-4464-B0BD-40087F429E98](https://gitee.com/nutprince/image/raw/master/JAVA_Image/202201150055352.jpg)

  

## Java基本语法

  

编写 Java 程序时，应注意以下几点：

  

+ **大小写敏感**：Java 是大小写敏感的，这就意味着标识符 Hello 与 hello 是不同的。

+ **类名**：对于所有的类来说，类名的首字母应该大写。如果类名由若干单词组成，那么每个单词的首字母应该大写，例如 **MyFirstJavaClass** 。

+ **方法名**：所有的方法名都应该以小写字母开头。如果方法名含有若干单词，则后面的每个单词首字母大写。

+ **源文件名**：源文件名必须和类名相同。当保存文件的时候，你应该使用类名作为文件名保存（切记 Java 是大小写敏感的），文件名的后缀为 **.java**。（如果文件名和类名不相同则会导致编译错误）。

+ **主方法入口**：所有的 Java 程序由 **public static void main(String[] args)** 方法开始执行。

  

## Java 标识符

  

Java 所有的组成部分都需要名字。类名、变量名以及方法名都被称为标识符。

  

关于 Java 标识符，有以下几点需要注意：

  

+ 所有的标识符都应该以字母（A-Z 或者 a-z）,美元符（$）、或者下划线（_）开始

+ 首字符之后可以是字母（A-Z 或者 a-z）,美元符（$）、下划线（_）或数字的任何字符组合

+ 关键字不能用作标识符

+ 标识符是大小写敏感的

+ 合法标识符举例：age、$salary、_value、__1_value

+ 非法标识符举例：123abc、-salary

  

## Java 关键字

  

下面列出了 Java 关键字。这些保留字不能用于常量、变量、和任何标识符的名称。

| **类别** | **关键字** |
|:---:|:---:|
| private | 访问控制 |
| protected | 受保护的 |
| public | 公共的 |
| default | 默认 |
| class | 类 |
| extends | 扩充,继承 |
| final | 最终值,不可改变的 |
| implements | 实现（接口） |
| interface | 接口 |
| native | 本地，原生方法（非 Java 实现） |
| new | 新,创建 |
| static | 静态 |
| strictfp | 严格,精准 |
| synchronized | 线程,同步 |
| transient | 短暂 |
| volatile | 易失 |
| continue | 继续 |
| default | 默认 |
| do | 运行 |
| else | 否则 |
| for | 循环 |
| if | 如果 |
| instanceof | 实例 |
| return | 返回 |
| switch | 根据值选择执行 |
| while | 循环 |
| catch | 捕捉异常 |
| finally | 有没有异常都执行 |
| throw | 抛出一个异常对象 |
| throws | 声明一个异常可能被抛出 |
| try | 捕获异常 |
| package | 包 |
| byte | 字节型 |
| char | 字符型 |
| double | 双精度浮点 |
| float | 单精度浮点 |
| int | 整型 |
| long | 长整型 |
| short | 短整型 |
| this | 本类 |
| void | 无返回值 |


  

**注意：**Java 的 null 不是关键字，类似于 true 和 false，它是一个字面常量，不允许作为标识符使用。

  

## Java注释

  

注释中的字符将被 Java 编译器忽略。

  

+ 单行注释

  

  ```java

  //这是一个不会被编译的注释

  ```

  

+ 多行注释

  

  ```java

  /*

  这是一个不会被编译的注释

  */

  ```

  

+ 文档注释

  

  ```java

  /**这是一个不会被编译的注释

  *@auther:NUTPrice

  *@version:1.0

  */

  ```

  

  > Java 支持三种注释方式。前两种分别是 **//** 和 **/\* \*/**，第三种被称作说明注释，它以 **/\**** 开始，以 ***/**结束。

  >

  > 说明注释允许你在程序中嵌入关于程序的信息。你可以使用 javadoc 工具软件来生成信息，并输出到HTML文件中。

  >

  > 说明注释，使你更加方便的记录你的程序信息。

  

  javadoc 工具软件识别以下标签：

  

  | **标签**      |                        **描述**                        |                           **示例**                           |

  | :------------ | :----------------------------------------------------: | :----------------------------------------------------------: |

  | @author       |                    标识一个类的作者                    |                     @author description                      |

  | @deprecated   |                 指名一个过期的类或成员                 |                   @deprecated description                    |

  | {@docRoot}    |                指明当前文档根目录的路径                |                        Directory Path                        |

  | @exception    |                  标志一个类抛出的异常                  |            @exception exception-name explanation             |

  | {@inheritDoc} |                  从直接父类继承的注释                  |      Inherits a comment from the immediate surperclass.      |

  | {@link}       |               插入一个到另一个主题的链接               |                      {@link name text}                       |

  | {@linkplain}  |  插入一个到另一个主题的链接，但是该链接显示纯文本字体  |          Inserts an in-line link to another topic.           |

  | @param        |                   说明一个方法的参数                   |              @param parameter-name explanation               |

  | @return       |                     说明返回值类型                     |                     @return explanation                      |

  | @see          |               指定一个到另一个主题的链接               |                         @see anchor                          |

  | @serial       |                   说明一个序列化属性                   |                     @serial description                      |

  | @serialData   | 说明通过writeObject( ) 和 writeExternal( )方法写的数据 |                   @serialData description                    |

  | @serialField  |             说明一个ObjectStreamField组件              |              @serialField name type description              |

  | @since        |               标记当引入一个特定的变化时               |                        @since release                        |

  | @throws       |                 和 @exception标签一样.                 | The @throws tag has the same meaning as the @exception tag.  |

  | {@value}      |         显示常量的值，该常量必须是static属性。         | Displays the value of a constant, which must be a static field. |

  | @version      |                      指定类的版本                      |                        @version info                         |

  

## Java 基本数据类型

  

> 变量就是申请内存来存储值。也就是说，当创建变量的时候，需要在内存中申请空间。

>

> 内存管理系统根据变量的类型为变量分配存储空间，分配的空间只能用来储存该类型数据。

>

> 因此，通过定义不同类型的变量，可以在内存中储存整数、小数或者字符。

  

Java 的两大数据类型:

  

+ 内置数据类型

  

+ 引用数据类型

  

  

**类型默认值**

  

下表列出了 Java 各个类型的默认值：

  

| **数据类型**           | **默认值** |

| :--------------------- | :--------- |

| byte                   | 0          |

| short                  | 0          |

| int                    | 0          |

| long                   | 0L         |

| float                  | 0.0f       |

| double                 | 0.0d       |

| char                   | 'u0000'    |

| String (or any object) | null       |

| boolean                | false      |

类型默认值

下表列出了 Java 各个类型的默认值：

  

**自动类型转换**

  

> 整型、实型（常量）、字符型数据可以混合运算。运算中，不同类型的数据先转化为同一类型，然后进行运算。

  

转换从低级到高级。

  

```

低  ------------------------------------>  高

  

byte,short,char—> int —> long—> float —> double 

```

## Java 变量类型

  

> 在Java语言中，所有的变量在使用前必须声明。

  

Java语言支持的变量类型有：

  

+ 类变量：独立于方法之外的变量，用 static 修饰。

+ 实例变量：独立于方法之外的变量，不过没有 static 修饰。

+ 局部变量：类的方法中的变量。

  

## Java 运算符

  

计算机的最基本用途之一就是执行数学运算，作为一门计算机语言，Java也提供了一套丰富的运算符来操纵变量。我们可以把运算符分成以下几组：

  

+ 算术运算符

+ 关系运算符

+ 位运算符

+ 逻辑运算符

+ 赋值运算符

+ 其他运算符

  

### 算术运算符

  

> 算术运算符用在数学表达式中，它们的作用和在数学中的作用一样。

  

下表列出了所有的算术运算符。

  

| 操作符 | 描述                              |

| :----- | :-------------------------------- |

| +      | 加法 - 相加运算符两侧的值         |

| -      | 减法 - 左操作数减去右操作数       |

| *      | 乘法 - 相乘操作符两侧的值         |

| /      | 除法 - 左操作数除以右操作数       |

| ％     | 取余 - 左操作数除以右操作数的余数 |

| ++     | 自增: 操作数的值增加1             |

| --     | 自减: 操作数的值减少1             |

  

### 自增自减运算符

  

**1、自增（++）自减（--）运算符**:是一种特殊的算术运算符，在算术运算符中需要两个操作数来进行运算，而自增自减运算符是一个操作数。

  

**2、前缀自增自减法(++a,--a):** 先进行自增或者自减运算，再进行表达式运算。

  

**3、后缀自增自减法(a++,a--):** 先进行表达式运算，再进行自增或者自减运算。

  

### 关系运算符

  

下表为Java支持的关系运算符

  

```java

int a = 10,b = 20;

```

  

| 运算符 | 例子             |

| :----- | :--------------- |

| ==     | （A == B）为假。 |

| !=     | (A != B) 为真。  |

| >      | （A> B）为假。   |

| <      | （A <B）为真。   |

| >=     | （A> = B）为假。 |

| <=     | （A <= B）为真。 |

  

### 位运算符

  

Java定义了位运算符，应用于整数类型(int)，长整型(long)，短整型(short)，字符型(char)，和字节型(byte)等类型。

  

位运算符作用在所有的位上，并且按位运算。假设a = 60，b = 13;它们的二进制格式表示将如下：

  

```

A = 0011 1100

B = 0000 1101

-----------------

A&B = 0000 1100

//同时为1->才取1，否则为0

  

A | B = 0011 1101

//同时为0->才取0，否则为1

  

A ^ B = 0011 0001

//同则为0，不同为1

  

~A= 1100 0011

//取反

```

  

下表列出了位运算符的基本运算，假设整数变量 A 的值为 60 和变量 B 的值为 13：

  

| 操作符 | 描述                                                         | 例子                           |

| :----- | :----------------------------------------------------------- | :----------------------------- |

| ＆     | 如果相对应位都是1，则结果为1，否则为0                        | （A＆B），得到12，即0000 1100  |

| \|     | 如果相对应位都是 0，则结果为 0，否则为 1                     | （A \| B）得到61，即 0011 1101 |

| ^      | 如果相对应位值相同，则结果为0，否则为1                       | （A ^ B）得到49，即 0011 0001  |

| ～     | 按位取反运算符翻转操作数的每一位，即0变成1，1变成0。         | （～A）得到-61，即1100 0011    |

| <<     | 按位左移运算符。左操作数按位左移右操作数指定的位数。         | A << 2得到240，即 1111 0000    |

| >>     | 按位右移运算符。左操作数按位右移右操作数指定的位数。         | A >> 2得到15即 1111            |

| >>>    | 按位右移补零操作符。左操作数的值按右操作数指定的位数右移，移动得到的空位以零填充。 | A>>>2得到15即0000 1111         |

  

### 逻辑运算符

  

下表列出了逻辑运算符的基本运算，假设布尔变量A为真，变量B为假

  

| 操作符 | 描述                                                         | 例子                |

| :----- | :----------------------------------------------------------- | :------------------ |

| &&     | 称为逻辑与运算符。当且仅当两个操作数都为真，条件才为真。     | （A && B）为假。    |

| \| \|  | 称为逻辑或操作符。如果任何两个操作数任何一个为真，条件为真。 | （A \| \| B）为真。 |

| ！     | 称为逻辑非运算符。用来反转操作数的逻辑状态。如果条件为true，则逻辑非运算符将得到false。 | ！（A && B）为真。  |

  

### 条件运算符

  

条件运算符也被称为三元运算符。该运算符有3个操作数，并且需要判断布尔表达式的值。该运算符的主要是决定哪个值应该赋值给变量。

  

```java

variable x = (expression) ? value if true : value if false

```

  

### Java运算符优先级

  

当多个运算符出现在一个表达式中，谁先谁后呢？这就涉及到运算符的优先级别的问题。在一个多运算符的表达式中，运算符优先级不同会导致最后得出的结果差别甚大。

  

例如，（1+3）＋（3+2）*2，这个表达式如果按加号最优先计算，答案就是 18，如果按照乘号最优先，答案则是 14。

  

再如，x = 7 + 3 * 2;这里x得到13，而不是20，因为乘法运算符比加法运算符有较高的优先级，所以先计算3 * 2得到6，然后再加7。

  

下表中具有最高优先级的运算符在的表的最上面，最低优先级的在表的底部。

  

| 类别     | 操作符                                     | 关联性   |

| :------- | :----------------------------------------- | :------- |

| 后缀     | () [] . (点操作符)                         | 左到右   |

| 一元     | expr++ expr--                              | 从左到右 |

| 一元     | ++expr --expr + - ～ ！                    | 从右到左 |

| 乘性     | * /％                                      | 左到右   |

| 加性     | + -                                        | 左到右   |

| 移位     | >> >>>  <<                                 | 左到右   |

| 关系     | > >= < <=                                  | 左到右   |

| 相等     | == !=                                      | 左到右   |

| 按位与   | ＆                                         | 左到右   |

| 按位异或 | ^                                          | 左到右   |

| 按位或   | \|                                         | 左到右   |

| 逻辑与   | &&                                         | 左到右   |

| 逻辑或   | \| \|                                      | 左到右   |

| 条件     | ？：                                       | 从右到左 |

| 赋值     | = + = - = * = / =％= >> = << =＆= ^ = \| = | 从右到左 |

| 逗号     | ，                                         | 左到右   |

  

## JAVA流程控制

  

### 输出

  

> 格式化输出使用`System.out.printf()`

  

- Java的格式化功能提供了多种占位符，可以把各种数据类型“格式化”成指定的字符串：

  

|占位符|说明|

|:----|----|

|%d|格式化输出整数|

|%x|格式化输出十六进制整数|

|%f|格式化输出浮点数|

|%e|格式化输出科学计数法表示的浮点数|

|%s|格式化字符串|

  

例如：

```java

public class Main {

    public static void main(String\[\] args) {  

        int n = 12345000;   

        System.out.printf("n=%d, hex=%08x", n, n); // 注意，两个%占位符必须传入两个数

    }

}

  

```

  

### 输入

  

> 和输出相比，Java的输入就要复杂得多。

  

```java

import java.util.Scanner;

  

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // 创建Scanner对象

        System.out.print("Input your name: "); // 打印提示

        String name = scanner.nextLine(); // 读取一行输入并获取字符串

        System.out.print("Input your age: "); // 打印提示

        int age = scanner.nextInt(); // 读取一行输入并获取整数

        System.out.printf("Hi, %s, you are %d\n", name, age); // 格式化输出

    }

}

```

  

首先，我们通过`import`语句导入`java.util.Scanner`，`import`是导入某个类的语句，必须放到Java源代码的开头。

  

然后，创建`Scanner`对象并传入`System.in`。`System.out`代表标准输出流，而`System.in`代表标准输入流。

  

直接使用`System.in`读取用户输入虽然是可以的，但需要更复杂的代码，而通过`Scanner`就可以简化后续的代码。

  

有了`Scanner`对象后，要读取用户输入的字符串，使用`scanner.nextLine()`，要读取用户输入的整数，使

  

用`scanner.nextInt()`。Scanner会自动转换数据类型，因此不必手动转换。

  

### if判断

  

**if...(else if)...(else) 语句**

  

**if 语句后面可以跟 else if…else 语句，这种语句可以检测到多种可能的情况。**

  

> 使用 if，else if，else 语句的时候，需要注意下面几点：

  

- if 语句至多有 1 个 else 语句，else 语句在所有的 else if 语句之后。

- if 语句可以有若干个 else if 语句，它们必须在 else 语句之前。

- 一旦其中一个 else if 语句检测为 true，其他的 else if 以及 else 语句都将跳过执行。

  

### switch多重选择

  

`switch`语句根据`switch (表达式)`计算的结果，跳转到匹配的`case`结果，然后继续执行后续语句，直到遇到`break`结束执行。

  

使用`switch`时，注意`case`语句并没有花括号`{}`，而且，`case`语句具有“_穿透性_”，漏写`break`将导致意想不到的结果。

  

### switch表达式

  

使用`switch`时，如果遗漏了`break`，就会造成严重的逻辑错误，而且不易在源代码中发现错误。从Java 12开始，`switch`语句升级为更简洁的表达式语法，使用类似模式匹配（Pattern Matching）的方法，保证只有一种路径会被执行，并且不需要`break`语句：

  

```java

public class Main {

public static void main(String\[\] args) {

  

    String fruit = "apple";

  

    switch (fruit) {

  

    case "apple" -> System.out.println("Selected apple");

  

    case "pear" -> System.out.println("Selected pear");

  

    case "mango" -> {

  

        System.out.println("Selected mango");

  

        System.out.println("Good choice!");

  

    }

  

    default -\> System.out.println("No fruit selected");

  

    }

}

}

```

  

### while循环

  

while是最基本的循环，它的结构为：

  

```java

while( 布尔表达式 ) { 

  //循环内容 

}

```

  

只要布尔表达式为 true，循环就会一直执行下去。

  

### do…while 循环

  

对于 while 语句而言，如果不满足条件，则不能进入循环。但有时候我们需要即使不满足条件，也至少执行一次。

  

do…while 循环和 while 循环相似，不同的是，do…while 循环至少会执行一次。

  

```

do {

       //代码语句

}while(布尔表达式);

```

  

**注意：**布尔表达式在循环体的后面，所以语句块在检测布尔表达式之前已经执行了。 如果布尔表达式的值为 true，则语句块一直执行，直到布尔表达式的值为 false。

  

###  for循环

  

虽然所有循环结构都可以用 while 或者 do...while表示，但 Java 提供了另一种语句 —— for 循环，使一些循环结构变得更加简单。

  

for循环执行的次数是在执行前就确定的。语法格式如下：

  

```java

for(初始化; 布尔表达式; 更新) {    //代码语句 }

```

  

  

关于 for 循环有以下几点说明：

  

- 最先执行初始化步骤。可以声明一种类型，但可初始化一个或多个循环控制变量，也可以是空语句。

- 然后，检测布尔表达式的值。如果为 true，循环体被执行。如果为false，循环终止，开始执行循环体后面的语句。

- 执行一次循环后，更新循环控制变量。

- 再次检测布尔表达式。循环执行上面的过程。

  

### 增强 for 循环

  

Java 增强 for 循环语法格式如下:

  

```java

for(声明语句 : 表达式) {   

  //代码句子

}

```

  

  

  

**声明语句：**声明新的局部变量，该变量的类型必须和数组元素的类型匹配。其作用域限定在循环语句块，其值与此时数组元素的值相等。

  

**表达式：**表达式是要访问的数组名，或者是返回值为数组的方法。

  

### break 关键字

  

break 主要用在循环语句或者 switch 语句中，用来跳出整个语句块。

  

break 跳出最里层的循环，并且继续执行该循环下面的语句。

  

### continue 关键字

  

continue 适用于任何循环控制结构中。作用是让程序立刻跳转到下一次循环的迭代。

  

在 for 循环中，continue 语句使程序立即跳转到更新语句。

  

在 while 或者 do…while 循环中，程序立即跳转到布尔表达式的判断语句。

  

## 面向对象

  

![未命名文件](https://gitee.com/NUTPrince/image/raw/master/JAVA_Image/%E6%9C%AA%E5%91%BD%E5%90%8D%E6%96%87%E4%BB%B6.jpg)

  

静态的属性 ->  属性

  

动态的行为 ->  方法

  

静态代码块（只会初次加载一次  ）->匿名代码块->构造代码块