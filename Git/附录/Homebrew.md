# homebrew简介
[homebrew官网](https://brew.sh/index_zh-cn)是使用 ruby 语言写的 Mac 系统的包管理工具 (也有 Linux 版本), 在系统默认没有提供相关包的情况下发挥作用. 大多是工程类没有图形界面的包。

Homebrew 的优点是能够判断系统中已经有的组件而不会重复下载, 其他的包管理工具如 `MacPorts`, `Fink`, `pkgsrc`, `Gentoo Prefix`等都会重复下载系统已有的组件。

homebrew是MacOS系统里面包的管理工具，主要解决软件或者包下载时的各种依赖包。

## 下载方法
**官方下载：
```shell
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
```
<显示github连接失败，可使用国内镜像>

## 国内镜像安装
```shell
/bin/zsh -c "$(curl -fsSL https://gitee.com/cunkai/HomebrewCN/raw/master/Homebrew.sh)"
```
按照提示下载安装即可。

# brew基础命令

-   `brew install vim`: 安装 vim
-   `brew install cask`: 安装 cask(也是一种软件管理工具, 但是涵盖软件范围广, 基本都是图形界面软件, 比如 QQ 微信等)
-   `brew help`: 查看简单帮助
-   `brew install <package name>`: 安装软件包
-   `brew uninstall <package name>`: 卸载软件包
-   `brew list [--versions]`: 列出已安装的软件包 (包括版本)
-   `brew search <package name>`: 查找软件包
-   `brew info <package name>`: 查看软件包信息
-   `brew update`: 更新 brew
-   `brew cleanup`: 清理所有包的旧版本
-   `brew outdated`: 列出过时的软件包 (已安装但不是最新版本)
-   `brew upgrade [<package name>]`: 更新过时的软件包 (不指定软件包表示更新全部)
-   `brew doctor`: 检查 brew 运行状态
-   `man brew`: 显示使用手册
-   `brew pin $FORMULA`: 锁定某个包 (以后不会再更新)
-   `brew unpin $FORMULA`: 取消锁定
-   `brew tap buo/cask-upgrade`: 安装一个第三方的仓库
    -   第三方仓库需要在`GitHub`上, 且仓库名必须以 `homebrew-`开头
    -   此命令的仓库名可以简写, 省略了`homebrew-`
    -   在`brew install`时, 默认的检查顺序如下
        1.  pinned taps
        2.  core formulae
        3.  other taps
-   `brew tap-pin user/repo`: 固定某个第三方仓库
-   `brew tap-info --installed`: 列出所有已安装的 `taps`
-   `brew untap buo/cask-upgrade`: 删除
-   `brew deps --installed --tree`: 查看已安装的包的依赖, 树形显示
-   `brew install mas`: 安装更新官方商店软件的插件
-   `mas upgrade`: 更新 mas 内需要更新的软件

## 如何安装旧版本包

### 使用 brew tap

以安装 1.2.22 版本的 `pyenv` 为例

```
# 1. create a new local tap(ignore this if created)
brew tap-new $USER/local
# 2. extract into our local tap
brew extract --version=1.2.22 pyenv hanley/local
# 3. run brew install@version as usual
brew install pyenv@1.2.22
brew pin pyenv@1.2.22
```

> 从 [https://github.com/Homebrew/homebrew-core/find/master](https://github.com/Homebrew/homebrew-core/find/master) 找到所需包的历史版本
> 
> 或者直接使用 `<https://github.com/Homebrew/homebrew-core/commits/master/Formula/<yourpackage>.rb` 定位到版本 commits 列表

### 使用 brew install url

在 github 上找到所需包的历史版本的 rb 文件, 定位该文件的 url, 然后直接使用 `brew install <url>` 即可

## 官方全部包列表

[Homebrew Formulae](https://formulae.brew.sh/formula/)

## 小知识

`Gem`是封装起来的`Ruby`应用程序或代码库. 在终端使用的`gem`命令, 是指通过`RubyGems`管理`Gem`包.

`rvm` 用于帮你安装`Ruby`环境, 帮你管理多个`Ruby`环境, 帮你管理你开发的每个`Ruby`应用使用机器上哪个`Ruby`环境. `Ruby`环境不仅仅是`Ruby`本身, 还包括依赖的第三方`Ruby`插件. 都由`RVM`管理.

`curl` 全称是 `commandline url`, 是在命令行模式下工作, 利用 `URL` 的语法进行数据的传输或者文件的传输

#### Cask基础命令

-   `brew install --cask <software name>`: 安装软件
-   `brew install --cask <software name> --force`: 强制安装 (可用在已有 dmg 安装的情况下)
-   `brew uninstall --cask <software name>` : 卸载软件
-   `brew zap --cask <software name>`: 将与此包相关的所有文件全部删除 (可能会删除与其他包共享的一些文件)
-   `brew search --cask <software name>`: 根据名称搜索相关软件
-   `brew info --cask <software name>`: 查看软件相关信息
-   `brew list --cask`: 列出通过 `Homebrew-Cask` 安装的包
-   `brew fetch --cask <software name>`: 下载远程软件包到本地文件夹 (不安装)
-   `brew outdated --cask` : 列出过期的软件包
-   `brew upgrade --cask`: 升级所有包
-   `brew tap buo/cask-upgrade`: 安装第三方仓库, 此仓库可以帮助用户检查更新并更新所有 `cask`
-   `brew cu -a`: 通过执行上一个命令后, 可用此命令更新所有 cask 下载的软件. 如果使用默认的 `brew cask upgrade`会导致部分自动更新的软件不被列出进而不能更新.

### rmtree命令

这个包很简单, 功能就是将一个已安装包, 且将只用于该包的所有依赖全部删除, 非常实用!

#### 安装

```
brew tap beeftornado/rmtree && brew install brew-rmtree
```

安装第三方 tap 并将该 tap 下的包 `brew-rmtree` 安装到本机

#### 使用

`brew rmtree <package name>`: 删除该包并将其所有依赖删除

### `[bundle](https://github.com/Homebrew/homebrew-bundle)`

这个功能可以让我们备份恢复软件

-   `brew bundle dump --describe --force --file="~/Desktop/Brewfile"`: 生成备份文件
    -   `--describe`: 为列表中的命令行工具加上说明性文字.
    -   `--force`: 直接覆盖之前生成的 `Brewfile` 文件. 如果没有该参数, 则询问你是否覆盖.
    -   `--file="~/Desktop/Brewfile"`: 在指定位置生成文件. 如果没有该参数, 则在当前目录生成 `Brewfile` 文件.
-   `brew bundle install --file="~/Desktop/Brewfile"`: 根据 `Brewfile` 批量安装软件
-   `brew bundle check`: 检查是否 `Brewfile` 中的所有依赖已经安装
-   `brew bundle list`: 列出 `Brewfile` 中的所有依赖
-   `brew bundle cleanup`: 将 `Brewfile` 中所有未列出的依赖全部删除