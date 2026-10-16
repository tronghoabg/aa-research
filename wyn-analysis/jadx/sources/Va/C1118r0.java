package Va;

import com.google.android.gms.ads.formats.NativeContentAdView;
import java.util.ArrayList;

/* renamed from: Va.r0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1118r0 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        W0.f13813U = (W0.f13812T + 67) % 128;
        Object objU = AbstractC1104pb.U(arrayList, 0, NativeContentAdView.class);
        int i5 = W0.f13813U + 105;
        W0.f13812T = i5 % 128;
        if (i5 % 2 == 0) {
            return ((NativeContentAdView) objU).getCallToActionView();
        }
        throw null;
    }
}
