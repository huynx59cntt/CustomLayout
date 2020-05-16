package vn.edu.ntu.tuananh.customlayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import vn.edu.ntu.tuananh.controller.controller;
import vn.edu.ntu.tuananh.model.ListCustom;

public class MainActivity extends AppCompatActivity {
    ArrayList<ListCustom> listCustoms;
    ListAdapter adapter;
    RecyclerView rvListCustom;
    AutoCompleteTextView actxtList;
    String[] list;
    ArrayAdapter<String> adapterList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

  //      getNamea();
        addViews();

    }
    private void addViews(){
        rvListCustom = findViewById(R.id.rvListCustom);
        rvListCustom.setLayoutManager(new LinearLayoutManager(this));
        controller c= (controller) getApplication();
        listCustoms = c.getListCustom();
        adapter = new ListAdapter(listCustoms);
        rvListCustom.setAdapter(adapter);
        actxtList = findViewById(R.id.actxtList);
       // adapterList = new ArrayAdapter<>(this, android.R.layout.list_content, adapter);
     //   actxtList.setAdapter(adapterList);
    }

//    private void getNamea(){
//        for(int i = 0; i < listCustoms.size(); i++)
//            list[i] = listCustoms.get(i).getName();
//    }
//

    private class ListViewHolder extends RecyclerView.ViewHolder{
        TextView txtName, txtBirthDay, txtSDT;
        ImageView image1,image2,image3;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = this.itemView.findViewById(R.id.txtName);
            txtBirthDay = this.itemView.findViewById(R.id.txtBirthDay);
            txtSDT = this.itemView.findViewById(R.id.txtSDT);
            image1 = this.itemView.findViewById(R.id.image1);
            image2 = this.itemView.findViewById(R.id.image2);
            image3 = this.itemView.findViewById(R.id.image3);
        }
    public void bind(ListCustom list){
        txtName.setText(list.getName());
        txtBirthDay.setText(list.getNgaySinh());
        txtSDT.setText(list.getSdt());
        image1.setImageResource(R.drawable.ic_action_add_to_phone);
        image2.setImageResource(R.drawable.ic_action_add_to_message);
        image3.setImageResource(R.drawable.ic_action_add_to_note);
    }

    }

    private class ListAdapter extends RecyclerView.Adapter<ListViewHolder>{
        ArrayList<ListCustom> listCustoms;

        public ListAdapter(ArrayList<ListCustom> listCustoms) {
            this.listCustoms = listCustoms;
        }

        @NonNull
        @Override
        public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater  = getLayoutInflater();
            View view = layoutInflater.inflate(R.layout.list_custom,
                    parent,false);
            return new ListViewHolder(view);
        }
        @Override
        public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
            holder.bind(listCustoms.get(position));
        }
        @Override
        public int getItemCount() {
            return listCustoms.size();
        }
    }
}
