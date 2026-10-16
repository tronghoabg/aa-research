package Va;

import com.smaato.sdk.core.mvvm.model.AdResponse;
import java.util.ArrayList;

/* renamed from: Va.z5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1224z5 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        AdResponse adResponse = (AdResponse) arrayList.get(0);
        C0995h6.f14246U = (C0995h6.f14245T + 67) % 128;
        String strK0 = C0995h6.K0(adResponse);
        C0995h6.f14246U = (C0995h6.f14245T + 55) % 128;
        return strK0;
    }
}
