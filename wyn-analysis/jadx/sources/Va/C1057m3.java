package Va;

import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import java.util.ArrayList;

/* renamed from: Va.m3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1057m3 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        LevelPlayImpressionDataListener levelPlayImpressionDataListener = (LevelPlayImpressionDataListener) arrayList.get(0);
        C1186w3.f14728T = (C1186w3.f14729U + 69) % 128;
        C1186w3.E0(levelPlayImpressionDataListener);
        int i5 = C1186w3.f14729U + 23;
        C1186w3.f14728T = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }
}
