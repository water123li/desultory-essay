/*
 *
 * Copyright (c) 2010-2015 by Shanghai HanTao Information Co., Ltd.
 * All rights reserved.
 *
 */

package oops.annotate.impl;

import oops.TestDao;
import oops.TestModel;
import oops.TestService;
import oops.annotate.InjectComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Description:
 * <p>
 * Create Author  : lilzhang
 * Create Date    : 2016-12-15
 * Project        : desultory-essay
 * File Name      : TestServiceImpl.java
 */
@Service("testService")
public class TestServiceImpl implements TestService
{
    @Autowired
    private TestDao testDao;

    @Autowired
    private InjectComponent injectComponent;

    private Object initObject;

    @PostConstruct
    public void init()
    {
        initObject = new Integer(44);
    }

    public void setTestDao(TestDao testDao)
    {
        this.testDao = testDao;
    }

    public void setInjectComponent(InjectComponent injectComponent)
    {
        this.injectComponent = injectComponent;
    }

    public TestModel handle(TestModel model)
    {
        injectComponent.doComp();
        System.out.println(getInitObject());
        return this.testDao.gen(model);
    }

    public Object getInitObject()
    {
        return initObject;
    }
}
