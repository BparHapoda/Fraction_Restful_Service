package ru.boronin.fractionApi.exception_handling;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DenominatorIsZero {
    private String info;
}
