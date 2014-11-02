package com.mycompany.myapp.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.joda.deser.LocalDateDeserializer;
import com.mycompany.myapp.domain.util.CustomLocalDateSerializer;
import org.joda.time.LocalDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * A Author.
 */

@Document(collection = "T_AUTHOR")
public class Author implements Serializable {

    @Id
    private String id;

    @Field("name")
    private String name;

    @Field("no_of_books_published")
    private Integer noOfBooksPublished;

    @Field("weight")
    private Long weight;

    @Field("height")
    private BigDecimal height;

    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = CustomLocalDateSerializer.class)
    @Field("date_of_birth")
    private LocalDate dateOfBirth;

    @Field("married")
    private Boolean married;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNoOfBooksPublished() {
        return noOfBooksPublished;
    }

    public void setNoOfBooksPublished(Integer noOfBooksPublished) {
        this.noOfBooksPublished = noOfBooksPublished;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Boolean getMarried() {
        return married;
    }

    public void setMarried(Boolean married) {
        this.married = married;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Author author = (Author) o;

        if (id != null ? !id.equals(author.id) : author.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + "'" +
                ", noOfBooksPublished='" + noOfBooksPublished + "'" +
                ", weight='" + weight + "'" +
                ", height='" + height + "'" +
                ", dateOfBirth='" + dateOfBirth + "'" +
                ", married='" + married + "'" +
                '}';
    }
}
