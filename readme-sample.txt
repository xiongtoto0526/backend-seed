

一、新建工程
——————————————————————————————————————————————————————————————————
1. 可直接拷贝本 backend-seed 文件夹。
2. 调整几个参数。
   1) 修改setting.gradle的名称：rootProject.name = 'backend-seed'
   2) 修改generatorConfig.xml中的 backend-seed



二、填写readme.txt
——————————————————————————————————————————————————————————————————
提示：每个工程都应有自说明文件，以下为样本。

1. 功能说明
例1：本工程是【后台API服务】，服务对象：前台x。
例2：本工程是【文件上传服务】,服务对象：通用。

2. 依赖服务描述
 - gradle.build 文件中的 dependencies 
 - lib目录下的jar文件

3. 构建方法
 1）首次构建，请先安装gradle。http://services.gradle.org/distributions/
   - 下载zip
   - 配置path
   - 命令行运行：gradle -version （若能显示版本号，则安装成功）
 2）在build.gradle的同级目录，命令行运行 gralde idea （将生成idea工程）
 3) 双击 *.ipr, 即可。






