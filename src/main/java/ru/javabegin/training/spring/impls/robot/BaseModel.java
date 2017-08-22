package ru.javabegin.training.spring.impls.robot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import ru.javabegin.training.spring.interfaces.Hand;
import ru.javabegin.training.spring.interfaces.Head;
import ru.javabegin.training.spring.interfaces.Leg;
import ru.javabegin.training.spring.interfaces.Robot;

public abstract class BaseModel implements Robot {

    @Autowired(required = false)
    private Hand hand;

    @Autowired(required = false)
    private Leg leg;

    @Autowired(required = false)
    private Head head;

    public BaseModel() {
        System.out.println(this + " - BaseModel constructor()");
    }

    public BaseModel(Hand hand, Leg leg, Head head) {
        this();
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

}
