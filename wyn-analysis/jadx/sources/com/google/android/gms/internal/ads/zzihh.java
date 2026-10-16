package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class zzihh extends zzihj {
    public zzihh(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zza(Object obj, long j8, byte b5) {
        if (zzihk.zzb) {
            zzihk.zzE(obj, j8, b5);
        } else {
            zzihk.zzF(obj, j8, b5);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final boolean zzb(Object obj, long j8) {
        return zzihk.zzb ? zzihk.zzv(obj, j8) : zzihk.zzw(obj, j8);
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zzc(Object obj, long j8, boolean z2) {
        if (zzihk.zzb) {
            zzihk.zzE(obj, j8, z2 ? (byte) 1 : (byte) 0);
        } else {
            zzihk.zzF(obj, j8, z2 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final float zzd(Object obj, long j8) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j8));
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zze(Object obj, long j8, float f10) {
        this.zza.putInt(obj, j8, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final double zzf(Object obj, long j8) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j8));
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zzg(Object obj, long j8, double d3) {
        this.zza.putLong(obj, j8, Double.doubleToLongBits(d3));
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final byte zzh(long j8) {
        return Memory.peekByte((int) j8);
    }
}
