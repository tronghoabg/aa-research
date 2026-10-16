package Va;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.VideoAd;

/* loaded from: classes4.dex */
public final class G4 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        VideoAd videoAd = (VideoAd) arrayList.get(0);
        C1098p5.f14472T = (C1098p5.f14473U + 5) % 128;
        boolean zD1 = C1098p5.d1(videoAd);
        C1098p5.f14472T = (C1098p5.f14473U + 29) % 128;
        return Boolean.valueOf(zD1);
    }
}
