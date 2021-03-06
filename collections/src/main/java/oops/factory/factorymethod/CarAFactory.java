/*
 *
 * Copyright (c) 2010-2015 by Shanghai HanTao Information Co., Ltd.
 * All rights reserved.
 *
 */

package oops.factory.factorymethod;

/**
 * Description:
 * <p>
 * Create Author  : lilzhang
 * Create Date    : 2016-12-28
 * Project        : desultory-essay
 * File Name      : CarAFactory.java
 */
public class CarAFactory implements ICarFactory
{
    public Car createCar()
    {
        return new CarA();
    }
}
