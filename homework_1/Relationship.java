package homework_1;

public class Relationship {
    private Person person1;
    private Person person2;
    private RelationshipType relationshipType;
    
    // Конструктор
    public Relationship(Person person1, Person person2, RelationshipType relationshipType) {
        this.person1 = person1;
        this.person2 = person2;
        this.relationshipType = relationshipType;
    }
    
    // Геттеры и сеттеры
    public Person getPerson1() {
        return person1;
    }
    public void setPerson1(Person person1) {
        this.person1 = person1;
    }
    public Person getPerson2() {
        return person2;
    }
    public void setPerson2(Person person2) {
        this.person2 = person2;
    }
    public RelationshipType getRelationshipType() {
        return relationshipType;
    }
    public void setRelationshipType(RelationshipType relationshipType) {
        this.relationshipType = relationshipType;
    }

    public String toString() {
        // Person from = person1;
        // Person to = person2;
        //return from.getName() + " (" + relationshipType.toString() + ") " + to.getName();
        return relationshipType.toString();
    }
    
}