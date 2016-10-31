package nyc.c4q.leighdouglas.ghost;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddContactDiagFrag extends DialogFragment {

    private EditText mEditText;
    private Button save;
    Listener listener;

    public AddContactDiagFrag() {
        //empty constructor
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View view = getActivity().getLayoutInflater().inflate(R.layout.fragment_add_contact, null);
        builder.setView(view);


        builder.setTitle("Add New Contact");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                //do stuff here
                mEditText = (EditText) getDialog().findViewById(R.id.add_contact_name);
                String name = mEditText.getText().toString();
                ContactList.getinstance().addContactName(new ContactName(name, "#000000"));
                listener.dosomething();
            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dismiss();
            }
        });

        return builder.create();
    }

    public interface Listener {
        void dosomething();
    }
}
