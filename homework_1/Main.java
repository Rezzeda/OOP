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
        Person person1 = new Person("Регина", LocalDate.of(1950, 5, 30), null);
        Person person2 = new Person("Максим", LocalDate.of(1991, 7, 03), null);
        Person person3 = new Person("Александр", LocalDate.of(2010, 8, 17), null);
        Person person4 = new Person("Николай", LocalDate.of(1959, 1, 06), null);
        Person person5 = new Person("Валентина", LocalDate.of(1955, 2, 11), null);
        Person person6 = new Person("Раиса", LocalDate.of(1992, 1, 11), null);

        tree.addPerson(person1);
        tree.addPerson(person2);
        tree.addPerson(person3);
        tree.addPerson(person4);
        tree.addPerson(person5);
        tree.addPerson(person6);
        
        // Добавление отношений
        Relationship relationship1 = new Relationship(person1, person2, RelationshipType.SPOUSE);
        tree.addRelationship(relationship1);
        Relationship relationship2 = new Relationship(person1, person3, RelationshipType.PARENT);
        tree.addRelationship(relationship2);
        Relationship relationship3 = new Relationship(person1, person4, RelationshipType.CHILD);
        tree.addRelationship(relationship3);
        Relationship relationship4 = new Relationship(person1, person5, RelationshipType.CHILD);
        tree.addRelationship(relationship4);
        Relationship relationship5 = new Relationship(person2, person1, RelationshipType.SPOUSE);
        tree.addRelationship(relationship5);
        Relationship relationship6 = new Relationship(person2, person3, RelationshipType.PARENT);
        tree.addRelationship(relationship6);
        Relationship relationship7 = new Relationship(person3, person1, RelationshipType.PARENT);
        tree.addRelationship(relationship7);
        Relationship relationship8 = new Relationship(person3, person2, RelationshipType.PARENT);
        tree.addRelationship(relationship8);
        Relationship relationship9 = new Relationship(person4, person1, RelationshipType.PARENT);
        tree.addRelationship(relationship9);
        Relationship relationship10 = new Relationship(person4, person5, RelationshipType.SPOUSE);
        tree.addRelationship(relationship10);
        Relationship relationship11 = new Relationship(person5, person4, RelationshipType.SPOUSE);
        tree.addRelationship(relationship11);
        Relationship relationship12 = new Relationship(person5, person1, RelationshipType.PARENT);
        tree.addRelationship(relationship12);
        Relationship relationship13 = new Relationship(person6, person4, RelationshipType.CHILD);
        tree.addRelationship(relationship13);
        Relationship relationship14 = new Relationship(person6, person5, RelationshipType.CHILD);
        tree.addRelationship(relationship14);
        Relationship relationship15 = new Relationship(person4, person6, RelationshipType.PARENT);
        tree.addRelationship(relationship15);
        Relationship relationship16 = new Relationship(person5, person6, RelationshipType.PARENT);
        tree.addRelationship(relationship16);
        Relationship relationship17 = new Relationship(person1, person6, RelationshipType.SIBLING);
        tree.addRelationship(relationship17);




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