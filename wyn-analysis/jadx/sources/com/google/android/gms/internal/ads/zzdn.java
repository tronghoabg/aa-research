package com.google.android.gms.internal.ads;

import android.os.Looper;

/* loaded from: classes3.dex */
public final class zzdn {
    private final zzea zza;
    private final zzea zzb;
    private final zzdm zzc;
    private Object zzd;
    private Object zze;
    private int zzf;

    public zzdn(Object obj, Looper looper, Looper looper2, zzdp zzdpVar, zzdm zzdmVar) {
        this.zza = zzdpVar.zzd(looper, null);
        this.zzb = zzdpVar.zzd(looper2, null);
        this.zzd = obj;
        this.zze = obj;
        this.zzc = zzdmVar;
    }

    private final void zzh(Runnable runnable) {
        zzea zzeaVar = this.zzb;
        if (zzeaVar.zza().getThread().isAlive()) {
            zzeaVar.zzm(runnable);
        }
    }

    private final void zzi(Object obj) {
        Object obj2 = this.zzd;
        this.zzd = obj;
        if (obj2.equals(obj)) {
            return;
        }
        this.zzc.zza(obj2, obj);
    }

    public final Object zza() {
        zzea zzeaVar = this.zzb;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == zzeaVar.zza()) {
            return this.zzd;
        }
        zzgtr.zzi(looperMyLooper == this.zza.zza());
        return this.zze;
    }

    public final void zzb(zzgti zzgtiVar, final zzgti zzgtiVar2) {
        zzgtr.zzi(Looper.myLooper() == this.zzb.zza());
        this.zzf++;
        zzd(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdl
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zze(zzgtiVar2);
            }
        });
        zzi(zzgtiVar.apply(this.zzd));
    }

    public final void zzc(final Object obj) {
        this.zze = obj;
        zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf(obj);
            }
        });
    }

    public final void zzd(Runnable runnable) {
        zzea zzeaVar = this.zza;
        if (zzeaVar.zza().getThread().isAlive()) {
            zzeaVar.zzm(runnable);
        }
    }

    public final /* synthetic */ void zze(zzgti zzgtiVar) {
        final Object objApply = zzgtiVar.apply(this.zze);
        this.zze = objApply;
        zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzg(objApply);
            }
        });
    }

    public final /* synthetic */ void zzf(Object obj) {
        if (this.zzf == 0) {
            zzi(obj);
        }
    }

    public final /* synthetic */ void zzg(Object obj) {
        int i5 = this.zzf - 1;
        this.zzf = i5;
        if (i5 == 0) {
            zzi(obj);
        }
    }
}
