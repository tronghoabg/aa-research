package com.google.android.gms.internal.ads;

import Va.M6;

/* loaded from: classes3.dex */
public final class zzsc extends Exception {
    public final boolean zza;

    public zzsc(int i5, int i10, int i11, int i12, int i13, zzv zzvVar, boolean z2, Exception exc) {
        String strValueOf = String.valueOf(zzvVar);
        int length = String.valueOf(i10).length();
        int length2 = String.valueOf(i11).length();
        int length3 = String.valueOf(i12).length();
        StringBuilder sb2 = new StringBuilder(length + 34 + length2 + 2 + length3 + 2 + String.valueOf(i13).length() + 2 + strValueOf.length());
        N0.a.l(i10, i11, "AudioTrack init failed 0 Config(", ", ", sb2);
        N0.a.l(i12, i13, ", ", ", ", sb2);
        super(M6.t(sb2, ") ", strValueOf, ""), exc);
        this.zza = false;
    }
}
