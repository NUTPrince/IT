# 硬链接

>一般情况下，文件名和inode号码是”一一对应”关系，每个inode号码对应一个文件名。
>但是Unix/Linux系统允许，多个文件名指向同一个inode号码。这意味着，可以用不同的文件名访问同样的内容；对文件内容进行修改，会影响到所有文件名；但是，删除一个文件名，不影响另一个文件名的访问。这种情况就被称为”硬链接”（hard link）。

- 硬链接相当于别名，不创建inode号。

- 链接文件与源文件存在相同的inode，只是在源文件的inode link count域里再增加1，因此硬链接不可以跨文件系统，而软链接可以。

- 删除源文件，链接文件依然可以正常访问（文件实体并未删除）。

- 不能跨分区，不能对目录使用。

- 不可以对不存在的文件和目录创建。

**创建方式：** 
```shell
硬链接：

ln target link_name
```

# 软连接

>文件A和文件B的inode号码虽然不一样，但是文件A的内容是文件B的路径。读取文件A时，系统会自动将访问者导向文件B。因此，无论打开哪一个文件，最终读取的都是文件B。这时，文件A就称为文件B的”软链接”（soft link）或者”符号链接（symbolic link）。
这意味着，文件A依赖于文件B而存在，如果删除了文件B，打开文件A就会报错：”No such file or directory”。这是软链接与硬链接最大的不同：文件A指向文件B的文件名，而不是文件B的inode号码，文件B的inode”链接数”不会因此发生变化。

- 软链接相当于快捷方式，将创建新的inode，所以链接文件与源文件的inode不同。

- 软链接的 inode 所指向的内容实际上是保存了一个绝对路径，当用户访问这个文件时，系统会自动将其替换成其所指的文件路径。

- 软连接和源文件文件类型不同，软链接文件权限为777，文件属性有l标识，访问权限真正取决于源文件权限。

- 删除源文件，软链接文件访问不了。
 
- 可以对不存在的文件和目录创建。

**创建方式：** 
```shell
软链接：

ln -s target link_name
```

# inode
>文件储存在硬盘上，硬盘的最小存储单位叫做"扇区"（Sector）。每个扇区储存512字节（相当于0.5KB）。
>
>操作系统读取硬盘的时候，不会一个个扇区地读取，这样效率太低，而是一次性连续读取多个扇区，即一次性读取一个"块"（block）。这种由多个扇区组成的"块"，是文件存取的最小单位。"块"的大小，最常见的是4KB，即连续八个 sector组成一个 block。
>
>文件数据都储存在"块"中，那么很显然，我们还必须找到一个地方储存文件的元信息，比如文件的创建者、文件的创建日期、文件的大小等等。这种储存文件元信息的区域就叫做inode，中文译名为"索引节点"。
>
>Inode相当于文件指针，指向了物理硬盘的一个区块。事实上文件系统会维护一个引用计数，只要有文件指向这个区块，它就不会从硬盘上消失.

inode中的内容:

- 文件的字节数，块数

- 文件拥有者的User ID

- 文件的Group ID

- 文件的读、写、执行权限

- 文件的时间戳，共有三个：1. ctime指inode上一次变动的时间。2. mtime指文件内容上一次 变动的时间。3. atime指文件上一次打开的时间。

- 链接数，即有多少文件名指向这个inode

- 文件数据block的位置

- inode编号（对应数组的下标）

inode编号是很重要的，当系统在找一个文件时，步骤如下：

> 1.通过文件名先找到文件的inode编号  
> 
> 2.通过inode编号找到文件inode信息  
> 
> 3.通过inode信息中的block指针找到文件内容。

# 硬链接与软链接的区别和联系

## 区别
![[s-2.png]]

## 联系
![[s-1.png]]
