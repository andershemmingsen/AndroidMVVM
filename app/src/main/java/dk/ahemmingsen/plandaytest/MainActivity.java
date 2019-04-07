package dk.ahemmingsen.plandaytest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import dk.ahemmingsen.plandaytest.ui.GuideAdapter;
import dk.ahemmingsen.plandaytest.viewmodel.UpcomingGuidesViewModel;

public class MainActivity extends AppCompatActivity {

    private UpcomingGuidesViewModel upcomingGuidesViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        GuideAdapter adapter = new GuideAdapter();
        recyclerView.setAdapter(adapter);

        upcomingGuidesViewModel = ViewModelProviders.of(this).get(UpcomingGuidesViewModel.class);
        upcomingGuidesViewModel.init();
        upcomingGuidesViewModel.getUpcomingGuides().observe(this, upcomingGuides -> {
            adapter.setGuides(upcomingGuides);
        });

    }
}
