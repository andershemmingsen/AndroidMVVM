package dk.ahemmingsen.plandaytest.retrofit;

import dk.ahemmingsen.plandaytest.model.UpcomingGuidesResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface GuideBookService {

    @GET("upcomingGuides")
    Call<UpcomingGuidesResponse> getUpcomingGuides();
}
