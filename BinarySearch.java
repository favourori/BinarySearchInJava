package com.company;

public class BinarySearch {

    public int containsElement(int[] list, int search) {

        int firstElementInListIndex = 0;
        int lastElementInListIndex = list.length - 1;


        while (firstElementInListIndex <= lastElementInListIndex) {
            int middleElement = (firstElementInListIndex + lastElementInListIndex) / 2;

            if (list[middleElement] == search) {
                return middleElement;
            } else if (search > list[middleElement]) {
                firstElementInListIndex = middleElement + 1;
            } else if (search < list[middleElement]) {
                lastElementInListIndex = middleElement - 1;
            }

        }

        return -1;
    }


}
