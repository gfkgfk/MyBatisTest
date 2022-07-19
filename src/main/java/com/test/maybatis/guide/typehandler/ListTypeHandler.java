package com.test.maybatis.guide.typehandler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;


//因为这里注解了 @MappedJdbcTypes(JdbcType.VARCHAR) 所以在取数据的时候只要是jdbc-varchar 并对应接受的对象属性是java-List的时候都会走这个handler
@MappedJdbcTypes(JdbcType.VARCHAR)
@MappedTypes({List.class})
public class ListTypeHandler extends BaseTypeHandler<List<String>> {
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, List<String> strings, JdbcType jdbcType) throws SQLException {
        System.out.println("setNonNullParameter");
        String result = "";
        for (int j = 0; j < strings.size(); j++) {
            if (j != 0) {
                result += ",";
            }
            result += strings.get(j);
        }
        System.out.println("setNonNullParameter"+result);
        preparedStatement.setString(i, result);
    }

    @Override
    public List<String> getNullableResult(ResultSet resultSet, String s) throws SQLException {
        System.out.println("getNullableResult1");
        return Arrays.asList(resultSet.getString(s).split(","));
    }

    @Override
    public List<String> getNullableResult(ResultSet resultSet, int i) throws SQLException {
        System.out.println("getNullableResult2");
        return Arrays.asList(resultSet.getString(i).split(","));
    }

    @Override
    public List<String> getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        System.out.println("getNullableResult3");
        return Arrays.asList(callableStatement.getString(i).split(","));
    }
}
