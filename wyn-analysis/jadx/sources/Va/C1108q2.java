package Va;

import com.hyprmx.android.sdk.api.data.Ad;
import java.util.ArrayList;

/* renamed from: Va.q2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1108q2 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        Ad ad2 = (Ad) arrayList.get(0);
        int i5 = C1185w2.f14724T + 103;
        C1185w2.f14725U = i5 % 128;
        if (i5 % 2 == 0) {
            C1185w2.F0(ad2);
            throw null;
        }
        String strF0 = C1185w2.F0(ad2);
        int i10 = C1185w2.f14725U + 91;
        C1185w2.f14724T = i10 % 128;
        if (i10 % 2 == 0) {
            return strF0;
        }
        throw null;
    }
}
