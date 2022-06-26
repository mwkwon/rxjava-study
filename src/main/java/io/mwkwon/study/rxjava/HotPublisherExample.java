package io.mwkwon.study.rxjava;

import io.reactivex.processors.PublishProcessor;

public class HotPublisherExample {

    public static void main(String[] args) {
        // 1개의 타임라이에서만 데이터가 통지되며 소비자의 구독 시점 부터 통지된 데이터를 받을 수 있다.

        PublishProcessor<Integer> processor = PublishProcessor.create();

        processor.subscribe(data -> System.out.println("구독 데이터1: " + data));
        processor.onNext(1);
        processor.onNext(2);

        processor.subscribe(data -> System.out.println("구독 데이터2: " + data));
        processor.onNext(3);
        processor.onNext(4);

        processor.onComplete();
    }
}
