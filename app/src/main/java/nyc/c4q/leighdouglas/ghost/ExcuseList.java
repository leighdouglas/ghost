package nyc.c4q.leighdouglas.ghost;

import java.util.List;

/**
 * Created by leighdouglas on 10/29/16.
 */

public class ExcuseList {
    private List<ContactName> mList;
    private ContactName contactName;

    public ExcuseList(ContactName contactName) {
        mList.add(contactName);
    }
}

