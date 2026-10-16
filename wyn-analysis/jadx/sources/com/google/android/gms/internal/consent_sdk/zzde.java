package com.google.android.gms.internal.consent_sdk;

import A7.AbstractC0279p0;

/* loaded from: classes.dex */
final class zzde extends zzdd {
    public zzde(char c10) {
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i5 = 44;
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(i5 & 15);
            i5 >>= 4;
        }
        return AbstractC0279p0.l("CharMatcher.is('", String.copyValueOf(cArr), "')");
    }
}
