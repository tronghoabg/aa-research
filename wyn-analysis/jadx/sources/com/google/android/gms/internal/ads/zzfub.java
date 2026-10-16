package com.google.android.gms.internal.ads;

import D6.H0;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzfub implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ H0 zzb;
    final /* synthetic */ zzful zzc;

    public zzfub(zzful zzfulVar, long j8, H0 h02) {
        this.zza = j8;
        this.zzb = h02;
        Objects.requireNonNull(zzfulVar);
        this.zzc = zzfulVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzful zzfulVar = this.zzc;
        if (zzfulVar.zzN() != null) {
            long j8 = this.zza;
            String strZzV = zzful.zzV(this.zzb);
            int iZzs = zzfulVar.zzs();
            int iZzt = zzfulVar.zzt();
            String strZzM = zzfulVar.zzM();
            zzfulVar.zzN().zzi(j8, strZzV, zzfulVar.zzP(), iZzs, iZzt, strZzM);
        }
    }
}
