package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
) // @Configuration 도 @Component 에 등록되어 있어서 필터로 제외 시켜준다. (기존 @Configurtation 예제 코드를 유지하기 위해서)
public class AutoAppConfig {
}
