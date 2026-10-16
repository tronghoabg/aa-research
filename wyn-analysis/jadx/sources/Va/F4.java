package Va;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.response.AdParams;

/* loaded from: classes4.dex */
public final class F4 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        AdParams adParams = (AdParams) arrayList.get(0);
        C1098p5.f14472T = (C1098p5.f14473U + 101) % 128;
        String strD0 = C1098p5.D0(adParams);
        int i5 = C1098p5.f14473U + 39;
        C1098p5.f14472T = i5 % 128;
        if (i5 % 2 == 0) {
            return strD0;
        }
        throw null;
    }
}
