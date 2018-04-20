package com.jhkook.reactive;

import io.reactivex.Observable;

public class ReactiveFunction {

    /**
     *  just() 생성자는 subscribe 호출시 바로 모든 데이터를 발행
     *
     */
    public void obserable_just(){

        Observable.just("one", "two", "three")
                .subscribe(System.out::println);
    }

    /**
     *  create() 생성자는 onNext() 를 통해서 임의로 데이터를 발행
     *
     */
    public void obserable_create(){

        Observable<Integer> source = Observable.create(subscriber->
        {
            subscriber.onNext(1);
            subscriber.onNext(2);
            subscriber.onComplete();
        });

        source.subscribe(System.out::println);

    }



}
