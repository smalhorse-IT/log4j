# springmvc整合log4j  

`日志格式：/usr/logs/${systemName}/YYYYMMDD/ServerFrame.log、BusinessLog.log、DaoLog.log、alllog.log`



**1、** 创建maven web项目。

**2、** 在pom.xml引入springMVC的坐标、jackson坐标（map转json解析时用）、log4j坐标以及Java版本控制。

**3、** 编写 web.xml，引入核心控制器DispatcherServlet和加载springmvc核心配置文件位置，设置控制器的URL拦截，引入
加载Log4J 配置文件用于初始化，配置监听器。

**4、** 在classpath下增加application.xml和log4j.properties配置文件。
`application.xml：配置自动扫描包和注解驱动；`
`log4j.properties:引入前缀 log4j.logger.(必须是此前缀 可阅读源码 PropertyConfigurator 类 ) 用于不同业务的日志存储在不同的文件`

**5、** 重写FileAppender的方法，按照自己的格式输出文件--SystemLogFileAppender.java。

**6、** 编写不同的业务取不同的日志前缀，常量文件--Constants.java。

**7、** 自定义日志类，实现按照不同业务分类打印日志--CustomerLogger.java。

**8、** 编写测试类--testController.java.

