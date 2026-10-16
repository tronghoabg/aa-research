package Va;

import com.hyprmx.android.sdk.model.PreloadedVastData;
import java.util.ArrayList;

/* renamed from: Va.u2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1159u2 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        PreloadedVastData preloadedVastData = (PreloadedVastData) arrayList.get(0);
        int i5 = C1185w2.f14724T + 73;
        C1185w2.f14725U = i5 % 128;
        if (i5 % 2 != 0) {
            return C1185w2.J0(preloadedVastData);
        }
        C1185w2.J0(preloadedVastData);
        throw null;
    }
}
