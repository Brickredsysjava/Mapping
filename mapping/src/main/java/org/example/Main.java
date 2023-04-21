package org.example;

import org.example.Db.Db;
import org.example.MtMB.Course;
import org.example.MtMB.Student0;
import org.example.OtMU.Phone;
import org.example.OtMU.Phoneuser;
import org.example.OtMnMtOB.Department;
import org.example.OtMnMtOB.Employee1;
import org.example.OtOB.Citizen;
import org.example.OtOB.Passport;
import org.example.OtOU.Employee;
import org.example.OtOU.Employeedetail;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        EntityManager em= Db.provideConnection();
        em.getTransaction().begin();

        Employee emp = new Employee(1,"KQ!");
        Employeedetail e1=new Employeedetail(36,"KL",1);
                emp.setEmployeedetails(e1);
        em.persist(emp);
//             Employee e11=em.find(Employee.class,1);
//        Employeedetail ed1=e11.getEmployeedetails();
//        System.out.println(ed1);


        // create a new Citizen and Passport
//        Citizen citizen = new Citizen();
//        citizen.setCname("John Doe");
//
//        Passport passport = new Passport();
//        passport.setPnumber("ABC123");
//
//// associate the Citizen with the Passport
//        citizen.setPassport(passport);
//        passport.setCitizen(citizen);
//
//// persist the Citizen entity, which should also persist the associated Passport entity due to cascading
//
//        em.persist(citizen);


//        Citizen c=em.find(Citizen.class,1);
//        Passport passport = c.getPassport();
//        System.out.println(passport.getPnumber());
//        Passport p=em.find(Passport.class,2);
//        System.out.println(p.getCitizen().getCname());


//        Phoneuser phoneUser = new Phoneuser();
//        phoneUser.setUsername("AAA");
//        phoneUser.setUseremail("AAA@mail.com");
//        phoneUser.setUserid(2);
//        Phone phone1=new Phone("Landline",98765,2);
//
//        Phone phone2=new Phone("cell",9876543,2);
//
//        List<Phone> list = new ArrayList<>();
//        list.add(phone1);
//        list.add(phone2);
//        phoneUser.setPhoneTables(list);
//        em.persist(phoneUser);
//        Phoneuser u = em.find(Phoneuser.class, 2);
//        System.out.println("userId is "+u.getUserid());
//        System.out.println("UserName is "+u.getUsername());
//        List<Phone> list1 = u.getPhoneTables();
//        for(Phone p:list1){
//            System.out.println("Phone Number is "+p.getPhoneno());
//            System.out.println("phone Type is "+p.getPhonetype());
//        }

//        Department dept = new Department();
//        dept.setDname("Engineering");
//        Employee1 emp1 = new Employee1();
//        emp1.setEname("Manu Manjunatha");
//        emp1.setEmail("manu.m@java4coding.com");
////ASSOCIATE DEPARTMENT WITH EMPLOYEE
//        emp1.setDepartment(dept);
//        Employee1 emp2 = new Employee1();
//        emp2.setEname("Advith");
//        emp2.setEmail("advith@java4coding.com");
////ASSOCIATE DEPARTMENT WITH EMPLOYEE
//        emp2.setDepartment(dept);
//        Employee1 emp3 = new Employee1();
//        emp3.setEname("Likitha Tyagraj");
//        emp3.setEmail("likitha@java4coding.com");
////ASSOCIATE DEPARTMENT WITH EMPLOYEE
//        emp3.setDepartment(dept);
//        Set<Employee1> s = new HashSet<>();
//        s.add(emp1);
//        s.add(emp2);
//        s.add(emp3);
//        dept.setEmployees(s);
//        em.persist(dept);
//         Department d1=em.find(Department.class,7);
//        System.out.println(d1.getEmployees());
//        Employee1 e1=em.find(Employee1.class,8);
//        System.out.println(e1.getDepartment().toString());
//        Course c1 = new Course();
//        c1.setCname("JAVA");
//        Course c2 = new Course();
//        c2.setCname("SERVLET");
//        Course c3 = new Course();
//        c3.setCname("JSp");
//        Student0 s1 = new Student0();
//        s1.setSname("Manu Manjunatha");
//        Student0 s2 = new Student0();
//        s2.setSname("Advith Tyagraj");
//        Set<Course> sc = new HashSet<>();
//        sc.add(c1);
//        sc.add(c2);
//        sc.add(c3);
//        Set<Student0> ss = new HashSet<>();
//        ss.add(s1);
//        ss.add(s2);
//        c1.setStudents(ss);
//        c2.setStudents(ss);
//        c3.setStudents(ss);
//// ASSOCIATING COURSE WITH STUDENT
//        s1.setCourses(sc);
//        s2.setCourses(sc);
//        em.persist(s1);
//        em.persist(s2);

//        Course c=em.find(Course.class,12);
//        System.out.println(c.getStudents());
//        Student0 s=em.find(Student0.class,13);
//        System.out.println(s.getCourses());
        em.getTransaction().commit();
        System.out.println("+++++++++");
    }
    }
