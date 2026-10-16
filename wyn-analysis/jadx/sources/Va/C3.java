package Va;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class C3 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) arrayList.get(0);
        int i5 = K3.f13478U + 65;
        K3.f13477T = i5 % 128;
        if (i5 % 2 != 0) {
            K3.C0(inneractiveAdSpot);
            throw null;
        }
        InneractiveUnitController inneractiveUnitControllerC0 = K3.C0(inneractiveAdSpot);
        K3.f13478U = (K3.f13477T + 63) % 128;
        return inneractiveUnitControllerC0;
    }
}
