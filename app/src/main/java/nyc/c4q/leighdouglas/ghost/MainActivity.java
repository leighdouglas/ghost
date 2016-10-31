package nyc.c4q.leighdouglas.ghost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements AddContactDiagFrag.Listener {
    private EditText username;
    private EditText phonenumber;
    private Button addContact;

    RecyclerView recyclerView;
    MyAdapter adapter;
    final String TAG = "add contact";
    private StaggeredGridLayoutManager staggeredGridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
        recyclerView = (RecyclerView) findViewById(R.id.buttonRecyclerView);
        recyclerView.setLayoutManager(staggeredGridLayoutManager); //determines how content shows up
        recyclerView.setAdapter(adapter = new MyAdapter(ContactList.getinstance().getmList()));
    }

    public void fabButtonClick(View v) {
        AddContactDiagFrag newFragment = new AddContactDiagFrag();
        newFragment.show(getSupportFragmentManager(), "add contact");
        newFragment.setListener(this);
    }

//    public void onButtonClick(View v) {
//        String userName = username.getText().toString();
//        String number = phonenumber.getText().toString();
//
//        ArrayList<ContentProviderOperation> ops = new ArrayList<ContentProviderOperation>();
//        int rawContactID = ops.size();
//
//        if (username.getText() != null && phonenumber.getText() != null) {
//            Intent contactIntent = new Intent(ContactsContract.Intents.Insert.ACTION);
//            contactIntent.setType(ContactsContract.RawContacts.CONTENT_TYPE);
//            contactIntent
//                    .putExtra(ContactsContract.Intents.Insert.NAME, userName)
//                    .putExtra(ContactsContract.Intents.Insert.PHONE, number);
//
//            startActivityForResult(contactIntent, 1);
//            Toast.makeText(this, "Contact added", Toast.LENGTH_LONG).show();
//        } else {
//            Toast.makeText(this, "Please add name and number", Toast.LENGTH_LONG).show();
//        }
//    }

    @Override
    public void dosomething() {
        adapter.notifyDataSetChanged();
    }
}


