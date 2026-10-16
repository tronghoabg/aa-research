package Va;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.models.vast.Companion;
import net.pubnative.lite.sdk.vpaid.models.vast.CompanionClickThrough;

/* loaded from: classes4.dex */
public final class R4 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        Companion companion = (Companion) arrayList.get(0);
        int i5 = C1098p5.f14473U + 43;
        C1098p5.f14472T = i5 % 128;
        if (i5 % 2 != 0) {
            C1098p5.b1(companion);
            throw null;
        }
        CompanionClickThrough companionClickThroughB1 = C1098p5.b1(companion);
        C1098p5.f14473U = (C1098p5.f14472T + 47) % 128;
        return companionClickThroughB1;
    }
}
