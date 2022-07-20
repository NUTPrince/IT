### 1. Git 配置

-   Git 配置
    
    获取和设置配置变量，这些变量控制着Git外观和操作的各个方面。
    
    **设置名字**
    
    `$ git config --global user.name "User name"`
    
    **设置电子邮件**
    
    `git config --global user.email "himanshudubey481@gmail.com"`
    
    **设置默认的编辑器**
    
    `$ git config --global core.editor Vim`
    
    **检查设置**
    
    `$ git config -list`
    
-   Git别名
    
    为每个命令设置一个别名
    
    ```shell
    $ git config --global alias.co checkout
    $ git config --global alias.br branch
    $ git config --global alias.ci commit
    $ git config --global alias.st status
    ```


### 2. 初始化项目

-   **Git init**
    
    创建一个本地仓库
    
    `git init`
    
-   **Git clone**
    
    为服务器上的仓库制作一份本地拷贝
    
    `$ git clone`
    

### 3. Local修改

-   Git add
    
    添加一个文件到暂存（索引）区
    
    `$ git add Filename`
    
    将一个 repo 的所有文件添加到暂存（索引）区
    
    `$ git add *`
    
-   Git commit
    
    在版本历史中永久地记录或快照该文件，并附上一条信息
    
    `$ git commit -m " Commit Message"`
    

### 4. 跟踪修改

-   Git diff
    
    追踪未被缓存的修改：`$ git diff`
    
    追踪已暂存但未提交的改动：`$ git diff --staged`
    
    追踪提交文件后的变化： `$ git diff HEAD`
    
    追踪两次提交之间的变化： `$ git diff Git Diff Branches: $ git diff < branch 2>`
    
-   Git status
    
    显示工作目录和暂存区的状态：`$ git status`
    
-   Git show 显示对象
    
    `$ git show`
    

### 5. Commit历史

-   Git log
    
    显示最近的提交和头的状态：`$ git log`
    
    以每行一个提交的方式显示输出：`$ git log -oneline`
    
    显示被修改的文件： `$ git log -stat`
    
    显示带位置的修改文件：`$ git log -p`
    
-   **Git blame**
    
    显示一个文件每一行的修改情况： `$ git blame<file name>`
    

### 6. 忽略文件

-   .gitignore
    
    指定Git应该忽略的故意不跟踪的文件。创建.gitignore。
    
    ```shell
    $ touch .gitignore List the ignored files:
    $ git ls-files -i --exclude-standard
    ```
    
    Shell
    

### 7. 分支管理

-   Git branch 创建分支
    
    ```shell
    $ git branch List Branch:
    $ git branch --list Delete a Branch:
    $ git branch -d Delete a remote Branch:
    $ git push origin -delete Rename Branch:
    $ git branch -m
    ```
    
    Shell
    
-   Git checkout
    
    在一个仓库中的分支之间进行切换。 切换到一个特定的分支。
    
    `$ git checkout`
    
    创建一个新的分支并切换到它。
    
    ```shell
    $ git checkout -b Checkout a Remote branch:
    $ git checkout
    ```
    
    Shell
    
-   Git stash
    
    在不提交当前分支的情况下切换分支。把当前的工作藏起来：
    
    `$ git stash`
    
    保存带有信息的藏书：
    
    `$ git stash save ""`
    
    检查存储的藏书：
    
    `$ git stash list`
    
    重新应用你刚藏起来的修改：
    
    `$ git stash apply`
    
    追踪藏书和它们的变化：
    
    `$ git stash show`
    
    重新应用之前的提交：
    
    `$ git stash pop`
    
    从队列中删除一个最新的储藏库：
    
    `$ git stash drop`
    
    一次性删除所有可用的藏书：
    
    `$ git stash clear`
    
    在一个单独的分支上存放工作：
    
    `$ git stash branch`
    
-   Git cherry-pick
    
    应用现有的一些提交所带来的变化：
    
    `$ git cherry-pick`
    

### 8. 合并

-   Git merge
    
    合并各分支：
    
    `$ git merge`
    
    将指定的提交合并到当前活动分支
    
    `将指定的提交合并到当前活动分支`
    
-   Git rebase
    
    将不同分支的提交序列应用于最终提交：
    
    `$ git rebase`
    
    继续rebase过程：
    
    `$ git rebase -continue`
    
    放弃rebase过程：
    
    `$ git rebase --skip`
    
-   Git交互式rebase
    
    允许对现有的提交进行各种操作，如编辑、重写、重新排序等等：
    
    `$ git rebase -i`
    

### 9. Remote

-   Git remote
    
    检查远程服务器的配置。
    
    `$ git remote -v`
    
    为仓库添加一个远程
    
    `$ git remote add`
    
    从远程服务器获取数据
    
    `$ git fetch`
    
    从版本库中删除一个远程连接
    
    `$ git remote rm`
    
    重命名远程服务器
    
    `$ git remote rename`
    
    显示关于某个特定远程的额外信息
    
    `$ git remote show`
    
    改变远程服务器
    
    `$ git remote set-url`
    
-   Git origin master
    
    推送数据到远程服务器
    
    `$ git push origin master`
    
    从远程服务器拉出数据
    
    `$ git pull origin master`
    

### 10. Pushing更新

-   Gitpush
    
    将本地仓库的提交信息传输到远程服务器上。推送数据到远程服务器
    
    `$ git push origin master`
    
    强制推送数据
    
    `$ git push -f`
    
    通过推送命令删除一个远程分支
    
    `$ git push origin -delete edited`
    

### 11. Pulling更新

-   Git pull
    
    从服务器上拉出数据
    
    `$ git pull origin master`
    
    拉出一个远程分支
    
    `$ git pull`
    
-   Git fetch
    
    从一个或多个仓库下载分支和标签。读取远程仓库
    
    ```shell
    $ git fetch< repository Url> Fetch a specific branch:
    $ git fetch
    ```
    
    Shell
    
    同时获取所有的分支
    
    `$ git fetch -all`
    
    同步本地版本库
    
    `$ git fetch origin</repository>`
    

### 12. 撤销修改

-   Git revert
    
    撤销修改
    
    `$ git revert`
    
    回退到某个特定的提交
    
    `$ git revert`
    
-   Git reset
    
    重置修改
    
    ```shell
    $ git reset -hard
    $ git reset -soft:
    $ git reset --mixed
    ```
    
    Shell
    

### 13. 删除文件

-   Git rm
    
    从工作树和索引中删除这些文件
    
    `$ git rm<file Name>`
    
    从 Git 中删除文件，但将文件保留在您的本地仓库中
    
    `$ git rm --cached</file>`