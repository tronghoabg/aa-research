package Va;

import com.smaato.sdk.core.mvvm.model.AdResponse;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class B5 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        AdResponse adResponse = (AdResponse) arrayList.get(0);
        C0995h6.f14246U = (C0995h6.f14245T + 73) % 128;
        Object objJ0 = C0995h6.J0(adResponse);
        C0995h6.f14245T = (C0995h6.f14246U + 81) % 128;
        return objJ0;
    }
}
