package Va;

import com.unity3d.services.banners.BannerView;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class N6 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        BannerView bannerView = (BannerView) arrayList.get(0);
        int i5 = P6.f13595T + 29;
        int i10 = i5 % 128;
        P6.f13596U = i10;
        if (i5 % 2 != 0) {
            int i11 = i10 + 1;
            P6.f13595T = i11 % 128;
            if (i11 % 2 == 0) {
                return bannerView.getListener();
            }
            bannerView.getListener();
            throw null;
        }
        int i12 = i10 + 1;
        P6.f13595T = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 52 / 0;
            return bannerView.getListener();
        }
        bannerView.getListener();
        throw null;
    }
}
