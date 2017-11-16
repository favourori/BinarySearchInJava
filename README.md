# BinarySearchInJava
Binary Search Algorithm Implemented in Java

How to use class: 
Create a new Instance of the BinarySearch Class ==> BinarySearch binarySearch = new BinarySearch();

It takes in two parameters: An Integer array & a value to search for.

Here's an Example:

int[] list = {20, 30, 40, 50, 60, 70, 100};
        int elementToSearchFor = 30;

        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.containsElement(list, elementToSearchFor));
        
        
This should return the Index of the element you're searching for. If the array doesn't contain the element you're searching for,it will return -1.

        
        
