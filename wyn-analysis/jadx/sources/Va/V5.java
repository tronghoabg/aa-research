package Va;

import com.smaato.sdk.core.ad.AdPresenter;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class V5 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        AdPresenter adPresenter = (AdPresenter) arrayList.get(0);
        int i5 = C0995h6.f14245T + 53;
        C0995h6.f14246U = i5 % 128;
        int i10 = i5 % 2;
        String strF0 = C0995h6.F0(adPresenter);
        if (i10 == 0) {
            int i11 = 24 / 0;
        }
        int i12 = C0995h6.f14246U + 61;
        C0995h6.f14245T = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 31 / 0;
        }
        return strF0;
    }
}
