package Va;

import java.util.ArrayList;
import net.pubnative.lite.sdk.models.AdData;

/* renamed from: Va.k5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1033k5 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        AdData adData = (AdData) arrayList.get(0);
        int i5 = C1098p5.f14473U + 45;
        C1098p5.f14472T = i5 % 128;
        int i10 = i5 % 2;
        String strK0 = C1098p5.K0(adData);
        if (i10 != 0) {
            int i11 = 27 / 0;
        }
        int i12 = C1098p5.f14473U + 15;
        C1098p5.f14472T = i12 % 128;
        if (i12 % 2 == 0) {
            return strK0;
        }
        throw null;
    }
}
