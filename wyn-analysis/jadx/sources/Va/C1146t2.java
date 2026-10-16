package Va;

import com.hyprmx.android.sdk.core.HyprMXController;
import com.hyprmx.android.sdk.placement.PlacementController;
import java.util.ArrayList;

/* renamed from: Va.t2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1146t2 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        HyprMXController hyprMXController = (HyprMXController) arrayList.get(0);
        C1185w2.f14725U = (C1185w2.f14724T + 9) % 128;
        PlacementController placementControllerK0 = C1185w2.K0(hyprMXController);
        int i5 = C1185w2.f14724T + 95;
        C1185w2.f14725U = i5 % 128;
        if (i5 % 2 != 0) {
            return placementControllerK0;
        }
        throw null;
    }
}
