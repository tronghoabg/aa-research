package Va;

import com.unity3d.services.banners.BannerView;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class K6 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        BannerView bannerView = (BannerView) arrayList.get(0);
        BannerView.IListener iListener = (BannerView.IListener) arrayList.get(1);
        P6.f13595T = (P6.f13596U + 69) % 128;
        bannerView.setListener(iListener);
        int i5 = P6.f13596U + 117;
        int i10 = i5 % 128;
        P6.f13595T = i10;
        if (i5 % 2 != 0) {
            throw null;
        }
        P6.f13596U = (i10 + 121) % 128;
        return null;
    }
}
