package Va;

import com.bytedance.sdk.openadsdk.TTAdConfig;
import java.util.ArrayList;

/* renamed from: Va.f2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0965f2 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        TTAdConfig tTAdConfig = (TTAdConfig) arrayList.get(0);
        int i5 = C0991h2.f14241T + 49;
        C0991h2.f14242U = i5 % 128;
        if (i5 % 2 == 0) {
            C0991h2.E0(tTAdConfig);
            throw null;
        }
        String strE0 = C0991h2.E0(tTAdConfig);
        int i10 = C0991h2.f14242U + 15;
        C0991h2.f14241T = i10 % 128;
        if (i10 % 2 == 0) {
            return strE0;
        }
        throw null;
    }
}
