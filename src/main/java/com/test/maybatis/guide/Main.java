package com.test.maybatis.guide;

import com.test.maybatis.guide.bean.Department;
import com.test.maybatis.guide.bean.Employee;
import com.test.maybatis.guide.bean.Person;
import com.test.maybatis.guide.dao.DepartmentMapper;
import com.test.maybatis.guide.dao.EmployeeMapper;
import com.test.maybatis.guide.dao.PersonMapper;
import com.test.maybatis.guide.singleDao.SingleEmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("mybatis测试");

        //getEmpById
//        try {
//            Properties properties =  Resources.getResourceAsProperties("db.properties");
//            System.out.println(properties);
//            String resource = "mybatis-config.xml";
//            InputStream inputStream = Resources.getResourceAsStream(resource);
//            System.out.println(inputStream);
//            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
//            SqlSession openSession = sqlSessionFactory.openSession(true);
//            EmployeeMapper employeeMapper = openSession.getMapper(EmployeeMapper.class);//package注册---需修改mybatis-config->mappers的注册方式
////            SingleEmployeeMapper employeeMapper = openSession.getMapper(SingleEmployeeMapper.class); //单个注册---需修改mybatis-config->mappers的注册方式
//
//            Employee employee = employeeMapper.getEmpById(1);
//            System.out.println(employee.toString());
//
//            openSession.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        //addEmp
//        try {
//
//            String resource = "mybatis-config.xml";
//            InputStream inputStream = null;
//            inputStream = Resources.getResourceAsStream(resource);
//            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
//            SqlSession openSession = sqlSessionFactory.openSession(true);
//            EmployeeMapper employeeMapper = openSession.getMapper(EmployeeMapper.class);
//            Employee employee = new Employee();
//            employee.setLastName("zhangsan");
//            employee.setGender("男");
//            employee.setEmail("774908833@qq.com");
//            Long rowCounts = employeeMapper.addEmp(employee);
//            System.out.println("影响行数：" + rowCounts);
//            System.out.println("自动增长：" + employee.getId());
//            System.out.println("自动增长tid：" + employee.getTid());//useGeneratedKeys="true" keyProperty="tid"
//            openSession.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //updateEmpTest
//        try {
//            String resource = "mybatis-config.xml";
//            InputStream inputStream = Resources.getResourceAsStream(resource);
//            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
//            SqlSession openSession = sqlSessionFactory.openSession(true);
//            EmployeeMapper employeeMapper = openSession.getMapper(EmployeeMapper.class);
//
//            Employee employee = employeeMapper.getEmpById(1);
//            employee.setGender("哒哒哒");
//            Long rowCounts = employeeMapper.updateEmp(employee);
//            System.out.println("影响行数：" + rowCounts);
//
//            openSession.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        //deleteEmpByIdTest
//        try {
//            String resource = "mybatis-config.xml";
//            InputStream inputStream = Resources.getResourceAsStream(resource);
//            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
//            SqlSession openSession = sqlSessionFactory.openSession(true);
//            EmployeeMapper employeeMapper = openSession.getMapper(EmployeeMapper.class);
//
//            Long rowCounts = employeeMapper.deleteEmpById(1);
//            System.out.println("影响行数：" + rowCounts);
//
//            openSession.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //getEmpLikeLastName 模糊查询
//        try {
//            String resource = "mybatis-config.xml";
//            InputStream inputStream = Resources.getResourceAsStream(resource);
//            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
//            SqlSession openSession = sqlSessionFactory.openSession(true);
//            EmployeeMapper employeeMapper = openSession.getMapper(EmployeeMapper.class);
//
//            List<Employee> list = employeeMapper.getEmpLikeLastName("%测%");
//
//            System.out.println("影响行数：" + list.size());
//            System.out.println(list.toString());
//
//            openSession.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        //getEmpsOrderByIdDesc
//        try {
//            String resource = "mybatis-config.xml";
//            InputStream inputStream = Resources.getResourceAsStream(resource);
//            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
//            SqlSession openSession = sqlSessionFactory.openSession(true);
//            EmployeeMapper employeeMapper = openSession.getMapper(EmployeeMapper.class);
//
//            List<Employee> list = employeeMapper.getEmpsOrderByIdDesc();
//            System.out.println("影响行数：" + list.size());
//            System.out.println(list.toString());
//
//            openSession.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //getEmpsByPage
//        try {
//            String resource = "mybatis-config.xml";
//            InputStream inputStream = Resources.getResourceAsStream(resource);
//            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
//            SqlSession openSession = sqlSessionFactory.openSession(true);
//            EmployeeMapper employeeMapper = openSession.getMapper(EmployeeMapper.class);
//
//            RowBounds rowBounds = new RowBounds(2, 3);
//            List<Employee> list = employeeMapper.getEmpsByPage(rowBounds);
//            System.out.println("影响行数：" + list.size());
//            System.out.println(list.toString());
//
//            openSession.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //TypeHandler
//        try {
//            String resource = "mybatis-config.xml";
//            InputStream inputStream = Resources.getResourceAsStream(resource);
//            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
//            SqlSession openSession = sqlSessionFactory.openSession(true);
//            EmployeeMapper employeeMapper = openSession.getMapper(EmployeeMapper.class);
//
//            Employee employee = employeeMapper.getEmpById(2);
//            employee.setDate(new Date());
//            Long rowCounts = employeeMapper.updateTime(employee);
//            System.out.println("影响行数：" + rowCounts);
//
//            openSession.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        //List insert
//        try {
//            String resource = "mybatis-config.xml";
//            InputStream inputStream = Resources.getResourceAsStream(resource);
//            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
//            SqlSession openSession = sqlSessionFactory.openSession(true);
//            EmployeeMapper employeeMapper = openSession.getMapper(EmployeeMapper.class);
//            List<String> list = new ArrayList<>();
//            list.add("第一个");
//            list.add("第二个");
//            Long rowCounts = employeeMapper.addList(list);
//            System.out.println("影响行数：" + rowCounts);
//
//            openSession.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //ListTypeHandler

//        try {
//            String resource = "mybatis-config.xml";
//            InputStream inputStream = Resources.getResourceAsStream(resource);
//            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
//            SqlSession openSession = sqlSessionFactory.openSession(true);
//            PersonMapper personMapper = openSession.getMapper(PersonMapper.class);
//            Person person = new Person();
//            person.setName("GOGO");
//            List<String> list = new ArrayList<>();
//            list.add("first");
//            list.add("second");
//            person.setHobbys(list);
//            Long rowCounts = personMapper.addPerson(person);
//            System.out.println("影响行数：" + rowCounts);
//            System.out.println(person.getId());
//            Person person2 = personMapper.getPerson(person.getId());
//            System.out.println(person2.getHobbys().size());
//            System.out.println(person2.getHobbys());
//            openSession.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        // map
//        try {
//            String resource = "mybatis-config.xml";
//            InputStream inputStream = Resources.getResourceAsStream(resource);
//            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
//            SqlSession openSession = sqlSessionFactory.openSession(true);
//            EmployeeMapper employeeMapper = openSession.getMapper(EmployeeMapper.class);
//            Map<String, Object> map = employeeMapper.getAllEmps();
//            System.out.println("影响行数：" + map.toString());
//            System.out.println("影响行数：" + map.get("date"));
//
//            openSession.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //maplist--bind key
//        try {
//            String resource = "mybatis-config.xml";
//            InputStream inputStream = Resources.getResourceAsStream(resource);
//            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
//            SqlSession openSession = sqlSessionFactory.openSession(true);
//            EmployeeMapper employeeMapper = openSession.getMapper(EmployeeMapper.class);
//            Map<String, Employee> map = employeeMapper.getAllEmpsList();
//            System.out.println("影响行数：" + map.toString());
//
//            openSession.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        // 级联封装，关联对象
//        try {
//            String resource = "mybatis-config.xml";
//            InputStream inputStream = Resources.getResourceAsStream(resource);
//            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
//            SqlSession openSession = sqlSessionFactory.openSession(true);
//            EmployeeMapper employeeMapper = openSession.getMapper(EmployeeMapper.class);
//            Employee employee = employeeMapper.getEmpByIdWithDep();
//            System.out.println("影响行数：" + employee.toString());
//            openSession.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //association级联封装
//        try {
//            String resource = "mybatis-config.xml";
//            InputStream inputStream = Resources.getResourceAsStream(resource);
//            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
//            SqlSession openSession = sqlSessionFactory.openSession(true);
//            EmployeeMapper employeeMapper = openSession.getMapper(EmployeeMapper.class);
//            Employee employee = employeeMapper.getEmpByIdWithDep2();
//            System.out.println("影响行数：" + employee.toString());
//            openSession.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        //association 分步查询
//        try {
//            String resource = "mybatis-config.xml";
//            InputStream inputStream = Resources.getResourceAsStream(resource);
//            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
//            SqlSession openSession = sqlSessionFactory.openSession(true);
//            EmployeeMapper employeeMapper = openSession.getMapper(EmployeeMapper.class);
//            Employee employee = employeeMapper.getEmpByIdWithDep3();
//            System.out.println("影响行数：" + employee.toString());
//            openSession.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        //association 延迟加载
        //<setting name="lazyLoadingEnabled" value="true" /> <setting name="aggressiveLazyLoading" value="false" />
//        try {
//            String resource = "mybatis-config.xml";
//            InputStream inputStream = Resources.getResourceAsStream(resource);
//            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
//            SqlSession openSession = sqlSessionFactory.openSession(true);
//            EmployeeMapper employeeMapper = openSession.getMapper(EmployeeMapper.class);
//            Employee employee = employeeMapper.getEmpByIdWithDep3();
//            System.out.println("影响行数：" + employee.getLastName());
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("影响行数：" + employee.toString());
//            openSession.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        // association： 一对一（one to one）
        // collection： 一对多（one to many）
        //collection级联封装
//        try {
//            String resource = "mybatis-config.xml";
//            InputStream inputStream = Resources.getResourceAsStream(resource);
//            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
//            SqlSession openSession = sqlSessionFactory.openSession(true);
//            DepartmentMapper departmentMapper = openSession.getMapper(DepartmentMapper.class);
//            Department department = departmentMapper.getDepByIdWithEmps1(1);
//            System.out.println("影响行数：" + department.toString());
//            openSession.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //collection分步查询
//        try {
//            String resource = "mybatis-config.xml";
//            InputStream inputStream = Resources.getResourceAsStream(resource);
//            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
//            SqlSession openSession = sqlSessionFactory.openSession(true);
//            DepartmentMapper departmentMapper = openSession.getMapper(DepartmentMapper.class);
//            Department department = departmentMapper.getDepByIdWithEmps2(1);
//            System.out.println("影响行数：" + department.toString());
//            openSession.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        //collection 延迟加载
//        try {
//            String resource = "mybatis-config.xml";
//            InputStream inputStream = Resources.getResourceAsStream(resource);
//            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
//            SqlSession openSession = sqlSessionFactory.openSession(true);
//            DepartmentMapper departmentMapper = openSession.getMapper(DepartmentMapper.class);
//            Department department = departmentMapper.getDepByIdWithEmps2(1);
//            System.out.println("影响行数：" + department.getDepId());
//
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            System.out.println("影响行数:" + department.getEmps());
//            openSession.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //discriminator鉴别器

//        try {
//
//            String resource = "mybatis-config.xml";
//            InputStream inputStream = Resources.getResourceAsStream(resource);
//            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
//            SqlSession openSession = sqlSessionFactory.openSession(true);
//
//
//
//            EmployeeMapper employeeMapper = openSession.getMapper(EmployeeMapper.class);
//            Employee employee1 = employeeMapper.getDepWithGirl(2);//2号员工为女生
//            System.out.println(employee1);
//            System.out.println(employee1.getDep());
//            Employee employee2 = employeeMapper.getDepWithGirl(11);//11号员工为男生
//            System.out.println(employee2.toString());
//            openSession.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        //SQL 片段
//        try {
//
//            String resource = "mybatis-config.xml";
//            InputStream inputStream = Resources.getResourceAsStream(resource);
//            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
//            SqlSession openSession = sqlSessionFactory.openSession(true);
//            EmployeeMapper employeeMapper = openSession.getMapper(EmployeeMapper.class);
//            Map<String, Object> map = employeeMapper.getSqlTag(1);
//            System.out.println(map);
//            openSession.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //SQL 片段 ,在include元素的refid属性或内部语句中使用属性值
//        try {
//            String resource = "mybatis-config.xml";
//            InputStream inputStream = Resources.getResourceAsStream(resource);
//            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
//            SqlSession openSession = sqlSessionFactory.openSession(true);
//            EmployeeMapper employeeMapper = openSession.getMapper(EmployeeMapper.class);
//            List<Employee> list = employeeMapper.getSqlTag2();
//            System.out.println(list);
//            openSession.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //动态SQL
//        try {
//            String resource = "mybatis-config.xml";
//            InputStream inputStream = Resources.getResourceAsStream(resource);
//            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
//            SqlSession openSession = sqlSessionFactory.openSession(true);
//            EmployeeMapper employeeMapper = openSession.getMapper(EmployeeMapper.class);
//            List<Employee> list = employeeMapper.getDynamicSql(1);  //if id!=3
////            List<Employee> list = employeeMapper.getDynamicSql(3);
//            System.out.println(list);
//            openSession.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //动态SQL 2
//        try {
//            String resource = "mybatis-config.xml";
//            InputStream inputStream = Resources.getResourceAsStream(resource);
//            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
//            SqlSession openSession = sqlSessionFactory.openSession(true);
//            EmployeeMapper employeeMapper = openSession.getMapper(EmployeeMapper.class);
//            Employee employee = new Employee();
//            employee.setEmail("%测试2%");
//            List<Employee> list = employeeMapper.getDynamicSql2(employee);  //if id!=3
//            System.out.println(list);
//            openSession.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        //动态SQL 4 trim
//        try {
//            String resource = "mybatis-config.xml";
//            InputStream inputStream = Resources.getResourceAsStream(resource);
//            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
//            SqlSession openSession = sqlSessionFactory.openSession(true);
//            EmployeeMapper employeeMapper = openSession.getMapper(EmployeeMapper.class);
//            Employee employee = new Employee();
//            employee.setId(29);
//            List<Employee> list = employeeMapper.getDynamicSqlTrim(employee);
//            System.out.println("影响行数:"+list);
//            openSession.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //动态SQL 4 update-trim
//        try {
//            String resource = "mybatis-config.xml";
//            InputStream inputStream = Resources.getResourceAsStream(resource);
//            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
//            SqlSession openSession = sqlSessionFactory.openSession(true);
//            EmployeeMapper employeeMapper = openSession.getMapper(EmployeeMapper.class);
//            Employee employee = new Employee();
//            employee.setId(29);
//            employee.setGender("女");
//            long num = employeeMapper.updateDynamicSqlTrim(employee);
//            System.out.println("影响行数:"+num);
//            openSession.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        //动态SQL5 choose (when, otherwise)
//        try {
//            String resource = "mybatis-config.xml";
//            InputStream inputStream = Resources.getResourceAsStream(resource);
//            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
//            SqlSession openSession = sqlSessionFactory.openSession(true);
//            EmployeeMapper employeeMapper = openSession.getMapper(EmployeeMapper.class);
//            Employee employee = new Employee();
////            employee.setId(29);
//            employee.setEmail("测试2@126.com");
//
//            List<Employee> list = employeeMapper.getDynamicSqlChoose(employee);
//            System.out.println("影响行数:"+list);
//            openSession.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        //动态SQL6 foreach
//        try {
//            String resource = "mybatis-config.xml";
//            InputStream inputStream = Resources.getResourceAsStream(resource);
//            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
//            SqlSession openSession = sqlSessionFactory.openSession(true);
//            EmployeeMapper employeeMapper = openSession.getMapper(EmployeeMapper.class);
//            //自己把参数封装成Map,对应mapper.xml 中collection的值为ids，是传入的参数Map的key
//            List ids = new ArrayList();
//            ids.add(1);
//            ids.add(13);
//            ids.add(14);
//            Map params = new HashMap();
//            params.put("ids", ids);
//            params.put("title", "中国");
//
//            //如果传入的是单参数且参数类型是一个List的时候，collection属性值为list
////            List params = new ArrayList();
////            params.add(1);
////            params.add(13);
////            params.add(14);
//
//
//            //如果传入的是单参数且参数类型是一个array数组的时候，collection的属性值为array
////            int[] params = new int[3];
////            params[0] = 1;
////            params[1] = 13;
////            params[2] = 14;
//            List<Employee> list = employeeMapper.getDynamicSqlForeach(params);
//            System.out.println("影响行数:"+list);
//            openSession.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        //动态SQL6 bind
//        try {
//            String resource = "mybatis-config.xml";
//            InputStream inputStream = Resources.getResourceAsStream(resource);
//            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
//            SqlSession openSession = sqlSessionFactory.openSession(true);
//            EmployeeMapper employeeMapper = openSession.getMapper(EmployeeMapper.class);
//            Employee employee = new Employee();
//            employee.setLastName("测试数据库");
//
//            List<Employee> list = employeeMapper.getDynamicSqlBind(employee);
//            System.out.println("影响行数:"+list);
//            openSession.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        //动态SQL6 2个内部参数
//        try {
//            String resource = "mybatis-config.xml";
//            InputStream inputStream = Resources.getResourceAsStream(resource);
//            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
//            SqlSession openSession = sqlSessionFactory.openSession(true);
//            EmployeeMapper employeeMapper = openSession.getMapper(EmployeeMapper.class);
//            Employee employee = new Employee();
//            employee.setLastName("测试2@126.com");
//
//            List<Employee> list = employeeMapper.getDynamicSqlInnerParams(employee);
//            System.out.println("影响行数:"+list);
//            openSession.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }




        //getEmpById
        try {
            Properties properties =  Resources.getResourceAsProperties("db.properties");
            System.out.println(properties);
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            System.out.println(inputStream);
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
            SqlSession openSession = sqlSessionFactory.openSession(true);
            EmployeeMapper employeeMapper = openSession.getMapper(EmployeeMapper.class);
            Employee employee = employeeMapper.getEmpById(1);
            System.out.println(employee.toString());
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Employee employee2 = employeeMapper.getEmpById(1);
            System.out.println(employee2.toString());
            openSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
