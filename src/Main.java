import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name, placeOfWork, recipe;
        int a, age;
        System.out.println("Николаев Александр Сергеевич");
        System.out.println("Группа РИБО-01-21");
        while (true) {
            System.out.println();
            System.out.println("Выьерите тип врача:");
            System.out.println("1 - Терапевт");
            System.out.println("2 - Окулист");
            try {
                a = Integer.parseInt(scan());
                if (a != 1 && a != 2) {
                    System.out.println("Необходимо ввести целое число от 1 до 2");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Необходимо ввести целое число от 1 до 2");
            }
        }
        while (true) {
            System.out.println();
            System.out.println("Введите имя врача:");
            name = scan();
            if (name.isEmpty() || name.isBlank()) {
                System.out.println("Поле \"Имя\" должно быть заполнено");
                continue;
            }
            break;
        }
        while (true) {
            System.out.println();
            System.out.println("Укажите возраст врача:");
            try {
                age = Integer.parseInt(scan());
                if (age < 18 || age > 130) {
                    System.out.println("Необходимо ввести целое чило от 18 до 130");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Необходимо ввести целое чило от 18 до 130");
            }
        }
        while (true) {
            System.out.println();
            System.out.println("Введите место работы:");
            placeOfWork = scan();
            if (placeOfWork.isEmpty() || placeOfWork.isBlank()) {
                System.out.println("Поле \"Место работы\" должно быть заполнено");
                continue;
            }
            break;
        }
        System.out.println();
        if (a == 1) {
            Therapist therapist = new Therapist(name, age, placeOfWork);
            System.out.println("Терапевт создан!");
            System.out.println(therapist);
            while (true) {
                System.out.println();
                System.out.println("Введите текст рецепта:");
                recipe = scan();
                if (recipe.isEmpty() || recipe.isBlank()) {
                    System.out.println("Поле \"Рецепт\" должно быть заполнено");
                    continue;
                }
                break;
            }
            System.out.println();
            System.out.println("Вызываем метод writeRecipe...");
            System.out.println("Готово!");
            System.out.println("До:");
            System.out.println(recipe);
            System.out.println("После:");
            therapist.writeRecipe(recipe);
        } else {
            Ophthalmologist ophthalmologist = new Ophthalmologist(name, age, placeOfWork);
            System.out.println("Окулист создан!");
            System.out.println(ophthalmologist);
            while (true) {
                System.out.println();
                System.out.println("Введите текст рецепта:");
                recipe = scan();
                if (recipe.isEmpty() || recipe.isBlank()) {
                    System.out.println("Поле \"Рецепт\" должно быть заполнено");
                    continue;
                }
                break;
            }
            System.out.println();
            System.out.println("Вызываем метод writeRecipe...");
            System.out.println("Готово!");
            System.out.println("До:");
            System.out.println(recipe);
            System.out.println("После:");
            ophthalmologist.writeRecipe(recipe);
        }
    }

    public static String scan() {
        return new Scanner(System.in).nextLine();
    }
}