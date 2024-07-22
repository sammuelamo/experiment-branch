package com.practice.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class ListAdditionTest {

    @Mock
    private ListAddition listAddition;

    @BeforeEach
    void setUp() {
        listAddition = new ListAddition();
    }

    @Test
    public void testListAddition(){
        List<Integer> list = new ArrayList<>();
        listAddition.addToList(list, 10);
        listAddition.addToList(list, 100);

        assertTrue(list.contains(100));
    }

}