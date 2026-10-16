package Va;

import com.inmobi.media.ads.network.common.model.Ad;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class E2 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        Ad ad2 = (Ad) arrayList.get(0);
        H2.f13403T = (H2.f13402S + 13) % 128;
        String strH0 = H2.H0(ad2);
        H2.f13402S = (H2.f13403T + 33) % 128;
        return strH0;
    }
}
