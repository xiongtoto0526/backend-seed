
一、新建工程
——————————————————————————————————————————————————————————————————
1. 拉取 backend-seed 工程。
2. 调整几个参数。
   1) 修改setting.gradle的名称：rootProject.name = 'backend-seed'
   2) 修改generatorConfig.xml中的 backend-seed
3. 工程构建方法
 1）首次构建，请先安装gradle。http://services.gradle.org/distributions/
   - 下载zip
   - 配置path
   - 命令行运行：gradle -version （若能显示版本号，则安装成功）
 2）在build.gradle的同级目录，命令行运行 gralde idea （将生成idea工程）
 3) 双击 *.ipr, 即可。


二、填写readme.txt
——————————————————————————————————————————————————————————————————
***** 提示：每个工程都应有自说明文件，以下为样本。***** 

1. 提供哪些服务？
 -【后台API服务】，服务对象：前台-A、App-B

2. 依赖哪些服务？
 -【文件上传服务】，提供方：yl-file-upload 工程
 -【图片压缩服务】，提供方：yl-image-zip 工程







