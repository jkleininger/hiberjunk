package net.qrab.mycat;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PERSON")
public class Person implements Serializable {

  @Id
  @Column(name="id")
  private int id;

  @Column(name="name")
  private String name;

  public Person() {
  }

  public Person(int i, String n) {
    id = i;
    name = n;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return id + ": " + name;
  }


}
