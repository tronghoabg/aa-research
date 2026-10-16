package Va;

import com.smaato.sdk.core.mvvm.model.AdResponse;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Va.y5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1212y5 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        AdResponse adResponse = (AdResponse) arrayList.get(0);
        C0995h6.f14245T = (C0995h6.f14246U + 9) % 128;
        List listC0 = C0995h6.C0(adResponse);
        C0995h6.f14245T = (C0995h6.f14246U + 85) % 128;
        return listC0;
    }
}
