package ru.javabegin.training.spring.impls.pool;

import org.springframework.beans.factory.annotation.Autowired;
import ru.javabegin.training.spring.common.Color;
import ru.javabegin.training.spring.common.RobotQualifier;
import ru.javabegin.training.spring.interfaces.Robot;
import ru.javabegin.training.spring.interfaces.RobotPool;

import java.util.Collection;

public class T1000Pool {

    @Autowired
    @RobotQualifier(color = Color.BRONZE, year = 2015)
    private Robot bronzeT1000;

    @Autowired
    @RobotQualifier(color = Color.GOLD, year = 2016)
    private Robot goldenT1000;

    @Autowired
    @RobotQualifier(color = Color.SILVER, year = 2012)
    private Robot silverT1000;


    public T1000Pool() {
    }


    public void setBronzeT1000(Robot bronzeT1000) {
        this.bronzeT1000 = bronzeT1000;
    }

    public void setGoldenT1000(Robot goldenT1000) {
        this.goldenT1000 = goldenT1000;
    }

    public void setSilverT1000(Robot silverT1000) {
        this.silverT1000 = silverT1000;
    }

    public void beginShow() {
        bronzeT1000.action();
        goldenT1000.action();
        silverT1000.action();
    }
}
