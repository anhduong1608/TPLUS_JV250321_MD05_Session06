package ra.edu.md05_sesion06_06.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Wedconfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebInitial.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
