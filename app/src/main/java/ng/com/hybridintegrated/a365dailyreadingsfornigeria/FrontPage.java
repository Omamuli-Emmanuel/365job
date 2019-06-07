package ng.com.hybridintegrated.a365dailyreadingsfornigeria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class FrontPage extends AppCompatActivity {

    private LinearLayout prayers;
    private LinearLayout rosary;
    private LinearLayout requests;
    private LinearLayout stationOfCross;
    private LinearLayout mappreciation;
    private LinearLayout novena;
    private LinearLayout confss,dailyreading,bulletin,catholicdoctrine;
    private AdView mAdview;
    private Toolbar mtoolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page);
        // android:label="365 Daily Readings For Nigeria"
       // this.setTitle("365 Daily Readings For Nigeria");
        mAdview=findViewById(R.id.addfrontpage);
        AdRequest adRequest=new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);

        mtoolbar=findViewById(R.id.toolbarfrontpage);
        setSupportActionBar(mtoolbar);
        mtoolbar.setTitle("365 Daily Readings For Nigeria");

        catholicdoctrine=findViewById(R.id.catholicdoc);
        catholicdoctrine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(FrontPage.this, Catholicdoctrine.class));
                startActivity(intent);
            }
        });

        bulletin=findViewById(R.id.bulletin);
        bulletin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(FrontPage.this, catholicbulletin.class));
                startActivity(intent);
            }
        });

        mappreciation=findViewById(R.id.appreciation);
        mappreciation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(FrontPage.this, Appreciation.class));
                startActivity(intent);
            }
        });

        dailyreading=findViewById(R.id.dailrd);
        dailyreading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(FrontPage.this, dailyReadings.class));
                startActivity(intent);
            }
        });

        confss = (LinearLayout)findViewById(R.id.confRec);
        confss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(FrontPage.this, conff.class));
                startActivity(intent);
            }
        });

        novena = (LinearLayout)findViewById(R.id.novena);
        novena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(FrontPage.this, novena.class));
                startActivity(intent);
            }
        });

        stationOfCross = (LinearLayout)findViewById(R.id.stationOfCross);
        stationOfCross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(FrontPage.this, stationOfTheCross.class));
                startActivity(intent);
            }
        });

        requests = (LinearLayout)findViewById(R.id.request);
        requests.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(FrontPage.this, prayerRequest.class));
                startActivity(intent);
            }
        });

        prayers = (LinearLayout)findViewById(R.id.churchPrayers);
        prayers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(FrontPage.this, churchPrayers.class));
                startActivity(intent);
            }
        });

        rosary = (LinearLayout)findViewById(R.id.rosary);
        rosary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(FrontPage.this, holyRosary.class));
                startActivity(intent);
            }
        });
    }
}
