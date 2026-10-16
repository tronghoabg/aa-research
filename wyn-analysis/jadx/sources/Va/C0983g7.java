package Va;

import com.vungle.ads.internal.model.Placement;
import java.util.ArrayList;

/* renamed from: Va.g7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0983g7 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        Placement placement = (Placement) arrayList.get(0);
        int i5 = C1061m7.f14384S + 27;
        C1061m7.f14385T = i5 % 128;
        if (i5 % 2 != 0) {
            return C1061m7.F0(placement);
        }
        C1061m7.F0(placement);
        throw null;
    }
}
