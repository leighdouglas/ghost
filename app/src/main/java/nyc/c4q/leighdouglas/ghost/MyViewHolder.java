package nyc.c4q.leighdouglas.ghost;

/**
 * Created by leighdouglas on 10/29/16.
 */
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MyViewHolder extends RecyclerView.ViewHolder{
    private Button button;

    public MyViewHolder(ViewGroup parent){
        super(inflateView(parent));

        button = (Button) itemView.findViewById(R.id.contact_button);

    }

    private static View inflateView(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.recycled_button, parent, false);
    }

    public void bind(ContactName contact) {
        button.setText(contact.getContactName());
        button.setBackgroundColor(Color.parseColor(contact.getColor()));
    }
}

