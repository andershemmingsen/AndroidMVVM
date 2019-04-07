package dk.ahemmingsen.plandaytest.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import dk.ahemmingsen.plandaytest.R;
import dk.ahemmingsen.plandaytest.model.Guide;

public class GuideAdapter extends RecyclerView.Adapter<GuideAdapter.GuideViewHolder> {

    private List<Guide> guides = new ArrayList<>();
    @NonNull
    @Override
    public GuideViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem, parent, false);
        return new GuideViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull GuideViewHolder holder, int position) {
        Guide currentGuide = guides.get(position);
        holder.textViewName.setText(currentGuide.getName());
        holder.textViewStartDate.setText(currentGuide.getStartDate());
        holder.textViewEndDate.setText(currentGuide.getEndDate());
        Picasso.get()
                .load(currentGuide.getIcon())
                .placeholder(R.mipmap.no_image)
                .resize(200, 200)
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return guides.size();
    }

    public void setGuides(List<Guide> guides) {
        this.guides = guides;
        notifyDataSetChanged();
    }

    class GuideViewHolder extends RecyclerView.ViewHolder {

        private TextView textViewName;
        private TextView textViewStartDate;
        private TextView textViewEndDate;
        private ImageView imageView;

        public GuideViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.text_name);
            textViewStartDate = itemView.findViewById(R.id.text_startDate);
            textViewEndDate = itemView.findViewById(R.id.text_endDate);
            imageView = itemView.findViewById(R.id.image_view);
        }
    }

}
