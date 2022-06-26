package io.mwkwon.study.rxjava;

import io.reactivex.Flowable;

public class ColdPublisherExample {

    public static void main(String[] args) {
        // 구독할때마다 데이터를 통지하는 다른 타임라인이 생성된다.

        Flowable<Integer> flowable = Flowable.just(1, 2, 3);

        flowable.subscribe(data -> System.out.println("구독자 데이터1: " + data));
        flowable.subscribe(data -> System.out.println("구독자 데이터2: " + data));
    }
}
