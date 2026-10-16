package Va;

import com.inmobi.media.ads.network.common.model.ContextData;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class B2 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        ContextData contextData = (ContextData) arrayList.get(0);
        H2.f13403T = (H2.f13402S + 11) % 128;
        String strM0 = H2.M0(contextData);
        H2.f13402S = (H2.f13403T + 125) % 128;
        return strM0;
    }
}
