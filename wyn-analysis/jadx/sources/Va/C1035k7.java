package Va;

import com.vungle.ads.internal.model.AdPayload;
import java.util.ArrayList;

/* renamed from: Va.k7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1035k7 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        AdPayload.AdUnit adUnit = (AdPayload.AdUnit) arrayList.get(0);
        int i5 = C1061m7.f14384S + 31;
        C1061m7.f14385T = i5 % 128;
        if (i5 % 2 == 0) {
            C1061m7.D0(adUnit);
            throw null;
        }
        String strD0 = C1061m7.D0(adUnit);
        int i10 = C1061m7.f14384S + 51;
        C1061m7.f14385T = i10 % 128;
        if (i10 % 2 != 0) {
            return strD0;
        }
        throw null;
    }
}
