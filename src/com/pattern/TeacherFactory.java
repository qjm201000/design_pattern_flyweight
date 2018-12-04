package com.pattern;

import java.util.HashMap;
import java.util.Map;

/**
 *   负责创建和管理享元角色
 */
public class TeacherFactory {
    private Map<String,Teacher> map= null;//享元数据的存放点

    public TeacherFactory(){
        this.map = new HashMap<String,Teacher>();
    }

    /**
     * 返回老师
     * @return
     */
    public Teacher getTeacher(String number){
        Teacher teacher = map.get(number);
        if(teacher == null){
            teacher = new Teacher(number);
            map.put(number,teacher);
        }
        return teacher;
    }
}
