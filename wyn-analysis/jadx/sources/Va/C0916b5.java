package Va;

import java.util.ArrayList;
import net.pubnative.lite.sdk.models.Ad;

/* renamed from: Va.b5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0916b5 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        Ad ad2 = (Ad) arrayList.get(0);
        C1098p5.f14473U = (C1098p5.f14472T + 61) % 128;
        String strQ0 = C1098p5.Q0(ad2);
        int i5 = C1098p5.f14473U + 13;
        C1098p5.f14472T = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 37 / 0;
        }
        return strQ0;
    }
}
