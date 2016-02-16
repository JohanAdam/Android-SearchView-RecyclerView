package com.josh.example.searchviewnew;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Josh on 2/9/2016.
 */
public class DetailActivity extends AppCompatActivity {

    TextView textName, textSub;
    ImageView photoMember;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        final ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        Data memberData = (Data)getIntent().getExtras().getSerializable("DATA");

        textName = (TextView)findViewById(R.id.title_text);
        textName.setText(memberData.getTitle());

        textSub = (TextView)findViewById(R.id.sub_text);
        textSub.setText(memberData.getLocation());

        getSupportActionBar().setTitle(memberData.getTitle());

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        NavUtils.navigateUpFromSameTask(this);
    }
}
