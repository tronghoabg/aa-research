package Va;

import com.hyprmx.android.sdk.core.DependencyHolder;
import com.hyprmx.android.sdk.model.PreloadedVastData;
import java.util.ArrayList;

/* renamed from: Va.v2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1172v2 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        DependencyHolder dependencyHolder = (DependencyHolder) arrayList.get(0);
        C1185w2.f14725U = (C1185w2.f14724T + 17) % 128;
        PreloadedVastData preloadedVastDataH0 = C1185w2.H0(dependencyHolder);
        C1185w2.f14724T = (C1185w2.f14725U + 71) % 128;
        return preloadedVastDataH0;
    }
}
