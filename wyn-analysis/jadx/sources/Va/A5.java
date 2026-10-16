package Va;

import com.smaato.sdk.core.mvvm.model.AdResponse;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class A5 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        AdResponse adResponse = (AdResponse) arrayList.get(0);
        int i5 = C0995h6.f14246U + 49;
        C0995h6.f14245T = i5 % 128;
        if (i5 % 2 == 0) {
            return C0995h6.D0(adResponse);
        }
        C0995h6.D0(adResponse);
        throw null;
    }
}
