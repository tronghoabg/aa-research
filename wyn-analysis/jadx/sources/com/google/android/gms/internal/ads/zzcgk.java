package com.google.android.gms.internal.ads;

import D6.C0395s;
import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* loaded from: classes3.dex */
public class zzcgk {
    private final zzcgd zza;
    private final AtomicInteger zzb;

    public zzcgk() {
        zzcgd zzcgdVar = new zzcgd();
        this.zza = zzcgdVar;
        this.zzb = new AtomicInteger(0);
        zzhcf.zzr(zzcgdVar, new zzcgi(this), zzcfy.zzh);
    }

    @Deprecated
    public final void zze(zzcgh zzcghVar, zzcgf zzcgfVar) {
        zzhcf.zzr(this.zza, new zzcgj(this, zzcghVar, zzcgfVar), zzcfy.zzh);
    }

    @Deprecated
    public final void zzf(Object obj) {
        this.zza.zzc(obj);
    }

    @Deprecated
    public final void zzg() {
        this.zza.zzd(new Exception());
    }

    @Deprecated
    public final void zzh(Throwable th, String str) {
        this.zza.zzd(th);
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zziL)).booleanValue()) {
            C6.n.f1857D.f1868h.zzi(th, str);
        }
    }

    @Deprecated
    public final int zzi() {
        return this.zzb.get();
    }

    public final /* synthetic */ AtomicInteger zzj() {
        return this.zzb;
    }
}
