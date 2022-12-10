package org.example.annotation;

import org.example.importselector.EnableUserInfoServiceImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(EnableUserInfoServiceImportSelector.class)
public @interface EnableUserInfoService {

    boolean value() default true;
}
