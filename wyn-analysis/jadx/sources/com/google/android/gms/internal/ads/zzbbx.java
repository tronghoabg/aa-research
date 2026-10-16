package com.google.android.gms.internal.ads;

import android.content.Context;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzbbx implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzbbz zzb;

    public zzbbx(zzbbz zzbbzVar, int i5, boolean z2) {
        this.zza = i5;
        Objects.requireNonNull(zzbbzVar);
        this.zzb = zzbbzVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        zzayt zzaytVarZza;
        int i5 = this.zza;
        zzbbz zzbbzVar = this.zzb;
        if (i5 > 0) {
            try {
                Thread.sleep(i5 * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            Context context = zzbbzVar.zza;
            zzaytVarZza = zzfxx.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
        } catch (Throwable unused2) {
            zzaytVarZza = null;
        }
        zzbbz zzbbzVar2 = this.zzb;
        zzbbzVar2.zzs(zzaytVarZza);
        int i10 = this.zza;
        if (i10 < 4) {
            if (zzaytVarZza != null && zzaytVarZza.zza() && !zzaytVarZza.zzb().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzaytVarZza.zzg() && zzaytVarZza.zzh().zza() && zzaytVarZza.zzh().zzb() != -2) {
                return;
            }
            zzbbzVar2.zzp(i10 + 1, true);
        }
    }
}
