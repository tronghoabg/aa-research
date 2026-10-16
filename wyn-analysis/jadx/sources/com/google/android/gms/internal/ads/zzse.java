package com.google.android.gms.internal.ads;

import Va.M6;

/* loaded from: classes3.dex */
public final class zzse extends Exception {
    public zzse(long j8, long j10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 63 + String.valueOf(j8).length());
        M6.A(sb2, "Unexpected audio track timestamp discontinuity: expected ", j10, ", got ");
        sb2.append(j8);
        super(sb2.toString());
    }
}
