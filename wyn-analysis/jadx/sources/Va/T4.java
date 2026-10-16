package Va;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.models.vast.Creatives;
import net.pubnative.lite.sdk.vpaid.models.vast.VastAdSource;

/* loaded from: classes4.dex */
public final class T4 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        VastAdSource vastAdSource = (VastAdSource) arrayList.get(0);
        C1098p5.f14472T = (C1098p5.f14473U + 117) % 128;
        Creatives creativesX0 = C1098p5.X0(vastAdSource);
        int i5 = C1098p5.f14472T + 111;
        C1098p5.f14473U = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 79 / 0;
        }
        return creativesX0;
    }
}
