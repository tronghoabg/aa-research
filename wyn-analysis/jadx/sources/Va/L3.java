package Va;

import java.util.ArrayList;
import jp.maio.sdk.android.MaioAdsListenerInterface;

/* loaded from: classes4.dex */
public final class L3 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        MaioAdsListenerInterface maioAdsListenerInterface = (MaioAdsListenerInterface) arrayList.get(0);
        M3.f13525T = (M3.f13524S + 53) % 128;
        M3.D0(maioAdsListenerInterface);
        int i5 = M3.f13525T + 67;
        M3.f13524S = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }
}
