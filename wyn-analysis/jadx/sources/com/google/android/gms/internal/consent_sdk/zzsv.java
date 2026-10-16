package com.google.android.gms.internal.consent_sdk;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
abstract class zzsv {
    final Unsafe zza;

    public zzsv(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract double zza(Object obj, long j8);

    public abstract float zzb(Object obj, long j8);

    public abstract void zzc(Object obj, long j8, boolean z2);

    public abstract void zzd(Object obj, long j8, byte b5);

    public abstract void zze(Object obj, long j8, double d3);

    public abstract void zzf(Object obj, long j8, float f10);

    public abstract boolean zzg(Object obj, long j8);
}
