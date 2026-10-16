package com.google.android.recaptcha.internal;

import sun.misc.Unsafe;

/* loaded from: classes4.dex */
abstract class zznh {
    final Unsafe zza;

    public zznh(Unsafe unsafe) {
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
