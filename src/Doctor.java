public abstract class Doctor {
    private String name;
    private int age;
    private String placeOfWork;

    public Doctor(String name, int age, String placeOfWork) {
        this.name = name;
        if (age < 18) {
            age = 18;
        }
        this.age = age;
        this.placeOfWork = placeOfWork;
    }

    public abstract void writeRecipe(String recipe);

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", placeOfWork='" + placeOfWork + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18) {
            age = 18;
        }
        this.age = age;
    }

    public String getPlaceOfWork() {
        return placeOfWork;
    }

    public void setPlaceOfWork(String placeOfWork) {
        this.placeOfWork = placeOfWork;
    }
}
