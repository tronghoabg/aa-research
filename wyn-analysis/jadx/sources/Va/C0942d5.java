package Va;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.models.vpaid.CreativeParams;

/* renamed from: Va.d5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0942d5 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        CreativeParams creativeParams = (CreativeParams) arrayList.get(0);
        C1098p5.f14472T = (C1098p5.f14473U + 65) % 128;
        String strF1 = C1098p5.f1(creativeParams);
        int i5 = C1098p5.f14472T + 121;
        C1098p5.f14473U = i5 % 128;
        if (i5 % 2 != 0) {
            return strF1;
        }
        throw null;
    }
}
