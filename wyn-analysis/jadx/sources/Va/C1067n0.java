package Va;

import com.google.android.gms.ads.formats.NativeAppInstallAdView;
import java.util.ArrayList;

/* renamed from: Va.n0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1067n0 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        int i5 = W0.f13813U + 95;
        W0.f13812T = i5 % 128;
        Object objU = AbstractC1104pb.U(arrayList, i5 % 2 != 0 ? 1 : 0, NativeAppInstallAdView.class);
        int i10 = W0.f13812T + 101;
        W0.f13813U = i10 % 128;
        if (i10 % 2 != 0) {
            return ((NativeAppInstallAdView) objU).getStoreView();
        }
        throw null;
    }
}
