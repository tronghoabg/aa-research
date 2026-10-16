package Va;

import io.bidmachine.banner.BannerListener;
import io.bidmachine.banner.BannerView;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class Z1 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        BannerView bannerView = (BannerView) arrayList.get(0);
        BannerListener bannerListener = (BannerListener) arrayList.get(1);
        int i5 = C0939d2.f14093T + 125;
        C0939d2.f14094U = i5 % 128;
        int i10 = i5 % 2;
        C0939d2.O0(bannerView, bannerListener);
        if (i10 != 0) {
            return null;
        }
        int i11 = 97 / 0;
        return null;
    }
}
