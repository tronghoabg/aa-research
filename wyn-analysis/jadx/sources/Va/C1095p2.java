package Va;

import com.hyprmx.android.sdk.core.DependencyHolder;
import java.util.ArrayList;

/* renamed from: Va.p2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1095p2 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        DependencyHolder dependencyHolder = (DependencyHolder) arrayList.get(0);
        C1185w2.f14724T = (C1185w2.f14725U + 119) % 128;
        String strL0 = C1185w2.L0(dependencyHolder);
        int i5 = C1185w2.f14724T + 17;
        C1185w2.f14725U = i5 % 128;
        if (i5 % 2 != 0) {
            return strL0;
        }
        throw null;
    }
}
