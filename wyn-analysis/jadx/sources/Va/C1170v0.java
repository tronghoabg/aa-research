package Va;

import com.google.android.gms.ads.formats.NativeContentAdView;
import java.util.ArrayList;

/* renamed from: Va.v0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1170v0 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        W0.f13813U = (W0.f13812T + 107) % 128;
        Object objU = AbstractC1104pb.U(arrayList, 0, NativeContentAdView.class);
        W0.f13812T = (W0.f13813U + 109) % 128;
        return ((NativeContentAdView) objU).getAdvertiserView();
    }
}
