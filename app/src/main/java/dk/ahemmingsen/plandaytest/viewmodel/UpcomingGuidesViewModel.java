package dk.ahemmingsen.plandaytest.viewmodel;

import java.util.List;

import javax.inject.Inject;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import dk.ahemmingsen.plandaytest.model.Guide;
import dk.ahemmingsen.plandaytest.repository.GuideBookRepository;

public class UpcomingGuidesViewModel extends ViewModel {

    private LiveData<List<Guide>> upcomingGuides;
    private GuideBookRepository guideBookRepository;

    @Inject
    public UpcomingGuidesViewModel() {
        this.guideBookRepository = new GuideBookRepository();
    }

    public void init() {
        if (upcomingGuides != null) {
            return;
        }
        upcomingGuides = guideBookRepository.getUpcomingGuides();
    }

    public LiveData<List<Guide>> getUpcomingGuides() {
        return upcomingGuides;
    }

}
