package Va;

import com.explorestack.protobuf.adcom.Ad;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class U1 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        Ad ad2 = (Ad) arrayList.get(0);
        C0939d2.f14094U = (C0939d2.f14093T + 77) % 128;
        String strE0 = C0939d2.E0(ad2);
        int i5 = C0939d2.f14094U + 61;
        C0939d2.f14093T = i5 % 128;
        if (i5 % 2 == 0) {
            return strE0;
        }
        throw null;
    }
}
