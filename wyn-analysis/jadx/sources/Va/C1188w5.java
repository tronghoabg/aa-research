package Va;

import com.smaato.sdk.core.api.ApiAdResponse;
import java.util.ArrayList;

/* renamed from: Va.w5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1188w5 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        ApiAdResponse apiAdResponse = (ApiAdResponse) arrayList.get(0);
        int i5 = C0995h6.f14245T + 9;
        C0995h6.f14246U = i5 % 128;
        if (i5 % 2 != 0) {
            return C0995h6.S0(apiAdResponse);
        }
        C0995h6.S0(apiAdResponse);
        throw null;
    }
}
