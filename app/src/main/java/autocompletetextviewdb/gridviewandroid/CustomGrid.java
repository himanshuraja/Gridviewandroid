package autocompletetextviewdb.gridviewandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Dell on 24-10-2016.
 */
public class CustomGrid extends BaseAdapter {
    private Context mContext;
    public final String[] web ;
    public final int[] Imageid;
    public CustomGrid(Context c,String [] web,int[] Imageid){
        mContext=c;
        this.Imageid=Imageid;
        this.web=web;

    }

    @Override
    public int getCount() {
        return web.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View grid;
        LayoutInflater inflater=(LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(convertView==null){
            grid =new View(mContext);
            grid=inflater.inflate( R.layout.grid_single,null);
            TextView textView=(TextView)grid.findViewById(R.id.grid_text);
            ImageView imageView=(ImageView)grid.findViewById(R.id.grid_image);
            textView.setText(web[position]);
            imageView.setImageResource(Imageid[position]);
        }
else {

        grid=(View)convertView;
    }
return grid;
    }}
