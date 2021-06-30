package com.cc.demo.servers;

import com.cc.demo.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class BatchTasks {

    @Autowired(required=false)
    private WebClient webClient = WebClient.create();

    public Mono<UserMapper> getBatchTasks(Integer pageIndex, Integer per){

        log.info("Servers ------------- pageIndex=" + pageIndex + "per=" + per);
        return webClient
                .get()
                .uri("http://localhost:8090/getUsers?pageIndex={pageIndex}&per={per}", pageIndex, per)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(UserMapper.class);
    }
}
