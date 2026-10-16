package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzait implements zzaga {
    private final zzaga zza;
    private final zzaga zzb;
    private zzagd zzc;
    private zzaga zzd;
    private Pair zze;

    public zzait() {
        this(0);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final boolean zza(zzagb zzagbVar) throws IOException {
        if (this.zzb.zza(zzagbVar)) {
            return true;
        }
        zzagbVar.zzl();
        return this.zza.zza(zzagbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ List zzb() {
        return AbstractC1742f.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc(zzagd zzagdVar) {
        this.zzc = zzagdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final int zzd(zzagb zzagbVar, zzaha zzahaVar) throws IOException {
        if (this.zzd == null) {
            zzaga zzagaVar = this.zzb;
            if (!zzagaVar.zza(zzagbVar)) {
                zzagaVar = this.zza;
            }
            this.zzd = zzagaVar;
            zzagbVar.zzl();
            Pair pair = this.zze;
            if (pair != null) {
                this.zzd.zze(((Long) pair.first).longValue(), ((Long) this.zze.second).longValue());
                this.zze = null;
            }
            zzaga zzagaVar2 = this.zzd;
            zzagd zzagdVar = this.zzc;
            zzagdVar.getClass();
            zzagaVar2.zzc(zzagdVar);
        }
        return this.zzd.zzd(zzagbVar, zzahaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze(long j8, long j10) {
        zzaga zzagaVar = this.zzd;
        if (zzagaVar != null) {
            zzagaVar.zze(j8, j10);
        } else {
            this.zze = Pair.create(Long.valueOf(j8), Long.valueOf(j10));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ zzaga zzg() {
        return AbstractC1742f.b(this);
    }

    public zzait(int i5) {
        this.zza = new zzahf(65496, 2, "image/jpeg");
        this.zzb = new zzaiu();
    }
}
