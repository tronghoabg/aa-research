package Va;

import com.smaato.sdk.core.ad.InterstitialAdPresenter;
import com.smaato.sdk.video.ad.InterstitialVideoAdPresenter;
import java.util.ArrayList;

/* renamed from: Va.c6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0930c6 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        InterstitialVideoAdPresenter interstitialVideoAdPresenter = (InterstitialVideoAdPresenter) arrayList.get(0);
        InterstitialAdPresenter.Listener listener = (InterstitialAdPresenter.Listener) arrayList.get(1);
        C0995h6.f14246U = (C0995h6.f14245T + 125) % 128;
        C0995h6.d1(interstitialVideoAdPresenter, listener);
        int i5 = C0995h6.f14245T + 95;
        C0995h6.f14246U = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }
}
