package nyc.c4q.leighdouglas.ghost;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

/**
 * Created by leighdouglas on 10/29/16.
 */

public class MyAdapter extends RecyclerView.Adapter {

    List<ContactName> mList;

    public MyAdapter(List<ContactName> list) {
        this.mList = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyViewHolder viewHolder = (MyViewHolder) holder;
        ContactName contact = mList.get(position);
        viewHolder.bind(contact);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }


}
