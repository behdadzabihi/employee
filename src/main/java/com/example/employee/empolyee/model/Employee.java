package com.example.employee.empolyee.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Entity //morafi in class be onvane mojoodiat be database baraye sakhtane table
@Data // setter va gettr
@Table(name = "tbl_employee") //esme table ke khodeman baraye sakhtan entekhab mikonim
//didane table:click roye database>schemas>table>bayad jadavle khod ra bebini
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private String mobileNumber;
    private String email;

}
