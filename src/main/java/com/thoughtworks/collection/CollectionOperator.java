package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        if(left>right){
            return Stream.iterate(left,x->x-1).limit(left-right+1).collect(Collectors.toList());
        }else {
            return Stream.iterate(left,x->x+1).limit(right-left+1).collect(Collectors.toList());
        }
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        if(left>right){
            return Stream.iterate(left,x->x-1).limit(left-right+1).filter(num -> num % 2 ==0).collect(Collectors.toList());
        }else {
            return Stream.iterate(left,x->x+1).limit(right-left+1).filter(num -> num % 2 ==0).collect(Collectors.toList());
        }
    }

    public List<Integer> popEvenElments(int[] array) {
       return Arrays.stream(array).boxed().collect(Collectors.toList()).stream().filter(num -> num % 2 ==0).collect(Collectors.toList());
    }

    public int popLastElment(int[] array) {
        return Arrays.stream(array).boxed().collect(Collectors.toCollection(LinkedList::new)).getLast();
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
