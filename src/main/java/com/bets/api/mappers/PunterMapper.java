package com.bets.api.mappers;

import com.bets.api.dtos.PunterRequestDTO;
import com.bets.api.dtos.PunterResponseDTO;
import com.bets.api.entities.Punter;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PunterMapper {
    @Mappings({
            @Mapping(target = "id", ignore = true)
    })
    Punter sourceToDestination(PunterRequestDTO punterRequestDTO);

    @InheritInverseConfiguration
    PunterResponseDTO destinationToSource(final Punter punter);

    @Mapping(target = "id", ignore = true)
    void updateSourceToDestination(PunterRequestDTO punterRequest, @MappingTarget Punter punter);

    List<PunterRequestDTO> map(List<Punter> punterList);
}
