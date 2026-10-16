package Va;

import com.explorestack.protobuf.adcom.Ad;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Va.a2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0900a2 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        Ad ad2 = (Ad) arrayList.get(0);
        int i5 = C0939d2.f14093T + 113;
        C0939d2.f14094U = i5 % 128;
        if (i5 % 2 == 0) {
            C0939d2.D0(ad2);
            throw null;
        }
        List listD0 = C0939d2.D0(ad2);
        int i10 = C0939d2.f14093T + 79;
        C0939d2.f14094U = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 27 / 0;
        }
        return listD0;
    }
}
