package test.com.ling.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import test.com.app.R;
import test.com.ling.model.Employee;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    EditText id;
    TextView phon;
    String etid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //id = (EditText)findViewById(R.id.id);
        //phon = (TextView) findViewById(R.id.phn);
        //etid = id.getText().toString();
        //test();
        testtt();
    }

    public void test() {

        List<Employee> employeeList = new ArrayList<>();

        Employee employee1 = new Employee();

        Map<String, List<String>> emponName = new HashMap<>();

        employee1.setName("Aravind");
        employee1.setId("492");
        List<String> listPhoneno = new ArrayList<>();
        listPhoneno.add("46456546546");
        listPhoneno.add("46456546545822");
        employee1.setPhnno(listPhoneno);
        employee1.setEmployeeonname(emponName);
        emponName.put(employee1.getName(), employee1.getPhnno());
        employeeList.add(employee1);


        Employee employees2 = new Employee();
        employees2.setName("Sagar");
        employees2.setId("491");
        List<String> emplistPhoneno = new ArrayList<>();
        emplistPhoneno.add("4456546546");
        emplistPhoneno.add("4456546545822");
        employees2.setPhnno(emplistPhoneno);
        employeeList.add(employees2);


        //fetch from list
        System.out.println("Size is " + employeeList.size());

        for (Employee fetchemp : employeeList) {
            System.out.println("Name: " + fetchemp.getName());
            System.out.println("Id: " + fetchemp.getId());
            if (fetchemp.getPhnno() != null) {
                for (String ph : fetchemp.getPhnno()) {
                    System.out.println("Phone number" + ph);
                }
            }
        }
    }

    public void testtt() {
        //Insert Employee 1 data
        List<Employee> employees = new ArrayList<>();
        Employee emp1 = new Employee();
        emp1.setName("aravind");
        emp1.setId("492");
        //employees.add(emp1);
        List<String> phnno = new ArrayList<>();
        phnno.add("8050059634");
        phnno.add("8050019569");
        emp1.setPhnno(phnno);
        employees.add(emp1);

        //Insert Employee 2 Data
        //List<Employee> employees2 = new ArrayList<>();
        Employee emp2 = new Employee();
        emp2.setName("Raj");
        emp2.setId("493");
        List<String> phn = new ArrayList<>();
        phn.add("445441414");
        emp2.setPhnno(phn);
        employees.add(emp2);

        //Fetch data
        for (Employee emplist : employees) {
            System.out.println("========================================================");
            System.out.println("Employee name:::" + emplist.getName());
            System.out.println("Employee id:::" + emplist.getId());
            System.out.println("Employee phonenos:::" + emplist.getPhnno());
            for (String ph : emplist.getPhnno()) {
                System.out.println("Phone nos " + ph);

            }
        }

        //HashMap
        Map<String, List<String>> idnphone = new HashMap<>();
        idnphone.put(emp1.getId(), emp1.getPhnno());
        for (Map.Entry<String, List<String>> entry : idnphone.entrySet()) {
            System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
            //phon.setText(entry.getValue().toString());
        }
    }
}
