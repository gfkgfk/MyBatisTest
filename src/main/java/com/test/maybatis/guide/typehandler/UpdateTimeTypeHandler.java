package com.test.maybatis.guide.typehandler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

import java.sql.*;
import java.util.Date;

public class UpdateTimeTypeHandler extends BaseTypeHandler<Date> {
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, Date date, JdbcType jdbcType) throws SQLException {
        System.out.println("setNonNullParameter:"+i);//i ----> columnIndex
        System.out.println("setNonNullParameter:"+date.getTime());
        System.out.println("setNonNullParameter jdbcType:"+jdbcType);
        System.out.println("setNonNullParameter:"+new Time(date.getTime()+900000));
        preparedStatement.setTime(i, new Time(date.getTime()+900000));
    }

    @Override
    public Date getNullableResult(ResultSet resultSet, String s) throws SQLException {
        System.out.println("getNullableResult1:");
        return null;
    }

    @Override
    public Date getNullableResult(ResultSet resultSet, int i) throws SQLException {
        System.out.println("getNullableResult2:");
        return null;
    }

    @Override
    public Date getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        System.out.println("getNullableResult3:");
        return null;
    }
}
