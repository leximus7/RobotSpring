package ru.javabegin.training.spring.impls.pool;

import ru.javabegin.training.spring.interfaces.Robot;
import ru.javabegin.training.spring.interfaces.RobotPool;

import java.util.Collection;

public class T1000Pool implements RobotPool {

    private Collection<Robot> robotCollection;

    public T1000Pool(Collection<Robot> robotCollection) {
        this.robotCollection = robotCollection;
    }

    public void setRobotCollection(Collection<Robot> robotCollection) {
        this.robotCollection = robotCollection;
    }

    @Override
    public Collection<Robot> getRobotCollection() {
        return this.robotCollection;
    }

    public void beginShow() {
        for (Robot robot : robotCollection) {
            robot.action();
        }
    }
}
