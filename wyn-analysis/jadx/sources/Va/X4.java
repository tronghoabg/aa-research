package Va;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.models.vast.Creatives;
import net.pubnative.lite.sdk.vpaid.models.vast.Wrapper;

/* loaded from: classes4.dex */
public final class X4 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        Wrapper wrapper = (Wrapper) arrayList.get(0);
        C1098p5.f14473U = (C1098p5.f14472T + 13) % 128;
        Creatives creativesN1 = C1098p5.n1(wrapper);
        C1098p5.f14473U = (C1098p5.f14472T + 123) % 128;
        return creativesN1;
    }
}
