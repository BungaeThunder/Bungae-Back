package bungae.thunder.cakey.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Cake {
    private Long id;
    private Integer year;
    private Long userId;
}
