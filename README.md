mybatis-flex配置使用
1.解决mybatis 在spring 3.2下报错问题。
SpringBoot 3.2 项目，启动报错 Invalid value type for attribute 'factoryBeanObjectType': java.lang.String

<dependency>
    <groupId>com.mybatis-flex</groupId>
    <artifactId>mybatis-flex-spring-boot-starter</artifactId>
    <version>${mybatis-flex.version}</version>
    <exclusions>
        <exclusion>
            <groupId>org.mybatis</groupId>
            <artifactId>mybatis-spring</artifactId>
        </exclusion>
    </exclusions>
</dependency>

<!-- 添加已适配 springboot 3.2 的 mybatis-spring 依赖-->
<dependency>
    <groupId>org.mybatis</groupId>
    <artifactId>mybatis-spring</artifactId>
    <version>3.0.3</version>
</dependency>
