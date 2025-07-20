package app.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Timer {

    private Long nanoTime = System.nanoTime();

    public Timer(){
        this.nanoTime = System.nanoTime();
        System.out.println("Время:" + nanoTime);
    }

    public Long getTime() {
        return nanoTime;
    }
}
