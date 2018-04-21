package com.example.quagnitia.contactwsdemo;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by V@iBh@V on 4/2/2018.
 */

public class ContactAdapter extends BaseAdapter{
    Context context;
    List<Contacts> contactsList;
    LayoutInflater lf;
    Holder holder;

    public ContactAdapter(Context context, List<Contacts> contactsList) {
        this.context=context;
        this.contactsList=contactsList;
        lf= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return contactsList.size();
    }

    @Override
    public Object getItem(int position) {
        return contactsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null)
        {
            convertView=lf.inflate(R.layout.row_contacts,null);
            holder=new Holder();
            holder.txtName=convertView.findViewById(R.id.txtName);
            holder.txtEmail=convertView.findViewById(R.id.txtEmail);
            holder.txtPhone=convertView.findViewById(R.id.txtPhone);
            convertView.setTag(holder);
        }
        holder= (Holder) convertView.getTag();

        final Contacts contacts=contactsList.get(position);
        holder.txtName.setText(contacts.getName());
        holder.txtEmail.setText(contacts.getEmail());
        holder.txtPhone.setText(contacts.getPhone().getMobile());

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  String name="",email="",phone="";
                Intent i=new Intent(context,DataActivity.class);
                i.putExtra("Name", contacts.getName());
                i.putExtra("Email", contacts.getEmail());
                i.putExtra("Phone", contacts.getPhone().getMobile());
                context.startActivity(i);
            }
        });
        return convertView;
    }

    private class Holder {
        TextView txtName,txtEmail,txtPhone;
    }
}
