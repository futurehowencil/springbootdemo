package com.fziqan;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @PackageName:com.fziqan
 * @ClassName:Student
 * @Description:
 * @author:FziqAn
 * @date 2019/5/27 16:23
 */
@Component
@ConfigurationProperties(prefix = "student")
@PropertySource(value = "classpath:student.properties")
public class Student {
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
