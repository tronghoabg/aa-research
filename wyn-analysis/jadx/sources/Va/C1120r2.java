package Va;

import com.hyprmx.android.sdk.api.data.OfferCacheEntity;
import java.util.ArrayList;

/* renamed from: Va.r2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1120r2 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        OfferCacheEntity offerCacheEntity = (OfferCacheEntity) arrayList.get(0);
        C1185w2.f14725U = (C1185w2.f14724T + 37) % 128;
        String strI0 = C1185w2.I0(offerCacheEntity);
        C1185w2.f14724T = (C1185w2.f14725U + 69) % 128;
        return strI0;
    }
}
