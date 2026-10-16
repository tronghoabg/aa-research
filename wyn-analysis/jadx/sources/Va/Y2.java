package Va;

import com.fyber.fairbid.mediation.MediationManager;
import com.fyber.fairbid.sdk.placements.PlacementsHandler;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class Y2 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        MediationManager mediationManager = (MediationManager) arrayList.get(0);
        C0901a3.f13969S = (C0901a3.f13970T + 95) % 128;
        PlacementsHandler placementsHandlerU0 = C0901a3.U0(mediationManager);
        int i5 = C0901a3.f13969S + 83;
        C0901a3.f13970T = i5 % 128;
        if (i5 % 2 != 0) {
            return placementsHandlerU0;
        }
        throw null;
    }
}
