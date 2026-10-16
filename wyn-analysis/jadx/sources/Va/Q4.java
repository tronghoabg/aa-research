package Va;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.models.vast.CompanionAds;
import net.pubnative.lite.sdk.vpaid.models.vast.Creative;

/* loaded from: classes4.dex */
public final class Q4 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        Creative creative = (Creative) arrayList.get(0);
        int i5 = C1098p5.f14473U + 11;
        C1098p5.f14472T = i5 % 128;
        int i10 = i5 % 2;
        CompanionAds companionAdsH1 = C1098p5.h1(creative);
        if (i10 != 0) {
            int i11 = 59 / 0;
        }
        return companionAdsH1;
    }
}
