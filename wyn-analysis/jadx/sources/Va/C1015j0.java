package Va;

import com.google.android.gms.ads.formats.NativeAppInstallAdView;
import java.util.ArrayList;

/* renamed from: Va.j0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1015j0 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        W0.f13812T = (W0.f13813U + 95) % 128;
        Object objU = AbstractC1104pb.U(arrayList, 0, NativeAppInstallAdView.class);
        int i5 = W0.f13813U + 63;
        W0.f13812T = i5 % 128;
        if (i5 % 2 == 0) {
            return ((NativeAppInstallAdView) objU).getIconView();
        }
        throw null;
    }
}
