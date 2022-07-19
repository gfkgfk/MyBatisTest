package com.test.maybatis.guide.dao;

import com.test.maybatis.guide.bean.Person;

public interface PersonMapper {
    public Long addPerson(Person person);

    public Person getPerson(int id);


}
