package Va;

import com.smaato.sdk.core.ad.AdPresenter;
import java.util.ArrayList;

/* renamed from: Va.x5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1200x5 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        AdPresenter adPresenter = (AdPresenter) arrayList.get(0);
        int i5 = C0995h6.f14246U + 75;
        C0995h6.f14245T = i5 % 128;
        if (i5 % 2 != 0) {
            C0995h6.m1(adPresenter);
            throw null;
        }
        String strM1 = C0995h6.m1(adPresenter);
        int i10 = C0995h6.f14246U + 107;
        C0995h6.f14245T = i10 % 128;
        if (i10 % 2 == 0) {
            return strM1;
        }
        throw null;
    }
}
