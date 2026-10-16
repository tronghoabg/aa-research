package com.applovin.applovin_max;

import android.content.Context;
import com.applovin.sdk.AppLovinSdk;
import io.flutter.plugin.platform.e;
import io.flutter.plugin.platform.f;
import java.util.Map;
import uc.C4286w;
import uc.InterfaceC4269f;

/* loaded from: classes.dex */
public class AppLovinMAXNativeAdViewFactory extends f {
    private final InterfaceC4269f messenger;

    public AppLovinMAXNativeAdViewFactory(InterfaceC4269f interfaceC4269f) {
        super(C4286w.f46765a);
        this.messenger = interfaceC4269f;
    }

    @Override // io.flutter.plugin.platform.f
    public e create(Context context, int i5, Object obj) {
        AppLovinSdk sdk = AppLovinMAX.getInstance().getSdk();
        Map map = (Map) obj;
        String str = (String) map.get("ad_unit_id");
        AppLovinMAX.d("Creating MaxNativeAdView widget with Ad Unit ID: " + str);
        return new AppLovinMAXNativeAdView(i5, str, map.containsKey("placement") ? (String) map.get("placement") : null, map.containsKey("custom_data") ? (String) map.get("custom_data") : null, map.containsKey("extra_parameters") ? (Map) map.get("extra_parameters") : null, map.containsKey("local_extra_parameters") ? (Map) map.get("local_extra_parameters") : null, this.messenger, sdk, context);
    }
}
