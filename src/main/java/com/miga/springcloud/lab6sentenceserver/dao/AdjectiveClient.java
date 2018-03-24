package com.miga.springcloud.lab6sentenceserver.dao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.miga.springcloud.lab6sentenceserver.domain.Word;

@FeignClient("ADJECTIVE")
public interface AdjectiveClient {

    @GetMapping("/")
    public Word getWord();

    static class HystrixClientFallback implements AdjectiveClient {

        @Override
        public Word getWord() {
            return new Word();
        }
    }
}