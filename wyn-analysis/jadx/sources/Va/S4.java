package Va;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.VideoAd;
import net.pubnative.lite.sdk.vpaid.VideoAdListener;

/* loaded from: classes4.dex */
public final class S4 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        VideoAd videoAd = (VideoAd) arrayList.get(0);
        VideoAdListener videoAdListener = (VideoAdListener) arrayList.get(1);
        C1098p5.f14473U = (C1098p5.f14472T + 57) % 128;
        C1098p5.j1(videoAd, videoAdListener);
        C1098p5.f14472T = (C1098p5.f14473U + 89) % 128;
        return null;
    }
}
