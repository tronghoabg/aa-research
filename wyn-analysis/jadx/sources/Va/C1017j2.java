package Va;

import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;
import java.util.ArrayList;

/* renamed from: Va.j2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1017j2 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        AdView adView = (AdView) arrayList.get(0);
        AdListener adListener = (AdListener) arrayList.get(1);
        C1082o2.f14451U = (C1082o2.f14450T + 67) % 128;
        C1082o2.L0(adView, adListener);
        int i5 = C1082o2.f14450T + 83;
        C1082o2.f14451U = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }
}
