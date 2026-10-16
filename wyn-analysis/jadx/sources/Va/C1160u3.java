package Va;

import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import java.util.ArrayList;

/* renamed from: Va.u3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1160u3 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        LevelPlayImpressionDataListener levelPlayImpressionDataListener = (LevelPlayImpressionDataListener) arrayList.get(0);
        int i5 = C1186w3.f14729U + 9;
        C1186w3.f14728T = i5 % 128;
        int i10 = i5 % 2;
        C1186w3.H0(levelPlayImpressionDataListener);
        if (i10 != 0) {
            throw null;
        }
        C1186w3.f14729U = (C1186w3.f14728T + 95) % 128;
        return null;
    }
}
