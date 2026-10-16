package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import j$.util.Objects;
import n7.C3597b;

/* loaded from: classes3.dex */
final class zzepj implements zzhcc {
    final /* synthetic */ long zza;
    final /* synthetic */ zzfkq zzb;
    final /* synthetic */ zzfkn zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzfsi zze;
    final /* synthetic */ zzfky zzf;
    final /* synthetic */ zzepl zzg;

    public zzepj(zzepl zzeplVar, long j8, zzfkq zzfkqVar, zzfkn zzfknVar, String str, zzfsi zzfsiVar, zzfky zzfkyVar) {
        this.zza = j8;
        this.zzb = zzfkqVar;
        this.zzc = zzfknVar;
        this.zzd = str;
        this.zze = zzfsiVar;
        this.zzf = zzfkyVar;
        Objects.requireNonNull(zzeplVar);
        this.zzg = zzeplVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzhcc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(java.lang.Throwable r14) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzepj.zza(java.lang.Throwable):void");
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzb(Object obj) {
        long j8;
        zzepl zzeplVar = this.zzg;
        ((C3597b) zzeplVar.zzj()).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.zza;
        synchronized (zzeplVar) {
            try {
                if (zzeplVar.zzn()) {
                    j8 = jElapsedRealtime;
                    zzeplVar.zzk().zza(this.zzb, this.zzc, 0, null, j8);
                } else {
                    j8 = jElapsedRealtime;
                }
                if (zzeplVar.zzp()) {
                    return;
                }
                zzfkn zzfknVar = this.zzc;
                if (zzeplVar.zzi(zzfknVar)) {
                    ((zzepk) zzeplVar.zzm().get(zzfknVar)).zzd = j8;
                } else {
                    long j10 = j8;
                    j8 = j10;
                    zzeplVar.zzm().put(zzfknVar, new zzepk(this.zzd, zzfknVar.zzaf, 0, j10, null));
                }
                zzeplVar.zzo().zzd(zzfknVar, j8, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
