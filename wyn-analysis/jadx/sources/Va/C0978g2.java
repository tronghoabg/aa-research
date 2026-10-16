package Va;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressView;
import java.util.ArrayList;

/* renamed from: Va.g2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0978g2 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        BannerExpressView bannerExpressView = (BannerExpressView) arrayList.get(0);
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = (PAGBannerAdWrapperListener) arrayList.get(1);
        int i5 = C0991h2.f14241T + 45;
        C0991h2.f14242U = i5 % 128;
        int i10 = i5 % 2;
        C0991h2.H0(bannerExpressView, pAGBannerAdWrapperListener);
        if (i10 == 0) {
            throw null;
        }
        C0991h2.f14242U = (C0991h2.f14241T + 81) % 128;
        return null;
    }
}
