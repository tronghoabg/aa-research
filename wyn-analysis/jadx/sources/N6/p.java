package N6;

import D6.C0395s;
import G6.H;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzdce;
import com.google.android.gms.internal.ads.zzdcf;
import com.google.android.gms.internal.ads.zzdlv;
import com.google.android.gms.internal.ads.zzefo;
import com.google.android.gms.internal.ads.zzfoi;
import com.google.android.gms.internal.ads.zzfoz;
import com.google.android.gms.internal.ads.zzfpm;
import com.google.android.gms.internal.ads.zzfps;
import com.google.android.gms.internal.ads.zzhcf;
import com.google.android.gms.internal.ads.zzimz;
import com.google.android.gms.internal.ads.zzini;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class p implements zzimz {

    /* renamed from: a, reason: collision with root package name */
    public final zzini f8531a;

    /* renamed from: b, reason: collision with root package name */
    public final H f8532b;

    /* renamed from: c, reason: collision with root package name */
    public final zzdcf f8533c;

    /* renamed from: d, reason: collision with root package name */
    public final zzini f8534d;

    public p(zzini zziniVar, H h10, zzdcf zzdcfVar, zzini zziniVar2) {
        this.f8531a = zziniVar;
        this.f8532b = h10;
        this.f8533c = zzdcfVar;
        this.f8534d = zziniVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final Object zzb() {
        zzfps zzfpsVar = (zzfps) this.f8531a.zzb();
        r rVar = new r(zzfoi.zzc(), ((zzefo) this.f8532b.f4508b).zzb());
        zzdce zzdceVarZzb = this.f8533c.zzb();
        zzdlv zzdlvVar = (zzdlv) this.f8534d.zzb();
        zzfoz zzfozVarZzi = zzfpsVar.zza(zzfpm.GENERATE_SIGNALS, zzdceVarZzb.zzb()).zzc(rVar).zzh(((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzgJ)).intValue(), TimeUnit.SECONDS).zzi();
        zzhcf.zzr(zzfozVarZzi, new xa.d(zzdlvVar, 18), zzcfy.zza);
        return zzfozVarZzi;
    }
}
