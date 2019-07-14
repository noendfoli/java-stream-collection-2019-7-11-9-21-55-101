package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        if(leftBorder>rightBorder){
            return Stream.iterate(leftBorder, x->x-1).limit(leftBorder-rightBorder+1).filter(num -> num % 2 ==0).collect(Collectors.toList()).stream().reduce(0,(x,y)->x += y);
        }else {
            return Stream.iterate(leftBorder, x->x+1).limit(rightBorder-leftBorder+1).filter(num -> num % 2 ==0).collect(Collectors.toList()).stream().reduce(0,(x,y)->x += y);
        }

    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        throw new NotImplementedException();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return  arrayList.stream().mapToInt(i -> i*3 + 2).sum();
//        int sum  = arrayList.stream().reduce(0,(x, y)->{
//                    x += y*3 + 2;
//                    return x;
//                });
//        return sum;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map(num ->{
            if(num%2 !=0){
                num = num*3+2;
            }
            return num;
        }).collect(Collectors.toList());
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

//    public double getMedianOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

    public double getAverageOfEven(List<Integer> arrayList) {
        return  arrayList.stream().filter(num -> num % 2 == 0).collect(Collectors.toList()).stream().reduce(0,(a,b)->{
            return a += b;
        })/2;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        return arrayList.stream().filter(num -> num %2 == 0).collect(Collectors.toList());
    }

//    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

//    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
}
