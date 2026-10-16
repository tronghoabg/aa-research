package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* loaded from: classes4.dex */
final class zzfn extends zzfo {
    public zzfn(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final double zza(Object obj, long j8) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j8));
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final float zzb(Object obj, long j8) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j8));
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final void zzc(Object obj, long j8, boolean z2) {
        if (zzfp.zzb) {
            zzfp.zzD(obj, j8, z2 ? (byte) 1 : (byte) 0);
        } else {
            zzfp.zzE(obj, j8, z2 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final void zzd(Object obj, long j8, byte b5) {
        if (zzfp.zzb) {
            zzfp.zzD(obj, j8, b5);
        } else {
            zzfp.zzE(obj, j8, b5);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final void zze(Object obj, long j8, double d3) {
        this.zza.putLong(obj, j8, Double.doubleToLongBits(d3));
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final void zzf(Object obj, long j8, float f10) {
        this.zza.putInt(obj, j8, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final boolean zzg(Object obj, long j8) {
        return zzfp.zzb ? zzfp.zzt(obj, j8) : zzfp.zzu(obj, j8);
    }
}
