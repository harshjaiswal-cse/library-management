package com.example.library_management.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Title is mandatory")
    @Size(min = 2, max = 100)
    private String title;

    @NotBlank(message = "Author is mandatory")
    private String author;

    private boolean available = true;

    // ✅ No need for manual getter/setter, Lombok @Data generates them automatically
}
