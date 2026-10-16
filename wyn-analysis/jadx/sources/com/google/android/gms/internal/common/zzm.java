package com.google.android.gms.internal.common;

import Va.M6;

/* loaded from: classes3.dex */
final class zzm extends zzl {
    private final char zza;

    public zzm(char c10) {
        this.zza = c10;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i5 = this.zza;
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(i5 & 15);
            i5 >>= 4;
        }
        String strCopyValueOf = String.copyValueOf(cArr);
        return M6.t(new StringBuilder(String.valueOf(strCopyValueOf).length() + 18), "CharMatcher.is('", strCopyValueOf, "')");
    }

    @Override // com.google.android.gms.internal.common.zzp
    public final boolean zza(char c10) {
        return c10 == this.zza;
    }
}
