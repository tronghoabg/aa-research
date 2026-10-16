package Va;

import com.smaato.sdk.core.api.ApiAdResponse;
import java.util.ArrayList;

/* renamed from: Va.d6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0943d6 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        ApiAdResponse apiAdResponse = (ApiAdResponse) arrayList.get(0);
        int i5 = C0995h6.f14245T + 91;
        C0995h6.f14246U = i5 % 128;
        if (i5 % 2 == 0) {
            C0995h6.T0(apiAdResponse);
            throw null;
        }
        String strT0 = C0995h6.T0(apiAdResponse);
        C0995h6.f14245T = (C0995h6.f14246U + 81) % 128;
        return strT0;
    }
}
