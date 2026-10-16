package Va;

import com.inmobi.media.ads.network.common.model.Ad;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes4.dex */
public final class C2 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        Ad ad2 = (Ad) arrayList.get(0);
        H2.f13403T = (H2.f13402S + 101) % 128;
        Map mapC0 = H2.C0(ad2);
        H2.f13402S = (H2.f13403T + 27) % 128;
        return mapC0;
    }
}
