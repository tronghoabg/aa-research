package Va;

import com.applovin.adview.AdViewController;
import com.applovin.sdk.AppLovinAdDisplayListener;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class A1 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        AdViewController adViewController = (AdViewController) arrayList.get(0);
        AppLovinAdDisplayListener appLovinAdDisplayListener = (AppLovinAdDisplayListener) arrayList.get(1);
        E1.f13299T = (E1.f13300U + 13) % 128;
        E1.J0(adViewController, appLovinAdDisplayListener);
        int i5 = E1.f13300U + 121;
        E1.f13299T = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }
}
