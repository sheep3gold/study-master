package nested;

/**
 * Created by ALEX on 2018/6/25.
 */
public class PublicClass {

    public class NestedClass {
        private String name;
        private Long age;

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

    public void printNestedClass(NestedClass nestedClass){
        System.out.println(nestedClass.getName());
    }

}
