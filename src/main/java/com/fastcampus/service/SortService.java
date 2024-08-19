package com.fastcampus.service;

import com.fastcampus.logic.Sort;

import java.util.List;

public class SortService {

    private final Sort<String> sort;

    //Sort를 구현한 어떤 구현체가 오더라도 그 속의 sort 메서드를 호출할 수 있게 된다.
    //의존성 주입!
    public SortService(Sort<String> sort) {
        this.sort = sort;
        System.out.println("구현체 : " + sort.getClass().getName());
    }

    public List<String> doSort(List<String> list) {
        return sort.sort(list);
    }
}
