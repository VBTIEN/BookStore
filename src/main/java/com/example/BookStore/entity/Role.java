package com.example.BookStore.entity;

import com.example.BookStore.validator.annotation.ValidUsername;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "role")
public class Role {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @Column(name = "name", length = 50, nullable = false)
  @NotBlank(message = "Name is required")
  @Size(max = 50, message = "Name must be than 50 characters")
  private String name;
  
  @Column(name = "description", length = 250)
  @Size(max = 250, message = "Description must be less than 250 characters")
  private String description;
  
  @ManyToMany(mappedBy = "roles")
  private Set<User> users = new HashSet<>();
}
