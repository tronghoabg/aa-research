package Va;

import com.smaato.sdk.core.mvvm.model.AdResponse;
import java.util.ArrayList;

/* renamed from: Va.e6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0956e6 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        AdResponse adResponse = (AdResponse) arrayList.get(0);
        C0995h6.f14245T = (C0995h6.f14246U + 115) % 128;
        String strI0 = C0995h6.I0(adResponse);
        int i5 = C0995h6.f14245T + 73;
        C0995h6.f14246U = i5 % 128;
        if (i5 % 2 != 0) {
            return strI0;
        }
        throw null;
    }
}
