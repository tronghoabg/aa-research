package Va;

import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import java.util.ArrayList;

/* renamed from: Va.z0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1219z0 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        W0.f13813U = (W0.f13812T + 55) % 128;
        Object objU = AbstractC1104pb.U(arrayList, 0, UnifiedNativeAdView.class);
        W0.f13812T = (W0.f13813U + 111) % 128;
        return ((UnifiedNativeAdView) objU).getIconView();
    }
}
