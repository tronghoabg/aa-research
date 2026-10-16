package Va;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import java.util.ArrayList;

/* renamed from: Va.n3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1070n3 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        AdData adData = (AdData) arrayList.get(0);
        int i5 = C1186w3.f14728T + 89;
        C1186w3.f14729U = i5 % 128;
        if (i5 % 2 != 0) {
            return C1186w3.D0(adData);
        }
        C1186w3.D0(adData);
        throw null;
    }
}
