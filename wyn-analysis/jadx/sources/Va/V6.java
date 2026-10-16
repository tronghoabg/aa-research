package Va;

import com.yandex.mobile.ads.banner.BannerAdEventListener;
import com.yandex.mobile.ads.banner.BannerAdView;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class V6 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        BannerAdView bannerAdView = (BannerAdView) arrayList.get(0);
        BannerAdEventListener bannerAdEventListener = (BannerAdEventListener) arrayList.get(1);
        C0957e7.f14122T = (C0957e7.f14121S + 47) % 128;
        C0957e7.E0(bannerAdView, bannerAdEventListener);
        int i5 = C0957e7.f14121S + 7;
        C0957e7.f14122T = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        int i10 = 63 / 0;
        return null;
    }
}
