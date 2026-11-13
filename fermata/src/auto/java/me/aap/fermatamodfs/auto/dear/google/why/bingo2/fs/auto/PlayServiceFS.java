package me.aap.fermatamodfs.auto.dear.google.why.bingo2.fs.auto;

import com.google.android.apps.auto.sdk.CarActivity;

public class PlayServiceFS extends CarService {
	@Override
	public Class<? extends CarActivity> getCarActivity() {
		return PlayCarActivity.class;
	}
}
