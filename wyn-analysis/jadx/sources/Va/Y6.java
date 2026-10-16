package Va;

import com.yandex.mobile.ads.common.AdInfo;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class Y6 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        AdInfo adInfo = (AdInfo) arrayList.get(0);
        C0957e7.f14122T = (C0957e7.f14121S + 107) % 128;
        String strF0 = C0957e7.F0(adInfo);
        int i5 = C0957e7.f14122T + 17;
        C0957e7.f14121S = i5 % 128;
        if (i5 % 2 == 0) {
            return strF0;
        }
        throw null;
    }
}
