/*
- Создать ArrayList Заполнить студентами, (TreeSet?)
        1) удалить оттуда с помощью removeIf всех студентов чьё имя содержит букву 'к'
        2) всем студентам добавить к возрасту 10 лет с помощью forEach. если легко можешь не делать или просто по примерам выше пройдись плотнее
- Возьми создай коллекцию, набахай туда студентов и всем чье имя начинается с буквы А добавь плюс 10 к возрасту и собери их имена в отдельную коллекцию, причем отсортировав по алфавиту в натуральном порядке
- Необходимо создать класс клиента со следующими полями: уникальный идентификатор, имя, возраст. Также у клиента есть список телефонов. Класс телефона содержит само значение и тип (стационарный или мобильный).  Найти самого возрастного клиента, которой пользуется стационарным телефоном
*/

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student("Иван", 17));
        studentArrayList.add(new Student("Пётр", 18));
        studentArrayList.add(new Student("Сидор", 19));
        studentArrayList.add(new Student("Андрей", 20));
        studentArrayList.add(new Student("Сергей", 21));
        studentArrayList.add(new Student("Юрий", 18));
        studentArrayList.add(new Student("Ян", 17));

        System.out.println("Начальный список:");
        for(Student s : studentArrayList) System.out.println(s.name +", "+ s.age);

        System.out.println("\nВсем у кого имя больше 4 букв увеличить возраст на 4 года:");
        for(Student s : studentArrayList) if(s.name.length()>4) s.age+=4;
        for(Student s : studentArrayList) System.out.println(s.name +", "+ s.age);

        System.out.println("\nВсех у кого возраст больше 18 удалить:");
        Iterator<Student> it = studentArrayList.iterator();
        while (it.hasNext()) if (it.next().age>18) it.remove(); //Using Iterator to avoid ConcurrentModificationException if doing remove
        for(Student s : studentArrayList) System.out.println(s.name +", "+ s.age);
    }
}
/*
1) Создать класс студенты. Добавить штук 5 в ArrayList
2) у студентов поля age, name
3) Всем у кого имя больше 4 буква. Увеличить возраст на 4 года
Второе
 Всем у кого имя больше возраст больше 18 -----------> удалить.
*/