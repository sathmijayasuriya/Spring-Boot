package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {

  @Id
  private int id;
  private String firstname;
  private String lastname;
  private String address;
  private String contact;

//    public User(int id, String name, String address) {
//        this.id = id;
//        this.name = name;
//        this.address = address;
//    }

}



