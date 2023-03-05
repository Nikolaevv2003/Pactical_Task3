public class Therapist extends Doctor {

    public Therapist(String name, int age, String placeOfWork) {
        super(name, age, placeOfWork);
    }

    @Override
    public void writeRecipe(String recipe) {
        System.out.println(new StringBuilder(recipe).reverse().toString());
    }

    @Override
    public String toString() {
        return "Therapist{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", placeOfWork='" + getPlaceOfWork() + '\'' +
                '}';
    }
}
