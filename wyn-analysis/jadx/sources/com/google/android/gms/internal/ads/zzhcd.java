package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
final class zzhcd implements Runnable {
    final p8.p zza;
    final zzhcc zzb;

    public zzhcd(p8.p pVar, zzhcc zzhccVar) {
        this.zza = pVar;
        this.zzb = zzhccVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thZza;
        p8.p pVar = this.zza;
        if ((pVar instanceof zzhdh) && (thZza = zzhdi.zza((zzhdh) pVar)) != null) {
            this.zzb.zza(thZza);
            return;
        }
        try {
            this.zzb.zzb(zzhcf.zzs(pVar));
        } catch (ExecutionException e7) {
            this.zzb.zza(e7.getCause());
        } catch (Throwable th) {
            this.zzb.zza(th);
        }
    }

    public final String toString() {
        zzgtn zzgtnVarZzb = zzgto.zzb(this);
        zzgtnVarZzb.zza(this.zzb);
        return zzgtnVarZzb.toString();
    }
}
