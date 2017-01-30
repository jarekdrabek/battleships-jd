package drabek;

import com.google.common.base.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Battlefield {

    private static final Logger LOG = LoggerFactory.getLogger(Battlefield.class);

    private Map<String, Boolean> units;

    private Battlefield(Map<String, Boolean> units) {
        this.units = units;
    }

    static Battlefield emptyBattlefield(){
        LOG.info("Creating empty Battlefield");
        return new Battlefield(Collections.emptyMap());
    }

    static Battlefield createBattlefield(List<String> unitsCoordinates){
        Map<String, Boolean> unitsMap = unitsCoordinates.stream()
                .collect(Collectors.toMap(coordinates -> coordinates, coordinates -> true));
        LOG.info("Creating Battlefield with units: {}",unitsCoordinates);
        return new Battlefield(unitsMap);
    }

    public boolean shot(String coordinates) {
        Boolean hit = Optional.ofNullable(units.get(coordinates)).orElse(false);
        LOG.info("Shot on {} {}!", coordinates, hit?"succeeded":"missed");
        return hit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Battlefield that = (Battlefield) o;
        return Objects.equal(units, that.units);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(units);
    }
}
