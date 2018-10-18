package test.com.ling.model;

import java.util.List;
import java.util.Map;

/**
 * @author Girmiti Software
 * @date 04-07-2018
 */
public class Employee {

    private String name;
    private String id;
    private List<String> phnno;
    private Map<String,List<String>> employeeonname;

    public Map<String, List<String>> getEmployeeonname() {
        return employeeonname;
    }

    public void setEmployeeonname(Map<String, List<String>> employeeonname) {
        this.employeeonname = employeeonname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getPhnno() {
        return phnno;
    }

    public void setPhnno(List<String> phnno) {
        this.phnno = phnno;
    }
}
