package Va;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import java.util.ArrayList;

/* renamed from: Va.y3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1210y3 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) arrayList.get(0);
        int i5 = K3.f13478U + 11;
        K3.f13477T = i5 % 128;
        if (i5 % 2 != 0) {
            K3.G0(inneractiveAdSpot);
            throw null;
        }
        boolean zG0 = K3.G0(inneractiveAdSpot);
        K3.f13478U = (K3.f13477T + 75) % 128;
        return Boolean.valueOf(zG0);
    }
}
