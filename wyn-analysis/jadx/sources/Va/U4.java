package Va;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.models.vast.StaticResource;

/* loaded from: classes4.dex */
public final class U4 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        StaticResource staticResource = (StaticResource) arrayList.get(0);
        int i5 = C1098p5.f14473U + 119;
        C1098p5.f14472T = i5 % 128;
        if (i5 % 2 == 0) {
            return C1098p5.l1(staticResource);
        }
        C1098p5.l1(staticResource);
        throw null;
    }
}
