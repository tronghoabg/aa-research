package Va;

import java.util.ArrayList;
import net.pubnative.lite.sdk.models.AdData;

/* renamed from: Va.g5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0981g5 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        AdData adData = (AdData) arrayList.get(0);
        int i5 = C1098p5.f14472T + 111;
        C1098p5.f14473U = i5 % 128;
        if (i5 % 2 != 0) {
            return C1098p5.e1(adData);
        }
        C1098p5.e1(adData);
        throw null;
    }
}
