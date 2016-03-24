package entitities;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by David on 24. 3. 2016.
 */
public class Student extends BasicEntity {
    private String firstName;
    private String lastName;
    private int age;
    private Set<Book> listOfBooks;

    public Student(){
        this.listOfBooks = new HashSet<Book>();
    }

    @Column
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @Column
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Column
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @OneToMany(mappedBy = "student")
    public Set<Book> getListOfBooks() {
        return listOfBooks;
    }

    public void setListOfBooks(Set<Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }
}
