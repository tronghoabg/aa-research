package N6;

import com.google.android.gms.internal.ads.zzcbk;
import com.google.android.gms.internal.ads.zzefn;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhcf;
import com.google.android.gms.internal.ads.zzhcp;

/* loaded from: classes3.dex */
public final class r implements zzhbn {

    /* renamed from: a, reason: collision with root package name */
    public final zzhcp f8538a;

    /* renamed from: b, reason: collision with root package name */
    public final zzefn f8539b;

    public r(zzhcp zzhcpVar, zzefn zzefnVar) {
        this.f8538a = zzhcpVar;
        this.f8539b = zzefnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final /* bridge */ /* synthetic */ p8.p zza(Object obj) {
        zzcbk zzcbkVar = (zzcbk) obj;
        return zzhcf.zzj(this.f8539b.zza(zzcbkVar), new C0780e(zzcbkVar, 2), this.f8538a);
    }
}
