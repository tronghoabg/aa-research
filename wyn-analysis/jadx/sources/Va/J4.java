package Va;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.VideoAdController;
import net.pubnative.lite.sdk.vpaid.response.AdParams;

/* loaded from: classes4.dex */
public final class J4 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        VideoAdController videoAdController = (VideoAdController) arrayList.get(0);
        C1098p5.f14473U = (C1098p5.f14472T + 35) % 128;
        AdParams adParamsC1 = C1098p5.c1(videoAdController);
        int i5 = C1098p5.f14473U + 55;
        C1098p5.f14472T = i5 % 128;
        if (i5 % 2 == 0) {
            return adParamsC1;
        }
        throw null;
    }
}
