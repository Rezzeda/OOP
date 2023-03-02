package homework_1;

import java.time.LocalDate;
import java.util.*;

public class Main {
    private static Scanner finder = new Scanner(System.in);

    public static void main(String[] args) {
        //GenealogyTree tree = new GenealogyTree();
        GenealogyTree tree = new GenealogyTree();

        // добавление людей и отношений в дерево

        List<Person> people = tree.getPeople();
        List<Relationship> relationships = tree.getRelationships();
        
        // Добавление людей
        Person person1 = new Person("Резеда", LocalDate.of(1950, 5, 10), null);
        Person person2 = new Person("Максим", LocalDate.of(1955, 3, 15), null);
        Person person3 = new Person("Андрей", LocalDate.of(1950, 5, 10), null);
        Person person4 = new Person("Камиль", LocalDate.of(1950, 5, 10), null);
        Person person5 = new Person("Венера", LocalDate.of(1950, 5, 10), null);
        
        tree.addPerson(person1);
        tree.addPerson(person2);
        tree.addPerson(person3);
        tree.addPerson(person4);
        tree.addPerson(person5);

        
        // Добавление отношений
        Relationship relationship1 = new Relationship(person1, person2, RelationshipType.SPOUSE);
        tree.addRelationship(relationship1);
        Relationship relationship2 = new Relationship(person1, person3, RelationshipType.PARENT);
        tree.addRelationship(relationship2);
        Relationship relationship3 = new Relationship(person1, person4, RelationshipType.CHILD);
        tree.addRelationship(relationship3);

        // // Вывод информации о каждом человеке
        // System.out.println("People:");
        // for (Person person : people) {
        //     System.out.println("Имя: " + person.getName() + " Дата рождения: " 
        //     + person.getBirthDate() + " Дата смерти: " + person.getDeathDate());
        // }

        // // Вывод информации о каждом отношении
        // System.out.println("Relationships:");
        // for (Relationship relationship : relationships) {
        // System.out.println(relationship.getPerson1().getName() + " " + relationship.getRelationshipType() + " " + relationship.getPerson2().getName());
        // }
        
        // System.out.print("Введите имя человека: ");
        // String personName = finder.nextLine();
        // for (Relationship relationship : relationships) {
        //     if (relationship.getPerson1().getName().equals(personName) || relationship.getPerson2().getName().equals(personName)) {
        //     System.out.println(relationship.getPerson1().getName() + " " + relationship.getRelationshipType() + " " + relationship.getPerson2().getName());
        //     }
        // }
        
        // вывод информации о детях
        System.out.print("Введите имя родителя: ");
        String parentName = finder.nextLine();
        List<Person> children = new ArrayList<>();
        for (Relationship relationship : relationships) {
            if (relationship.getRelationshipType() == RelationshipType.PARENT && relationship.getPerson1().getName().equals(parentName)) {
                children.add(relationship.getPerson2());
            } else if (relationship.getRelationshipType() == RelationshipType.CHILD && relationship.getPerson2().getName().equals(parentName)) {
                children.add(relationship.getPerson1());
            }
        }

        if (children.isEmpty()) {
            System.out.println(parentName + " не имеет детей.");
        } else {
        System.out.println("Дети " + parentName + ":");
        for (Person child : children) {
            System.out.println(child.getName());
            }
        }
    }  
}
