package test.com.ling.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import test.com.app.R;
import test.com.ling.model.AccountHolders;

public class Main2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ListView listView = findViewById(R.id.lv_display);
        TextView jsonData = findViewById(R.id.tv_json);
        TextView objectData = findViewById(R.id.tv_object);

        //Set Data to AccountHolders List
        List<AccountHolders> accountHoldersList = new ArrayList<>();

        //Account Holder 0
        AccountHolders accountHolders = new AccountHolders();
        accountHolders.setAccountHolderName("Aravind");
        accountHolders.setAccountType("Savings");
        accountHolders.setAccountBalance("14589");
        accountHolders.setBankBranch("Bangalore");
        accountHolders.setBankIfsc("Axis-B001");
        accountHolders.setBankName("Axis");
        accountHoldersList.add(accountHolders);

        //Account Holder 1
        AccountHolders accountHolders1 = new AccountHolders();
        accountHolders1.setAccountHolderName("Raj");
        accountHolders1.setAccountType("current");
        accountHolders1.setAccountBalance("458");
        accountHolders1.setBankBranch("Mysore");
        accountHolders1.setBankIfsc("Axis-M002");
        accountHolders1.setBankName("AxisM");
        accountHoldersList.add(accountHolders1);

        //Fetch Data From AccountHolders List.
        for (AccountHolders fetchacc : accountHoldersList) {
            System.out.println("========================================");
            System.out.println(fetchacc.getAccountHolderName());
            System.out.println(fetchacc.getAccountType());
            System.out.println(fetchacc.getAccountBalance());
            System.out.println(fetchacc.getBankBranch());
            System.out.println(fetchacc.getBankIfsc());
            System.out.println(fetchacc.getBankName());
            System.out.println("========================================");
        }

        //Object to Json String
        Gson gson = new Gson();
        String jsonInString = gson.toJson(accountHoldersList);
        System.out.println(jsonInString);
        jsonData.setText(jsonInString);

        //Json String to Object
        // AccountHolders[] data = gson.fromJson(jsonInString, AccountHolders[].class);
        //System.out.println(data);

        //Json String to Object
        Type collectionType = new TypeToken<Collection<AccountHolders>>() {
        }.getType();
        Collection<AccountHolders> data = gson.fromJson(jsonInString, collectionType);
        System.out.println(data);
        objectData.setText(data.toString());

        //List of Account Holders in ListView
        ArrayAdapter<AccountHolders> adapter = new ArrayAdapter<>(Main2Activity.this, android.R.layout.simple_list_item_1, accountHoldersList);
        listView.setAdapter(adapter);
    }
}
