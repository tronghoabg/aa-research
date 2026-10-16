package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class zzcns {
    private final H6.a zza;
    private final Context zzb;
    private final long zzc;
    private final WeakReference zzd;

    public /* synthetic */ zzcns(zzcnr zzcnrVar, byte[] bArr) {
        this.zza = zzcnrVar.zzd();
        this.zzb = zzcnrVar.zze();
        this.zzd = zzcnrVar.zzg();
        this.zzc = zzcnrVar.zzf();
    }

    public final Context zza() {
        return this.zzb;
    }

    public final Context zzb() {
        return this.zzb;
    }

    public final WeakReference zzc() {
        return this.zzd;
    }

    public final H6.a zzd() {
        return this.zza;
    }

    public final String zze() {
        return C6.n.f1857D.f1863c.E(this.zzb, this.zza.f4927a);
    }

    public final zzcnp zzf() {
        return new zzcnp(this.zzb, this.zza);
    }

    public final C6.f zzg() {
        return new C6.f(this.zzb, this.zza);
    }

    public final zzblr zzh() {
        return new zzblr(this.zzb);
    }

    public final long zzi() {
        return this.zzc;
    }
}
