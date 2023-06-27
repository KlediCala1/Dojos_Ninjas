package com.dojo.codingdojo.dojos_ninjas.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
    @Entity
    @Table(name = "ninjas")
    public class Ninja {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @NotBlank
        @Size(min = 3)
        private String firstName;

        @NotBlank
        @Size(min = 3)
        private String lastName;

        @NotNull
        private Integer age;

        @DateTimeFormat(pattern = "yyyy-MM-dd")
        @Column(updatable = false)
        private Date createdAt;

        @DateTimeFormat(pattern = "yyyy-MM-dd")
        private Date updatedAt;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "dojo_id")
        private Dojo dojo;

        @PrePersist
        protected void createOn(){
            this.createdAt = new Date();
        }

        @PreUpdate
        protected void updateOn(){
            this.updatedAt = new Date();
        }
        public Ninja(){

        }

        public Ninja(Long id, String firstName, Integer age, String lastName,Dojo dojo) {
            this.id = id;
            this.firstName = firstName;
            this.age = age;
            this.lastName = lastName;
            this.dojo = dojo;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public Dojo getDojo() {
            return dojo;
        }

        public void setDojo(Dojo dojo) {
            this.dojo = dojo;
        }
    }

