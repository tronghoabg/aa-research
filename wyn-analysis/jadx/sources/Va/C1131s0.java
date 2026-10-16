package Va;

import com.google.android.gms.ads.formats.NativeContentAdView;
import java.util.ArrayList;

/* renamed from: Va.s0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1131s0 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        int i5 = W0.f13813U + 43;
        W0.f13812T = i5 % 128;
        Object objU = AbstractC1104pb.U(arrayList, i5 % 2 != 0 ? 1 : 0, NativeContentAdView.class);
        int i10 = W0.f13813U + 29;
        W0.f13812T = i10 % 128;
        if (i10 % 2 == 0) {
            return ((NativeContentAdView) objU).getLogoView();
        }
        throw null;
    }
}
