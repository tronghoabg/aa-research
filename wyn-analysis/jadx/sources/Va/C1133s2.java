package Va;

import com.hyprmx.android.sdk.api.data.WebTrafficObject;
import java.util.ArrayList;

/* renamed from: Va.s2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1133s2 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        WebTrafficObject webTrafficObject = (WebTrafficObject) arrayList.get(0);
        int i5 = C1185w2.f14725U + 71;
        C1185w2.f14724T = i5 % 128;
        if (i5 % 2 == 0) {
            return C1185w2.G0(webTrafficObject);
        }
        C1185w2.G0(webTrafficObject);
        throw null;
    }
}
