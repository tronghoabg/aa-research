package Va;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class G3 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        InneractiveAdViewUnitController inneractiveAdViewUnitController = (InneractiveAdViewUnitController) arrayList.get(0);
        K3.f13478U = (K3.f13477T + 109) % 128;
        InneractiveAdSpot inneractiveAdSpotK0 = K3.K0(inneractiveAdViewUnitController);
        K3.f13477T = (K3.f13478U + 11) % 128;
        return inneractiveAdSpotK0;
    }
}
