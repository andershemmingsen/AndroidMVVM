package dk.ahemmingsen.plandaytest.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitHelper {

    static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://private-c60ade-guidebook1.apiary-mock.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public static GuideBookService getGuideBookService() {
        return retrofit.create(GuideBookService.class);
    }

}
