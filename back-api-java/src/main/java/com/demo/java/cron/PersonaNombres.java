package com.demo.java.cron;

import com.demo.java.service.HumanoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PersonaNombres {
    @Autowired
    private HumanoService humanoService;

    @Scheduled(cron = "* * * * * *")
    public void scheduleTaskUsingCronExpression() {
        long now = System.currentTimeMillis() / 1000;
    //    personaSave();
        log.info("Cron Trabajando" + now);
    }

   /* public void personaSave() {
        Humano humano = new Humano();
        humano.setFullname("lizbet");
        humano.setFullname("peres");
        humano.setUser("corre@gmail.com");
        humanoService.crearHumano(humano);
        //humanoService.findTopByOrderByIdDesc();
        log.info("El ultimo es");
    }
*/
//https://crontab.cronhub.io/
}
