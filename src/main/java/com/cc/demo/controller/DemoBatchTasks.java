package com.cc.demo.controller;

import com.cc.demo.mapper.UserMapper;
import com.cc.demo.servers.BatchTasks;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
public class DemoBatchTasks {

    @Autowired
    private BatchTasks batchTasks;

    @GetMapping(value = "/batch-tasks")
    public Mono<UserMapper> BatchTasks (@RequestParam(value = "pageIndex", required = false) Integer pageIndex,
                                        @RequestParam(value = "per", required = false) Integer per){

        log.info("Controller ---------- pageIndex=" + pageIndex + "per=" + per);
        return batchTasks.getBatchTasks(pageIndex, per);
    }

}
