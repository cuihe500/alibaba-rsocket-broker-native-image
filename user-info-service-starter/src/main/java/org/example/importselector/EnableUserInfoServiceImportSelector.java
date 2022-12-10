package org.example.importselector;

import org.example.annotation.EnableUserInfoService;
import org.example.config.EnableUserInfoServiceConfiguration;
import org.jetbrains.annotations.NotNull;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Objects;

public class EnableUserInfoServiceImportSelector implements ImportSelector {

    @Override
    public String @NotNull [] selectImports(AnnotationMetadata importingClassMetadata) {

        AnnotationAttributes annotationAttributes = AnnotationAttributes.fromMap(
                importingClassMetadata.getAnnotationAttributes(EnableUserInfoService.class.getName())
        );
        final Object value = Objects.requireNonNull(annotationAttributes).get("value");
        boolean isTrue = value != null && Boolean.parseBoolean(value.toString());
        if (isTrue) {
            return new String[]{EnableUserInfoServiceConfiguration.class.getName()};
        }
        return new String[0];
    }

}
