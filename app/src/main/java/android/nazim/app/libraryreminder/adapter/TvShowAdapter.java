package android.nazim.app.libraryreminder.adapter;

import android.nazim.app.libraryreminder.R;
import android.nazim.app.libraryreminder.ViewHolder.ModelViewHolder;
import android.nazim.app.libraryreminder.model.TvShow;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Nazim on 01/06/15.
 */
public class TvShowAdapter extends AbstractAdapter {

    public TvShowAdapter(List<TvShow> contactList) {
        super(contactList);
    }

    @Override
    public void onBindViewHolder(ModelViewHolder tvShowHolder, int i) {
        TvShow ci = ((TvShow) contactList.get(i));
        tvShowHolder.getInfo1().setText("Episode : " + ci.episode);
        tvShowHolder.getName().setText(ci.name + "");
        tvShowHolder.getInfo2().setText("Saison : " + ci.season);
    }
}
