package Va;

import java.util.ArrayList;
import java.util.List;
import net.pubnative.lite.sdk.vpaid.response.AdParams;

/* loaded from: classes4.dex */
public final class L4 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        AdParams adParams = (AdParams) arrayList.get(0);
        C1098p5.f14473U = (C1098p5.f14472T + 71) % 128;
        List listE0 = C1098p5.E0(adParams);
        C1098p5.f14472T = (C1098p5.f14473U + 63) % 128;
        return listE0;
    }
}
