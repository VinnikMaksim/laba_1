package lab1;

public class Cheese extends Food {
    private String type;
    public Cheese(String type) {
// Вызвать конструктор предка, передав ему имя класса
        super("рыС");
// Инициализировать размер яблока
        this.type = type;
    }
    // Переопределить способ употребления яблока
    public void consume() {
        System.out.println(this + " съедено");
    }
    // Селектор для доступа к полю данных РАЗМЕР
    public String gettipe() {
        return type;
    }
    // Модификатор для изменения поля данных РАЗМЕР
    public void settype(String type) {
        this.type = type;
    }
    // Переопределѐнная версия метода equals(), которая при сравнении
// учитывает не только поле name (Шаг 1), но и проверяет совместимость
// типов (Шаг 2) и совпадение размеров (Шаг 3)
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) { // Шаг 1
            if (!(arg0 instanceof Cheese)) return false; // Шаг 2
            return type.equals(((Cheese)arg0).type); // Шаг 3
        } else
            return false;
    }
    // Переопределѐнная версия метода toString(), возвращающая не только
// название продукта, но и его размер
    public String toString() {
        return super.toString() + " типа '" + type.toUpperCase() + "'";
    }
}
