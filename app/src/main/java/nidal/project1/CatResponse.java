package nidal.project1;

import android.net.Uri;

import com.google.gson.annotations.SerializedName;

import java.net.URL;

public class CatResponse {

    @SerializedName("url")
    URL mUrl;

    public URL getImage() {
        return mUrl;
    }
}
