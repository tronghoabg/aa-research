package Va;

import com.smaato.sdk.banner.widget.BannerView;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class Z5 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        BannerView bannerView = (BannerView) arrayList.get(0);
        BannerView.EventListener eventListener = (BannerView.EventListener) arrayList.get(1);
        int i5 = C0995h6.f14245T + 73;
        C0995h6.f14246U = i5 % 128;
        int i10 = i5 % 2;
        C0995h6.k1(bannerView, eventListener);
        if (i10 == 0) {
            throw null;
        }
        C0995h6.f14246U = (C0995h6.f14245T + 63) % 128;
        return null;
    }
}
