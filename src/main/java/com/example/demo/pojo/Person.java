package com.example.demo.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "person") // 绑定配置
@Validated //  数据校验
public class Person {
    private String name;
    private Integer age;
    private Boolean happy;
    private Date birth;
    @Email(message = "すみません、illegal Email です。")
    private String email;
    private Map<String, Object> mapp;
    private List<Integer> lis;
    private Dog dog;

    public Person() {}

    public Person(String name, Integer age, Boolean happy, Date birth, String email, Map<String, Object> mapp, List<Integer> lis, Dog dog) {
        this.name = name;
        this.age = age;
        this.happy = happy;
        this.birth = birth;
        this.email = email;
        this.mapp = mapp;
        this.lis = lis;
        this.dog = dog;
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

    public Boolean getHappy() {
        return happy;
    }

    public void setHappy(Boolean happy) {
        this.happy = happy;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Map<String, Object> getMapp() {
        return mapp;
    }

    public void setMapp(Map<String, Object> mapp) {
        this.mapp = mapp;
    }

    public List<Integer> getLis() {
        return lis;
    }

    public void setLis(List<Integer> lis) {
        this.lis = lis;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", happy=" + happy +
                ", birth=" + birth +
                ", email='" + email + '\'' +
                ", mapp=" + mapp +
                ", lis=" + lis +
                ", dog=" + dog +
                '}';
    }
}
