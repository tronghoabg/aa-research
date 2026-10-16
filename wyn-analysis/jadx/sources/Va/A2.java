package Va;

import com.inmobi.media.ads.network.common.model.AdSet;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class A2 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        AdSet adSet = (AdSet) arrayList.get(0);
        H2.f13402S = (H2.f13403T + 43) % 128;
        Boolean boolJ0 = H2.J0(adSet);
        H2.f13402S = (H2.f13403T + 79) % 128;
        return boolJ0;
    }
}
