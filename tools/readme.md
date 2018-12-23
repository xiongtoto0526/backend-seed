# 数据库model与mapper自动生成工具

1.进入当前目录命令行
cd ./

2.配置表
修改generatorConfig.xml中，修改要生成的表名，和domain的实体类名。
<table tableName="yourNewTable" domainObjectName="yourNewTable"

3.检查脏目录
### 特别提示：
a) 如果重复生成table， 需先删除 resource/mapper下的xml，否则会导致xml被重写两次，运行时则会报错如下：
   ---- Result Maps collection already contains value for com.seasun.management.mapper ---
  （mybatis-generator自身的bug）
b) 如果model本身在生成后有过修改，需先备份，再执行下一步。
c) 因为mapper.java会被强制重写，若有修改，请先保存java文件。

4.执行
windows: run.bat
mac: sh run.sh  

4.检查
分别会在com.yl.river.mapper
       com.yl.river.model
       resource/mapper
下生成对应的类 或 xml 。

5.完成。
