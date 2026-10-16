package Va;

import java.util.ArrayList;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.AdData;

/* renamed from: Va.f5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0968f5 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        Ad ad2 = (Ad) arrayList.get(0);
        String str = (String) arrayList.get(1);
        C1098p5.f14473U = (C1098p5.f14472T + 39) % 128;
        AdData adDataV0 = C1098p5.V0(ad2, str);
        int i5 = C1098p5.f14472T + 105;
        C1098p5.f14473U = i5 % 128;
        if (i5 % 2 != 0) {
            return adDataV0;
        }
        throw null;
    }
}
