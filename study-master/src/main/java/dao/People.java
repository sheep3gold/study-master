package dao;

/**
 * Created by ALEX on 2018/6/26.
 */
public class People {
    private String name;
    private Long age;

    @Override
    public boolean equals(Object anObject){

        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}
