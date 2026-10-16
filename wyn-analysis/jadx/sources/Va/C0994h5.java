package Va;

import java.util.ArrayList;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.AdData;

/* renamed from: Va.h5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0994h5 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        Ad ad2 = (Ad) arrayList.get(0);
        String str = (String) arrayList.get(1);
        int i5 = C1098p5.f14473U + 23;
        C1098p5.f14472T = i5 % 128;
        if (i5 % 2 != 0) {
            C1098p5.N0(ad2, str);
            throw null;
        }
        AdData adDataN0 = C1098p5.N0(ad2, str);
        int i10 = C1098p5.f14473U + 51;
        C1098p5.f14472T = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 16 / 0;
        }
        return adDataN0;
    }
}
