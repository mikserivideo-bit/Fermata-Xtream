package me.aap.fermatamodfs.auto.dear.google.why.bingo2.fs.addon.web;

import android.content.Context;

import androidx.annotation.IdRes;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;

import me.aap.fermatamodfs.auto.dear.google.why.bingo2.fs.addon.AddonInfo;
import me.aap.fermatamodfs.auto.dear.google.why.bingo2.fs.addon.FermataAddon;
import me.aap.utils.misc.ChangeableCondition;
import me.aap.utils.pref.PreferenceSet;
import me.aap.utils.pref.PreferenceStore;
import me.aap.utils.ui.fragment.ActivityFragment;

@Keep
public final class HomeAssistantAddon extends WebBrowserAddon {
	public static final String START_URL = "https://lukasimunovic.from.hr";

	@NonNull
	private static final AddonInfo info =
			FermataAddon.findAddonInfo(HomeAssistantAddon.class.getName());

	public HomeAssistantAddon() {
		super("homeassistant_web");
	}

	@IdRes
	@Override
	public int getAddonId() {
		return me.aap.fermatamodfs.auto.dear.google.why.bingo2.fs.R.id.homeassistant_fragment;
	}

	@NonNull
	@Override
	public AddonInfo getInfo() {
		return info;
	}

	@NonNull
	@Override
	public ActivityFragment createFragment() {
		return new HomeAssistantFragment();
	}

	@Override
	public void contributeSettings(Context ctx, PreferenceStore store, PreferenceSet set,
			ChangeableCondition visibility) {
		super.contributeSettings(ctx, store, set, visibility);
		set.addBooleanPref(o -> {
			o.store = getPreferenceStore();
			o.pref = WEB_OPEN_ON_START;
			o.title = R.string.open_on_start;
			o.visibility = visibility;
		});
	}

	@Override
	String getLastUrl() {
		return START_URL;
	}

	@Override
	void setLastUrl(String url) {
	}
}
