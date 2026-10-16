package Va;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.response.AdParams;

/* renamed from: Va.n5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1072n5 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        AdParams adParams = (AdParams) arrayList.get(0);
        int i5 = C1098p5.f14473U + 15;
        C1098p5.f14472T = i5 % 128;
        int i10 = i5 % 2;
        String strM0 = C1098p5.M0(adParams);
        if (i10 != 0) {
            int i11 = 36 / 0;
        }
        int i12 = C1098p5.f14472T + 13;
        C1098p5.f14473U = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 60 / 0;
        }
        return strM0;
    }
}
