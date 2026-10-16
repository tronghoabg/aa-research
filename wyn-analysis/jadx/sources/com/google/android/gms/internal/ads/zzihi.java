package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class zzihi extends zzihj {
    public zzihi(Unsafe unsafe) {
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

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.ads.zzihk.zzx(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.ads.zzihk.zzy(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z2' boolean)' in method call: com.google.android.gms.internal.ads.zzihk.zzx(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z2' boolean)' in method call: com.google.android.gms.internal.ads.zzihk.zzy(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zzc(Object obj, long j8, boolean z2) {
        if (zzihk.zzb) {
            zzihk.zzx(obj, j8, z2);
        } else {
            zzihk.zzy(obj, j8, z2);
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
        return Memory.peekByte(j8);
    }
}
