package com.bets.api.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class PunterRequestDTO {
    @NotBlank
    @NotNull
    private String name;

    @NotNull
    @NotBlank
    private String email;
}
