package com.google.android.recaptcha.internal;

import sun.misc.Unsafe;

/* loaded from: classes4.dex */
final class zzng extends zznh {
    public zzng(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.recaptcha.internal.zznh
    public final double zza(Object obj, long j8) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j8));
    }

    @Override // com.google.android.recaptcha.internal.zznh
    public final float zzb(Object obj, long j8) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j8));
    }

    /* JADX WARN: Failed to inline method: com.google.android.recaptcha.internal.zzni.zzi(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.recaptcha.internal.zzni.zzj(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z2' boolean)' in method call: com.google.android.recaptcha.internal.zzni.zzi(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z2' boolean)' in method call: com.google.android.recaptcha.internal.zzni.zzj(java.lang.Object, long, boolean):void */
    @Override // com.google.android.recaptcha.internal.zznh
    public final void zzc(Object obj, long j8, boolean z2) {
        if (zzni.zzb) {
            zzni.zzi(obj, j8, z2);
        } else {
            zzni.zzj(obj, j8, z2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zznh
    public final void zzd(Object obj, long j8, byte b5) {
        if (zzni.zzb) {
            zzni.zzD(obj, j8, b5);
        } else {
            zzni.zzE(obj, j8, b5);
        }
    }

    @Override // com.google.android.recaptcha.internal.zznh
    public final void zze(Object obj, long j8, double d3) {
        this.zza.putLong(obj, j8, Double.doubleToLongBits(d3));
    }

    @Override // com.google.android.recaptcha.internal.zznh
    public final void zzf(Object obj, long j8, float f10) {
        this.zza.putInt(obj, j8, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.recaptcha.internal.zznh
    public final boolean zzg(Object obj, long j8) {
        return zzni.zzb ? zzni.zzt(obj, j8) : zzni.zzu(obj, j8);
    }
}
