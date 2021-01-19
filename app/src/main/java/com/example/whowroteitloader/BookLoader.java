package com.example.whowroteitloader;


import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

public class BookLoader extends AsyncTaskLoader<String> {

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }

    private String mQuery;

    public BookLoader(Context context, String query) {
        super(context);
        mQuery = query;
    }

    @Nullable
    @Override
    public String loadInBackground() {
        return NetworkUtils.getBookInfo(mQuery);
    }
}
