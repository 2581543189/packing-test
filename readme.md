问题：
1. springboot 打的包不能依 包名被修改

2.Hadoop 打成shade 包 idea里边运行和jar包执行结果不一样

3.target里边打出多个包，不知道哪个是哪个插件打出来的

4.shade 和xxx 打出来的包，打开以后目录结构不一样

5.直接把jar 改成zip mac打不开 windows可以


maven-jar-plugin

maven-assembly-plugin

maven-shade-plugin



RAR和ZIP:压缩大战真相
https://blog.csdn.net/pankul/article/details/9286695

打包和压缩 打包的原理

META-INF/MANIFEST.MF jvm解析有约定？

maven多个插件 如何一起执行

spring boot 默认打包插件

文件夹名称有点 和文件目录的关系，打包的时候怎么处理

tar打包原理分析
http://blog.chinaunix.net/uid-7358667-id-3542596.html

linux 文件模型 文件的路径和解析方式不是文件内容的一部分

jar包的格式 jar包中的jar包

同时存在 jar包和class文件 jvm会如何处理

maven内部运行原理解析
https://www.cnblogs.com/ys-wuhan/p/6360914.html

查看maven插件的源码
http://maven.apache.org/plugins/index.html


常用插件解析
https://www.cnblogs.com/avivaye/p/5341341.html

使用maven-help-plugin描述插件
https://www.cnblogs.com/build-up/p/4975695.html

maven的三大生命周期
https://www.cnblogs.com/huxinga/p/6740897.html

| parse | plugin | goal |
| ------ | ------ | ------ |
| clean | maven-clean-plugin | clean |
| process-test-resources | maven-resources-plugin | testResources |
| process-resources | maven-resources-plugin | resources |
| package | maven-jar-plugin | jar |
| compile | maven-compiler-plugin | compile |
| test-compile | maven-compiler-plugin | test-compile |
| test | maven-surefire-plugin | test |
| install | maven-install-plugin | install |
| deploy | maven-deploy-plugin | deploy |
| site | maven-site-plugin | site |
| site-deploy | maven-site-plugin | deploy |


