package Va;

import com.fyber.inneractive.sdk.external.ImpressionData;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class J3 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        ImpressionData impressionData = (ImpressionData) arrayList.get(0);
        int i5 = K3.f13478U + 59;
        K3.f13477T = i5 % 128;
        if (i5 % 2 != 0) {
            K3.M0(impressionData);
            throw null;
        }
        String strM0 = K3.M0(impressionData);
        K3.f13477T = (K3.f13478U + 105) % 128;
        return strM0;
    }
}
