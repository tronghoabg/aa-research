package Va;

import com.explorestack.protobuf.adcom.Ad;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class R1 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        Ad ad2 = (Ad) arrayList.get(0);
        int iIntValue = ((Integer) arrayList.get(1)).intValue();
        C0939d2.f14094U = (C0939d2.f14093T + 73) % 128;
        String strL0 = C0939d2.L0(ad2, iIntValue);
        int i5 = C0939d2.f14094U + 39;
        C0939d2.f14093T = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 16 / 0;
        }
        return strL0;
    }
}
