package com.csabacsete.csabisportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @OnClick(R.id.button_spotify_streamer)
    void onSpotifyStreamerButtonClick() {
        showToast(R.string.launch_spotify_streamer);
    }

    @OnClick(R.id.button_scores_app)
    void onScoresAppButtonClick() {
        showToast(R.string.launch_scores_app);
    }

    @OnClick(R.id.button_library_app)
    void onLibraryAppButtonClick() {
        showToast(R.string.launch_library);
    }

    @OnClick(R.id.button_build_it_bigger)
    void onBuildItBiggerButtonClick() {
        showToast(R.string.launch_build_it_bigger);
    }

    @OnClick(R.id.button_xyz_reader)
    void onXyxReaderButtonClick() {
        showToast(R.string.launch_xyz_reader);
    }

    @OnClick(R.id.button_my_own_app)
    void onMyOwnAppButtonClick() {
        showToast(R.string.launch_my_own_app);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
    }

    private void showToast(final int messageResource) {
        Toast.makeText(this, getString(messageResource), Toast.LENGTH_SHORT).show();
    }

}
