package org.example;

import java.util.ArrayList;
import java.util.List;


public class HomeWork extends BinaryIntSearchTree {

    /**
     * <h1>Задание 1.</h1>
     * Дан класс BinaryTree, который реализует бинарное дерево поиска.
     * Реализовать метод findMaxDigits, который возвращает массив
     * наибольших элементов в дереве, не превосходящих upperBound.
     * <br/>
     * Пример :
     * коллекция в дереве 1, 2, 3, 4, 5
     * count = 3, upperBound 4
     * ответ [4, 3, 2]

     *
     * @param count максимальное количество элементов в ответе
     * @param upperBound верхняя граница для поиска элементов
     * @return массив найденных максимальных значений не более чем upperBound и длиной не более count, отсортировано от большего к меньшему
     * Сигнатуру метода не меняем
     */
    public List<Integer> findMaxDigits(int count, int upperBound) {
        List<Integer> result = new ArrayList<>();
        findMaxDigitsHelper(root, upperBound, result, count);
        return result;
    }

    private void findMaxDigitsHelper(Node node, int upperBound, List<Integer> result, int count) {
        if (node == null || result.size() >= count) {
            return;
        }

        if (node.value <= upperBound) {
            findMaxDigitsHelper(node.right, upperBound, result, count);
            if (result.size() < count) {
                result.add(node.value);
            }
            findMaxDigitsHelper(node.left, upperBound, result, count);
        } else {
            findMaxDigitsHelper(node.left, upperBound, result, count);
        }
    }
}
