package com.cydeo.springp01employeeregistrationproject.module;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
//    @NotNull        // doesn't accept null but accept everything else like ""
//    @NotEmpty       // doesn't accept @NotNull but accept empty Strings  " "
//    @NotBlank       // doesn't accept @NotEmpty

    @NotBlank @Size(max = 12, min = 2)
    private String firstName;

    private String lastName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
    private String email;
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;

}
