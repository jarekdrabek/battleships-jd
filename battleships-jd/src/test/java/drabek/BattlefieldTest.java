package drabek;

import org.junit.Test;

import static com.google.common.collect.Lists.newArrayList;
import static org.assertj.core.api.Assertions.assertThat;

public class BattlefieldTest {

    @Test
    public void should_return_false_if_shot_on_empty_battlefield(){
        //Given
        Battlefield emptyBattlefield = Battlefield.emptyBattlefield();
        //When
        boolean result = emptyBattlefield.shot("A2");
        //Then
        assertThat(result).isFalse();
    }

    @Test
    public void should_return_true_if_shot_on_a_field_with_unit(){
        //Given
        Battlefield battlefield = Battlefield.createBattlefield(newArrayList("A2"));
        //When
        boolean result = battlefield.shot("A2");
        //Then
        assertThat(result).isTrue();
    }

    @Test
    public void should_return_false_if_shot_on_a_field_without_unit(){
        //Given
        Battlefield battlefield = Battlefield.createBattlefield(newArrayList("A3"));
        //When
        boolean result = battlefield.shot("A2");
        //Then
        assertThat(result).isFalse();
    }

}