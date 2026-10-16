package Va;

import com.google.android.gms.ads.formats.NativeAppInstallAdView;
import java.util.ArrayList;

/* renamed from: Va.p0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1093p0 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        int i5 = W0.f13812T + 27;
        W0.f13813U = i5 % 128;
        int i10 = i5 % 2;
        return ((NativeAppInstallAdView) AbstractC1104pb.U(arrayList, 0, NativeAppInstallAdView.class)).getStarRatingView();
    }
}
