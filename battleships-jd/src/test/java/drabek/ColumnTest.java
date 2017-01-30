package drabek;

import org.junit.Test;

import static drabek.Column.column;

public class ColumnTest {


    @Test(expected = IllegalArgumentException.class)
    public void creating_column_that_is_not_a_letter_should_throw_exception(){
        column('@');
    }

    @Test(expected = IllegalArgumentException.class)
    public void creating_column_that_is_over_j_should_throw_exception(){
        column('k');
    }

    @Test(expected = IllegalArgumentException.class)
    public void creating_column_with_K_value_should_throw_exception(){
        column('K');
    }

    @Test
    public void value_between_a_and_j_or_A_and_J_should_not_throw_exception(){
        column('a');
        column('b');
        column('c');
        column('d');
        column('e');
        column('f');
        column('g');
        column('h');
        column('i');
        column('j');
        column('A');
        column('B');
        column('C');
        column('D');
        column('E');
        column('F');
        column('G');
        column('H');
        column('I');
        column('J');
    }

}