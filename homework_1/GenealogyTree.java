package homework_1;

import java.util.ArrayList;
import java.util.List;

public class GenealogyTree {
    private List<Person> people;
    private List<Relationship> relationships;


// Конструктор
public GenealogyTree() {
    this.people = new ArrayList<>();
    this.relationships = new ArrayList<>();
    
}


// Добавление и удаление людей из списка
public void addPerson(Person person) {
    people.add(person);
}

public void removePerson(Person person) {
    people.remove(person);
}

// Добавление и удаление отношений из списка
public void addRelationship(Relationship relationship) {
    relationships.add(relationship);
}

public void removeRelationship(Relationship relationship) {
    relationships.remove(relationship);
}

// Получение списка людей и отношений
public List<Person> getPeople() {
    return people;
}

public List<Relationship> getRelationships() {
    return relationships;
}


}