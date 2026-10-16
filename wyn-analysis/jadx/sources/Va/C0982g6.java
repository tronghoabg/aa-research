package Va;

import com.smaato.sdk.core.mvvm.model.AdResponse;
import java.util.ArrayList;

/* renamed from: Va.g6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0982g6 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        AdResponse adResponse = (AdResponse) arrayList.get(0);
        C0995h6.f14245T = (C0995h6.f14246U + 97) % 128;
        String strG0 = C0995h6.G0(adResponse);
        int i5 = C0995h6.f14246U + 43;
        C0995h6.f14245T = i5 % 128;
        if (i5 % 2 == 0) {
            return strG0;
        }
        throw null;
    }
}
