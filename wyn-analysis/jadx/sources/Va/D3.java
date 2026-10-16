package Va;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class D3 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) arrayList.get(0);
        K3.f13478U = (K3.f13477T + 67) % 128;
        InneractiveAdRequest inneractiveAdRequestJ0 = K3.J0(inneractiveAdSpot);
        K3.f13478U = (K3.f13477T + 79) % 128;
        return inneractiveAdRequestJ0;
    }
}
