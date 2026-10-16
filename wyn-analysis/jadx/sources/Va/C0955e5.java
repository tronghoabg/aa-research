package Va;

import java.util.ArrayList;
import net.pubnative.lite.sdk.models.Ad;

/* renamed from: Va.e5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0955e5 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        Ad ad2 = (Ad) arrayList.get(0);
        int i5 = C1098p5.f14473U + 7;
        C1098p5.f14472T = i5 % 128;
        if (i5 % 2 != 0) {
            C1098p5.L0(ad2);
            throw null;
        }
        String strL0 = C1098p5.L0(ad2);
        int i10 = C1098p5.f14472T + 81;
        C1098p5.f14473U = i10 % 128;
        if (i10 % 2 != 0) {
            return strL0;
        }
        throw null;
    }
}
