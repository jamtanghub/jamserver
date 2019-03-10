package com.jam.cloud.jamserver.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "t_user")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class User implements Serializable {

    @ApiModelProperty("id")
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "username")
    private String userName;

    @NotNull
    @Column(name = "name")
    private String name;

    @Min(0)
    @Column(name = "age")
    private Integer age;

    @Max(1000000000)
    @Min(-100000000)
    @Column(name = "balance")
    private BigDecimal balance;

}
