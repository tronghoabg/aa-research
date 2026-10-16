package com.google.android.gms.internal.p002firebaseauthapi;

import A7.AbstractC0279p0;

/* loaded from: classes.dex */
final class zzj extends zzk {
    private final char zza;

    public zzj(char c10) {
        this.zza = c10;
    }

    public final String toString() {
        char c10 = this.zza;
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i5 = 0; i5 < 4; i5++) {
            cArr[5 - i5] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return AbstractC0279p0.l("CharMatcher.is('", String.copyValueOf(cArr), "')");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzh
    public final boolean zza(char c10) {
        return c10 == this.zza;
    }
}
