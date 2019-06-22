package nidal.project1;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
public interface CatImage {

        // we set query to put the variable in the url in get method
//        https://api.thecatapi.com/v1/images/search?format=json
        @GET("/v1/images/search")
        Call<List<CatResponse>> get(@Query("format") String format, @Query("x-api-key") String token);

}
