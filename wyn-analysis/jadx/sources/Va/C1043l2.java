package Va;

import com.facebook.ads.internal.adapters.AdAdapter;
import java.util.ArrayList;

/* renamed from: Va.l2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1043l2 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        AdAdapter adAdapter = (AdAdapter) arrayList.get(0);
        int i5 = C1082o2.f14451U + 31;
        C1082o2.f14450T = i5 % 128;
        if (i5 % 2 == 0) {
            return C1082o2.G0(adAdapter);
        }
        C1082o2.G0(adAdapter);
        throw null;
    }
}
