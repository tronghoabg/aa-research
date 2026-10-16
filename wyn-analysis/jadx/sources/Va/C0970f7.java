package Va;

import com.vungle.ads.internal.model.Placement;
import java.util.ArrayList;

/* renamed from: Va.f7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0970f7 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        Placement placement = (Placement) arrayList.get(0);
        C1061m7.f14384S = (C1061m7.f14385T + 71) % 128;
        boolean zH0 = C1061m7.H0(placement);
        int i5 = C1061m7.f14385T + 81;
        C1061m7.f14384S = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 87 / 0;
        }
        return Boolean.valueOf(zH0);
    }
}
