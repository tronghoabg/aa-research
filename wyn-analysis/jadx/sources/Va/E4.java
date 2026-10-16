package Va;

import java.util.ArrayList;
import java.util.List;
import net.pubnative.lite.sdk.vpaid.response.AdParams;

/* loaded from: classes4.dex */
public final class E4 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        AdParams adParams = (AdParams) arrayList.get(0);
        int i5 = C1098p5.f14472T + 123;
        C1098p5.f14473U = i5 % 128;
        int i10 = i5 % 2;
        List listH0 = C1098p5.H0(adParams);
        if (i10 == 0) {
            int i11 = 96 / 0;
        }
        return listH0;
    }
}
