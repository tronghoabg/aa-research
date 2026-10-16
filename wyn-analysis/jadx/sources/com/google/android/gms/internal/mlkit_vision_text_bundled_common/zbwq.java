package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import sun.misc.Unsafe;

/* loaded from: classes4.dex */
final class zbwq extends zbwr {
    public zbwq(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr
    public final double zba(Object obj, long j8) {
        return Double.longBitsToDouble(this.zba.getLong(obj, j8));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr
    public final float zbb(Object obj, long j8) {
        return Float.intBitsToFloat(this.zba.getInt(obj, j8));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr
    public final void zbc(Object obj, long j8, boolean z2) {
        if (zbws.zbb) {
            zbws.zbD(obj, j8, z2 ? (byte) 1 : (byte) 0);
        } else {
            zbws.zbE(obj, j8, z2 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr
    public final void zbd(Object obj, long j8, byte b5) {
        if (zbws.zbb) {
            zbws.zbD(obj, j8, b5);
        } else {
            zbws.zbE(obj, j8, b5);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr
    public final void zbe(Object obj, long j8, double d3) {
        this.zba.putLong(obj, j8, Double.doubleToLongBits(d3));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr
    public final void zbf(Object obj, long j8, float f10) {
        this.zba.putInt(obj, j8, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr
    public final boolean zbg(Object obj, long j8) {
        return zbws.zbb ? zbws.zbt(obj, j8) : zbws.zbu(obj, j8);
    }
}
