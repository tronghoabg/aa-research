package com.google.android.gms.internal.consent_sdk;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzsu extends zzsv {
    public zzsu(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsv
    public final double zza(Object obj, long j8) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j8));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsv
    public final float zzb(Object obj, long j8) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j8));
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.consent_sdk.zzsw.zzi(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.consent_sdk.zzsw.zzj(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 boolean)' in method call: com.google.android.gms.internal.consent_sdk.zzsw.zzi(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 boolean)' in method call: com.google.android.gms.internal.consent_sdk.zzsw.zzj(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.consent_sdk.zzsv
    public final void zzc(Object obj, long j8, boolean z2) {
        if (zzsw.zzb) {
            zzsw.zzi(obj, j8, z2);
        } else {
            zzsw.zzj(obj, j8, z2);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsv
    public final void zzd(Object obj, long j8, byte b5) {
        if (zzsw.zzb) {
            zzsw.zzD(obj, j8, b5);
        } else {
            zzsw.zzE(obj, j8, b5);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsv
    public final void zze(Object obj, long j8, double d3) {
        this.zza.putLong(obj, j8, Double.doubleToLongBits(d3));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsv
    public final void zzf(Object obj, long j8, float f10) {
        this.zza.putInt(obj, j8, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsv
    public final boolean zzg(Object obj, long j8) {
        return zzsw.zzb ? zzsw.zzt(obj, j8) : zzsw.zzu(obj, j8);
    }
}
