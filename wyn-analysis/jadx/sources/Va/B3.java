package Va;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class B3 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) arrayList.get(0);
        K3.f13478U = (K3.f13477T + 121) % 128;
        String strD0 = K3.D0(inneractiveAdSpot);
        int i5 = K3.f13478U + 119;
        K3.f13477T = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 82 / 0;
        }
        return strD0;
    }
}
