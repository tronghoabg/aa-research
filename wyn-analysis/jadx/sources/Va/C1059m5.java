package Va;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.response.AdParams;

/* renamed from: Va.m5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1059m5 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        AdParams adParams = (AdParams) arrayList.get(0);
        int i5 = C1098p5.f14473U + 41;
        C1098p5.f14472T = i5 % 128;
        if (i5 % 2 == 0) {
            return C1098p5.P0(adParams);
        }
        C1098p5.P0(adParams);
        throw null;
    }
}
