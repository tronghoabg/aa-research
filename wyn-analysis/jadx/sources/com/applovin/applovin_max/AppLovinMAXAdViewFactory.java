package com.applovin.applovin_max;

import android.content.Context;
import com.applovin.mediation.MaxAdFormat;
import io.flutter.plugin.platform.e;
import io.flutter.plugin.platform.f;
import java.util.Map;
import uc.C4286w;
import uc.InterfaceC4269f;

/* loaded from: classes.dex */
public class AppLovinMAXAdViewFactory extends f {
    private final InterfaceC4269f messenger;

    public AppLovinMAXAdViewFactory(InterfaceC4269f interfaceC4269f) {
        super(C4286w.f46765a);
        this.messenger = interfaceC4269f;
    }

    @Override // io.flutter.plugin.platform.f
    public e create(Context context, int i5, Object obj) {
        Map map = (Map) obj;
        String str = (String) map.get("ad_unit_id");
        MaxAdFormat deviceSpecificBannerAdViewAdFormat = "mrec".equals((String) map.get("ad_format")) ? MaxAdFormat.MREC : AppLovinMAX.getDeviceSpecificBannerAdViewAdFormat(context);
        Integer num = map.containsKey("ad_view_id") ? (Integer) map.get("ad_view_id") : null;
        int iIntValue = num != null ? num.intValue() : 0;
        Boolean bool = Boolean.TRUE;
        return new AppLovinMAXAdView(i5, str, iIntValue, deviceSpecificBannerAdViewAdFormat, bool.equals(map.get("is_adaptive_banner_enabled")), bool.equals(map.get("is_auto_refresh_enabled")), map.containsKey("placement") ? (String) map.get("placement") : null, map.containsKey("custom_data") ? (String) map.get("custom_data") : null, map.containsKey("extra_parameters") ? (Map) map.get("extra_parameters") : null, map.containsKey("local_extra_parameters") ? (Map) map.get("local_extra_parameters") : null, this.messenger, context);
    }
}
