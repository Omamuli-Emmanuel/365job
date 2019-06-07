package ng.com.hybridintegrated.a365dailyreadingsfornigeria.Bulletin;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import ng.com.hybridintegrated.a365dailyreadingsfornigeria.R;
import ng.com.hybridintegrated.a365dailyreadingsfornigeria.appreciation.appreciationadapter;

public class bulletinadapter extends RecyclerView.Adapter< bulletinadapter.Myholder> {
    private  List<bulletinmodel> mlist;
    private Context mcontext;
    public bulletinadapter(Context applicationContext, List<bulletinmodel> mlist) {
        this.mcontext=applicationContext;
        this.mlist=mlist;

    }

    @NonNull
    @Override
    public bulletinadapter.Myholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bulletinsinglelayout,viewGroup,false);
        return new bulletinadapter.Myholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull bulletinadapter.Myholder myholder, int i) {
        bulletinmodel g=mlist.get(i);
        String title=g.getTitle();
        String body=g.getBody();

        myholder.title.setText(title);
        myholder.body.setText(body);

    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public class Myholder extends RecyclerView.ViewHolder {
        TextView title,body;
        public Myholder(@NonNull View v) {
            super(v);
            title=v.findViewById(R.id.title);
            body=v.findViewById(R.id.bodysss);
        }
    }
}
