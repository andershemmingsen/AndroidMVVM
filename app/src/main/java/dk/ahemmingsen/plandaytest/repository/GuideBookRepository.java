package dk.ahemmingsen.plandaytest.repository;

import android.util.Log;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import dk.ahemmingsen.plandaytest.model.Guide;
import dk.ahemmingsen.plandaytest.model.UpcomingGuidesResponse;
import dk.ahemmingsen.plandaytest.retrofit.GuideBookService;
import dk.ahemmingsen.plandaytest.retrofit.RetrofitHelper;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Singleton
public class GuideBookRepository {

    private static final String TAG = GuideBookRepository.class.getSimpleName() + ".TAG";
    private GuideBookService guideBookService;

    @Inject
    public GuideBookRepository(GuideBookService webservice) {
        guideBookService = webservice;
        //FIXME Dagger injection not working
    }

    //TODO remove when Dagger problem is fixed
    public GuideBookRepository() {
        guideBookService = RetrofitHelper.getGuideBookService();
    }

    public LiveData<List<Guide>> getUpcomingGuides() {
        final MutableLiveData<List<Guide>> upcomingGuides = new MutableLiveData<>();
        guideBookService.getUpcomingGuides().enqueue(new Callback<UpcomingGuidesResponse>() {
            @Override
            public void onResponse(Call<UpcomingGuidesResponse> call, Response<UpcomingGuidesResponse> response) {
                Log.d(TAG, "Fetching UpcomingGuides data");
                upcomingGuides.setValue(response.body().getUpcomingGuides());
            }

            @Override
            public void onFailure(Call<UpcomingGuidesResponse> call, Throwable t) {

            }
        });
        return upcomingGuides;
    }
}
