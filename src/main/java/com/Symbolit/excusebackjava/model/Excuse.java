package com.Symbolit.excusebackjava.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.web.bind.annotation.CrossOrigin;

@Data
@AllArgsConstructor
@Entity
public class Excuse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer http_code;

    private String tag;

    private String message;

    public Excuse() {
    }
}
