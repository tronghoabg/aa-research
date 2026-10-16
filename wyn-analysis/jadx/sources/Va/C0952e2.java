package Va;

import com.bytedance.sdk.openadsdk.TTAdConfig;
import java.util.ArrayList;

/* renamed from: Va.e2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0952e2 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        TTAdConfig tTAdConfig = (TTAdConfig) arrayList.get(0);
        C0991h2.f14241T = (C0991h2.f14242U + 93) % 128;
        String strG0 = C0991h2.G0(tTAdConfig);
        C0991h2.f14242U = (C0991h2.f14241T + 57) % 128;
        return strG0;
    }
}
