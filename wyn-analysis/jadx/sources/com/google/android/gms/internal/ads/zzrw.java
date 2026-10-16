package com.google.android.gms.internal.ads;

import android.os.Handler;

/* loaded from: classes3.dex */
public final class zzrw {
    private final Handler zza;
    private final zzrx zzb;

    public zzrw(Handler handler, zzrx zzrxVar) {
        this.zza = zzrxVar == null ? null : handler;
        this.zzb = zzrxVar;
    }

    public final /* synthetic */ void zzA(int i5) {
        String str = zzfm.zza;
        this.zzb.zzx(i5);
    }

    public final /* synthetic */ void zzB(zzjb zzjbVar) {
        String str = zzfm.zza;
        this.zzb.zzy(zzjbVar);
    }

    public final void zza(final zzjd zzjdVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzo(zzjdVar);
                }
            });
        }
    }

    public final void zzb(final String str, final long j8, final long j10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzri
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzp(str, j8, j10);
                }
            });
        }
    }

    public final void zzc(final zzv zzvVar, final zzje zzjeVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzq(zzvVar, zzjeVar);
                }
            });
        }
    }

    public final void zzd(final long j8) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzr(j8);
                }
            });
        }
    }

    public final void zze(final int i5, final long j8, final long j10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzro
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzs(i5, j8, j10);
                }
            });
        }
    }

    public final void zzf(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzt(str);
                }
            });
        }
    }

    public final void zzg(final zzjd zzjdVar) {
        zzjdVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzu(zzjdVar);
                }
            });
        }
    }

    public final void zzh(final boolean z2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrr
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzv(z2);
                }
            });
        }
    }

    public final void zzi(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrs
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzw(exc);
                }
            });
        }
    }

    public final void zzj(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzx(exc);
                }
            });
        }
    }

    public final void zzk(final zzsa zzsaVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzru
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzy(zzsaVar);
                }
            });
        }
    }

    public final void zzl(final zzsa zzsaVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzz(zzsaVar);
                }
            });
        }
    }

    public final void zzm(final int i5) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzA(i5);
                }
            });
        }
    }

    public final void zzn(final zzjb zzjbVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrl
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzB(zzjbVar);
                }
            });
        }
    }

    public final /* synthetic */ void zzo(zzjd zzjdVar) {
        String str = zzfm.zza;
        this.zzb.zzl(zzjdVar);
    }

    public final /* synthetic */ void zzp(String str, long j8, long j10) {
        String str2 = zzfm.zza;
        this.zzb.zzm(str, j8, j10);
    }

    public final /* synthetic */ void zzq(zzv zzvVar, zzje zzjeVar) {
        String str = zzfm.zza;
        this.zzb.zzn(zzvVar, zzjeVar);
    }

    public final /* synthetic */ void zzr(long j8) {
        String str = zzfm.zza;
        this.zzb.zzo(j8);
    }

    public final /* synthetic */ void zzs(int i5, long j8, long j10) {
        String str = zzfm.zza;
        this.zzb.zzp(i5, j8, j10);
    }

    public final /* synthetic */ void zzt(String str) {
        String str2 = zzfm.zza;
        this.zzb.zzq(str);
    }

    public final /* synthetic */ void zzu(zzjd zzjdVar) {
        zzjdVar.zza();
        String str = zzfm.zza;
        this.zzb.zzr(zzjdVar);
    }

    public final /* synthetic */ void zzv(boolean z2) {
        String str = zzfm.zza;
        this.zzb.zzs(z2);
    }

    public final /* synthetic */ void zzw(Exception exc) {
        String str = zzfm.zza;
        this.zzb.zzt(exc);
    }

    public final /* synthetic */ void zzx(Exception exc) {
        String str = zzfm.zza;
        this.zzb.zzu(exc);
    }

    public final /* synthetic */ void zzy(zzsa zzsaVar) {
        String str = zzfm.zza;
        this.zzb.zzv(zzsaVar);
    }

    public final /* synthetic */ void zzz(zzsa zzsaVar) {
        String str = zzfm.zza;
        this.zzb.zzw(zzsaVar);
    }
}
