package Va;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.models.vast.VASTAdTagURI;
import net.pubnative.lite.sdk.vpaid.models.vast.Wrapper;

/* loaded from: classes4.dex */
public final class V4 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        Wrapper wrapper = (Wrapper) arrayList.get(0);
        C1098p5.f14473U = (C1098p5.f14472T + 5) % 128;
        VASTAdTagURI vASTAdTagURIY0 = C1098p5.Y0(wrapper);
        C1098p5.f14472T = (C1098p5.f14473U + 35) % 128;
        return vASTAdTagURIY0;
    }
}
