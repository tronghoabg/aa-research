package sb;

import A.C0230x;
import a.AbstractC1304a;
import ad.L;
import android.content.Context;
import ba.C1521a;
import com.google.android.gms.ads.AdRequest$Builder;
import h9.c;
import nb.d;
import x6.C4476g;
import x6.EnumC4471b;

/* loaded from: classes4.dex */
public final class b extends AbstractC1304a {

    /* renamed from: b, reason: collision with root package name */
    public L f45411b;

    public final EnumC4471b n0(d dVar) {
        int iOrdinal = dVar.ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? EnumC4471b.UNKNOWN : EnumC4471b.BANNER : EnumC4471b.REWARDED : EnumC4471b.INTERSTITIAL;
    }

    @Override // a.AbstractC1304a
    public final void v(Context context, String str, d dVar, C0230x c0230x, c cVar) {
        AdRequest$Builder adRequest$BuilderN = this.f45411b.n();
        adRequest$BuilderN.getClass();
        C4476g c4476g = new C4476g(adRequest$BuilderN);
        C1521a c1521a = new C1521a((Object) c0230x, false, (Object) cVar, 17);
        C4033a c4033a = new C4033a(0);
        c4033a.f45409b = str;
        c4033a.f45410c = c1521a;
        Q6.a.a(context, n0(dVar), c4476g, c4033a);
    }

    @Override // a.AbstractC1304a
    public final void w(Context context, d dVar, C0230x c0230x, c cVar) {
        int iOrdinal = dVar.ordinal();
        v(context, iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? "" : "gmaScarBiddingBannerSignal" : "gmaScarBiddingRewardedSignal" : "gmaScarBiddingInterstitialSignal", dVar, c0230x, cVar);
    }
}
