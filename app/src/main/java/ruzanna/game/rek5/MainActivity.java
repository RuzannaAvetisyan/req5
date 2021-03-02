package ruzanna.game.rek5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.Context;
import android.os.Bundle;

import com.facebook.FacebookSdk;
import com.facebook.applinks.AppLinkData;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        FacebookSdk.setAutoInitEnabled(true);
        FacebookSdk.fullyInitialize();
        AppLinkData.fetchDeferredAppLinkData(this, FacebookSdk.getApplicationId(),
                new AppLinkData.CompletionHandler() {
                    @Override
                    public void onDeferredAppLinkDataFetched(AppLinkData appLinkData) {
                        try {
                            InternetConnect internetConnect = new InternetConnect();
                            if (internetConnect.isOnline(MainActivity.this.getApplicationContext()))
                                System.out.println("test1");
                            else
                                System.out.println("test2");

                            Intent intent = new Intent(MainActivity.this, GameActivity.class);
                            startActivity(intent);finish();
                        }catch (Exception e){

                        }


                    }
                }
        );
    }
}
