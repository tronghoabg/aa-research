package N6;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzblc;
import com.google.android.gms.internal.ads.zzdzy;
import com.unity3d.services.UnityAdsConstants;
import p7.AbstractC3772b;

/* loaded from: classes3.dex */
public final class y extends Q6.b {

    /* renamed from: a, reason: collision with root package name */
    public final x f8566a;

    /* renamed from: b, reason: collision with root package name */
    public final zzdzy f8567b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8568c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8569d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8570e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f8571f;

    public y(x xVar, boolean z2, int i5, Boolean bool, zzdzy zzdzyVar) {
        this.f8566a = xVar;
        this.f8568c = z2;
        this.f8569d = i5;
        this.f8571f = bool;
        this.f8567b = zzdzyVar;
        C6.n.f1857D.k.getClass();
        this.f8570e = System.currentTimeMillis();
    }

    @Override // Q6.b
    public final void onFailure(String str) {
        Pair pair = new Pair("sgf_reason", str);
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        C6.n nVar = C6.n.f1857D;
        nVar.k.getClass();
        Pair pair6 = new Pair("lat_ms", Long.toString(System.currentTimeMillis() - this.f8570e));
        int i5 = this.f8569d;
        Pair pair7 = new Pair("sgpc_rn", Integer.toString(i5));
        Pair pair8 = new Pair("sgpc_lsu", String.valueOf(this.f8571f));
        boolean z2 = this.f8568c;
        AbstractC3772b.a0(this.f8567b, "sgpcf", pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("tpc", true != z2 ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION));
        nVar.k.getClass();
        this.f8566a.b(z2, new z(null, str, ((Long) zzblc.zzh.zze()).longValue() + System.currentTimeMillis(), i5));
    }

    @Override // Q6.b
    public final void onSuccess(Q6.a aVar) {
        Pair pair = new Pair("se", "query_g");
        Pair pair2 = new Pair("ad_format", "BANNER");
        Pair pair3 = new Pair("rtype", Integer.toString(6));
        Pair pair4 = new Pair("scar", "true");
        C6.n nVar = C6.n.f1857D;
        nVar.k.getClass();
        Pair pair5 = new Pair("lat_ms", Long.toString(System.currentTimeMillis() - this.f8570e));
        int i5 = this.f8569d;
        Pair pair6 = new Pair("sgpc_rn", Integer.toString(i5));
        Pair pair7 = new Pair("sgpc_lsu", String.valueOf(this.f8571f));
        boolean z2 = this.f8568c;
        AbstractC3772b.a0(this.f8567b, "sgpcs", pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("tpc", true != z2 ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION));
        nVar.k.getClass();
        this.f8566a.b(z2, new z(aVar, "", ((Long) zzblc.zzh.zze()).longValue() + System.currentTimeMillis(), i5));
    }
}
