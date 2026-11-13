package me.aap.fermatamodfs.auto.dear.google.why.bingo2.fs.addon.web;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import me.aap.fermatamodfs.auto.dear.google.why.bingo2.fs.R;
import me.aap.fermatamodfs.auto.dear.google.why.bingo2.fs.addon.AddonManager;
import me.aap.utils.ui.fragment.ActivityFragment;

@Keep
public final class HomeAssistantFragment extends WebBrowserFragment {
	@Override
	public int getFragmentId() {
		return R.id.homeassistant_fragment;
	}

	@Nullable
	@Override
	protected HomeAssistantAddon getAddon() {
		return AddonManager.get().getAddon(HomeAssistantAddon.class);
	}

	@Override
	public void switchingFrom(@Nullable ActivityFragment currentFragment) {
		super.switchingFrom(currentFragment);
		HomeAssistantAddon addon = getAddon();
		if ((addon != null) && (getWebView() != null)) loadUrl(HomeAssistantAddon.START_URL);
	}

	@NonNull
	@Override
	public CharSequence getTitle() {
		return getString(R.string.addon_name_homeassistant);
	}
}
