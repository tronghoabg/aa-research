package Va;

import com.explorestack.protobuf.adcom.Ad;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class M1 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        Ad ad2 = (Ad) arrayList.get(0);
        int iIntValue = ((Integer) arrayList.get(1)).intValue();
        int i5 = C0939d2.f14093T + 89;
        C0939d2.f14094U = i5 % 128;
        if (i5 % 2 != 0) {
            return C0939d2.S0(ad2, iIntValue);
        }
        C0939d2.S0(ad2, iIntValue);
        throw null;
    }
}
