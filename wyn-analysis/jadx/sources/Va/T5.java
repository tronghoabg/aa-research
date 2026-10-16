package Va;

import com.smaato.sdk.banner.widget.BannerView;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class T5 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        BannerView bannerView = (BannerView) arrayList.get(0);
        C0995h6.f14245T = (C0995h6.f14246U + 107) % 128;
        String strI1 = C0995h6.i1(bannerView);
        C0995h6.f14246U = (C0995h6.f14245T + 121) % 128;
        return strI1;
    }
}
