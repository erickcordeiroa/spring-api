package com.devnation.api.dtos;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public record ProductRecordDto(@NotBlank String title,@NotNull BigDecimal value) {
}
