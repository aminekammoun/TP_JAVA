package com.directi.training.lsp.exercise_refactored;

public class ElectronicDuck extends Duck
{
    private boolean _on = false;

    @Override
    public void quack()
    {
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            throw new RuntimeException("Can't quack when off");
        }
    }

    @Override
    public void swim()
    {
        if (_on) {
            System.out.println("Electronic duck swim");
        } else {
            System.out.println("Duck est éteint et ne peut donc pas nager.");
        }
    }

    public void turnOn()
    {
        _on = true;
    }

    public void turnOff()
    {
        _on = false;
    }
}
