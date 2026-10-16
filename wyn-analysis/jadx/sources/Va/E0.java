package Va;

import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class E0 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        W0.f13813U = (W0.f13812T + 111) % 128;
        Object objU = AbstractC1104pb.U(arrayList, 0, UnifiedNativeAdView.class);
        int i5 = W0.f13812T + 99;
        W0.f13813U = i5 % 128;
        if (i5 % 2 != 0) {
            return ((UnifiedNativeAdView) objU).getMediaView();
        }
        throw null;
    }
}
