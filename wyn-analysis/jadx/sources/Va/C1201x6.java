package Va;

import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementVideoListener;
import java.util.ArrayList;

/* renamed from: Va.x6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1201x6 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        TJPlacement tJPlacement = (TJPlacement) arrayList.get(0);
        C1225z6.f14837S = (C1225z6.f14838T + 11) % 128;
        TJPlacementVideoListener tJPlacementVideoListenerC0 = C1225z6.C0(tJPlacement);
        C1225z6.f14838T = (C1225z6.f14837S + 77) % 128;
        return tJPlacementVideoListenerC0;
    }
}
