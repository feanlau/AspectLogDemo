# AspectLogDemo

Spring Boot使用自定义注解+AOP处理日志

可以看到请求是如下所示的：

```ini
2021-04-23 17:23:42.580  INFO 91624 --- [           main] com.lqr.AspectLogDemoApplication         : Starting AspectLogDemoApplication on FeanLau-Pro-2.local with PID 91624 (/Users/liufan/Desktop/AspectLogDemo/target/classes started by liufan22 in /Users/liufan/Desktop/AspectLogDemo)
2021-04-23 17:23:42.582  INFO 91624 --- [           main] com.lqr.AspectLogDemoApplication         : No active profile set, falling back to default profiles: default
2021-04-23 17:23:42.784  INFO 91624 --- [           main] ationConfigEmbeddedWebApplicationContext : Refreshing org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@54c562f7: startup date [Fri Apr 23 17:23:42 CST 2021]; root of context hierarchy
2021-04-23 17:23:44.007  INFO 91624 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat initialized with port(s): 8087 (http)
2021-04-23 17:23:44.016  INFO 91624 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2021-04-23 17:23:44.017  INFO 91624 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/8.5.16
2021-04-23 17:23:44.121  INFO 91624 --- [ost-startStop-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2021-04-23 17:23:44.121  INFO 91624 --- [ost-startStop-1] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 1341 ms
2021-04-23 17:23:44.259  INFO 91624 --- [ost-startStop-1] o.s.b.w.servlet.ServletRegistrationBean  : Mapping servlet: 'dispatcherServlet' to [/]
2021-04-23 17:23:44.262  INFO 91624 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'characterEncodingFilter' to: [/*]
2021-04-23 17:23:44.262  INFO 91624 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'hiddenHttpMethodFilter' to: [/*]
2021-04-23 17:23:44.262  INFO 91624 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'httpPutFormContentFilter' to: [/*]
2021-04-23 17:23:44.262  INFO 91624 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'requestContextFilter' to: [/*]
2021-04-23 17:23:44.524  INFO 91624 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : Looking for @ControllerAdvice: org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@54c562f7: startup date [Fri Apr 23 17:23:42 CST 2021]; root of context hierarchy
2021-04-23 17:23:44.566  INFO 91624 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/add],methods=[POST]}" onto public com.lqr.model.Result com.lqr.controller.UserController.add(com.lqr.model.User) throws javassist.NotFoundException
2021-04-23 17:23:44.568  INFO 91624 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error],produces=[text/html]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
2021-04-23 17:23:44.568  INFO 91624 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error]}" onto public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> org.springframework.boot.autoconfigure.web.BasicErrorController.error(javax.servlet.http.HttpServletRequest)
2021-04-23 17:23:44.593  INFO 91624 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/webjars/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2021-04-23 17:23:44.593  INFO 91624 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2021-04-23 17:23:44.620  INFO 91624 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**/favicon.ico] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2021-04-23 17:23:44.643  WARN 91624 --- [           main] .t.AbstractTemplateResolverConfiguration : Cannot find template location: classpath:/templates/ (please add some templates or check your Thymeleaf configuration)
2021-04-23 17:23:44.919  INFO 91624 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2021-04-23 17:23:44.971  INFO 91624 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8087 (http)
2021-04-23 17:23:44.975  INFO 91624 --- [           main] com.lqr.AspectLogDemoApplication         : Started AspectLogDemoApplication in 2.667 seconds (JVM running for 3.433)
2021-04-23 17:24:18.862  INFO 91624 --- [nio-8087-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring FrameworkServlet 'dispatcherServlet'
2021-04-23 17:24:18.862  INFO 91624 --- [nio-8087-exec-1] o.s.web.servlet.DispatcherServlet        : FrameworkServlet 'dispatcherServlet': initialization started
2021-04-23 17:24:18.875  INFO 91624 --- [nio-8087-exec-1] o.s.web.servlet.DispatcherServlet        : FrameworkServlet 'dispatcherServlet': initialization completed in 13 ms
2021-04-23 17:25:02.230  WARN 91624 --- [nio-8087-exec-5] o.s.web.servlet.PageNotFound             : Request method 'GET' not supported
2021-04-23 17:25:03.923  WARN 91624 --- [nio-8087-exec-6] o.s.web.servlet.PageNotFound             : Request method 'GET' not supported
2021-04-23 17:27:10.493 ERROR 91624 --- [nio-8087-exec-1] com.lqr.aspect.LogAspect                 : 获取日志：添加用户失败，因为用户未成年```# AspectLogDemo
