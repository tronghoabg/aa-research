package Va;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.response.AdParams;

/* loaded from: classes4.dex */
public final class I4 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        AdParams adParams = (AdParams) arrayList.get(0);
        C1098p5.f14472T = (C1098p5.f14473U + 75) % 128;
        String strG0 = C1098p5.G0(adParams);
        C1098p5.f14472T = (C1098p5.f14473U + 45) % 128;
        return strG0;
    }
}
