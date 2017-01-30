package drabek;

import org.junit.Test;

import static drabek.Row.row;
import static org.assertj.core.api.Assertions.assertThat;

public class CoordinateTest {

    @Test
    public void should_return_correct_value_of_column_and_row_value(){
        //When
        Coordinate coordinates = Coordinate.valueOf("A1");
        //Then
        assertThat(coordinates.column).isEqualTo(Column.column('A'));
        assertThat(coordinates.row).isEqualTo(row(1));
    }

    @Test
    public void should_return_correct_value_of_column_and_double_digit_row_value(){
        //When
        Coordinate coordinates = Coordinate.valueOf("C10");
        //Then
        assertThat(coordinates.column).isEqualTo(Column.column('C'));
        assertThat(coordinates.row).isEqualTo(row(10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_exception_if_empty_string_given(){
        Coordinate.valueOf("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_exception_if_null_given(){
        Coordinate.valueOf(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_exception_if_only_column_given(){
        Coordinate.valueOf("A");
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_exception_if_not_begin_with_column(){
        Coordinate.valueOf("5");
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_exception_if_row_doesnt_follow_column(){
        Coordinate.valueOf("AA");
    }

}