package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* loaded from: classes3.dex */
public final class zzaeq {
    private final Handler zza;
    private final zzaer zzb;

    public zzaeq(Handler handler, zzaer zzaerVar) {
        if (zzaerVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.zza = handler;
        this.zzb = zzaerVar;
    }

    public final void zza(final zzjd zzjdVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaep
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzl(zzjdVar);
                }
            });
        }
    }

    public final void zzb(final String str, final long j8, final long j10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaef
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzm(str, j8, j10);
                }
            });
        }
    }

    public final void zzc(final zzv zzvVar, final zzje zzjeVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaeg
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzn(zzvVar, zzjeVar);
                }
            });
        }
    }

    public final void zzd(final int i5, final long j8) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaeh
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzo(i5, j8);
                }
            });
        }
    }

    public final void zze(final long j8, final int i5) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaei
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzp(j8, i5);
                }
            });
        }
    }

    public final void zzf(final zzbv zzbvVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaej
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzq(zzbvVar);
                }
            });
        }
    }

    public final void zzg(final Object obj) {
        Handler handler = this.zza;
        if (handler != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaek
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzr(obj, jElapsedRealtime);
                }
            });
        }
    }

    public final void zzh(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzael
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzs(str);
                }
            });
        }
    }

    public final void zzi(final zzjd zzjdVar) {
        zzjdVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaem
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzt(zzjdVar);
                }
            });
        }
    }

    public final void zzj(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaen
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzu(exc);
                }
            });
        }
    }

    public final void zzk(final zzjb zzjbVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaeo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzv(zzjbVar);
                }
            });
        }
    }

    public final /* synthetic */ void zzl(zzjd zzjdVar) {
        String str = zzfm.zza;
        this.zzb.zzb(zzjdVar);
    }

    public final /* synthetic */ void zzm(String str, long j8, long j10) {
        String str2 = zzfm.zza;
        this.zzb.zzc(str, j8, j10);
    }

    public final /* synthetic */ void zzn(zzv zzvVar, zzje zzjeVar) {
        String str = zzfm.zza;
        this.zzb.zzd(zzvVar, zzjeVar);
    }

    public final /* synthetic */ void zzo(int i5, long j8) {
        String str = zzfm.zza;
        this.zzb.zze(i5, j8);
    }

    public final /* synthetic */ void zzp(long j8, int i5) {
        String str = zzfm.zza;
        this.zzb.zzj(j8, i5);
    }

    public final /* synthetic */ void zzq(zzbv zzbvVar) {
        String str = zzfm.zza;
        this.zzb.zzf(zzbvVar);
    }

    public final /* synthetic */ void zzr(Object obj, long j8) {
        String str = zzfm.zza;
        this.zzb.zzg(obj, j8);
    }

    public final /* synthetic */ void zzs(String str) {
        String str2 = zzfm.zza;
        this.zzb.zzh(str);
    }

    public final /* synthetic */ void zzt(zzjd zzjdVar) {
        zzjdVar.zza();
        String str = zzfm.zza;
        this.zzb.zzi(zzjdVar);
    }

    public final /* synthetic */ void zzu(Exception exc) {
        String str = zzfm.zza;
        this.zzb.zzk(exc);
    }

    public final /* synthetic */ void zzv(zzjb zzjbVar) {
        String str = zzfm.zza;
        this.zzb.zzz(zzjbVar);
    }
}
