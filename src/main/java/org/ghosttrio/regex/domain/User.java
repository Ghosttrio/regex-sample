package org.ghosttrio.regex.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;

@Entity
public class User {

    @Id
    private Long id;

    // 정규 표현식을 사용하여 이메일 형식 검증
//    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$", message = "올바른 이메일 형식을 입력하세요.")
//    private String email;

    @Email
    private String email;

}