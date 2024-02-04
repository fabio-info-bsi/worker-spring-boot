package br.com.fabex.consumer;

import br.com.fabex.service.BusinessService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@AllArgsConstructor
public class Task {

    private BusinessService businessService;

    @Scheduled(fixedRate = 10_000, initialDelay = 10_000)
    public void listner() {
        log.info("Task::listner ...");
        this.businessService.logic();
    }
}
