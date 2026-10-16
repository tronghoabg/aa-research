package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zziw extends IllegalStateException {
    public zziw(int i5, int i10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 21 + String.valueOf(i10).length() + 1);
        N0.a.l(i5, i10, "Buffer too small (", " < ", sb2);
        sb2.append(")");
        super(sb2.toString());
    }
}
