package wb;

import A.C0230x;
import D6.c1;
import a.AbstractC1304a;
import android.content.Context;
import android.os.Bundle;
import ba.C1521a;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest$Builder;
import h9.c;
import nb.d;
import sb.C4033a;
import tc.j;
import x6.C4476g;
import x6.EnumC4471b;

/* renamed from: wb.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4399a extends AbstractC1304a {

    /* renamed from: b, reason: collision with root package name */
    public j f47457b;

    @Override // a.AbstractC1304a
    public final void v(Context context, String str, d dVar, C0230x c0230x, c cVar) {
        AdRequest$Builder adRequest$Builder = (AdRequest$Builder) new AdRequest$Builder(14).V(((c1) this.f47457b.f46015a).f2412a);
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_5");
        C4476g c4476g = new C4476g((AdRequest$Builder) adRequest$Builder.x(AdMobAdapter.class, bundle));
        C1521a c1521a = new C1521a((Object) c0230x, false, (Object) cVar, 17);
        C4033a c4033a = new C4033a(1);
        c4033a.f45409b = str;
        c4033a.f45410c = c1521a;
        int iOrdinal = dVar.ordinal();
        Q6.a.a(context, iOrdinal != 2 ? iOrdinal != 3 ? EnumC4471b.INTERSTITIAL : EnumC4471b.BANNER : EnumC4471b.REWARDED, c4476g, c4033a);
    }

    @Override // a.AbstractC1304a
    public final void w(Context context, d dVar, C0230x c0230x, c cVar) {
        int iOrdinal = dVar.ordinal();
        v(context, iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? "" : "gmaScarBiddingBannerSignal" : "gmaScarBiddingRewardedSignal" : "gmaScarBiddingInterstitialSignal", dVar, c0230x, cVar);
    }
}
