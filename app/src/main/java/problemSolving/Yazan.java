package problemSolving;

 class Yazan{
    private final String name;
    private final int age;

    public Yazan(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Yazan{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}