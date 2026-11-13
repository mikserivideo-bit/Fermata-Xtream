package me.aap.fermatamodfs.auto.dear.google.why.bingo2.fs.auto;

import android.os.Bundle;

import androidx.annotation.Nullable;

import me.aap.utils.log.Log;

public class PlayCarActivity extends MainCarActivity {
	@Override
	public void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActivityDelegate().onSuccess(d -> d.goToCurrent()
				.onFailure(err -> Log.e(err, "Failed to open the current media item")));
	}
}
