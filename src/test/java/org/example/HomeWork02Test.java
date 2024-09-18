package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HomeWork02Test {

    @Test
    void findMaxDigitsOne() {
        HomeWork tree = new HomeWork();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);

        List<Integer> maxDigits = tree.findMaxDigits(3, 4);
        assertIterableEquals(Arrays.asList(4, 3, 2), maxDigits);
    }

    @Test
    void findMaxDigitsTwo() {
        HomeWork tree = new HomeWork();
        tree.add(500);
        tree.add(302);
        tree.add(45);
        tree.add(1000);
        tree.add(48);

        List<Integer> maxDigits = tree.findMaxDigits(3, 303);
        assertIterableEquals(Arrays.asList(302, 48, 45), maxDigits);
    }
}