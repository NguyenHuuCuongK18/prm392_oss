package project.prm392_oss.database;

import android.app.Application;
import android.content.Context;

public class App extends Application {
    private static Context context;


    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }

    public static Context getContext() {
        return context;
    }
}
