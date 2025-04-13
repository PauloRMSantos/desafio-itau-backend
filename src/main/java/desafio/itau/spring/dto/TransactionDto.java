package desafio.itau.spring.dto;

import jakarta.validation.constraints.NotNull;
import java.time.OffsetDateTime;

public class TransactionDto {
    @NotNull
    private Double valor;
    @NotNull
    private OffsetDateTime dataHora;

    public TransactionDto(Double valor, OffsetDateTime dataHora) {
        this.valor = valor;
        this.dataHora = dataHora;
    }

    public Double getValor() {
        return valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }
}
