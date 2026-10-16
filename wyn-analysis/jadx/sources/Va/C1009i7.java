package Va;

import com.vungle.ads.internal.model.AdPayload;
import java.util.ArrayList;

/* renamed from: Va.i7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1009i7 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        AdPayload.CacheableReplacement cacheableReplacement = (AdPayload.CacheableReplacement) arrayList.get(0);
        int i5 = C1061m7.f14384S + 33;
        C1061m7.f14385T = i5 % 128;
        if (i5 % 2 != 0) {
            return C1061m7.E0(cacheableReplacement);
        }
        C1061m7.E0(cacheableReplacement);
        throw null;
    }
}
