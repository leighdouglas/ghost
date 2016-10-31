package nyc.c4q.leighdouglas.ghost;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leighdouglas on 10/30/16.
 */

public class ContactList {

    public List<ContactName> mList;
    private static ContactList instance = null;

    private ContactList() {
        mList = new ArrayList<>();
        mList.add(new ContactName("Eddie", "#F67280"));
        mList.add(new ContactName("Leigh", "#C06C84"));
        mList.add(new ContactName("Carina", "#355c7d"));
    }

    public static ContactList getinstance() {
        if (instance == null) {
            instance = new ContactList();
        }
        return instance;
    }

    public void addContactName(ContactName contactName) {
        mList.add(contactName);
    }

    public List<ContactName> getmList() {
        return mList;
    }

}


