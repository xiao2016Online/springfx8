# springfx8

## 介绍

本项目是使用springboot +javafx 的一个demo，其本质上还是一个springboot 项目。

## 开发环境

IDEA

Maven

JDK8 (oracle Jdk 非openjdk ,因为openjdk 不包含javafx模块)

SpringBoot2.X 



## 编译打包

1. 使用maven 打包成jar
2. 使用ex4j 将Jar包变异成exe
3. 使用inno setup将exe 打包成可以安装的exe



## 注意事项



因为自从java9后，模块可以独立安装，在使用Java11 编译时，可以使用maven 将Java fx 11的模块引入进来，但是在运行的时候需要加上运行参数才可以，运行参数可以参考下面

```
--module-path D:\coder\openjdk\javafx-sdk-11.0.2\lib --add-modules javafx.controls,javafx.fxml
```

