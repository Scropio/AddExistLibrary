package demo.dot.com.addexistlibrary.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Toast;

import com.dd.processbutton.iml.ActionProcessButton;

import demo.dot.com.addexistlibrary.MainActivity;
import demo.dot.com.addexistlibrary.R;

/**
 * Created by nelson on 5/13/16.
 */
public class demoAdapter extends BaseAdapter{

    String[] result;
    Context context;
    int[] imageId;

    private static LayoutInflater inflater = null;

    public demoAdapter(MainActivity mainActivity, String[] prgmNameList) {

        result = prgmNameList;
        context = mainActivity;

        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() { return result.length; }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position){
        return position;
    }

    public class Holder{
        ActionProcessButton actBtn;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent){
        final Holder holder = new Holder();
        View rowView;

        rowView = inflater.inflate(R.layout.grid_cell, null);

        holder.actBtn = (ActionProcessButton) rowView.findViewById(R.id.btnSignIn);

        holder.actBtn.setText(result[position].toCharArray(),0,result[position].length());

        holder.actBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"ActBtn : " + result[position], Toast.LENGTH_LONG).show();
                holder.actBtn.setMode(ActionProcessButton.Mode.PROGRESS);
                holder.actBtn.setProgress(30);
            }
        });

        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"You clicked " + result[position], Toast.LENGTH_LONG).show();
            }
        });

        return rowView;
    }

}
