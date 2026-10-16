package com.google.android.gms.internal.ads;

import D6.C0395s;
import G6.AbstractC0552p;
import G6.U;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzciz extends AbstractC0552p {
    final zzchu zza;
    final zzcjh zzb;
    private final String zzc;
    private final String[] zzd;

    public zzciz(zzchu zzchuVar, zzcjh zzcjhVar, String str, String[] strArr) {
        this.zza = zzchuVar;
        this.zzb = zzcjhVar;
        this.zzc = str;
        this.zzd = strArr;
        C6.n.f1857D.f1859B.zzc(this);
    }

    @Override // G6.AbstractC0552p
    public final void zza() {
        try {
            this.zzb.zzf(this.zzc, this.zzd);
        } finally {
            U.f4562l.post(new zzcix(this));
        }
    }

    @Override // G6.AbstractC0552p
    public final p8.p zzb() {
        return (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcM)).booleanValue() && (this.zzb instanceof zzcjq)) ? zzcfy.zzf.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzciy
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zze();
            }
        }) : super.zzb();
    }

    public final String zzd() {
        return this.zzc;
    }

    public final /* synthetic */ Boolean zze() {
        return Boolean.valueOf(this.zzb.zzg(this.zzc, this.zzd, this));
    }
}
