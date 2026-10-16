package Va;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.models.vast.Creatives;
import net.pubnative.lite.sdk.vpaid.models.vast.InLine;

/* loaded from: classes4.dex */
public final class P4 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        InLine inLine = (InLine) arrayList.get(0);
        C1098p5.f14472T = (C1098p5.f14473U + 47) % 128;
        Creatives creativesM1 = C1098p5.m1(inLine);
        C1098p5.f14473U = (C1098p5.f14472T + 77) % 128;
        return creativesM1;
    }
}
