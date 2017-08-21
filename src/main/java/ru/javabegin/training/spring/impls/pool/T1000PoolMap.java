package ru.javabegin.training.spring.impls.pool;

import ru.javabegin.training.spring.interfaces.Robot;
import ru.javabegin.training.spring.interfaces.RobotPool;

import java.util.Collection;
import java.util.Map;

public class T1000PoolMap implements RobotPool {

    private Map<String, Robot> robotCollection;

    public T1000PoolMap(Map<String, Robot> robotCollection) {
        this.robotCollection = robotCollection;
    }

    public void setRobotCollection(Map<String, Robot> robotCollection) {
        this.robotCollection = robotCollection;
    }

    @Override
    public Collection<Robot> getRobotCollection() {
        return this.robotCollection.values();
    }

    public void action() {
        for (Robot robot : robotCollection.values()) {
            robot.action();
        }
    }
}

