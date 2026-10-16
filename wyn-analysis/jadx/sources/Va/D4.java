package Va;

import java.util.ArrayList;
import net.pubnative.lite.sdk.models.AdData;

/* loaded from: classes4.dex */
public final class D4 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        AdData adData = (AdData) arrayList.get(0);
        String str = (String) arrayList.get(1);
        int i5 = C1098p5.f14473U + 93;
        C1098p5.f14472T = i5 % 128;
        if (i5 % 2 == 0) {
            return C1098p5.k1(adData, str);
        }
        C1098p5.k1(adData, str);
        throw null;
    }
}
