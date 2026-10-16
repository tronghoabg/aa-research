package Va;

import java.util.ArrayList;
import java.util.List;
import net.pubnative.lite.sdk.vpaid.response.AdParams;

/* loaded from: classes4.dex */
public final class O4 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        AdParams adParams = (AdParams) arrayList.get(0);
        C1098p5.f14473U = (C1098p5.f14472T + 107) % 128;
        List listC0 = C1098p5.C0(adParams);
        int i5 = C1098p5.f14472T + 59;
        C1098p5.f14473U = i5 % 128;
        if (i5 % 2 != 0) {
            return listC0;
        }
        throw null;
    }
}
