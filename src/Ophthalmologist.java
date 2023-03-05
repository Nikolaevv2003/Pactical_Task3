public class Ophthalmologist extends Doctor {

    public Ophthalmologist(String name, int age, String placeOfWork) {
        super(name, age, placeOfWork);
    }

    //Этот метод заменяет все 'а' на 'y' и переводит все четные буквы в верхний регистр.
    @Override
    public void writeRecipe(String recipe) {
        char[] array = recipe.toCharArray();
        for (int i=0; i<array.length; i++) {
            if (array[i] == 'a' || array[i] == 'A') {
                array[i] = 'y';
            }
            if (i % 2 == 0) {
                array[i] = Character.toUpperCase(array[i]);
            }
        }
        System.out.println(new String(array));
    }

    @Override
    public String toString() {
        return "Ophthalmologist{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", placeOfWork='" + getPlaceOfWork() + '\'' +
                '}';
    }
}
