package lab1;

public class Product {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        // Определение ссылок на продукты завтрака
        Food[] breakfast = new Food[20];
        // Анализ аргументов командной строки и создание для них
        // экземпляров соответствующих классов для завтрака
        int itemsSoFar = 0;
        for (String arg: args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
// У сыра дополнительных параметров нет
                breakfast[itemsSoFar] = new Cheese(parts[1]);;
            } else
            if (parts[0].equals("Apple")) {
// У яблока – 1 параметр, который находится в parts[1]
                breakfast[itemsSoFar] = new Apple(parts[1]);
            } else
            if (parts[0].equals("Potatoes")) {
// У яблока – 1 параметр, который находится в parts[1]
                breakfast[itemsSoFar] = new Potatoes(parts[1]);
            }
// ... Продолжается анализ других продуктов для завтрака
            itemsSoFar++;
        }

        int Potatoes_FREE = 0;
        Potatoes potatoes_FREE = new Potatoes("free");
        for (Food potato : breakfast) {
            if (potato instanceof Potatoes) {
                if ((potato).equals(potatoes_FREE))
                    Potatoes_FREE++;
            }
        }
        System.out.println("Количество " + potatoes_FREE + " всего " + Potatoes_FREE);

// Перебор всех элементов массива
        for (Food item: breakfast)
            if (item!=null)
// Если элемент не null – употребить продукт
                item.consume();
            else
// Если дошли до элемента null – значит достигли конца
// списка продуктов, ведь 20 элементов в массиве было
// выделено с запасом, и они могут быть не
// использованы все
                break;
    }
}
