package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import sun.misc.Unsafe;

/* loaded from: classes4.dex */
final class zbwp extends zbwr {
    public zbwp(Unsafe unsafe) {
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

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbi(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbj(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 boolean)' in method call: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbi(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 boolean)' in method call: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbj(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr
    public final void zbc(Object obj, long j8, boolean z2) {
        if (zbws.zbb) {
            zbws.zbi(obj, j8, z2);
        } else {
            zbws.zbj(obj, j8, z2);
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
