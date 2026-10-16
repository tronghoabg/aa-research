package Va;

import com.google.android.gms.ads.formats.NativeAppInstallAdView;
import java.util.ArrayList;

/* renamed from: Va.g0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0976g0 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        W0.f13813U = (W0.f13812T + 105) % 128;
        Object objU = AbstractC1104pb.U(arrayList, 0, NativeAppInstallAdView.class);
        W0.f13812T = (W0.f13813U + 33) % 128;
        return ((NativeAppInstallAdView) objU).getBodyView();
    }
}
