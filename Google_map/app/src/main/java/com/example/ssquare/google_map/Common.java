package com.example.ssquare.google_map;

import com.example.ssquare.google_map.Remote.IGoogleAPIService;
import com.example.ssquare.google_map.Remote.RetrofitClient;

/**
 * Created by S square on 06-02-2018.
 */

public class Common
{
    private static final String GOOGLE_APT_URL="https://maps.googleapis.com/";

    public static IGoogleAPIService getGoogleAPIService()
    {
        return RetrofitClient.getClient(GOOGLE_APT_URL).create(IGoogleAPIService.class);
    }
}
