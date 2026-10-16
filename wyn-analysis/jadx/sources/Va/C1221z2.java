package Va;

import com.inmobi.media.ads.network.common.model.Ad;
import java.util.ArrayList;

/* renamed from: Va.z2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1221z2 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        Ad ad2 = (Ad) arrayList.get(0);
        int i5 = H2.f13403T + 95;
        H2.f13402S = i5 % 128;
        if (i5 % 2 == 0) {
            return H2.Q0(ad2);
        }
        H2.Q0(ad2);
        throw null;
    }
}
