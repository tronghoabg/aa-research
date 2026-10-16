package Va;

import java.util.ArrayList;
import net.pubnative.lite.sdk.models.Ad;

/* renamed from: Va.a5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0903a5 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        Ad ad2 = (Ad) arrayList.get(0);
        C1098p5.f14473U = (C1098p5.f14472T + 99) % 128;
        String strJ0 = C1098p5.J0(ad2);
        int i5 = C1098p5.f14472T + 117;
        C1098p5.f14473U = i5 % 128;
        if (i5 % 2 != 0) {
            return strJ0;
        }
        throw null;
    }
}
